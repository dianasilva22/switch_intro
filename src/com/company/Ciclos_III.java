package com.company;

public class Ciclos_III {

    public static int numAlgarismos(long numero) {
        int contagem = 0;

        while (numero != 0) {
            numero /= 10;
            contagem++;
        }
        return contagem;
    }

    public int qtdAlgarismosParesdeNumero(long numero) {
        int contagemAlgarismosPares = 0;

        while (numero != 0) {
            int digito = (int) (numero % 10);
            if (Calculadora.numeroEPar(digito)) {
                contagemAlgarismosPares++;
            }
            numero /= 10;
        }
        return contagemAlgarismosPares;
    }

    public int qtdAlgarismosImparesdeNumero(long numero) {
        int contagemAlgarismosImpares = 0;

        while (numero != 0) {
            int digito = (int) (numero % 10);
            if (digito % 2 != 0) {
                contagemAlgarismosImpares++;
            }
            numero /= 10;
        }
        return contagemAlgarismosImpares;
    }

    public double mediaAlgarismosParesDeNumero(long numero) {
        int somaDePares = 0;
        long guardarNumero = numero;
        while (numero != 0) {
            int digito = (int) (numero % 10);
            if (Calculadora.numeroEPar(digito)) {
                somaDePares += digito;
            }
            numero /= 10;
        }
        return (double) somaDePares / numAlgarismos(guardarNumero);
    }

    public int numeroSemAlgarismosPares(long numero) {
        int guardarAlgarismos = 0;
        int i = 0;

        while (numero != 0) {
            int digito = (int) (numero % 10);
            if (digito % 2 != 0) {
                i++;
                guardarAlgarismos = digito * Calculadora.potencia(10, i - 1) + guardarAlgarismos;
            }
            numero /= 10;
        }
        return guardarAlgarismos;
    }
}
