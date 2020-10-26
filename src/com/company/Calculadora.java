package com.company;


public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public double dividir(double a, double b) {
        return (double) a / b;
    }

    public static int potencia(int a, int b) {

        int resultado = a;
        if (b == 0) {
            resultado = 1;
        }
        for (int i = 1; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }

    public double raizQuadrada(double a) {
        return Math.sqrt(a);
    }

    public static boolean numeroEPar(int a) {
        boolean par = false;
        if (a % 2 == 0) {
            par = true;
        }
        return par;
    }

    public boolean ePrimo(int numero) {
        boolean primo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
            primo = true;
        }
        return primo;
    }

    public static boolean eMultiplo(int numeroATestar, int numero){
        if (numeroATestar%numero==0){
            return true;
        }
        return false;
    }

}

