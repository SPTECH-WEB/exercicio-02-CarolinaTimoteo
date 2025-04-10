package com.example.exercicio02.service;

import org.springframework.stereotype.Component;

@Component
public class TerceirizadaFrete implements FreteStrategy {
    @Override
    public  double calcular(double peso){
        return peso * 2.0  + 15;
    }

    @Override
    public String tipo(){
        return "Terceirizada";
    }
}
