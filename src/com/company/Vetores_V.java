package com.company;

public class Vetores_V {

    public int[] encontraMultiplosDeTresNoIntervalo(int limite1, int limite2) {

        int limiteMenor = Ciclos_I.limiteMinimo(limite1, limite2);
        int limiteMaior = Ciclos_I.limiteMaximo(limite1, limite2);

        int[] multiplosDeTres = new int[Ciclos_I.qtdMultiplosDeTres(limite1, limite2)];

        int j = 0;

        for (int i = limiteMenor; i <= limiteMaior; i++) {
            if (Calculadora.eMultiplo(i, 3)) {
                multiplosDeTres[j] = i;
                j++;
            }
        }
        return multiplosDeTres;

    }

    public int[] encontraMultiplosDeUmNumeroNoIntervalo(int limite1, int limite2, int numero) {

        int limiteMenor = Ciclos_I.limiteMinimo(limite1, limite2);
        int limiteMaior = Ciclos_I.limiteMaximo(limite1, limite2);

        int[] multiplosDeNumero = new int[Ciclos_I.qtdMultiplosDeDadoNumero(limite1, limite2, numero)];

        int j = 0;
        for (int i = limiteMenor; i <= limiteMaior; i++) {
            if (Calculadora.eMultiplo(i,numero)) {
                multiplosDeNumero[j] = i;
                j++;
            }
        }
        return multiplosDeNumero;
    }

    public int[] encontraMultiplosdeTresECincoNoIntervalo(int limite1, int limite2) {

        int limiteMenor = Ciclos_I.limiteMinimo(limite1, limite2);
        int limiteMaior = Ciclos_I.limiteMaximo(limite1, limite2);

        int[] multiplosDeTresECinco = new int[Ciclos_I.qtdMultiplosDeTresECinco(limite1, limite2)];

        int j = 0;
        for (int i=limiteMenor; i <= limiteMaior; i++) {
            if (Calculadora.eMultiplo(i,3) || Calculadora.eMultiplo(i,5)) {
                multiplosDeTresECinco[j] = i;
                j++;
            }
        }
        return multiplosDeTresECinco;
    }

    public int[] encontraMultiplosDeDoisNumerosNoIntervalo(int limite1, int limite2, int numero1, int numero2) {

        int limiteMenor = Ciclos_I.limiteMinimo(limite1, limite2);
        int limiteMaior = Ciclos_I.limiteMaximo(limite1, limite2);

        int[] multiplosDeDoisNumeros = new int[Ciclos_I.qtdMultiplosDeDoisNumeros(limite1, limite2, numero1, numero2)];

        int j = 0;
        for (int i= limiteMenor; i <= limiteMaior; i++) {
            if (Calculadora.eMultiplo(i,numero1) || Calculadora.eMultiplo(i,numero2)) {
                multiplosDeDoisNumeros[j] = i;
                j++;
            }
        }
        return multiplosDeDoisNumeros;
    }

}
