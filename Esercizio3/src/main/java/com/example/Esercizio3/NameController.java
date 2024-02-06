package com.example.Esercizio3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {
    @GetMapping("/nome")
    public String getNome(@RequestParam String nome){
        return nome;
    }
    @PostMapping("/reverseName")
    public String reverseName(@RequestParam String nome){
        StringBuilder reverseName = new StringBuilder(nome);
        return reverseName.reverse().toString();
    }
}
