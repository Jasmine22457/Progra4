/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeromayor;

import javax.swing.JOptionPane;

/**
 *
 * @author Jasmin
 */
public class NumeroMayor {

    public static void main(String[] args) {
       
        double numero1;
        double numero2;
        double numero3;
        double mayor;
        
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el primer número:"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("por favor ingrese el segundo número:"));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("por favor ingrese el tercer número:"));

        // Encontrar el mayor número usando estructura if 
        
         mayor = numero1;
        
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }

        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
       
    }
}
