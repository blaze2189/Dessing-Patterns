package com.jolopez;

public class DecorateTacoSalsaRoja extends DecorateTaco{
    protected DecorateTacoSalsaRoja(ITaco tacoComponent) {
        super(tacoComponent);
    }

    @Override
    public void decorte() {
        super.decorte();
        System.out.println("con salsa roja");
    }
}
