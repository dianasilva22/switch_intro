package com.company;

public class Ciclos_II {

    public long somaPares(int limite1, int limite2) {
        int soma = 0;

        for (int i = Ciclos_I.limiteMinimo(limite1,limite2); i <= Ciclos_I.limiteMaximo(limite1,limite2); i++) {
            if (Calculadora.numeroEPar(i)) {
                soma += i;
            }
        }
        return soma;
    }

    public int produtoMultiplosDeDoisNumeros(int limite1, int limite2, int numero1, int numero2) {

        int produto = 1;

        for (int i = Ciclos_I.limiteMinimo(limite1,limite2); i <= Ciclos_I.limiteMaximo(limite1,limite2); i++) {
            if (Calculadora.eMultiplo(i,numero1) || Calculadora.eMultiplo(i,numero2)) {
                produto *= i;
            }
        }
        return produto;
    }

    public double mediaMultiplosDeDoisNumeros(int limite1, int limite2, int numero) {

        int soma = 0;
        int contagem = 0;

        for (int i = Ciclos_I.limiteMinimo(limite1,limite2); i <= Ciclos_I.limiteMaximo(limite1,limite2); i++) {
            if (i % numero == 0) {
                soma += i;
                contagem++;
            }
        }
        return soma / contagem;
    }
}
