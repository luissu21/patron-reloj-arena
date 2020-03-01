package com.clase3.maven.vo;

import java.util.List;

public class ListaSumaDigitosPatronesVo {

    private List<Integer> listaSumaDigitos;
    private Integer numeroPatrones;
    private Integer maxSumaDigitos;


    public List<Integer> getListaSumaDigitos() {
        return listaSumaDigitos;
    }

    public void setListaSumaDigitos(List<Integer> listaSumaDigitos) {
        this.listaSumaDigitos = listaSumaDigitos;
    }

    public Integer getNumeroPatrones() {
        return numeroPatrones;
    }

    public void setNumeroPatrones(Integer numeroPatrones) {
        this.numeroPatrones = numeroPatrones;
    }

    public Integer getMaxSumaDigitos() {
        return maxSumaDigitos;
    }

    public void setMaxSumaDigitos(Integer maxSumaDigitos) {
        this.maxSumaDigitos = maxSumaDigitos;
    }

    @Override
    public String toString() {
        return "ListaSumaDigitosPatronesVo{" +
                "listaSumaDigitos=" + listaSumaDigitos +
                ", numeroPatrones=" + numeroPatrones +
                ", maxSumaDigitos=" + maxSumaDigitos +
                '}';
    }

}
