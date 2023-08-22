/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pya;
import javax.swing.JOptionPane;

/**
 *
 * @author Jasmin
 */
public class PyA {

    public static void main(String[] args) {
        
        double superior;
        double inferior;
        double izquierdo;
        double derecho;
        double perimetro;
        double area;
        

        
        superior = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de longitud del lado superior :"));
        
        inferior = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de longitud del lado inferior :"));
        
        izquierdo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de longitud del lado izquierdo:"));
        
        derecho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de longitud del lado derecho :"));

        // Cálculo del perímetro y área
         perimetro = superior + inferior + izquierdo + derecho;
         area = superior * izquierdo;

      
        JOptionPane.showMessageDialog(null, "El perímetro del rectángulo es: " + perimetro + " \n" + "El area del rectangulo es :" + area);
       
    }
    
}
