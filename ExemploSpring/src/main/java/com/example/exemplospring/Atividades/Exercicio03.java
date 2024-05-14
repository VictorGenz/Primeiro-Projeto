package com.example.exemplospring.Atividades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio03 {
   @GetMapping("lerfatorial")
    public String lerfatorial(@RequestParam String numero) {
       int f =1;
       int c = Integer.parseInt(numero);
       String s ="";
while(c>+1){
    f*=c;
    if(c ==1){
        s+=c;
    }
    else if (c>1){
        s+=c +"x";
    }
    c--;
}

 return s + "oi";
   }
}
