package com.company;

public class Ciclos_IV {



    public double mediaDosAlgarismosDeNumero(long numero) {
        return (double) somaDosAlgarismosDeNumero(numero) / Ciclos_III.numAlgarismos(numero);

    }

    public int somaDosAlgarismosDeNumero(long numero) {
        int soma = 0;

        while (numero > 0) {
            int digito = (int) (numero % 10);
            soma += digito;
            numero /= 10;
        }
        return soma;
    }

    public int numeroSimetrico(long numero) {
        int numeroSimetrico = 0;

        while (numero != 0) {
            int digito = (int) (numero % 10);
            numeroSimetrico = numeroSimetrico * 10 + digito;
            numero /= 10;
        }
        return numeroSimetrico;
    }

    public boolean isCapicua(long numero) {
        boolean eCapicua = false;
        if (numero < 10) {
            return eCapicua;
        } else {
            if (numero == numeroSimetrico(numero)) {
                eCapicua = true;
            }
        }
        return eCapicua;
    }

    public int primeiraCapicuaNumIntervalo(int limite1, int limite2) {

        int primeiraCapicua = 0;

        for (int i = Ciclos_I.limiteMinimo(limite1,limite2); i < Ciclos_I.limiteMaximo(limite1,limite2); i++) {
            if (isCapicua(i)) {
                primeiraCapicua = i;
                break;
            }
        }
        return primeiraCapicua;
    }

    public int qtdDeCapicuasNumIntervalo(int limite1, int limite2) {

        int numeroDeCapicuas = 0;


        for (int i = Ciclos_I.limiteMinimo(limite1,limite2); i < Ciclos_I.limiteMaximo(limite1,limite2); i++) {
            if (isCapicua(i)) {
                numeroDeCapicuas++;
            }
        }
        return numeroDeCapicuas;
    }

    public int maiorCapicuaNumIntervalo(int limite1, int limite2) {

        int maiorCapicua = 0;

        for (int i = Ciclos_I.limiteMaximo(limite1,limite2); i > Ciclos_I.limiteMinimo(limite1,limite2); i--) {
            if (isCapicua(i)) {
                maiorCapicua = i;
                break;
            }
        }
        return maiorCapicua;
    }

    public boolean isArmstrong(long numero) {
        int somaDosCubos = 0;
        long guardarNumero = numero;
        int potencia=Ciclos_III.numAlgarismos(numero);

        while (numero > 0) {
            int digito = (int) (numero % 10);
            somaDosCubos += Math.pow(digito, potencia);
            numero /= 10;
        }
        if (somaDosCubos == guardarNumero) {
            return true;
        }
        return false;
    }

    public int primeiroArmstrongNumIntervalo(int limite1, int limite2) {

        int primeiroArmstrong = 0;


        for (int i = Ciclos_I.limiteMinimo(limite1,limite2); i < Ciclos_I.limiteMaximo(limite1,limite2); i++) {
            if (isArmstrong(i)) {
                primeiroArmstrong = i;
                break;
            }
        }
        return primeiroArmstrong;
    }

    public int qtdDeArmstrongsNumIntervalo(int limite1, int limite2) {

        int qtdArmstrong = 0;

        for (int i = Ciclos_I.limiteMinimo(limite1,limite2); i < Ciclos_I.limiteMaximo(limite1,limite2); i++) {
            if (isArmstrong(i)) {
                qtdArmstrong++;
            }
        }
        return qtdArmstrong;
    }
}
