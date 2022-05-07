package ${package}.${rootArtifactId}.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(OlaMundoController.class)
public class OlaMundoTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void statusOk() throws Exception {
//        RestTemplate client = new RestTemplate();

//        ResponseEntity<RecursoStatus> resposta = client.getForEntity("http://localhost:8080/status", RecursoStatus.class);
//
//        assertNotNull(resposta);
//        assertEquals(HttpStatus.OK,resposta.getStatusCode());
//        assertNotNull(resposta.getBody());
//        assertEquals("",resposta.getBody().getNome());
//        assertEquals("",resposta.getBody().getMensagem());
//        assertEquals(Status.OK,resposta.getBody().getStatus());
//        assertNotNull(resposta.getBody().getDependencias());
//        assertEquals(2,resposta.getBody().getDependencias().size());
        mvc.perform(MockMvcRequestBuilders.get("/olamundo"))
                .andExpect(status().isOk())
                .andExpect(content().string("Olá Mundo!"));

    }


}