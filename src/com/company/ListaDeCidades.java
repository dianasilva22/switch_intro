package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCidades {

    private List<Cidade> arrayDeCidades;

    public ListaDeCidades() {
        this.arrayDeCidades = new ArrayList<>();
    }

    public boolean adicionarCidade(Cidade novaCidade) {

        if (!(this.arrayDeCidades.contains(novaCidade))) {
            this.arrayDeCidades.add(novaCidade);
            return true;
        }
        return false;
    }

/*    public boolean adicionarVariasCidades(List<Cidade> cidades){

        boolean guardou = false;
        for (Cidade cidade : cidades) {
            this.adicionarCidade(cidade);
            guardou=true;
        }
        return guardou;
    }*/

    public Cidade getCidadePorNome(String nome) {

        for (Cidade cidade : this.arrayDeCidades) {
            if (cidade.getmNome().equals(nome)) {
                return cidade;
            }
        }
        return null;
    }

    public Cidade removeCidadePorNome(String nome) {

        for (Cidade cidade : this.arrayDeCidades) {
            if (cidade.getmNome().equals(nome)) {
                this.arrayDeCidades.remove(cidade);
                return cidade;
            }
        }
        return null;

    }

    public double getMaxTempFromAllCities() {

        double maiorTemperatura = this.arrayDeCidades.get(0).getMaiorTemperatura();
        double provisorio;


        for (Cidade cidade : arrayDeCidades) {
            provisorio = cidade.getMaiorTemperatura();
            if (provisorio > maiorTemperatura) {
                maiorTemperatura = provisorio;
            }
        }
        return maiorTemperatura;
    }

    public List<String> getNomeDasCidadesComRegistoDeTemperaturaMaisElevada() {
        List<String> cidadesComTemperaturaMaxima = new ArrayList<>();

        double temperaturaMax = getMaxTempFromAllCities();

        for (Cidade cidade : arrayDeCidades) {
            if (cidade.getMaiorTemperatura() == temperaturaMax) {
                cidadesComTemperaturaMaxima.add(cidade.getmNome());
            }
        }
        return cidadesComTemperaturaMaxima;
    }

    public List<String> getCidadesComTemperaturaSuperiorA(double temperatura) {
        List<String> cidadesComTemperaturaSuperior = new ArrayList<>();

        for (Cidade cidade : arrayDeCidades) {
            if (cidade.getMaiorTemperatura() > temperatura) {
                cidadesComTemperaturaSuperior.add(cidade.getmNome());
            }
        }
        return cidadesComTemperaturaSuperior;
    }

    public List<Double> getTemperaturaMaxEMinDeCidade(String nomeCidade) {

        List<Double> temperaturasMaxEMin = new ArrayList<>();

        Cidade c1 = this.getCidadePorNome(nomeCidade);
        temperaturasMaxEMin.add(c1.getMaiorTemperatura());
        temperaturasMaxEMin.add(c1.getMenorTemperatura());

        return temperaturasMaxEMin;
    }

}
