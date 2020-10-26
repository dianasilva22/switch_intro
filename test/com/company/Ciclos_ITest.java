package com.company;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Ciclos_ITest {

    private Ciclos_I sut;

    @Before
    public void StartUp() {
        this.sut = new Ciclos_I();
    }

    @Test
    public void verSeQtdParesFunciona() {
        int resultado = sut.qtdParesEntreDoisLimites(1, 8);
        assertEquals(4, resultado);
    }

    @Test
    public void verSeQtdParesFunciona_LimitesTrocados() {
        int resultado = sut.qtdParesEntreDoisLimites(8, 1);
        assertEquals(4, resultado);
    }

    @Test
    public void verSeQtdDeMultiplosDeTresFunciona() {
        int resultado = sut.qtdMultiplosDeTres(1, 10);
        assertEquals(3, resultado);
    }

    @Test
    public void verSeQtdDeMultiplosDeTresFunciona_LimitesTrocados() {
        int resultado = sut.qtdMultiplosDeTres(10, 1);
        assertEquals(3, resultado);
    }

    @Test
    public void verSeQtdDeMultiplosDeDadoNumeroFunciona() {
        int resultado = sut.qtdMultiplosDeDadoNumero(1, 20, 5);
        assertEquals(4, resultado);
    }

    @Test
    public void verSeQtdDeMultiplosDeDadoNumeroFunciona_limiteTrocado() {
        int resultado = sut.qtdMultiplosDeDadoNumero(20, 1, 5);
        assertEquals(4, resultado);
    }

    @Test
    public void verSeQtdDeMultiplosDeTresECincoFunciona() {
        int resultado = sut.qtdMultiplosDeTresECinco(1, 15);
        assertEquals(7, resultado);

    }

    @Test
    public void verSeQtdDeMultiplosDeTresECincoFunciona_LimiteTrocado() {
        int resultado = sut.qtdMultiplosDeTresECinco(15, 1);
        assertEquals(7, resultado);

    }

    @Test
    public void verSeQtdDeMultiplosDeDoisNumerosFunciona() {
        int resultado = sut.qtdMultiplosDeDoisNumeros(1, 15, 3, 5);
        assertEquals(7, resultado);

    }

    @Test
    public void verSeQtdDeMultiplosDeDoisNumerosFunciona_LimitesTrocados() {
        int resultado = sut.qtdMultiplosDeDoisNumeros(15, 1, 3, 5);
        assertEquals(7, resultado);

    }

    @Test
    public void verSeSomaDeMultiplosDeDoisNumerosFunciona() {
        int resultado = sut.somaMultiplosDeDoisNumeros(1, 15, 3, 5);
        assertEquals(60, resultado);

    }

    @Test
    public void verSeSomaDeMultiplosDeDoisNumerosFunciona_LimitesInvertidos() {
        int resultado2 = sut.somaMultiplosDeDoisNumeros(15, 1, 3, 5);
        assertEquals(60, resultado2);

    }
}