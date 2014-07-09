/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase14;

/**
 *
 * @author dell 3110
 */
public class Clase16Burbuja {
    private String letra;
    
    public int[] OrdenamientoB(int[] arreglo, String ordenamiento) {
        int indice;
        int indice2;
        int auxiliar;

        if (ordenamiento.equals(letra== "A")) 
        {

            for (indice = 0; indice < arreglo.length - 1; indice++)
            {
                for (indice2 = 0; indice2 < (((arreglo.length) - indice) - 1); indice2++)
                {

                    if (arreglo[indice2 + 1] < arreglo[indice2])
                    {
                        auxiliar = arreglo[indice2 + 1];
                        arreglo[indice2 + 1] = arreglo[indice2];
                        arreglo[indice2] = auxiliar;
                    }
                }

            }
        }
        else 
        {
                    for (indice = 0; indice < arreglo.length - 1; indice++)
            {
                for (indice2 = 0; indice2 < (((arreglo.length) - indice) - 1); indice2++)
                {

                    if (arreglo[indice2 + 1] > arreglo[indice2])
                    {
                        auxiliar = arreglo[indice2 + 1];
                        arreglo[indice2 + 1] = arreglo[indice2];
                        arreglo[indice2] = auxiliar;
                    }
                }

            }
        
        }
        return arreglo;
    }


    void getLetra(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

