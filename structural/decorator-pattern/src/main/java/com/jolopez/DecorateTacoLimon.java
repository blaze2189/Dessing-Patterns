package com.jolopez;

public class DecorateTacoLimon extends  DecorateTaco{
    protected DecorateTacoLimon(ITaco tacoComponent) {
        super(tacoComponent);
    }

    @Override
    public void decorte() {
        super.decorte();
        System.out.println("con limon");
    }
}
