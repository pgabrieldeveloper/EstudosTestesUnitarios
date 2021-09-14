package com.company;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTestes {

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        Long resultadaoEsperado = 10L;
        Long soma = calculadora.soma(5L, 5L);
        Assert.assertEquals(resultadaoEsperado, soma);
    }

}
