package com.example.exemplospring.Atividades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio08 {
    @GetMapping("Horatomin")
    public String Horatomin(@RequestParam double hora) {
        double min = hora * 60;
        return min + "";
    }
}
