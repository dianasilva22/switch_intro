package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtraTest {

    private Extra sut;

    @Before
    public void StartUp() {
        this.sut = new Extra();
    }

    @Test
    public void verSetransformaDecimaisEmBinariosFunciona() {
        int resultado = sut.transformaDecimaisEmBinarios(25);
        assertEquals(11001, resultado);
    }

    @Test
    public void ordenaArrayDeFormaCrescente(){
        int[] resultado=sut.ordenaArrayDeFormaCrescente(new int[]{11,2,9,6});
        assertArrayEquals(new int[]{2,6,9,11},resultado);
    }

    @Test
    public void ordenaArrayDeFormaDecrescente(){
        int[] resultado=sut.ordenaArrayDeFormaDecrescente(new int[]{5,2,9,6});
        assertArrayEquals(new int[]{9,6,5,2},resultado);
    }

    @Test
    public void multiplicaDoisArrays(){
        int[] resultado=sut.multiplicaDoisArrays(new int[]{5,2,9,6},new int[]{2,3,2,2});
        assertArrayEquals(new int[]{10,6,18,12},resultado);
    }

    @Test
    public void multiplicaDoisArrays_ArraysDeTamanhosDiferentes(){
        int[] resultado=sut.multiplicaDoisArrays(new int[]{5,2,9,6},new int[]{2,3,2});
        assertArrayEquals(new int[]{10,6,18},resultado);
    }

    @Test
    public void multiplicaNArrays_ArraysComOMesmoTamanho(){
        int[] resultado=sut.multiplicarNArrays(new int[][]{{5,2,9,6},{2,3,2,2},{2,2,2,2}});
        assertArrayEquals(new int[]{20,12,36,24},resultado);
    }

    @Test
    public void multiplicaNArrays_ArraysComTamanhoDiferente(){
        int[] resultado=sut.multiplicarNArrays(new int[][]{{5,2,9,6},{2,3,2,2},{2,2,2}});
        assertArrayEquals(new int[]{20,12,36},resultado);
    }

    @Test
    public void verificaSeContemArray(){
        int resultado=sut.getPosicaoInicioSubArray(new int[]{1,2,3,4,5,6,7},new int[]{3,4,5});
        assertEquals(2,resultado);
    }

    @Test
    public void verificaSeContemArray_naoContem(){
        int resultado=sut.getPosicaoInicioSubArray(new int[]{1,2,3,4,5,6,7},new int[]{3,6,6});
        assertEquals(-1,resultado);
    }

    @Test
    public void verificaSeContemArray_SubArrayMaiorQueArrayNum(){
        int resultado=sut.getPosicaoInicioSubArray(new int[]{1,2,3,4},new int[]{3,6,6,9,7});
        assertEquals(-1,resultado);
    }

    @Test
    public void devolveArraySemNumero_BasicTest(){
        int[] resultado = sut.devolveArraySemUmNumero(new int[]{1,2,3,4},2);
        assertArrayEquals(new int[]{1,3,4},resultado);
    }

    @Test
    public void devolveArraySemNumero_RepeatingNumber(){
        int[] resultado = sut.devolveArraySemUmNumero(new int[]{1,2,3,4,2},2);
        assertArrayEquals(new int[]{1,3,4,2},resultado);
    }

    @Test
    public void devolveArraySemNumero_NumeroNaoEstaContido(){
        int[] resultado = sut.devolveArraySemUmNumero(new int[]{1,3,4},2);
        assertArrayEquals(new int[]{1,3,4},resultado);
    }
}