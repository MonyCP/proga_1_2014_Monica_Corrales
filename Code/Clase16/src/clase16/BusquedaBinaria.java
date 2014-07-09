/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase16;

/**
 *
 * @author dell 3110
 */
public class BusquedaBinaria {
     public int BuscarNombre(String[] nombres, String busqueda) {

        int inicial = 0;
        int elementofinal = nombres.length - 1;

        while (inicial < elementofinal) {
            int central = ((inicial + elementofinal) / 2);
            if (busqueda.compareTo(nombres[central]) > 0) {
                inicial = central + 1;
            } else {
                if (busqueda.compareTo(nombres[central]) < 0) {
                    elementofinal = central - 1;
                } else {
                    return central;
                }
            }
        }
        return -1;
    }
    
}
