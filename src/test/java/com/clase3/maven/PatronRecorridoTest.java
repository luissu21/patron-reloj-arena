package com.clase3.maven;

import static org.junit.Assert.assertTrue;

import com.clase3.maven.vo.ListaSumaDigitosPatronesVo;
import com.clase3.maven.vo.NumeroFilasColumnasVo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PatronRecorridoTest {

    PatronRecorridoImpl patronRecorridoImpl = new PatronRecorridoImpl();
    NumeroFilasColumnasVo numeroFilasColumnasVo = new NumeroFilasColumnasVo();
    ListaSumaDigitosPatronesVo listaSumaDigitosPatronesVo = new ListaSumaDigitosPatronesVo();

    @Test
    @Ignore
    public void imprimirMatrizEntradaTest () throws Exception {
        Integer [][] matrizEntrada = {{1,5,2,0}, {5,4,3,9}, {8,6,3,4}, {2,7,3,9}};
        patronRecorridoImpl.imprimirMatrizEntrada(matrizEntrada);
    }

    @Test
    public void obtenerTamanioMatrizEntradaTest () throws Exception {

        Integer [][] matrizEntrada = {{1,5,2,0}, {5,4,3,9}, {8,6,3,4}, {2,7,3,9}};

        numeroFilasColumnasVo = patronRecorridoImpl.obtenerTamanioMatrizEntrada(matrizEntrada);

        Assert.assertNotNull(numeroFilasColumnasVo.getNumeroFilas());
        Assert.assertNotNull(numeroFilasColumnasVo.getNumeroColumnas());

    }

    @Test
    public void obtenerListaPatronesMatrizEntradaTest () throws Exception {

        Integer [][] matrizEntrada = {{1,5,2,0}, {5,4,3,9}, {8,6,3,4}, {2,7,3,9}};

        listaSumaDigitosPatronesVo = patronRecorridoImpl.obtenerListaPatronesMatrizEntrada(matrizEntrada);

        Assert.assertNotNull(listaSumaDigitosPatronesVo.getListaSumaDigitos());
        Assert.assertNotNull(listaSumaDigitosPatronesVo.getNumeroPatrones());

    }

    @Test
    public void obtenerMaximaSumaPatrones () throws Exception {

        Integer [][] matrizEntrada = {{1,5,2,0}, {5,4,3,9}, {8,6,3,4}, {2,7,3,9}};
        //Integer [][] matrizEntrada = {{1,5,2,0,0,9}, {5,4,3,9,1,0}, {8,6,3,4,1,0}, {2,7,3,9,0,3},
          //      {8,6,3,4,1,5}, {8,6,3,7,4,2,4}};

        listaSumaDigitosPatronesVo = patronRecorridoImpl.obtenerMaximaSumaPatrones(matrizEntrada);

        System.out.println("\nHay " + listaSumaDigitosPatronesVo.getNumeroPatrones() + " patrones en la matriz.");
        System.out.println("La suma del patron mas grande es: " + listaSumaDigitosPatronesVo.getMaxSumaDigitos());
        Assert.assertNotNull(listaSumaDigitosPatronesVo.getMaxSumaDigitos());

    }

}
