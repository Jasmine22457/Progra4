/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posicionesabecedario;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class PosicionesAbecedario {

    public static void main(String[] args) {
    
        String nombre = JOptionPane.showInputDialog("Ingrese su primer nombre: ");
        nombre = nombre.toUpperCase(); 

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);

            if (letra >= 'A' && letra <= 'Z') {
                int posicion = letra - 'A' + 1; // Calcular la posición en el alfabeto
                resultado.append(letra).append(": ").append(posicion).append("\n");
            }
        }

        if (resultado.length() > 0) {
            JOptionPane.showMessageDialog(null, "Posiciones en el alfabeto:\n" + resultado.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Letras ingresdas no validas.");
        }
        
    }
}
