package com.example.exemplospring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {
    @GetMapping("ping")
    public String ping() {
        return "pong";
    }
    @GetMapping("nome/{}")
public String recebenome(@PathVariable String nome) {
        return "O nome incerido foi: " + nome;
    }
@GetMapping("soma")
    public String recebesoma(@RequestParam int x ,@RequestParam int y) {
        return "A soma dos valores" + (x+y);

}


}
