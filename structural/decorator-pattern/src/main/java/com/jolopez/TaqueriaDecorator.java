package com.jolopez;

public abstract class TaqueriaDecorator implements ITaqueria{

    private ITaqueria taqueria;

    protected TaqueriaDecorator(ITaqueria taqueria) {
        this.taqueria = taqueria;
    }

    @Override
    public void decorate() {
        taqueria.decorate();
    }

}
