package com.jolopez;

public class BarraDecorator extends TaqueriaDecorator{


    protected BarraDecorator(ITaqueria taqueria) {
        super(taqueria);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("\ncon barra");
    }
}
