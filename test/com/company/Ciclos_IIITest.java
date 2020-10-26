package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ciclos_IIITest {
    private Ciclos_III sut;

    @Before
    public void StartUp() {
        this.sut = new Ciclos_III();
    }

    @Test
    public void verSeNumAlgarismosFunciona_BasicTest() {
        int resultado = sut.numAlgarismos(250000);
        assertEquals(6, resultado);
    }

    @Test
    public void verSeNumAlgarismosFunciona_TesteComUmAlgarismo() {
        int resultado1 = sut.numAlgarismos(2);
        assertEquals(1, resultado1);
    }

    @Test
    public void verSeQtdAlgarismosParesNoNumeroFunciona_BasicTest() {
        int resultado = sut.qtdAlgarismosParesdeNumero(125469);
        assertEquals(3, resultado);
    }

    @Test
    public void verSeQtdAlgarismosParesNoNumeroFunciona_NumeroSemAlgarismosPares() {
        int resultado2 = sut.qtdAlgarismosParesdeNumero(11111);
        assertEquals(0, resultado2);
    }

    @Test
    public void verSeQtdAlgarismosImparesNoNumeroFunciona() {
        int resultado = sut.qtdAlgarismosImparesdeNumero(125469);
        assertEquals(3, resultado);
    }

    @Test
    public void verSeQtdAlgarismosImparesNoNumeroFunciona_NumeroSemAlgarismosImpares() {
        int resultado2 = sut.qtdAlgarismosImparesdeNumero(22222);
        assertEquals(0, resultado2);
    }

    @Test
    public void verSeMediaAlgarismosParesNoNumeroFunciona() {
        double resultado = sut.mediaAlgarismosParesDeNumero(125469);
        assertEquals(2.0, resultado, 0.01);

    }

    @Test
    public void verSeNumeroSemAlgarismosParesFunciona() {
        int resultado = sut.numeroSemAlgarismosPares(1458);
        assertEquals(15, resultado);
    }
}