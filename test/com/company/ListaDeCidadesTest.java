package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListaDeCidadesTest {

    @Test
    public void adicionarCidades_CidadeAindaNaoExisteNaLista() {
        //Arrange
        Cidade porto = new Cidade("Porto", 25);
        ListaDeCidades cidades = new ListaDeCidades();
        //Act
        boolean result = cidades.adicionarCidade(porto);
        //Assert
        assertTrue(result);
    }

    @Test
    public void adicionarCidades_CidadeJaExisteNaLista() {
        //Arrange
        Cidade porto = new Cidade("Porto", 25);
        Cidade repetida = new Cidade("Porto",25);
        ListaDeCidades cidades = new ListaDeCidades();
        cidades.adicionarCidade(porto);
        //Act
        boolean result = cidades.adicionarCidade(repetida);
        //Assert
        assertFalse(result);
    }

 /*   @Test
    public void adicionarVariasCidades_BasicTest() {
        //Arrange
        Cidade porto = new Cidade("Porto", 25);
        Cidade lisboa = new Cidade("Lisboa",25);
        ListaDeCidades cidades = new ListaDeCidades();
        cidades.adicionarCidade(porto);
        //Act
        boolean result = cidades.adicionarVariasCidades(new ArrayList<>(){porto,lisboa});
        //Assert
        assertFalse(result);
    }*/

    @Test
    public void getCidadePorNome_CidadeExisteNaLista(){
        //Arrange
        Cidade porto = new Cidade("Porto", 25);
        Cidade lisboa = new Cidade("Lisboa",25);
        ListaDeCidades cidades = new ListaDeCidades();
        cidades.adicionarCidade(porto);
        cidades.adicionarCidade(lisboa);
        //Act
        Cidade result = cidades.getCidadePorNome("Porto");
        //Assert
        assertEquals(porto,result);
    }

    @Test
    public void getCidadePorNome_CidadeNaoExisteNaLista(){
        //Arrange
        Cidade porto = new Cidade("Porto", 25);
        Cidade lisboa = new Cidade("Lisboa",25);
        ListaDeCidades cidades = new ListaDeCidades();
        cidades.adicionarCidade(porto);
        cidades.adicionarCidade(lisboa);
        Cidade expectedResult=null;
        //Act
        Cidade result = cidades.getCidadePorNome("Viana do Castelo");
        //Assert
        assertEquals(expectedResult,result);
    }

    @Test
    public void removerCidade_BasicTest() {
        //Arrange
        Cidade porto = new Cidade("Porto", 25);
        Cidade lisboa = new Cidade("Lisboa", 34);
        ListaDeCidades cidades = new ListaDeCidades();
        cidades.adicionarCidade(porto);
        cidades.adicionarCidade(lisboa);
        //Act
        Cidade result = cidades.removeCidadePorNome("Lisboa");
        //Assert
        assertEquals(lisboa, result);
    }

    @Test
    public void removerCidade_CidadeNaoExisteNaLista() {
        //Arrange
        Cidade porto = new Cidade("Porto", 25);
        Cidade lisboa = new Cidade("Lisboa", 34);
        ListaDeCidades cidades = new ListaDeCidades();
        cidades.adicionarCidade(porto);
        cidades.adicionarCidade(lisboa);
        Cidade expectedResult = null;
        //Act
        Cidade result = cidades.removeCidadePorNome("Viana do Castelo");
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void temperaturaMaximaVariasCidades_BasicTest() {
        //Arrange
        double[] temperaturas1 = {10, 11, 12, 25, 13, 13, 26, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas2 = {10, 11, 12, 25, 13, 13, 26, 14, 14, 14, 40, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas3 = {10, 11, 12, 25, 13, 13, 26, 25, 24, 14, 30, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        Cidade c1 = new Cidade("Porto", temperaturas1);
        Cidade c2 = new Cidade("Rio de Janeiro", temperaturas2);
        Cidade c3 = new Cidade("Berlim", temperaturas3);
        ListaDeCidades lista = new ListaDeCidades();
        lista.adicionarCidade(c1);
        lista.adicionarCidade(c2);
        lista.adicionarCidade(c3);
        double expectedResult = 40;
        //Act
        double result = lista.getMaxTempFromAllCities();
        //Assert
        assertEquals(expectedResult, result, 0.01);
    }

    @Test
    public void temperaturaMaximaVariasCidades_DuasCidadesComTemperaturaMax() {
        //Arrange
        double[] temperaturas1 = {10, 11, 12, 25, 13, 13, 26, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas2 = {10, 11, 12, 25, 13, 13, 26, 14, 14, 14, 40, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas3 = {10, 11, 12, 25, 13, 13, 26, 25, 24, 14, 30, 16, 40, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        Cidade c1 = new Cidade("Porto", temperaturas1);
        Cidade c2 = new Cidade("Rio de Janeiro", temperaturas2);
        Cidade c3 = new Cidade("Berlim", temperaturas3);
        ListaDeCidades lista = new ListaDeCidades();
        lista.adicionarCidade(c1);
        lista.adicionarCidade(c2);
        lista.adicionarCidade(c3);
        double expectedResult = 40;
        //Act
        double result = lista.getMaxTempFromAllCities();
        //Assert
        assertEquals(expectedResult, result, 0.01);
    }

    @Test
    public void getNomeDasCidadesComRegistoDeTemperaturaMaisElevada() {
        //Arrange
        double[] temperaturas1 = {10, 11, 12, 25, 13, 13, 26, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas2 = {10, 11, 12, 25, 13, 13, 26, 14, 14, 14, 40, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas3 = {10, 11, 12, 25, 13, 13, 26, 25, 24, 14, 30, 16, 15, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        Cidade c1 = new Cidade("Porto", temperaturas1);
        Cidade c2 = new Cidade("Rio de Janeiro", temperaturas2);
        Cidade c3 = new Cidade("Berlim", temperaturas3);
        ListaDeCidades lista = new ListaDeCidades();
        lista.adicionarCidade(c1);
        lista.adicionarCidade(c2);
        lista.adicionarCidade(c3);
        List<String> expectedResult = new ArrayList(Arrays.asList(c2.getmNome()));
        //Act
        List<String> result = lista.getNomeDasCidadesComRegistoDeTemperaturaMaisElevada();
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void getCidadesComTemperaturaSuperiorA() {
        //Arrange
        double[] temperaturas1 = {10, 11, 12, 25, 13, 13, 26, 14, 14, 14, 40, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas2 = {10, 11, 12, 25, 13, 13, 14, 14, 14, 14, 15, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas3 = {10, 11, 12, 25, 13, 13, 26, 25, 24, 14, 30, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        Cidade c1 = new Cidade("Porto", temperaturas1);
        Cidade c2 = new Cidade("Rio de Janeiro", temperaturas2);
        Cidade c3 = new Cidade("Berlim", temperaturas3);
        ListaDeCidades listaDeCidades = new ListaDeCidades();
        listaDeCidades.adicionarCidade(c1);
        listaDeCidades.adicionarCidade(c2);
        listaDeCidades.adicionarCidade(c3);
        double temperatura = 26;
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Porto");
        expectedResult.add("Berlim");
        //Act
        List<String> result = listaDeCidades.getCidadesComTemperaturaSuperiorA(temperatura);
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void getCidadesComTemperaturaSuperiorA_NenhumaCidadeTemTemperaturaSup() {
        //Arrange
        double[] temperaturas1 = {10, 11, 12, 25, 13, 13, 26, 14, 14, 14, 40, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas2 = {10, 11, 12, 25, 13, 13, 14, 14, 14, 14, 15, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas3 = {10, 11, 12, 25, 13, 13, 26, 25, 24, 14, 30, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        Cidade c1 = new Cidade("Porto", temperaturas1);
        Cidade c2 = new Cidade("Rio de Janeiro", temperaturas2);
        Cidade c3 = new Cidade("Berlim", temperaturas3);
        ListaDeCidades listaDeCidades = new ListaDeCidades();
        listaDeCidades.adicionarCidade(c1);
        listaDeCidades.adicionarCidade(c2);
        listaDeCidades.adicionarCidade(c3);
        double temperatura = 40;
        List<String> expectedResult = new ArrayList<>();
        //Act
        List<String> result = listaDeCidades.getCidadesComTemperaturaSuperiorA(temperatura);
        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void getTemperaturaMaxEMinDeCidade(){
        //Arrange
        double[] temperaturas1 = {10, 11, 12, 25, 13, 13, 26, 14, 14, 14, 40, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas2 = {10, 11, 12, 25, 13, 13, 14, 14, 14, 14, 15, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas3 = {10, 11, 12, 25, 13, 13, 26, 25, 24, 14, 30, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 9, 13, 11};
        Cidade c1 = new Cidade("Porto", temperaturas1);
        Cidade c2 = new Cidade("Rio de Janeiro", temperaturas2);
        Cidade c3 = new Cidade("Berlim", temperaturas3);
        ListaDeCidades listaDeCidades = new ListaDeCidades();
        listaDeCidades.adicionarCidade(c1);
        listaDeCidades.adicionarCidade(c2);
        listaDeCidades.adicionarCidade(c3);
        double tempMax=30;
        double tempMin=9;
        List<Double> expectedResult = new ArrayList<>();
        expectedResult.add(tempMax);
        expectedResult.add(tempMin);
        //Act
        List<Double> result = listaDeCidades.getTemperaturaMaxEMinDeCidade("Berlim");
        //Assert
        assertEquals(expectedResult,result);

    }
}