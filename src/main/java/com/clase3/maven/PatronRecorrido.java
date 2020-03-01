package com.clase3.maven;

import com.clase3.maven.vo.ListaSumaDigitosPatronesVo;
import com.clase3.maven.vo.NumeroFilasColumnasVo;

public interface PatronRecorrido {

    public void imprimirMatrizEntrada (Integer [][] matrizEntrada) throws Exception;

    public NumeroFilasColumnasVo obtenerTamanioMatrizEntrada (Integer [][] matrizEntrada) throws Exception;

    public ListaSumaDigitosPatronesVo obtenerListaPatronesMatrizEntrada (Integer[][] matrizEntrada) throws Exception;

    public ListaSumaDigitosPatronesVo obtenerMaximaSumaPatrones (Integer[][] matrizEntrada) throws Exception;

}
