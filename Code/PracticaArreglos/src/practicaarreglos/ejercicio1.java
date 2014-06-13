/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaarreglos;

/**
 *
 * @author dell 3110
 */
public class ejercicio1 {
    //sume todos los elementos
    //sume los mayores a 36   phyton
    //sume los mayores a 59
    
    private double salarios []= new double[8];

    public void AgregarSalario(double salario) 
    {
        for (int i = 0; i < salarios.length; i++) 
        {
            if (salarios[i] == 0) 
            {
                salarios[i] = salario;
                break;
            }

        }

    } 
    
    public double SumaSalarios(double suma)
    {
        for (int i = 0; i < salarios.length; i++) 
        {
            suma+=salarios[i];
        }
        return suma;
    }

}
