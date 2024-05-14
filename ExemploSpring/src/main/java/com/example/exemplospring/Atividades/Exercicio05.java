package com.example.exemplospring.Atividades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio05 {
    @GetMapping("Conversaodetemp")
    public String Conversaodetemp(@RequestParam String temp) {
double tempCelc = Double.parseDouble(temp);
double temFah = tempCelc * 1.8 + 32;

return temFah + "" +"°";

    }
}
