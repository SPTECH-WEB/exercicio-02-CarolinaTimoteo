package com.example.exercicio02.service;

import org.springframework.stereotype.Component;

@Component
public class EconomicaFrete implements  FreteStrategy{
    @Override
    public double calcular(double peso){
        return peso * 1.0;
    }

    @Override
    public String tipo(){
        return "Econômica";
    }
}
