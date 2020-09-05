package com.github.fernandoenf.eskillo.controller;

import com.github.fernandoenf.eskillo.model.Localidade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalidadeController {
    
    @GetMapping()
    public Localidade obterLocalidade() {
        return new Localidade(id, nome, uf);
    }
}
