package br.com.tarefa_02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping("/pg1")
    public String pg1(){
        return "pg1";
    }

    @GetMapping("/pg2")
    public String pg2(){
        return "pg2";
    }

    @GetMapping("/pg3")
    public String pg3(){
        return "pg3";
    }
}