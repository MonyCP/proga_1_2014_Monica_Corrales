/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatriz;

/**
 *
 * @author dell 3110
 */
public class PracticaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejercicio1 oejercicio1 = new ejercicio1();
        oejercicio1.CargarMatriz();
        oejercicio1.Imprimir();
        
        ejercicio2 oejercicio2 = new ejercicio2();
        oejercicio2.CantidadFC();
        oejercicio2.CargarMatriz();
        oejercicio2.IntercambioImprimir();
        
        ejercicio3 oejercicio3 = new ejercicio3();
        oejercicio3.CantidadFC();
        oejercicio3.CargarMatriz();
        oejercicio3.imprimirEsquinas();
        
        ejercicio4 oejercicio4 = new ejercicio4();
        oejercicio4.CantidadFC();
        oejercicio4.CargarMatriz();
        oejercicio4.imprimirMayor();
    }
    
}
