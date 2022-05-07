package ${package}.${rootArtifactId}.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
//    @Bean
//    public HandlerAdapter handlerAdapter() {
//        return new MyHandlerAdapter();
//    }
//
//    @Bean
//    @Primary
//    public HandlerMapping handlerMapping() {
//        return new MyHandlerMapping();
//    }

//    @Bean
//    @Primary
//    public RequestMappingHandlerMapping requestMappingHandlerMapping(){
//        return new MyUrlHandlerMapping();
//    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


}
