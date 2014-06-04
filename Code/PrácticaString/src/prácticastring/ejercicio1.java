/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prácticastring;

/**
 *
 * @author dell 3110
 */
public class ejercicio1 {
    private String cadena;
    private String resul;

    public String alRevez() {
        String retorno = "";
        for (int i = getCadena().length() - 1; i >= 0; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String palindromo1() {
        String retorno = "";
        retorno = getCadena();
        for (int i = getCadena().length() - 2; i >= 0; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String buscaPalabra() {
        String retorno = "";
        int pos = resul.indexOf(cadena);
          for (int i = getTexto().length(); i > 0; i--) {
              retorno = resul.substring(0, pos) + "-" + resul.substring(pos);
         }
        if (pos != -1) {
            for (int i = getTexto().length(); i > 0; i--) {
                retorno = resul.substring(0, pos) + "-" + resul.substring(pos);
            }
        } else {
            retorno = " No fue encontrado el string " + cadena + " en el texto.";
        }

        return retorno;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getTexto() {
        return cadena;
    }

    public void setTexto(String resul) {
        this.resul = resul;
    }

}
