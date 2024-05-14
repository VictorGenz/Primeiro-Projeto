package com.example.exemplospring.Atividades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio01 {
        @GetMapping("conversao")
    public String recebenumero(@RequestParam String x){
     int valDecimal=0;
     for(int i=x.length()-1; i>=0; i--){
         if(x.charAt(i)=='1'){
             valDecimal += Math.pow(2, i);
         }
     }
            return valDecimal+"";


    }

}
