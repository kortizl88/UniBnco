package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.SolicitudesExternasDto;
import Com.Elektra.Uniformes.map.SolicitudesExternasMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SolicitudesExternasDao {

    private final SolicitudesExternasMap map;

    @Autowired
    public SolicitudesExternasDao(SolicitudesExternasMap map) {
        this.map = map;
    }


    public void guardarSolicitudExterna(SolicitudesExternasDto dto) {
        map.guardarSolicitudExterna(dto);
    }
}
