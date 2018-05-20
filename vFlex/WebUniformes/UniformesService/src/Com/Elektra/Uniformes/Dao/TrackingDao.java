package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Config.ConfiguraAccesos;
import Com.Elektra.Uniformes.Dto.DatosTrackingDto;
import Com.Elektra.Uniformes.Dto.FiltroTrackingDto;
import Com.Elektra.Uniformes.map.TrackingMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@Repository
public class TrackingDao {

    private static final Logger log = Logger.getLogger(TrackingDao.class);

    private final DataSource dataSource;

    @Autowired
    public TrackingDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<DatosTrackingDto> consultaSolicitudes(FiltroTrackingDto filtro) throws SQLException, TimeoutException, ExecutionException, InterruptedException {
        List<DatosTrackingDto> result = new ArrayList<DatosTrackingDto>();
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = dataSource.getConnection();
            cs = conn.prepareCall(ConfiguraAccesos.SPCONSULTAPEDIDOSPORFILTRO);
            ConsultaPedidosCallable consultaPedidos = new ConsultaPedidosCallable(filtro, cs);
            ExecutorService executor = Executors.newSingleThreadExecutor();
            rs = executor.submit(consultaPedidos).get(30, TimeUnit.SECONDS);
            TrackingMapper mapper = new TrackingMapper();
            int i = 0;
            while (rs.next()) {
                result.add(mapper.mapRow(rs, i++));
            }
        } catch (TimeoutException e) {
            if (cs != null) {
                log.error("Se excedió el tiempo de ejcución permitido, se cancela la consulta.");
                cs.cancel();
            }
            throw e;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    log.error("Error al cerrar la conexión", e);
                }
            }
            if (cs != null) {
                try {
                    cs.close();
                } catch (SQLException e) {
                    log.error("Error al cerrar el callable statement", e);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    log.error("Error al cerrar el result set", e);
                }
            }
        }

        return result;
    }
}