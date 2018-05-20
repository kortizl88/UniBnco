package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.FiltroTrackingDto;
import oracle.jdbc.OracleTypes;

import java.sql.*;
import java.util.concurrent.Callable;

public class ConsultaPedidosCallable implements Callable<ResultSet> {

    private final FiltroTrackingDto filtro;
    private final CallableStatement callableStatement;

    public ConsultaPedidosCallable(FiltroTrackingDto filtro, CallableStatement callableStatement) {
        this.filtro = filtro;
        this.callableStatement = callableStatement;
    }

    public ResultSet call() throws Exception {
        Date fechaSolicitudIni = filtro.getFechaSolicitudIni() != null ? new Date(filtro.getFechaSolicitudIni().getTime()) : null;
        Date fechaSolicitudFin = filtro.getFechaSolicitudFin() != null ? new Date(filtro.getFechaSolicitudFin().getTime()) : null;
        Date fechaRemisionIni = filtro.getFechaRemisionIni() != null ? new Date(filtro.getFechaRemisionIni().getTime()) : null;
        Date fechaRemisionFin = filtro.getFechaRemisionFin() != null ? new Date(filtro.getFechaRemisionFin().getTime()) : null;
        setInt(1, filtro.getIdEmpleado());
        setInt(2, filtro.getTienda());
        setInt(3, filtro.getPedido());
        setInt(4, filtro.getSku());
        setInt(5, filtro.getCentroDeCostos());
        setInt(6, filtro.getRemision());
        setDate(7, fechaSolicitudIni);
        setDate(8, fechaSolicitudFin);
        setDate(9, fechaRemisionIni);
        setDate(10, fechaRemisionFin);
        callableStatement.registerOutParameter(11, OracleTypes.CURSOR);

        callableStatement.execute();
        return (ResultSet) callableStatement.getObject(11);
    }

    private void setInt(int index, Integer value) throws SQLException {
        if (value == null) {
            callableStatement.setNull(index, Types.INTEGER);
        } else {
            callableStatement.setInt(index, value);
        }
    }

    private void setDate(int index, Date date) throws SQLException {
        if (date == null) {
            callableStatement.setNull(index, Types.DATE);
        } else {
            callableStatement.setDate(index, date);
        }
    }
}
