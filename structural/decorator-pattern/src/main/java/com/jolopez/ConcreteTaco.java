package com.jolopez;

public class ConcreteTaco implements ITaco{

    private String tipo;

    public ConcreteTaco(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public void decorte() {
        System.out.println(String.format("Taco de %s",tipo));
    }
}
