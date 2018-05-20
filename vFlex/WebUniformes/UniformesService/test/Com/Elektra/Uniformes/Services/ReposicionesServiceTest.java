package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Dao.ReposicionesDao;
import Com.Elektra.Uniformes.Dto.AutorizanteDto;
import Com.Elektra.Uniformes.Dto.ReposicionDto;
import Com.Elektra.Uniformes.Services.resp.ReposicionResponse;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.easymock.EasyMock.*;

public class ReposicionesServiceTest {

    private ReposicionesService service;

    private ReposicionesDao mockDao;

    @Before
    public void setUp() {
        mockDao = createMock(ReposicionesDao.class);
        service = new ReposicionesService(mockDao);
    }

    @Test
    public void testSolicitarReposicionConArchivo() throws IOException {
        ReposicionDto reposicion = new ReposicionDto();
        reposicion.setIdEmpleado(Integer.MAX_VALUE);
        reposicion.setNombreEmpleado("Juan Perez");
        reposicion.setMotivo("Extravío");
        reposicion.setMensaje("Casco extraviado");
        reposicion.setTelefono("555-5555-55");
        reposicion.setCorreo("test@test.mx");
        reposicion.setDescripcionCorta("Casco");
        InputStream is = null;
        byte[] archivo = null;

        AutorizanteDto autorizanteDto = new AutorizanteDto();
        autorizanteDto.setEmail("ogarciago@elektra.com.mx");
        autorizanteDto.setNombre("NOMBRE PRUEBA");
        autorizanteDto.setPuesto("PUESTO PRUEBA");
        try {
            is = ReposicionesServiceTest.class.getResourceAsStream("/Logo.jpg");
            archivo = IOUtils.toByteArray(is);
        } finally {
            if (is != null) {
                is.close();
            }
        }

        String nombre = "Logo Azteca Servicios Financieros.JPG";
        String tipo = "JPEG";

        expect(mockDao.consultaCorreoAutorizantes(Integer.MAX_VALUE)).andReturn(Arrays.asList(autorizanteDto));
        expect(mockDao.insertaReposicion(reposicion)).andReturn(Integer.MAX_VALUE);
        replay(mockDao);

        ReposicionResponse result = service.solicitaReposicion(reposicion, archivo, nombre, tipo);
        assertNotNull(result);
        assertEquals((Integer) 0, result.getCodigo());
        assertEquals((Integer) Integer.MAX_VALUE, result.getFolioReposicon());
        assertEquals("Nombre Prueba", result.getAutorizante().getNombre());
        assertEquals("Puesto Prueba", result.getAutorizante().getPuesto());
        verify(mockDao);
    }

    @Test
    public void testSolicitarReposicion() throws IOException {
        ReposicionDto reposicion = new ReposicionDto();
        reposicion.setIdEmpleado(Integer.MAX_VALUE);
        reposicion.setNombreEmpleado("Juan Perez");
        reposicion.setMotivo("Extravío");
        reposicion.setMensaje("Casco extraviado");
        reposicion.setTelefono("555-5555-55");
        reposicion.setCorreo("test@test.mx");
        reposicion.setDescripcionCorta("Casco");

        expect(mockDao.consultaCorreoAutorizantes(Integer.MAX_VALUE)).andReturn(new ArrayList<AutorizanteDto>());
        expect(mockDao.insertaReposicion(reposicion)).andReturn(Integer.MAX_VALUE);
        replay(mockDao);

        ReposicionResponse result = service.solicitaReposicion(reposicion, null, null, null);
        assertNotNull(result);
        assertEquals((Integer) 0, result.getCodigo());
        assertEquals((Integer) Integer.MAX_VALUE, result.getFolioReposicon());
        verify(mockDao);
    }
}
