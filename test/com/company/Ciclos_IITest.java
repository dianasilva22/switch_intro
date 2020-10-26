package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ciclos_IITest {
    private Ciclos_II sut;

    @Before
    public void StartUp() {
        this.sut = new Ciclos_II();
    }

    @Test
    public void verSeSomaParesFunciona() {
        long resultado = sut.somaPares(1, 10);
        assertEquals(30, resultado);
    }

    @Test
    public void verSeSomaParesFunciona_LimitesInvertidos() {
        long resultado = sut.somaPares(10, 1);
        assertEquals(30, resultado);
    }

    @Test
    public void verSeProdutoMultiplosDeDoisNumerosFunciona() {
        int resultado = sut.produtoMultiplosDeDoisNumeros(1, 10, 2, 5);
        assertEquals(19200, resultado);
    }

    @Test
    public void verSeProdutoMultiplosDeDoisNumerosFunciona_LimitesInvertidos() {
        int resultado = sut.produtoMultiplosDeDoisNumeros(10, 1, 2, 5);
        assertEquals(19200, resultado);
    }

    @Test
    public void verSeMediaMultiplosDeDoisNumerosFunciona() {
        double resultado = sut.mediaMultiplosDeDoisNumeros(1, 10, 2);
        assertEquals(6.0, resultado, 0.001);
    }

    @Test
    public void verSeMediaMultiplosDeDoisNumerosFunciona_LimitesInvertidos() {
        double resultado = sut.mediaMultiplosDeDoisNumeros(10, 1, 2);
        assertEquals(6.0, resultado, 0.001);
    }


}