package com.example.exemplospring.Atividades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio06 {
    @GetMapping("Media")
    public String media(@RequestParam String nota1, @RequestParam String nota2, @RequestParam String nota3) {
        double nota1Double = Double.parseDouble(nota1);
        double nota2Double = Double.parseDouble(nota2);
        double nota3Double = Double.parseDouble(nota3);
        double media = (nota1Double + nota2Double + nota3Double) / 3;
        return String.format("%.2f", media);
    }
}
