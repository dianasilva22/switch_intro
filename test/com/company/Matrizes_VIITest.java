package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Matrizes_VIITest {
    private Matrizes_VII sut;

    @Before
    public void StartUp() {
        this.sut = new Matrizes_VII();
    }

    @Test
    public void maiorElementoDaMatriz_BasicTest() {
        //Arrange
        int expectedResult = 29;
        int result = 0;
        int[][] matriz = new int[][]{{5, 29, 9, 6}, {2, 3, 10, 5}, {11, 21, 22}};
        //Act
        result = sut.maiorElementoDaMatriz(matriz);
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void menorElementoDaMatriz_BasicTest() {
        //Arrange
        int expectedResult = 2;
        int result = 0;
        int[][] matriz = new int[][]{{5, 29, 9, 6}, {2, 3, 10, 5}, {11, 21, 22}};
        //Act
        result = sut.menorElementoDaMatriz(matriz);
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void calculaMediaDosElementosDaMatriz_BasicTest() {
        //Arrange
        double expectedResult = 5.0;
        double result = 0;
        int[][] matriz = new int[][]{{5, 2, 9, 6}, {2, 3, 10, 5}, {4, 6, 2, 6}};
        //Act
        result = sut.calculaMediaDosElementosDaMatriz(matriz);
        //Assert
        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void somaDasLinhasDaMatriz() {
        //Arrange
        int[] expectedResult = new int[]{6, 3, 8};
        int[] result = {};
        int[] array1 = {2, 2, 2};
        int[] array2 = {1, 1, 1};
        int[] array3 = {5, 1, 2};
        int[][] matriz = {array1, array2, array3};
        //Act
        result = sut.somaDasLinhasDaMatriz(matriz);
        //Assert
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void somaDasColunasDaMatriz_BasicTest() {
        //Arrange
        int[] expectedResult = new int[]{8, 4, 5};
        int[] result = {};
        int[] array1 = {2, 2, 2};
        int[] array2 = {1, 1, 1};
        int[] array3 = {5, 1, 2};
        int[][] matriz = {array1, array2, array3};
        //Act
        result = sut.somaDasColunasDaMatriz(matriz);
        //Assert
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void encontraIndiceLinhaComMaiorSum_BasicTest() {
        //Arrange
        int expectedResult = 2;
        int result = -1;
        int[] array1 = {2, 2, 2};
        int[] array2 = {1, 1, 1};
        int[] array3 = {5, 1, 2};
        int[][] matriz = {array1, array2, array3};
        //Act
        result = sut.encontraIndiceLinhaComMaiorSum(matriz);
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void qtdElementosNaoNulosNaDiagonalDaMatriz_TodosNumNaoNulos() {
        //Arrange
        int expectedResult = 3;
        int result = -1;
        int[] array1 = {2, 2, 2};
        int[] array2 = {1, 1, 1};
        int[] array3 = {5, 1, 2};
        int[][] matriz = {array1, array2, array3};
        //Act
        result = sut.qtdElementosNaoNulosNaDiagonalDaMatriz(matriz);
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void qtdElementosNaoNulosNaDiagonalDaMatriz_UmNumNulo() {
        //Arrange
        int expectedResult = 2;
        int result = -1;
        int[] array1 = {2, 2, 2};
        int[] array2 = {1, 0, 1};
        int[] array3 = {5, 1, 2};
        int[][] matriz = {array1, array2, array3};
        //Act
        result = sut.qtdElementosNaoNulosNaDiagonalDaMatriz(matriz);
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void qtdElementosNaoNulosNaDiagonalDaMatriz_TosdosNumerosNulos() {
        //Arrange
        int expectedResult = 0;
        int result = -1;
        int[] array1 = {0, 2, 2};
        int[] array2 = {1, 0, 1};
        int[] array3 = {5, 1, 0};
        int[][] matriz = {array1, array2, array3};
        //Act
        result = sut.qtdElementosNaoNulosNaDiagonalDaMatriz(matriz);
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void diagonalPrincipalESecundariaSaoIguais_DiagonaisSaoIguais() {
        //Arrange
        boolean result = false;
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {1, 2, 2, 8};
        int[] array3 = {5, 5, 5, 7};
        int[] array4 = {7, 1, 6, 7};
        int[][] matriz = {array1, array2, array3, array4};
        //Act
        result=sut.diagonalPrincipalESecundariaSaoIguais(matriz);
        //Assert
        assertTrue(result);
    }

    @Test
    public void diagonalPrincipalESecundariaSaoIguais_Matriz3x3_DiagonaisSaoIguais() {
        //Arrange
        boolean result = false;
        int[] array1 = {1, 2, 1};
        int[] array2 = {1, 2, 2};
        int[] array3 = {5, 5, 5};
        int[][] matriz = {array1, array2, array3};
        //Act
        result=sut.diagonalPrincipalESecundariaSaoIguais(matriz);
        //Assert
        assertTrue(result);
    }

    @Test
    public void diagonalPrincipalESecundariaSaoIguais_DiagonaisNaoSaoIguais() {
        //Arrange
        boolean result = false;
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {1, 3, 2, 8};
        int[] array3 = {5, 5, 5, 7};
        int[] array4 = {7, 1, 6, 7};
        int[][] matriz = {array1, array2, array3, array4};
        //Act
        result=sut.diagonalPrincipalESecundariaSaoIguais(matriz);
        //Assert
        assertFalse(result);
    }

    @Test
    public void somaDuasMatrizes(){
        //Arrange
        int[][] expectedResult={{8,12,5},{10,8,7},{5,30,4}};
        int[][] result={};
        int[][] matriz1={{4,2,2},{9,6,4},{4,15,1}};
        int[][] matriz2={{4,10,3},{1,2,3},{1,15,3}};
        //Act
        result=sut.somaDuasMatrizes(matriz1,matriz2);
        //Assert
        assertArrayEquals(expectedResult,result);
    }

    @Test
    public void multiplicaDuasMatrizes(){
        //Arrange
        int[][] expectedResult={{8,12,18},{13,18,27},{21,30,45}};
        int[][] result={};
        int[][] matriz1={{2,2},{4,1},{6,3}};
        int[][] matriz2={{3,4,6},{1,2,3},};
        //Act
        result=sut.multiplicaDuasMatrizes(matriz1,matriz2);
        //Assert
        assertArrayEquals(expectedResult,result);
    }

    @Test
    public void matrizESimetrica_TesteComMatrizSimetrica(){
        //Arrange
        boolean result=false;
        int[][]matriz={{1,2,3,4},{2,1,5,7},{3,5,1,8},{4,7,8,1}};
        //Act
        result=sut.matrizESimetrica(matriz);
        //Assert
        assertTrue(result);
    }

    @Test
    public void matrizESimetrica_TesteComMatrizAssimetrica(){
        //Arrange
        boolean result=false;
        int[][]matriz={{1,2,7,10},{8,1,5,7},{3,5,1,8},{4,7,8,1}};
        //Act
        result=sut.matrizESimetrica(matriz);
        //Assert
        assertFalse(result);
    }
}

