package ${package}.${rootArtifactId}.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {

    @GetMapping("")
    @ResponseBody
    public String olaMundo(){
        return "Olá Mundo!";
    }

}
