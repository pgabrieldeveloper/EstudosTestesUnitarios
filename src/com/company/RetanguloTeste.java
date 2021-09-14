package com.company;

import com.company.poligono.Retangulo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RetanguloTeste {

    private Integer base;
    private Integer altura;
    private Integer area;
    private Integer perimetro;

    @Parameterized.Parameters
    public static Collection<Object[]> parametros () {
        return Arrays.asList(new Object[][]{
                {20,10,200,60},
                {30,20,600,100}
        });
    }


    public RetanguloTeste(Integer base ,Integer altura, Integer area, Integer perimetro){
        this.base = base;
        this.altura = altura;
        this.area = area;
        this.perimetro = perimetro;
    }

    @Test
    public void testeCalculoDeArea() {
        Retangulo retangulo = new Retangulo(base,altura);
        Assert.assertEquals(area, retangulo.calcularArea());
    }

    @Test
    public void testeCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(base,altura);
        Assert.assertEquals(perimetro, retangulo.calcularPerimetro());
    }

}
