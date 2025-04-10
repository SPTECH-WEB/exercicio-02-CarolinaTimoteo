package com.example.strategy.service;

import org.springframework.stereotype.Component;

@Component
public class ExpressaFrete implements FreteStrategy{
    @Override
    public double calcular(double peso){
        return peso * 2.5;
    }
    @Override
    public String tipo(){
        return "Expressa";
    }
}
