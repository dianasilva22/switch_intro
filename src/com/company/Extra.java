package com.company;

public class Extra {

    public int transformaDecimaisEmBinarios(int numero) {
        int binario = 0;
        int resto;
        int i = 0;

        while (numero > 0) {
            resto = numero % 2;
            i++;
            binario = resto * Calculadora.potencia(10, i - 1) + binario;
            numero /= 2;
        }
        return binario;
    }

    public int[] ordenaArrayDeFormaCrescente(int[] someArray) {
        int contador = 0;

        while (contador < someArray.length) {
            ordenaDoisADois(someArray);
            contador++;
        }
        return someArray;
    }

    public void ordenaDoisADois(int[] someArray) {
        int guardarElemento;
        for (int i = 0; i < someArray.length - 1; i++) {
            if (someArray[i] > someArray[i + 1]) {
                guardarElemento = someArray[i];
                someArray[i] = someArray[i + 1];
                someArray[i + 1] = guardarElemento;
            }
        }
    }

    public int[] ordenaArrayDeFormaDecrescente(int[] someArray) {

        int guardarElemento;
        int contador = 0;

        while (contador < someArray.length) {
            for (int i = 0; i < someArray.length - 1; i++) {
                if (someArray[i] < someArray[i + 1]) {
                    guardarElemento = someArray[i];
                    someArray[i] = someArray[i + 1];
                    someArray[i + 1] = guardarElemento;
                }
                contador++;
            }
        }
        return someArray;
    }

    public static int[] multiplicaDoisArrays(int[] someArray1, int[] someArray2) {

        int tamanhoMaximoDoArray = tamanhoMaximoDoNovoArray(someArray1, someArray2);
        int[] arrayMultiplicado = new int[tamanhoMaximoDoArray];

        for (int i = 0; i < tamanhoMaximoDoArray; i++) {
            arrayMultiplicado[i] = someArray1[i] * someArray2[i];
        }
        return arrayMultiplicado;
    }

    public static int tamanhoMaximoDoNovoArray(int[] someArray1, int[] someArray2) {

        if (someArray1.length > someArray2.length) {
            return someArray2.length;
        }

        return someArray1.length;
    }

    public int[] multiplicarNArrays(int[][] matriz) {

        int[] arrayMultiplicado = matriz[0];

        for (int i = 1; i < matriz.length; i++) {

            arrayMultiplicado = multiplicaDoisArrays(arrayMultiplicado, matriz[i]);
        }
        return arrayMultiplicado;
    }


    public int getPosicaoInicioSubArray(int[] arrayNum, int[] subArray) {

        if (arrayNum.length < subArray.length) {
            return -1;
        }

        int limiteMaximo = arrayNum.length - subArray.length + 1;

        for (int i = 0; i < limiteMaximo; i++) {
            boolean b = verificaSubArrayPosicaoI(i, arrayNum, subArray);
            if (b) {
                return i;
            }
        }
        return -1;
    }

    private boolean verificaSubArrayPosicaoI(int posicao, int[] arrayNum, int[] subArray) {
        for (int i = 1; i < subArray.length; i++) {
            if (subArray[i] != arrayNum[i + posicao]) {
                return false;
            }
        }
        return true;
    }

    public int[] devolveArraySemUmNumero(int[] someArray, int numero) {

        if (primeiraPosicaoDoNumero(someArray, numero) == -1) {
            return someArray;
        }

        int[] newArray = new int[someArray.length - 1];

        int j = 0;

        for (int i = 0; i < someArray.length; i++) {
            if (i != primeiraPosicaoDoNumero(someArray, numero)) {
                newArray[j] = someArray[i];
                j++;
            }
        }
        return newArray;
    }

    private int primeiraPosicaoDoNumero(int[] someArray, int numero) {

        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] == numero) {
                return i;
            }
        }
        return -1;
    }

}
