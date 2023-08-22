/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ayv;

import javax.swing.JOptionPane;

/**
 *
 * @author Jasmin
 */
public class AyV {

    public static void main(String[] args) {
         
        String valor;
        double radio;
        double area;
        double volumen;
        
        valor = JOptionPane.showInputDialog ( "Escriba el radio de la circunferencia" );
        radio = Double.parseDouble (valor );
         
         area = Math.PI * radio * radio;
         
         volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);

        JOptionPane.showMessageDialog(null, "El área de la circunferencia es: " + area + "\n"+ "El volumen de la circunferencia es: " + volumen);
    }

    
}
