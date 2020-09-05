package com.github.fernandoenf.eskillo.controller;

import com.github.fernandoenf.eskillo.model.Localidade;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalidadeController {
    
    @GetMapping("/localidades")
    public String obterLocalidade() {
        return "GET LOCALIDADE FUNCIONANDO!";
    }

    @PostMapping("/localidades")
    public String postLocalidade(){
        return "POST LOCALIDADE FUNCIONANDO!";
    }
    @PutMapping("/localidades")
    public String putLocalidade(){
        return "PUT LOCALIDADE FUNCIONANDO!";

    }
    @DeleteMapping("/localidades")
    public String deleteLocalidade(){
        return "DELETE LOCALIDADE FUNCIONANDO!";
    }
}
