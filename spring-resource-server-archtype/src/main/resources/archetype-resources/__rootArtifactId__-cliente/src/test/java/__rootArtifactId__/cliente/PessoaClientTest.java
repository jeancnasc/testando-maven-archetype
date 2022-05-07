package ${package}.${rootArtifactId}.cliente;

import ${package}.${rootArtifactId}.api.PessoaApi;
import ${package}.${rootArtifactId}.api.PessoaClientConfig;
import ${package}.${rootArtifactId}.api.PessoaDto;
import ${package}.${rootArtifactId}.server.App;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PessoaClientConfig.class, App.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class PessoaClientTest {

    @Autowired
    private PessoaApi client;

    @Test
    public void statusOk() {
        PessoaDto p = client.recuperar(1L);

        Assert.assertEquals(Long.valueOf(1L), p.getId());
        Assert.assertEquals("Nome " + 1, p.getNome());
    }
}
