package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Vetores_VTest {

    private Vetores_V sut;

    @Before
    public void StartUp() {
        this.sut = new Vetores_V();
    }

    @Test
    public void verSeEncontraMultiplosDeTresNoIntervaloFunciona() {
        int[] resultado = sut.encontraMultiplosDeTresNoIntervalo(1, 10);
        assertArrayEquals(new int[]{3, 6, 9}, resultado);
    }

    @Test
    public void verSeDevolveMultiplosDeTresFunciona_LimitesInvertidos() {
        int[] resultado = sut.encontraMultiplosDeTresNoIntervalo(10, 1);
        assertArrayEquals(new int[]{3, 6, 9}, resultado);
    }

    @Test
    public void verSeEncontraMultiplosDeNumeroNoIntervaloFunciona() {
        int[] resultado = sut.encontraMultiplosDeUmNumeroNoIntervalo(1, 10, 2);
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, resultado);
    }

    @Test
    public void verSeEncontraMultiplosDeNumeroNoIntervaloFunciona_LimitesInvertidos() {
        int[] resultado = sut.encontraMultiplosDeUmNumeroNoIntervalo(10, 1, 2);
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, resultado);
    }

    @Test
    public void verSeEncontMultiplosDeTresECincoFunciona() {
        int[] resultado = sut.encontraMultiplosdeTresECincoNoIntervalo(1, 10);
        assertArrayEquals(new int[]{3, 5, 6, 9, 10}, resultado);
    }

    @Test
    public void verSeDevolveMultiplosDeTresECincoFunciona_LimitesInvertidos() {
        int[] resultado = sut.encontraMultiplosdeTresECincoNoIntervalo(10, 1);
        assertArrayEquals(new int[]{3, 5, 6, 9, 10}, resultado);
    }

    @Test
    public void verSeEncontraMultiplosDeDoisNumerosNoIntervaloFunciona() {
        int[] resultado = sut.encontraMultiplosDeDoisNumerosNoIntervalo(1, 10, 3, 5);
        assertArrayEquals(new int[]{3, 5, 6, 9, 10}, resultado);
    }

    @Test
    public void verSeEncontraMultiplosDeDoisNumerosNoIntervaloFunciona_LimitesInvertidos() {
        int[] resultado = sut.encontraMultiplosDeDoisNumerosNoIntervalo(10, 1, 3, 5);
        assertArrayEquals(new int[]{3, 5, 6, 9, 10}, resultado);
    }

}