/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.descuentos;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class Descuentos {

    public static void main(String[] args) {
        
        
         //  ingrese el salario del trabajador
        String salarios = JOptionPane.showInputDialog("Ingrese el salario del trabajador en dólares: ");

        try {
            // Convertir la entrada del usuario a un valor numérico (double)
            double salario = Double.parseDouble(salarios);

            // Verificar si el salario es mayor a $300 para aplicar el descuento de AFP
            if (salario > 300.0) {
                double descuentoAFP = salario * 0.0625;
                salario -= descuentoAFP;

                // Solicitar al usuario el género del trabajador
                String genero = JOptionPane.showInputDialog("Ingrese el género del trabajador (H para hombre, M para mujer): ");
                genero = genero.toUpperCase(); 
                
                switch (genero) {
                    case "H":
                        {
                            double descuentoISSS = salario * 0.03;
                            double descuentoRenta = salario * 0.10;
                            salario -= (descuentoISSS + descuentoRenta);
                            break;
                        }
                    case "M":
                        {
                            double descuentoISSS = salario * 0.02;
                            salario -= descuentoISSS;
                            break;
                        }
                    default:
                        JOptionPane.showMessageDialog(null, "Género no válido. Use 'H' para hombre o 'M' para mujer.");
                        return;
                }

              
                JOptionPane.showMessageDialog(null, " Salario con los descuentos es: $" + salario);
            } else {
                JOptionPane.showMessageDialog(null, "El salario no supera los $300. No se aplica descuento de AFP.");
            }
        } catch (NumberFormatException e) {
            // Manejar el caso en que el usuario ingrese un valor no válido
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido para el salario.");
        }
        
    }
    
    
}
