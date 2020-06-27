package com.jolopez;

public class MesasDecorator extends TaqueriaDecorator {

    protected MesasDecorator(ITaqueria taqueria) {
        super(taqueria);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println(String.format("\ncon %d mesas",calcularMesas()));
    }

    private Integer calcularMesas(){
        //return ThreadLocalRandom.current().nextInt(5,10);
        return 5;
    }

}
