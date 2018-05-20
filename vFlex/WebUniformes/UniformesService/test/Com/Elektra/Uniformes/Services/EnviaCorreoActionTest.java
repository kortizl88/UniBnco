package Com.Elektra.Uniformes.Services;

import Com.Elektra.Uniformes.Services.resp.ServiceResponse;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class EnviaCorreoActionTest {
    EnviaCorreoService service = new EnviaCorreoService();

    @Test
    public void testEnviaCorreo() {
        Integer idEmp = 123456;
        String nombre = "Aqui Va El Nombre";
        String email = "ogarciago@elektra.com.mx";
        String telefono = "55-5555-5555";
        String mensaje = "Esto es un mensaje de prueba, favor de ignorar.";
        String asunto = "Email prueba.";
        ServiceResponse resp = service.enviaCorreo(idEmp, nombre, email, telefono, mensaje, asunto);
        assertNotNull(resp);
        assertEquals(0, (int) resp.getCodigo());
    }
}
