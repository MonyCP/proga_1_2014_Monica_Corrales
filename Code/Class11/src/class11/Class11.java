/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class11;

/**
 *
 * @author dell 3110
 */
public class Class11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        ejercicio1 oejercicio1 = new ejercicio1();
        oejercicio1.CargarMatriz();
        oejercicio1.Imprimir();
    
        ejercicio2 oejercicio2 = new ejercicio2();
        oejercicio2.CargarMatriz();
        oejercicio2.ImprimirDiagonal();
        
        ejercicio3 oejercicio3 = new ejercicio3();
        oejercicio3.CargarMatriz();
        oejercicio3.PrimeraColumna();
        oejercicio3.UltimaColumna();
        oejercicio3.PrimeraFila();
        oejercicio3.UltimaFila();
    }
    
}
