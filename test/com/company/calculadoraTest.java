package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculadoraTest {

    private Calculadora sut;

    @Before
    public void StartUp() {
        this.sut = new Calculadora();
    }

    @Test
    public void verSeSoma() {
        int resultado = sut.soma(1, 2);
        assertEquals(3, resultado);
    }

    @Test
    public void somaComZero() {
        int resultado = sut.soma(1, 0);
        assertEquals(1, resultado);
    }

    @Test
    public void verSeSubtrai() {
        int resultado = sut.subtrair(2, 1);
        assertEquals(1, resultado);
    }

    @Test
    public void verSeMultiplica() {
        int resultado = sut.multiplicar(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    public void multiplicarPorZero() {
        int resultado = sut.multiplicar(2, 0);
        assertEquals(0, resultado);
        int resultado2 = sut.multiplicar(0, 2);
        assertEquals(0, resultado);
    }

    @Test
    public void verSeDivide() {
        double resultado = sut.dividir(4, 2);
        assertEquals(2, resultado, 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void dividirPorZero() {
        int resultado = sut.dividir(4, 0);
    }

    @Test
    public void doubleDividirPorZero() {
        double resultado = sut.dividir(4.3, 0);
        assertEquals(Double.POSITIVE_INFINITY, resultado, 0.001);
    }

    @Test
    public void verSePotenciaFunciona_BasicTest() {
        int resultado = sut.potencia(2, 2);
        assertEquals(4, resultado);
    }

    @Test
    public void verSePotenciaFunciona_ExpoenteZero() {
        int resultado = sut.potencia(2, 0);
        assertEquals(1, resultado);
    }

    @Test
    public void verSeRaizQuadradaDa() {
        double resultado = sut.raizQuadrada(4);
        assertEquals(2, resultado, 0.001);
    }

    @Test
    public void raizQuadradaNumeroNegativo() {
        double resultado = sut.raizQuadrada(-4);
        boolean isNaN = Double.isNaN(resultado);
        assertTrue(isNaN);
    }

    @Test
    public void verSeONumeroEPar() {
        boolean resultado = sut.numeroEPar(2);
        assertTrue(resultado);
    }

    @Test
    public void verSeONumeroNaoEPar() {
        boolean resultado = sut.numeroEPar(3);
        assertFalse(resultado);
    }

    @Test
    public void verSeEPrimoFunciona() {
        boolean resultado = sut.ePrimo(3);
        assertTrue(resultado);
    }

    @Test
    public void verSeONumeroNaoEPrimo() {
        boolean resultado = sut.ePrimo(4);
        assertFalse(resultado);
    }

}