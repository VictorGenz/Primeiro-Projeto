package com.example.exemplospring.Atividades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio07 {
    @GetMapping("Primo")
    public String mostrarPrimo(@RequestParam double num) {
        boolean primo1 = true;
        for(int j = 2;j<num;j++) {
            if(num%j == 0) {
                primo1 = false;
            }
            if(primo1) {
                return "O número " + num + " é primo";
            } else {
                return "O número "+num+" não é primo";
            }}
        return "gg bois";

    }
}
