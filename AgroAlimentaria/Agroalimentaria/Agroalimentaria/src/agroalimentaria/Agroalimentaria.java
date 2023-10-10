/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agroalimentaria;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author Jasmin
 */
public class Agroalimentaria {

    
   
    public static void main(String[] args) {

        int opcion;
        int Contador = 1;
        String nombre;
        
        while (Contador != 0) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  ---------------Bienvenidos al Menu-----------
                                                                  1 - Productos Frescos
                                                                  2 - Productos Refrigerados
                                                                  3 - Productos Congelados
                                                                  4 - Salir"""));

            switch (opcion) {
                case 1 -> {
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto fresco que desea agregar: ");
                    
                    ProductosFrescos productosFrescos = new ProductosFrescos( nombre, "15-2-2026", "6-1-2024");

                    productosFrescos.setfechaEnvasado(JOptionPane.showInputDialog("Digete la fecha de envasado del producto: "));
                    productosFrescos.setPaisOrigen(JOptionPane.showInputDialog("Digete el pais de origen: "));
                    productosFrescos.mostrar();
                }
                case 2 -> {
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto Refrigerado: ");
                    
                    ProductosRefrigerados productosR = new ProductosRefrigerados( nombre, "2-2-2024", "8-12-2023");
                    productosR.setCodigo(JOptionPane.showInputDialog("Digete el codigo: "));
                    productosR.mostrar();
                }
                case 3 -> {
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto Congelado: ");
                    
                    ProductosCongelados productosC = new ProductosCongelados(nombre, "31-12-2025", "05-10-2023");
                    
                    productosC.setTemperatura(JOptionPane.showInputDialog("Digete la temperatura: "));
                    productosC.mostrar();
                }
                case 4 -> Contador = 0;
                default -> throw new AssertionError("Esta opcion no es  valida");
            }
        }

    }

}
