package com.jolopez;

public class DecorateTacoSalsaVerde extends DecorateTaco{
    protected DecorateTacoSalsaVerde(ITaco tacoComponent) {
        super(tacoComponent);
    }

    @Override
    public void decorte() {
        super.decorte();
        System.out.println("con salsa verde");
    }
}
