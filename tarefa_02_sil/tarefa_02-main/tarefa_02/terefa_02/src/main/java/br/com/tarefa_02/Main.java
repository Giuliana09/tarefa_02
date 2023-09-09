package br.com.tarefa_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.processing.Generated;

@SpringBootApplication
@RestController
public class Main {

    @GetMapping("/")
    public String index(){
        return "";
    }
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }
}