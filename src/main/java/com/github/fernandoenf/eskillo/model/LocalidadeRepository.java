package com.github.fernandoenf.eskillo.model;

import java.util.ArrayList;

public class LocalidadeRepository {
    ArrayList<Localidade> databank = new ArrayList<Localidade>();
    
    public void adicionar(Localidade temp) {
        databank.add(temp);
    }   
}
