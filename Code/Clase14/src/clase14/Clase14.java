/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase14;

import java.util.Scanner;

/**
 *
 * @author dell 3110
 */
public class Clase14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int[] arreglo = {56, 4, 85, 90, 42};
        int[] arreglo2 = {56, 4, 85, 90, 42};
        int[] arregloOrdenado;
        String letra = " ";

        OrdenamientoSeleccion os = new OrdenamientoSeleccion();
        arregloOrdenado = os.OrdenS(arreglo, "A");
        System.out.println("Ordenamiento por seleccion: ");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println(arregloOrdenado[i]);
        }
        System.out.println("Digite A si desea que sea  ordenado de forma acendente y B si quiere sea de forma desendente");
        Clase16Burbuja ob = new Clase16Burbuja();
        letra=teclado.nextLine();
        arregloOrdenado=ob.OrdenamientoB(arreglo2, letra);
        System.out.println("Ordenamiento burbuja");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println(arregloOrdenado[i]);
        }
        
    }
}
