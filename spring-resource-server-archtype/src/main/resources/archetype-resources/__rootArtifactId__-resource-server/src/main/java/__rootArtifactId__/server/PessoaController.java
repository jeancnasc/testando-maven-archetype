package ${package}.${rootArtifactId}.server;

import ${package}.${rootArtifactId}.api.PessoaApi;
import ${package}.${rootArtifactId}.api.PessoaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController implements PessoaApi {

    @Autowired
    @Qualifier("db")
    private PessoaRepository pessoaRepository;


    @Override
    public PessoaDto recuperar( Long id) {
        return pessoaRepository.recuperar(id);
    }
}
