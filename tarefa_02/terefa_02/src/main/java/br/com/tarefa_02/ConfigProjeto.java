package br.com.tarefa_02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProjeto {
    @Bean(name = "porta")
    public String porta(){
        return "http://localhost:5000/";
    }
}
