package com.company;

import java.util.Arrays;

public class Vetores_VI {

    public int numeroDeElementosDeUmArray(int[] someArray) {
        return someArray.length;
    }

    public static int maiorElementoDoArray(int[] someArray) {
        Arrays.sort(someArray);
        return someArray[someArray.length - 1];
    }

    public static double maiorElementoDoArray(double[] someArray) {
        Arrays.sort(someArray);
        return someArray[someArray.length - 1];
    }



    public static double maiorElementoDoArrayVersao2(double[] someArray) {
        double maior = 0;

        for (int i = 0; i < someArray.length; i++) {
            if (maior < someArray[i]) {
                maior = someArray[i];
            }
        }
        return maior;
    }


    public static int menorElementoDoArray(int[] someArray) {
        Arrays.sort(someArray);
        return someArray[0];
    }

    public static double menorElementoDoArray(double[] someArray) {
        double menor = someArray[0];

        for (int i = 1; i < someArray.length; i++) {
            if (menor > someArray[i]) {
                menor = someArray[i];
            }
        }
        return menor;
    }

    public int contaElementosNaoNulos(int[] someArray) {

        int contagem = 0;

        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] != 0) {
                contagem++;
            }
        }
        return contagem;
    }

    public static double calculaMediaDosElementosDeArray(int[] someArray) {
        int soma = 0;

        for (int i = 0; i < someArray.length; i++) {
            soma += someArray[i];
        }
        return (double) soma / someArray.length;
    }

    public static double calculaMediaDosElementosDeArray(double[] someArray) {
        int soma = 0;

        for (int i = 0; i < someArray.length; i++) {
            soma += someArray[i];
        }
        return (double) soma / someArray.length;
    }

    public double calculaMediaDosElementosParesDeArray(int[] someArray) {
        int soma = 0;
        int contagem = 0;

        for (int i = 0; i < someArray.length; i++) {
            if (Calculadora.numeroEPar(someArray[i])) {
                soma += someArray[i];
                contagem++;
            }
        }
        return (double) soma / contagem;
    }

    public double calculaMediaDeElementosDeArrayMultiplosDeNumero(int[] someArray, int numero) {
        int soma = 0;
        int contagem = 0;

        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] % numero == 0) {
                soma += someArray[i];
                contagem++;
            }
        }
        return (double) soma / contagem;
    }

    public boolean verificaSeArrayEstaVazio(int[] someArray) {
        return someArray.length == 0;
    }

    public boolean verificaSeArrayTemApenasUmElemento(int[] someArray) {
        return someArray.length == 1;
    }

    public boolean verificaSeArraySoTemElementosPares(int[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean verificaSeArrayTemElementosDuplicados(int[] someArray) {
        Arrays.sort(someArray);

        for (int i = 0; i < someArray.length - 1; i++) {
            int j = i + 1;
            if (someArray[i] == someArray[j]) {
                return true;
            }
        }
        return false;
    }
}
