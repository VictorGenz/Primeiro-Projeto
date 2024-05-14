package com.example.exemplospring.Atividades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio09 {
    @GetMapping("Trinangulo")
    public String Trinangulo(@RequestParam int largura,@RequestParam int altura) {
        double area = ((largura * altura)/2);
        return area + "";
    }
}
