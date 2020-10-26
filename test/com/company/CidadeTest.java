package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CidadeTest {

    @Test
    public void verSeConstrutorFunciona_AtributoNome() {
        //Arrange
        Cidade c1 = new Cidade("Porto", 13.2);
        String expectedResult = "Porto";
        //Act
        String nomeGuardadoPeloConstrutor = c1.getmNome();
        //Assert
        assertEquals(expectedResult, nomeGuardadoPeloConstrutor);
    }

    @Test
    public void seeIfConstructorWorks_AtributoTemperatura() {
        //Arrange
        Cidade c1 = new Cidade("Porto", 13.2);
        double expectedResult = 13.2;
        //Act
        double temperaturaGuardadaPeloConstrutor = c1.getmTemperatura();
        //Assert
        assertEquals(expectedResult, temperaturaGuardadaPeloConstrutor, 0.001);
    }

    @Test
    public void equals_ObjectIsNotACity() {
        //Arrange
        Calculadora calculadora = new Calculadora();
        Cidade cidade = new Cidade();
        //Act
        boolean result = cidade.equals(calculadora);
        //Assert
        assertFalse(result);
    }

    @Test
    public void GetESetNome() {
        //Arrange
        Cidade c1 = new Cidade("Porto", 13.2);
        String expectedResult = "Maia";
        //Act
        c1.setmNome("Maia");
        String nomeDaCidade = c1.getmNome();
        //Assert
        assertEquals(expectedResult, nomeDaCidade);
    }

    @Test
    public void GetESetTemperatura() {
        //Arrange
        Cidade c1 = new Cidade("Porto", 13.2);
        double expectedResult = 20.6;
        //Act
        c1.setmTemperatura(20.6);
        double temperaturaDaCidade = c1.getmTemperatura();
        //Assert
        assertEquals(expectedResult, temperaturaDaCidade, 0.001);
    }

    @Test
    public void setTemperaturaFarenheit() {
        //Arrange
        Cidade c1 = new Cidade("Porto", 13.2);
        double expectedResult = 0;
        //Act
        c1.setTemperaturaFarenheit(32.0);
        double temperaturaDaCidade = c1.getmTemperatura();
        //Assert
        assertEquals(expectedResult, temperaturaDaCidade, 0.001);
    }

    @Test
    public void setEGetTemperaturas() {
        //Arrange
        Cidade c1 = new Cidade("Porto", 13.2);
        double[] expectedResult = {10.0, 11.0, 11.0, 12.5, 12.6, 12.8, 13.0, 13.6, 13.8, 14.0, 14.1, 14.2, 15.0, 15.6, 16.8, 14.0, 13.8, 12.2, 12.6, 11.0, 10.3, 10.2, 10.1, 10};
        double[] temperaturas = {10.0, 11.0, 11.0, 12.5, 12.6, 12.8, 13.0, 13.6, 13.8, 14.0, 14.1, 14.2, 15.0, 15.6, 16.8, 14.0, 13.8, 12.2, 12.6, 11.0, 10.3, 10.2, 10.1, 10};
        //Act
        c1.setmTemperaturas(temperaturas);
        double[] mTemperaturas = c1.getmTemperaturas();
        //Assert
        assertArrayEquals(expectedResult, mTemperaturas, 0.01);
    }

    @Test
    public void setEGetTemperaturaDaHora() {
        //Arrange
        Cidade c1 = new Cidade();
        double expectedResult = 28.3;
        double temperaturaAs13Horas = 28.3;
        int hora = 13;
        //Act
        c1.setTemperaturaDeHora(hora, temperaturaAs13Horas);
        double result = c1.getmTemperaturaDeHora(hora);
        //Assert
        assertEquals(expectedResult, result, 0.01);
    }

    @Test
    public void getTemperaturaMedia_Entre3e5() {
        //Arrange
        Cidade c1 = new Cidade();
        double expectedResult = 13;
        double[] temperaturas = {10, 11, 12, 13, 13, 13, 14, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        c1.setmTemperaturas(temperaturas);
        int horaInicio = 3;
        int horaFim = 5;
        //Act
        double resultado = c1.getTemperaturaMedia(horaInicio, horaFim);
        //Assert
        assertEquals(expectedResult, resultado, 0.01);
    }

    @Test
    public void getTemperaturaMedia_Entre3e13() {
        //Arrange
        Cidade c1 = new Cidade();
        double expectedResult = 14.82;
        double[] temperaturas = {10, 11, 12, 13, 13, 13, 14, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        c1.setmTemperaturas(temperaturas);
        int horaInicio = 3;
        int horaFim = 13;
        //Act
        double resultado = c1.getTemperaturaMedia(horaInicio, horaFim);
        //Assert
        assertEquals(expectedResult, resultado, 0.01);
    }

    @Test
    public void getTemperaturaMedia_Entre0e23() {
        //Arrange
        Cidade c1 = new Cidade();
        double expectedResult = 14.79;
        double[] temperaturas = {10, 11, 12, 13, 13, 13, 14, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        c1.setmTemperaturas(temperaturas);
        int horaInicio = 0;
        int horaFim = 23;
        //Act
        double resultado = c1.getTemperaturaMedia(horaInicio, horaFim);
        //Assert
        assertEquals(expectedResult, resultado, 0.01);
    }

    @Test
    public void getMaiorTemperatura() {
        //Arrange
        Cidade c1 = new Cidade();
        double expectedResult = 20;
        double[] temperaturas = {10, 11, 12, 13, 13, 13, 14, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        c1.setmTemperaturas(temperaturas);
        //Act
        double resultado = c1.getMaiorTemperatura();
        //Assert
        assertEquals(expectedResult, resultado, 0.01);
    }

    @Test
    public void getMenorTemperatura() {
        //Arrange
        Cidade c1 = new Cidade();
        double expectedResult = 9;
        double[] temperaturas = {10, 11, 12, 13, 13, 13, 14, 14, 14, 9, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        c1.setmTemperaturas(temperaturas);
        //Act
        double resultado = c1.getMenorTemperatura();
        //Assert
        assertEquals(expectedResult, resultado, 0.01);
    }

    @Test
    public void getTemperaturaManhaETarde() {
        //Arrange
        Cidade c1 = new Cidade();
        double[] expectedResult = {13.69, 16.09};
        double[] temperaturas = {10, 11, 12, 13, 13, 13, 14, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        c1.setmTemperaturas(temperaturas);
        //Act
        double[] resultado = c1.getTemperaturasDaManhaEDaTarde();
        //Assert
        assertArrayEquals(expectedResult, resultado, 0.01);
    }

    @Test
    public void getMetadeDoDiaMaisQuente_TardeEMaisQuente() {
        //Arrange
        Cidade c1 = new Cidade();
        String expectedResult = "Tarde";
        double[] temperaturas = {10, 11, 12, 13, 13, 13, 14, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        c1.setmTemperaturas(temperaturas);
        //Act
        String resultado = c1.getMetadeDoDiaMaisQuente();
        //Assert
        assertEquals(expectedResult, resultado);
    }

    @Test
    public void getMetadeDoDiaMaisQuente_ManhaEMaisQuente() {
        //Arrange
        Cidade c1 = new Cidade();
        String expectedResult = "Manhã";
        double[] temperaturas = {20, 20, 22, 23, 23, 23, 24, 24, 24, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        c1.setmTemperaturas(temperaturas);
        //Act
        String resultado = c1.getMetadeDoDiaMaisQuente();
        //Assert
        assertEquals(expectedResult, resultado);
    }

    @Test
    public void calculaVariacoesTemperatura() {
        //Arrange
        Cidade c1 = new Cidade();
        double[] temperaturas = {10, 11, 12, 25, 13, 13, 14, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        c1.setmTemperaturas(temperaturas);
        double[] expectedResult = {1, 1, 13, 12, 0, 1, 0, 0, 0, 2, 0, 2, 0, 2, 1, 1, 1, 1, 0, 1, 1, 1, 2};
        //Act
        double[] resultado = c1.calculaVariacoesTermicas();
        //Assert
        assertArrayEquals(expectedResult, resultado, 0.01);
    }

    @Test
    public void getHorasMaiorVariacaoTermica() {
        //Arrange
        Cidade c1 = new Cidade();
        int[] expectedResult = {2};
        double[] temperaturas = {10, 11, 12, 25, 13, 13, 14, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        c1.setmTemperaturas(temperaturas);
        //Act
        int[] resultado = c1.getHorasMaiorVariacaoTermica();
        //Assert
        assertArrayEquals(expectedResult, resultado);
    }

    @Test
    public void getHorasMaiorVariacaoTermica_DuasMaioresVariacoes() {
        //Arrange
        Cidade c1 = new Cidade();
        int[] expectedResult = {2, 5};
        double[] temperaturas = {10, 11, 12, 25, 13, 13, 26, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        c1.setmTemperaturas(temperaturas);
        //Act
        int[] resultado = c1.getHorasMaiorVariacaoTermica();
        //Assert
        assertArrayEquals(expectedResult, resultado);
    }

    @Test
    public void temperaturaMaximaVariasCidades() {
        //Arrange
        double[] temperaturas1 = {10, 11, 12, 25, 13, 13, 26, 14, 14, 14, 16, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas2 = {10, 11, 12, 25, 13, 13, 26, 14, 14, 14, 40, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        double[] temperaturas3 = {10, 11, 12, 25, 13, 13, 26, 25, 24, 14, 30, 16, 18, 18, 20, 19, 18, 17, 16, 16, 15, 14, 13, 11};
        Cidade c1 = new Cidade("Porto", temperaturas1);
        Cidade c2 = new Cidade("Rio de Janeiro", temperaturas2);
        Cidade c3 = new Cidade("Berlim", temperaturas3);
        Cidade[] arrayDeCidades = {c1, c2, c3};
        double expectedResult = 40;
        //Act
        double result = Cidade.temperaturaMaximaVariasCidades(arrayDeCidades);
        //Assert
        assertEquals(expectedResult, result, 0.01);
    }
}