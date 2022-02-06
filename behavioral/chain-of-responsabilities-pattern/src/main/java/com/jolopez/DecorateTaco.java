package com.jolopez;

public abstract class DecorateTaco implements ITaco{

    private ITaco tacoComponent;

    protected DecorateTaco(ITaco tacoComponent) {
        this.tacoComponent=tacoComponent;
    }

    @Override
    public void decorte() {
        tacoComponent.decorte();
    }
}
