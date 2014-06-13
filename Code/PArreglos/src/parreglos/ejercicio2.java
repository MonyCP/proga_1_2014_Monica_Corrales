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
public class ejercicio2 {
    
    
    int[] vector1=new int[4];    
    int[] vector2=new int[4];  
    int[] suma=new int[4]; 
         
    public void AgregarVector1(int vector)
    {
        for (int i = 0; i < vector1.length; i++) {
            if(vector1[i]==0)
            {
               vector1[i]= vector;
               break;
            }
        }
    }
    
    public void AgregarVector2(int vector)
    {
        for (int i = 0; i < vector2.length; i++) {
            if(vector2[i]==0)
            {
               vector2[i]= vector;
               break;
            }
        }
    }
    
    public void SumaVectores()
    {
        for (int i = 0; i < vector1.length; i++) {
            suma[i]=vector1[i]+vector2[i];
        }
    }
    
    public String Imprimir()
    {
        String imprimir="";
        for (int i = 0; i < suma.length; i++) {
            imprimir+="El total de la sumatoria # "+(i+1)+ " es de "+ suma[i] +" \n ";
        }
        return imprimir;
    } 
    
}
