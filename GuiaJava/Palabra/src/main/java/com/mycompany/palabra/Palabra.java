/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palabra;
import javax.swing.JOptionPane;
/**
 *
 * @author Jasmin
 */
public class Palabra {

    public static void main(String[] args) {
        
        String palabra;
        String numero;
        int num;
        
     palabra = JOptionPane.showInputDialog("Por favor ingrese una palabra:");
     numero = JOptionPane.showInputDialog("Por favor ingrese un numero :");
        
         num = Integer.parseInt(numero);
      
       StringBuilder pal = new StringBuilder();
        for (int i = 0; i < num; i++) {
            
            pal.append(palabra).append("\n");
           
        }
         JOptionPane.showMessageDialog(null, pal.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
   
    }
}
