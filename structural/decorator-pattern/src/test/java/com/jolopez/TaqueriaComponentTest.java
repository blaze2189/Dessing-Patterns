package com.jolopez;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TaqueriaComponentTest {

    @Test
    public void taqueriaCarnitasConBarra(){
        assertTrue(true);
            ITaqueria taqueria = new TaqueriaComponent("carnitas");
            taqueria = new MesasDecorator(taqueria);
            taqueria = new BarraDecorator(taqueria);
            taqueria.decorate();

            taqueria = new PagoTarjetaDecorator(taqueria);
            taqueria.decorate();

            taqueria = new MesasDecorator(new BarraDecorator(new ServicioParaLllevarDecorator(new TaqueriaComponent("carnitas"))));
            taqueria.decorate();
            assertTrue(true);
    }




}