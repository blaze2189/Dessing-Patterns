package com.jolopez;

public class ServicioParaLllevarDecorator extends TaqueriaDecorator{

    protected ServicioParaLllevarDecorator(ITaqueria taqueria) {
        super(taqueria);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("\nservicio para llevar");
    }

}
