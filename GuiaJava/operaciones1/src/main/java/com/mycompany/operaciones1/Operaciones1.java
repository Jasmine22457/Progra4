/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operaciones1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jasmin
 */
public class Operaciones1 {

    public static void main(String[] args) {
     
     String valor1; 
                          
     String valor2; 
     
     
       double numero1;     
       double numero2;     
       double  suma; 
       double resta;
       double multiplicacion;
       double division;
       
       
      
       valor1 = JOptionPane.showInputDialog ( "Escriba el primer numero entero" );
       

       valor2 = JOptionPane.showInputDialog ( "Escriba el segundo numero entero");
       
  
        numero1 = Double.parseDouble (valor1 );
        numero2 = Double.parseDouble(valor2);
        
        
        //sumar los numeros
       suma = numero1 + numero2 ;
       // restar
       resta= numero1 - numero2 ;
       
       // multipilcar 
       
       multiplicacion = numero1 * numero2 ;
       
       // divison 
       division = numero1 / numero2 ;
       //mostrar el resultado
      JOptionPane.showMessageDialog ( null, "La suma de : " + numero1 + " + "+ numero2 + "  " + " Es : " + " "  + suma  + " \n" + "La resta de : " + numero1 + " - "+ numero2 + "" + " es:" + " " + resta +" \n" + "La multiplicacion de : " + numero1 + " x "+ numero2 + "  " + "es :" + " " + multiplicacion + " \n" +"La divison de :" + numero1 + " / " + numero2 + " " + "es : " + " " + division , "Resultados", JOptionPane.PLAIN_MESSAGE );
    }
}
