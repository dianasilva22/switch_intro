package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ciclos_IVTest {

    private Ciclos_IV sut;

    @Before
    public void StartUp() {
        this.sut = new Ciclos_IV();
    }

    @Test
    public void verSeMediaDosAlgarismosDeNumeroFunciona() {
        double resultado = sut.mediaDosAlgarismosDeNumero(14856);
        assertEquals(4.8, resultado, 0.001);
    }

    @Test
    public void verSeSomaDeAlgarismosDeNumeroFunciona() {
        int resultado = sut.somaDosAlgarismosDeNumero(12356);
        assertEquals(17, resultado);
    }

    @Test
    public void verSeNumeroSimetricoFunciona_TesteBasico() {
        int resultado = sut.numeroSimetrico(14856);
        assertEquals(65841, resultado);
    }

    @Test
    public void verSeNumeroSimetricoFunciona_comZeroNoMeio() {
        int resultado = sut.numeroSimetrico(14206);
        assertEquals(60241, resultado);
    }

    @Test
    public void verSeNumeroSimetricoFunciona_comZeroNoFim() {
        int resultado = sut.numeroSimetrico(140);
        assertEquals(41, resultado);
    }

    @Test
    public void verSeIsCapicuaFunciona() {
        boolean resultado = sut.isCapicua(323);
        assertTrue(resultado);
    }

    @Test
    public void verSeIsCapicuaFunciona_numeroMenorQueDez() {
        boolean resultado = sut.isCapicua(9);
        assertFalse(resultado);
    }

    @Test
    public void verSeIsCapicuaFunciona_numeroNaoECapicua() {
        boolean resultado = sut.isCapicua(123);
        assertFalse(resultado);
    }

    @Test
    public void verSePrimeiraCapicuaNumIntervaloFunciona() {
        int resultado = sut.primeiraCapicuaNumIntervalo(1, 20);
        assertEquals(11, resultado);
    }

    @Test
    public void verSePrimeiraCapicuaNumIntervaloFunciona_Limite1MaiorQueLimite2() {
        int resultado = sut.primeiraCapicuaNumIntervalo(20, 1);
        assertEquals(11, resultado);
    }

    @Test
    public void verSeMaiorCapicuaNumIntervaloFunciona() {
        int resultado = sut.maiorCapicuaNumIntervalo(1, 25);
        assertEquals(22, resultado);
    }

    @Test
    public void verSeMaiorCapicuaNumIntervaloFunciona_LimitesTrocados() {
        int resultado = sut.maiorCapicuaNumIntervalo(25, 1);
        assertEquals(22, resultado);
    }

    @Test
    public void verQtdDeCapicuasNumIntervaloFunciona() {
        int resultado = sut.qtdDeCapicuasNumIntervalo(1, 25);
        assertEquals(2, resultado);
    }

    @Test
    public void verQtdDeCapicuasNumIntervaloFunciona_LimitesTrocados() {
        int resultado = sut.qtdDeCapicuasNumIntervalo(25, 1);
        assertEquals(2, resultado);
    }

    @Test
    public void verSeIsArmstrongFunciona() {
        boolean resultado = sut.isArmstrong(153);
        assertTrue(resultado);
    }

    @Test
    public void verSePrimeiroArmstrongNumIntervaloFunciona() {
        int resultado = sut.primeiroArmstrongNumIntervalo(11, 200);
        assertEquals(153, resultado);
    }

    @Test
    public void verSePrimeiroArmstrongNumIntervaloFunciona_LimitesTrocados() {
        int resultado = sut.primeiroArmstrongNumIntervalo(200, 11);
        assertEquals(153, resultado);
    }

    @Test
    public void verSeQtdDeArmstrongsNumIntervaloFunciona() {
        int resultado = sut.qtdDeArmstrongsNumIntervalo(1, 200);
        assertEquals(10, resultado);
    }

    @Test
    public void verSeQtdDeArmstrongsNumIntervaloFunciona_LimitesTrocados() {
        int resultado = sut.qtdDeArmstrongsNumIntervalo(200, 1);
        assertEquals(10, resultado);
    }
}