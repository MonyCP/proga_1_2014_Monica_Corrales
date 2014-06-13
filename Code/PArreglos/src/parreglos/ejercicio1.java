/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parreglos;

/**
 *
 * @author dell 3110
 */
public class ejercicio1 {
   
    private int [] arreglo = new int [8];
    
    public void Agregar()
    {
        int cantidad=0;
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]==0){
                arreglo[i]=cantidad;
            }
        }
    }
    
    public int Suma() {
            int suma = 0;
            for (int i = 0; i < arreglo.length; i++) {
                suma += arreglo[i];
            }
            return suma;
        }
    
     public int Suma36() {
            int suma = 0;
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] > 36) {
                    suma += arreglo[i];
                }
            }
            return suma;
        }
     public int Cantidad50() {
            int suma = 0;
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] >= 50) {
                    suma++;
                }
            }
            return suma;
        }

    void Agregar(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
