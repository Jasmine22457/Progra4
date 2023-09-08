/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoracircunferecia;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */

public class CalculadoraCircunferecia {
    public static void main(String[] args) {
        //  constante para el valor de pi con al menos 10 posiciones decimales
        final double PI = 3.1415926535;

        String radioC = JOptionPane.showInputDialog("Ingrese el radio de la circunferencia: ");
        
        try {
            // Convertir la entrada del usuario a un valor numérico (double)
            double radio = Double.parseDouble(radioC);

            // Calcular el área y el volumen
            double area = PI * radio * radio;
            double volumen = (4.0 / 3.0) * PI * radio * radio * radio;

            // Mostrar los resultados en cuadros de diálogo
            JOptionPane.showMessageDialog(null, "El Área de la circunferencia es : " + " " + area + "\n"+"El volumen de la circunferencia es:" +" "+ volumen);
//            JOptionPane.showMessageDialog(null, "Volumen de la circunferencia: " + volumen);
        } catch (NumberFormatException e) {
            // Manejar el caso en que el usuario ingrese un valor no válido
            JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido");
        }
    }
}

    

