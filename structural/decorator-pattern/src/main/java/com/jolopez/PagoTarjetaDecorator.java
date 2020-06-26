package com.jolopez;

import java.util.concurrent.ThreadLocalRandom;

public class PagoTarjetaDecorator extends TaqueriaDecorator{

    protected PagoTarjetaDecorator(ITaqueria taqueria) {
        super(taqueria);
    }

    public void decorate() {
        super.decorate();
        System.out.println(String.format( "\nPago con: %s",analizarOpciones()));
    }

    private String analizarOpciones(){

        return "Visa, Master Card";

    }

}
