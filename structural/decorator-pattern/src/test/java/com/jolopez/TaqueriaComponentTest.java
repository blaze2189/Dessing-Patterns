package com.jolopez;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class TaqueriaComponentTest extends TestCase {

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

    }




}