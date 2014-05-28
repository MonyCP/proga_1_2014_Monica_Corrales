/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaswitch;

/**
 *
 * @author dell 3110
 */
public class Fecha {

  
    public int opera (int año, int mes)
     {
         int dias = 0;
         if(mes==2)
         {
            if(año % 4 == 0 && año % 100 != 0  || año % 400 == 0)
            {dias=1;}
            else
            {dias=2;}
         }
         if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)
             dias=3;
         if(mes==4||mes==6||mes==9||mes==11)
             dias=4;
      return dias;
     }
    
}
