package com.jolopez;

public class TaqueriaComponent implements ITaqueria {

    private String tipoTaqueria;

    public TaqueriaComponent(String tipoTaqueria) {
        this.tipoTaqueria = tipoTaqueria;
    }

    @Override
    public void decorate() {
        System.out.println(String.format("Taqueria tipo: %s",tipoTaqueria));
    }

}
