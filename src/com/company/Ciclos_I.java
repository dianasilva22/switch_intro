package com.company;

public class Ciclos_I {

    public static int limiteMaximo(int limite1, int limite2) {

        if (limite1 > limite2) {
            return limite1;
        }
        return limite2;
    }

    public static int limiteMinimo(int limite1, int limite2) {
        if (limite2 < limite1) {
            return limite2;
        } else {
            return limite1;
        }
    }

    public int qtdParesEntreDoisLimites(int limite1, int limite2) {

        int contagem = 0;

        for (int i = limiteMinimo(limite1,limite2); i <= limiteMaximo(limite1,limite2); i++) {
            if (Calculadora.numeroEPar(i)) {
                contagem++;
            }
        }
        return contagem;
    }

    public static int qtdMultiplosDeTres(int limite1, int limite2) {

        int contagem = 0;

        for (int i = limiteMinimo(limite1, limite2); i <= limiteMaximo(limite1, limite2); i++) {
            if (Calculadora.eMultiplo(i,3)) {
                contagem++;
            }
        }
        return contagem;
    }

    public static int qtdMultiplosDeDadoNumero(int limite1, int limite2, int numero) {

        int contagem = 0;


        for (int i = limiteMinimo(limite1, limite2); i <= limiteMaximo(limite1, limite2); i++) {
            if (Calculadora.eMultiplo(i,numero)) {
                contagem++;
            }
        }
        return contagem;
    }

    public static int qtdMultiplosDeTresECinco(int limite1, int limite2) {

        int contagem = 0;

        for (int i = limiteMinimo(limite1, limite2); i <= limiteMaximo(limite1, limite2); i++) {
            if (Calculadora.eMultiplo(i,3) || Calculadora.eMultiplo(i,5)) {
                contagem++;
            }
        }
        return contagem;
    }

    public static int qtdMultiplosDeDoisNumeros(int limite1, int limite2, int numero1, int numero2) {

        int contagem = 0;


        for (int i = limiteMinimo(limite1, limite2); i <= limiteMaximo(limite1, limite2); i++) {
            if (Calculadora.eMultiplo(i,numero1) || Calculadora.eMultiplo(i,numero2)) {
                contagem++;
            }
        }
        return contagem;
    }

    public int somaMultiplosDeDoisNumeros(int limite1, int limite2, int numero1, int numero2) {

        int soma = 0;

        for (int i = limiteMinimo(limite1, limite2); i <= limiteMaximo(limite1, limite2); i++) {
            if (Calculadora.eMultiplo(i,numero1) || Calculadora.eMultiplo(i,numero2)) {
                soma += i;
            }
        }
        return soma;
    }

}
