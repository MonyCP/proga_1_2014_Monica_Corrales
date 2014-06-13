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
    //Convierte una cadena a mayuscula
    public String toUpperCase(String valor) {
        String resultado = "";
        char caracter;
        int valorAscii = 0;
        for (int i = 0; i < valor.length(); i++) {

            caracter = valor.charAt(i);

            //En la tabla ascii los numeros entre 97 y 122 son las letras minusculas, se le resta 32 para obtener el valor ascii de la myuscula
            if (caracter >= 97 && caracter <= 122) {
                valorAscii = caracter - 32;
                resultado += (char) valorAscii;
            } else {
                resultado += caracter;
            }
        }
        return resultado;
    }

    //Obtiene substring
    public String subString(String texto, int inicio, int fin) {
        String resultado = "";

        if ((inicio > fin) || (inicio > texto.length()) || (inicio < 0)) {
            return "";
        } else {
            for (int i = 0; i < texto.length(); i++) {

                if (i >= inicio && i <= fin) {
                    resultado += texto.charAt(i);
                }
            }
            return resultado;
        }
    }
    //Inicio de palabra en el texto
    public int IndexOf(String texto, String palabra, int inicio) {
        if (inicio >= texto.length()) {
            return -1;
        } else {
            for (int i = 0; i < texto.length(); i++) {

                if (i >= inicio) {
                    if (palabra.charAt(0) == texto.charAt(i)) 
                    {
                        int j = 0;
                        while (j < palabra.length()) {

                            if (texto.charAt(i + j) != palabra.charAt(j)) {
                                break;
                            }
                            j++;
                        }
                        if (j == palabra.length()) {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }
    }
}
