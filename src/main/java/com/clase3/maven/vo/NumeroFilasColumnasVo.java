package com.clase3.maven.vo;

public class NumeroFilasColumnasVo {

    private Integer numeroFilas;
    private Integer numeroColumnas;


    public Integer getNumeroFilas() {
        return numeroFilas;
    }

    public void setNumeroFilas(Integer numeroFilas) {
        this.numeroFilas = numeroFilas;
    }

    public Integer getNumeroColumnas() {
        return numeroColumnas;
    }

    public void setNumeroColumnas(Integer numeroColumnas) {
        this.numeroColumnas = numeroColumnas;
    }


    @Override
    public String toString() {
        return "numeroFilasColumnasVo{" +
                "numeroFilas=" + numeroFilas +
                ", numeroColumnas=" + numeroColumnas +
                '}';
    }

}
