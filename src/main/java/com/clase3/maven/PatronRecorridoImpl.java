package com.clase3.maven;

import com.clase3.maven.vo.ListaSumaDigitosPatronesVo;
import com.clase3.maven.vo.NumeroFilasColumnasVo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PatronRecorridoImpl implements PatronRecorrido {

    NumeroFilasColumnasVo numeroFilasColumnasVo = new NumeroFilasColumnasVo();
    ListaSumaDigitosPatronesVo listaSumaDigitosPatronesVo = new ListaSumaDigitosPatronesVo();

    @Override
    public void imprimirMatrizEntrada(Integer[][] matrizEntrada) throws Exception {
        if (matrizEntrada == null || matrizEntrada.length == 0) {
            throw new NullPointerException("La matriz es nula o esta vacia");
        }

        numeroFilasColumnasVo = this.obtenerTamanioMatrizEntrada(matrizEntrada);

        if (numeroFilasColumnasVo.getNumeroFilas() == numeroFilasColumnasVo.getNumeroColumnas()) {

            for (int i = 0; i < numeroFilasColumnasVo.getNumeroFilas(); i++) {
                System.out.println("");
                for (int j = 0; j < numeroFilasColumnasVo.getNumeroColumnas(); j++) {
                    if (j == 0){
                        System.out.print("|");
                    }
                    System.out.print(matrizEntrada[i][j] + "|");
                }
            }
        } else {
            throw new NullPointerException("La matriz no es cuadrada");
        }
    }

    @Override
    public NumeroFilasColumnasVo obtenerTamanioMatrizEntrada (Integer[][] matrizEntrada) throws Exception {

        numeroFilasColumnasVo.setNumeroFilas(matrizEntrada.length);
        for (int i = 0; i < numeroFilasColumnasVo.getNumeroFilas(); i++) {

            if (i != 0) {
                if (matrizEntrada[i].length == matrizEntrada[i-1].length){
                    numeroFilasColumnasVo.setNumeroColumnas(matrizEntrada[i].length);
                } else {
                    numeroFilasColumnasVo.setNumeroColumnas(null);
                    break;
                }
            }
        }

        return numeroFilasColumnasVo;

    }

    @Override
    public ListaSumaDigitosPatronesVo obtenerListaPatronesMatrizEntrada (Integer[][] matrizEntrada) throws Exception {

        numeroFilasColumnasVo = this.obtenerTamanioMatrizEntrada(matrizEntrada);

        Integer sumaDigitos;
        List<Integer> listaSumaDigitos = new ArrayList<Integer>();
        Integer numeroPatrones = 0;

        for (int i = 0; i < numeroFilasColumnasVo.getNumeroFilas(); i++) {

            if (i + 1 < matrizEntrada.length && i + 2 < matrizEntrada.length) {

                for (int j = 0; j < numeroFilasColumnasVo.getNumeroColumnas(); j++) {

                    if (j > 0) {

                        if (j + 1 < matrizEntrada[i].length) {

                            sumaDigitos = matrizEntrada[i][j - 1] + matrizEntrada[i][j] + matrizEntrada[i][j + 1]
                                    + matrizEntrada[i + 1][j] + matrizEntrada[i + 2][j - 1] + matrizEntrada[i + 2][j]
                                    + matrizEntrada[i + 2][j + 1];
                            listaSumaDigitos.add(sumaDigitos);
                            numeroPatrones++;

                        } else break;
                    }
                }
            } else break;
        }

        listaSumaDigitosPatronesVo.setListaSumaDigitos(listaSumaDigitos);
        listaSumaDigitosPatronesVo.setNumeroPatrones(numeroPatrones);

        return listaSumaDigitosPatronesVo;
    }

    @Override
    public ListaSumaDigitosPatronesVo obtenerMaximaSumaPatrones (Integer[][] matrizEntrada) throws Exception {

        System.out.println("Entrada: ");
        this.imprimirMatrizEntrada(matrizEntrada);

        listaSumaDigitosPatronesVo = this.obtenerListaPatronesMatrizEntrada(matrizEntrada);

        if (listaSumaDigitosPatronesVo != null) {
            listaSumaDigitosPatronesVo.setMaxSumaDigitos(Collections.max(
                    listaSumaDigitosPatronesVo.getListaSumaDigitos()));
        } else {
            throw new NullPointerException("No se obtuvo la lista de suma de digitos");
        }

        return listaSumaDigitosPatronesVo;
    }
}
