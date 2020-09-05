package com.github.fernandoenf.eskillo.controller;

import com.github.fernandoenf.eskillo.model.Localidade;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalidadeController {
    
    @GetMapping("/localidades")
    public String obterLocalidade() {
        return "GET LOCALIDADE FUNCIONANDO!";
    }

    @PostMapping("/localidades")
    public HttpStatus postLocalidade(@RequestBody Localidade temp) {
        Localidade nova = new Localidade(null, null, null);
        nova.setId(temp.getId());
        nova.setNome(temp.getNome());
        nova.setUf(temp.getUf());
        System.out.printf("Foi adicionada a localidade de Nome:%s, Uf:%s, ID:%d", temp.getNome(),temp.getUf(), temp.getId());
        return HttpStatus.OK;
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
