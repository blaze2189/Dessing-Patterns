package com.jolopez;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConcreteTacoTest {

    @Test
    public void decorate(){

        ITaco taco1 = new ConcreteTaco("pastor");
        ITaco taco2 = new ConcreteTaco("pastor");


        taco1 = new DecorateTacoLimon(new DecorateTacoCebolla(new DecorateTacoSalsaVerde(taco1)));
        taco2 = new DecorateTacoLimon(taco2);
        taco2 = new DecorateTacoCebolla(taco2);

        taco1.decorte();
        taco2.decorte();

        System.out.println("---------------");

        taco2 = new DecorateTacoSalsaRoja(taco2);
        taco2.decorte();


        taco2 = new ConcreteTaco("pastor");
        assertTrue(true);
    }

}