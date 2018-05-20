package Com.Elektra.Uniformes.Dao;

import Com.Elektra.Uniformes.Dto.EncuestaDto;
import Com.Elektra.Uniformes.Dto.PreguntaDto;
import Com.Elektra.Uniformes.Dto.RespuestaDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao-context.xml")
public class EncuestaDaoTest {

    @Autowired
    EncuestaDao dao;

    @Test
    public void testConsultaEncuestaPendiente() {
        Integer idEmpleado = 158011;
        EncuestaDto result = dao.consultaEncuestaPendiente(idEmpleado);
        assertNotNull(result);
        assertNotNull(result.getIdEncuesta());
        assertNotNull(result.getTitulo());
        assertNotNull(result.getDescripcion());
        assertNotNull(result.getVigencia());
        assertNotNull(result.getRegistro());
        assertNotNull(result.getPreguntas());
        assertNotNull(result.getIdSucursal());
        assertNotNull(result.getSucursal());
        assertTrue(result.getPreguntas().size() > 0);
        for (PreguntaDto pregunta : result.getPreguntas()) {
            assertNotNull(pregunta.getIdPregunta());
            assertNotNull(pregunta.getOrden());
            assertNotNull(pregunta.getTexto());
            assertNotNull(pregunta.getRegistro());
            assertNotNull(pregunta.getRespuestas());
            assertTrue(pregunta.getRespuestas().size() > 0);
            for (RespuestaDto resp : pregunta.getRespuestas()) {
                assertNotNull(resp.getIdRespuesta());
                assertNotNull(resp.getOrden());
                assertNotNull(resp.getTexto());
                assertNotNull(resp.getRegistro());
            }
        }
    }

    @Test
    @Transactional
    @Rollback
    public void testGuardarRespuestas() {
        PreguntaDto pregunta = new PreguntaDto();
        pregunta.setIdPregunta(1);
        pregunta.setIdRespuestaSeleccionada(1);
        EncuestaDto encuesta = new EncuestaDto();
        encuesta.setIdEmpleado(158011);
        encuesta.setIdEncuesta(1);
        encuesta.setComentarios("Prueba unitaria");
        encuesta.setPreguntas(new ArrayList<PreguntaDto>());
        encuesta.getPreguntas().add(pregunta);

        Integer result = dao.guardarRespuestas(encuesta);
        assertNotNull(result);
        assertTrue(result != 0);
    }
}
