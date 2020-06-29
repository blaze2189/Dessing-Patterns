package com.jolopez;

public class DecorateTacoCebolla extends DecorateTaco{
    protected DecorateTacoCebolla(ITaco tacoComponent) {
        super(tacoComponent);

    }

    @Override
    public void decorte() {
        super.decorte();
        System.out.println("con cebolla");
    }
}
