/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compra;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class Compra {

    public static void main(String[] args) {
        int numClient = 10;
        double precioDocena = 12.0; // Precio por docena del producto
        double descuentoDocenasExactas = 0.15; // 15% de descuento por 3 docenas exactas
        double descuentoG = 0.10; // 10% de descuento en caso contrario

        for (int i = 1; i <= numClient; i++) {
            // Solicitar al usuario la cantidad de docenas compradas
            String docenasC = JOptionPane.showInputDialog("Cliente " + i + ": Ingrese la cantidad de docenas compradas: ");

            try {
                // Convertir la entrada del usuario a un valor numérico (double)
                int docenas = Integer.parseInt(docenasC);

                // Calcular el monto de compra antes de aplicar descuento
                double montoCompra = docenas * precioDocena * 12.0; // 1 docena = 12 unidades

                // Calcular el monto de descuento y unidades de obsequio
                double Descuento;
                int unidadesObsequio = 0;

                if (docenas >= 3) {
                    Descuento = montoCompra * descuentoDocenasExactas;
                    unidadesObsequio = (docenas - 3) * 12; 
                } else {
                    Descuento = montoCompra * descuentoG;
                }

                // Calcular el monto total a pagar
                double montoTotal = montoCompra - Descuento;

                // Mostrar los resultados en cuadros de diálogo
                JOptionPane.showMessageDialog(null,
                        "Cliente " + i + "\n" +
                        "Monto de compra: $" + montoCompra + "\n" +
                        "Monto de descuento: $" + Descuento + "\n" +
                        "Unidades de obsequio: " + unidadesObsequio + "\n" +
                        "Monto total a pagar: $" + montoTotal);

            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad válida de docenas.");
            }
        }
    }
}
