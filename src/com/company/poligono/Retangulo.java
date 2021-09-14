package com.company.poligono;

public class Retangulo {
    private Integer base;
    private Integer altura;
    private Integer area;

    public Retangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;

    }

    public Integer calcularArea(){
        area = base * altura;
        return area;
    }


    public Integer calcularPerimetro(){
        return (base * 2) + (altura * 2);
    }


    public Integer getBase() {
        return base;
    }

    public Integer getAltura() {
        return altura;
    }

    public Integer getArea() {
        return area;
    }
}
