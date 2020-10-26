package com.company;

public class Matrizes_VII {

    public int maiorElementoDaMatriz(int[][] matriz) {

        int maiorElemento = 0;
        int tamanhoDaMatriz = matriz.length;

        for (int i = 0; i < tamanhoDaMatriz; i++) {
            int provisorio = Vetores_VI.maiorElementoDoArray(matriz[i]);

            if (provisorio > maiorElemento) {
                maiorElemento = provisorio;
            }
        }
        return maiorElemento;
    }

    public int menorElementoDaMatriz(int[][] matriz) {

        int menorElemento = matriz[0][0];
        int tamanhoDaMatriz = matriz.length;

        for (int i = 0; i < tamanhoDaMatriz; i++) {
            int provisorio = Vetores_VI.menorElementoDoArray(matriz[i]);
            if (provisorio < menorElemento) {
                menorElemento = provisorio;
            }
        }
        return menorElemento;
    }

    public double calculaMediaDosElementosDaMatriz(int[][] matriz) {

        int somaDeElementos = 0;
        int numeroDeElementosMatriz = 0;

        for (int i = 0; i < matriz.length; i++) {
            somaDeElementos += somaElementosDeArray(matriz[i]);
            numeroDeElementosMatriz += matriz[i].length;
        }
        return somaDeElementos / numeroDeElementosMatriz;
    }

    private int somaElementosDeArray(int[] someArray) {
        int soma = 0;

        for (int i = 0; i < someArray.length; i++) {
            soma += someArray[i];
        }
        return soma;
    }

    public int[] somaDasLinhasDaMatriz(int[][] matriz) {
        int[] arrayComSomas = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            arrayComSomas[i] = somaElementosDeArray(matriz[i]);
        }
        return arrayComSomas;
    }

    public int[] somaDasColunasDaMatriz(int[][] matriz) {
        int[] arrayComSomas = new int[matriz[0].length];

        for (int i = 0; i < matriz[0].length; i++) {

            arrayComSomas[i] += somaDeUmaColunaDaMatriz(matriz, i);

        }
        return arrayComSomas;
    }

    private int somaDeUmaColunaDaMatriz(int[][] matriz, int posicao) {
        int sum = 0;

        for (int i = 0; i < matriz.length; i++) {
            sum += matriz[i][posicao];
        }
        return sum;
    }

    public int encontraIndiceLinhaComMaiorSum(int[][] matriz) {

        int[] arraySomas = somaDasLinhasDaMatriz(matriz);

        for (int i = 0; i < arraySomas.length; i++) {
            if (arraySomas[i] == Vetores_VI.maiorElementoDoArray(arraySomas)) {
                return i;
            }
        }
        return -1;
    }

    public int qtdElementosNaoNulosNaDiagonalDaMatriz(int[][] matriz) {

        int contagem = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] != 0) {
                contagem++;
            }
        }
        return contagem;
    }

    public boolean diagonalPrincipalESecundariaSaoIguais(int[][] matriz) {

        int TAMANHO_MATRIZ = matriz.length - 1;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] != matriz[i][TAMANHO_MATRIZ - i]) {
                return false;
            }
        }
        return true;
    }

    public int[][] somaDuasMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] matrizComSomas = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            matrizComSomas[i] = somaDoisArrays(matriz1[i], matriz2[i]);
        }
        return matrizComSomas;
    }

    private int[] somaDoisArrays(int[] array1, int[] array2) {
        int[] arraySomado = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            arraySomado[i] = array1[i] + array2[i];
        }
        return arraySomado;
    }

    public int[][] multiplicaDuasMatrizes(int[][] matriz1, int[][] matriz2) {
        int numLinhasMatriz1 = matriz1.length;
        int numColunasMatriz2 = matriz2[0].length;

        if (numLinhasMatriz1 != numColunasMatriz2) {
            return null;
        }

        int numLinhasMatriz2=matriz2.length;

        int[][] novaMatriz=new int[numLinhasMatriz1][numColunasMatriz2];
        for (int i = 0; i <numLinhasMatriz1; i++) {
            for (int j = 0; j < numColunasMatriz2; j++) {
                for (int k = 0; k < numLinhasMatriz2; k++) {
                    novaMatriz[i][j]+=matriz1[i][k]*matriz2[k][j];
                }
            }
        }
        return novaMatriz;
    }

    public boolean matrizESimetrica (int[]...matriz){

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j]!=matriz[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
