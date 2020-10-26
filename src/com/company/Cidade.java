package com.company;

public class Cidade {
    private String mNome;
    private double mTemperatura;
    private double[] mTemperaturas = new double[24];

    public Cidade(String mNome, double mTemperatura) {
        this.mNome = mNome;
        this.mTemperatura = mTemperatura;
    }

    public Cidade() {
    }

    public Cidade(String mNome, double[] mTemperaturas) {
        this.mNome = mNome;
        this.mTemperaturas = mTemperaturas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //comparar posições de memória
            return true;
        }
        if (!(obj instanceof Cidade)) {
            return false;
        }
        Cidade c = (Cidade) obj; //Isto é um cast

        if (this.mNome.equals(c.getmNome())) {
            return true;
        }
        return false;
    }


    public String getmNome() {
        return mNome;
    }

    public void setmNome(String mNome) {
        this.mNome = mNome;
    }

    public double getmTemperatura() {
        return mTemperatura;
    }

    public void setmTemperatura(double mTemperatura) {

        this.mTemperatura = mTemperatura;
    }

    public void setTemperaturaFarenheit(double temperaturaFarenheit) {
        this.mTemperatura = farenheitToCelcius(temperaturaFarenheit);
    }

    private double farenheitToCelcius(double temperaturaEmFarenheit) {
        return ((temperaturaEmFarenheit - 32) * 5) / 9;
    }

    public void setmTemperaturas(double[] Temperaturas) {
        this.mTemperaturas = Temperaturas;
    }

    public double[] getmTemperaturas() {
        return mTemperaturas;
    }

    public void setTemperaturaDeHora(int hora, double temperatura) {
        this.mTemperaturas[hora] = temperatura;
    }

    public double getmTemperaturaDeHora(int hora) {
        if (hora == 24) {
            return mTemperaturas[0];
        }
        return mTemperaturas[hora];
    }

    public double getTemperaturaMedia(int horaInicio, int horaFim) {

        int tamanhoNovoArray = tamanhoNovoArray(horaInicio, horaFim);
        double[] newArray = new double[tamanhoNovoArray];

        for (int i = 0; i < tamanhoNovoArray; i++) {
            newArray[i] = mTemperaturas[horaInicio];
            horaInicio++;
        }
        return Vetores_VI.calculaMediaDosElementosDeArray(newArray);
    }

    private int tamanhoNovoArray(int limite1, int limite2) {
        int limiteMenor = Ciclos_I.limiteMinimo(limite1, limite2);
        int limiteMaior = Ciclos_I.limiteMaximo(limite1, limite2);

        int contagem = 0;

        for (int i = limiteMenor; i <= limiteMaior; i++) {
            contagem++;
        }
        return contagem;
    }

    public double getMaiorTemperatura() {
        return Vetores_VI.maiorElementoDoArray(this.mTemperaturas);
    }

    public double getMenorTemperatura() {
        return Vetores_VI.menorElementoDoArray(this.mTemperaturas);
    }

    public double[] getTemperaturasDaManhaEDaTarde() {

        double[] arrayTemperaturaManhaETarde = new double[2];

        arrayTemperaturaManhaETarde[0] = getTemperaturaMedia(0, 12);
        arrayTemperaturaManhaETarde[1] = getTemperaturaMedia(13, 23);

        return arrayTemperaturaManhaETarde;
    }

    public String getMetadeDoDiaMaisQuente() {
        double[] arrayTemperaturaManhaETarde = this.getTemperaturasDaManhaEDaTarde();

        if (arrayTemperaturaManhaETarde[0] > arrayTemperaturaManhaETarde[1]) {
            return "Manhã";
        }
        return "Tarde";
    }

    public int[] getHorasMaiorVariacaoTermica() {

        double[] variacoesTemperatura = calculaVariacoesTermicas();

        double maiorVariacaoTermica = Vetores_VI.maiorElementoDoArrayVersao2(variacoesTemperatura);

        int[] horasMaiorVariacao = new int[contaNumeroDeOcorrencias(variacoesTemperatura, maiorVariacaoTermica)];

        int j = 0;
        for (int i = 0; i < variacoesTemperatura.length; i++) {
            if (variacoesTemperatura[i] == maiorVariacaoTermica) {
                horasMaiorVariacao[j] = i;
                j++;
            }
        }
        return horasMaiorVariacao;
    }

    public double[] calculaVariacoesTermicas() {

        double[] newArray = new double[23];
        for (int i = 0; i < mTemperaturas.length - 1; i++) {
            newArray[i] = Math.abs(this.mTemperaturas[i] - this.mTemperaturas[i + 1]);
        }
        return newArray;
    }

    public int contaNumeroDeOcorrencias(double[] someArray, double maiorVariacaoTermica) {
        int contagem = 0;
        int tamanhoArray = someArray.length;
        for (int i = 0; i < tamanhoArray; i++) {
            if (someArray[i] == maiorVariacaoTermica) {
                contagem++;
            }
        }
        return contagem;
    }

    public static double temperaturaMaximaVariasCidades(Cidade[] arrayDeCidades) {

        double maiorTemperatura = arrayDeCidades[0].getMaiorTemperatura();
        double provisorio;

        int tamanhoDoArrayDeCidades = arrayDeCidades.length;

        for (int i = 1; i < tamanhoDoArrayDeCidades; i++) {
            provisorio = arrayDeCidades[i].getMaiorTemperatura();
            if (provisorio > maiorTemperatura) {
                maiorTemperatura = provisorio;
            }
        }
        return maiorTemperatura;
    }

}
