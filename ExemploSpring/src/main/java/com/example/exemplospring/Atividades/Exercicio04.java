package com.example.exemplospring.Atividades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio04 {
@GetMapping("Palindromo")
    public String palindromo(@RequestParam String palavra){
    String palavra2 = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
        palavra2 += palavra.charAt(i);
    }
        if (palavra.equals(palavra2)) {
        return "é um palíndromo " + palavra2;
    } else {
        return "não é um palíndromo " + palavra;
}
}
}


