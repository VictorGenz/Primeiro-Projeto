package com.example.exemplospring.Atividades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio02 {
    @GetMapping("lernumeroromano")
    public String lernumeroromano(@RequestParam String numRom) {
        int contagem = numRom.length();
        int valor =0;
        for (int i = contagem - 1; i >= 0; i--) {

            switch (numRom.charAt(i)) {
                case 'i':
                    valor=valor+1;
                    break;
                case 'v':
                    valor=valor+5;
                    break;
                case 'x':
                    valor=valor+10;
                    break;

            }

        }
return valor+"";
    }
}



