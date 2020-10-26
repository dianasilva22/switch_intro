package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Vetores_VITest {

    private Vetores_VI sut;

    @Before
    public void StartUp() {
        this.sut = new Vetores_VI();
    }

    @Test
    public void verSeNumeroDeElementosDeUmArrayFunciona() {
        int resultado = sut.numeroDeElementosDeUmArray(new int[]{1, 2, 3});
        assertEquals(3, resultado);
    }

    @Test
    public void verSeMaiorElementoDeUmArrayFunciona() {
        int resultado = sut.maiorElementoDoArray(new int[]{5, 2, 3,10,6});
        assertEquals(10, resultado);
    }

    @Test
    public void verSeMaiorElementoDeUmArrayVersao2Funciona() {
        double resultado = sut.maiorElementoDoArrayVersao2(new double[]{5, 2, 3,10,6});
        assertEquals(10, resultado,0.01);
    }
    @Test
    public void verSeMenorElementoDeUmArrayFunciona() {
        int resultado = sut.menorElementoDoArray(new int[]{5, 2, 3,10,6});
        assertEquals(2, resultado);
    }
    @Test
    public void verSeContaElementosNaoNulosFunciona() {
        int resultado = sut.contaElementosNaoNulos(new int[]{5, 0, 3,10,6});
        assertEquals(4, resultado);
    }

    @Test
    public void verSeCalculaMediaDeElementosDeArrayFunciona() {
        double resultado = sut.calculaMediaDosElementosDeArray(new int[]{5, 5, 3,10,6});
        assertEquals(5.8, resultado,0.001);
    }

    @Test
    public void verSeCalculaMediaDeElementosParesDeArrayFunciona() {
        double resultado = sut.calculaMediaDosElementosParesDeArray(new int[]{5, 2, 3,10,6});
        assertEquals(6, resultado,0.001);
    }

    @Test
    public void calculaMediaDeElementosDeArrayMultiplosDeNumero(){
        double resultado = sut.calculaMediaDeElementosDeArrayMultiplosDeNumero(new int[]{2,5,7,10},2);
        assertEquals(6,resultado,0.001);
    }

    @Test
    public void verificaSeArrayEstaVazio_TesteComArrayVazio(){
        boolean resultado = sut.verificaSeArrayEstaVazio(new int[]{});
        assertTrue(resultado);
    }

    @Test
    public void verificaSeArrayEstaVazio_TesteComArrayPreenchido(){
        boolean resultado = sut.verificaSeArrayEstaVazio(new int[]{5,3,6});
        assertFalse(resultado);
    }

    @Test
    public void verificaSeArrayTemUmElemento_TesteComArrayDeUmElemento(){
        boolean resultado = sut.verificaSeArrayTemApenasUmElemento(new int[]{5});
        assertTrue(resultado);
    }

    @Test
    public void verificaSeArrayTemUmElemento_TesteComArrayComVariosElemento(){
        boolean resultado = sut.verificaSeArrayEstaVazio(new int[]{5,3,6});
        assertFalse(resultado);
    }

    @Test
    public void verificaSeArraySoTemElementosPares_TesteComArrayDePares(){
        boolean resultado = sut.verificaSeArraySoTemElementosPares(new int[]{2,4,6});
        assertTrue(resultado);
    }

    @Test
    public void verificaSeArraySoTemElementosPares_TesteComArrayComImpares(){
        boolean resultado = sut.verificaSeArraySoTemElementosPares(new int[]{2,3,6});
        assertFalse(resultado);
    }

    @Test
    public void verificaSeArrayTemElementosDuplicados_TesteComArrayComElementosDuplicado(){
        boolean resultado = sut.verificaSeArrayTemElementosDuplicados(new int[]{2,3,6,2});
        assertTrue(resultado);
    }

    @Test
    public void verificaSeArrayTemElementosDuplicados_TesteComArraySemElementosDuplicado(){
        boolean resultado = sut.verificaSeArrayTemElementosDuplicados(new int[]{2,3,6,5});
        assertFalse(resultado);
    }

}