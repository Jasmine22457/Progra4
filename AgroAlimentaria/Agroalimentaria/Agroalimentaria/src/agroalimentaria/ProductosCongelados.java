/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agroalimentaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Jasmin
 */
public class ProductosCongelados extends Productos{

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    String temperatura;
    
    public ProductosCongelados(String nombre, String fechaCaducidad, String lote){
         super(nombre, fechaCaducidad, lote);
         
    }
 
    public void mostrar(){
        JOptionPane.showInternalMessageDialog(null, "nombre del Producto: " + getNombre() + "\nFecha de caducidad: " + getFechaCaducidad() + "\nLote: " + getLote() + "\nTemperatura: " + getTemperatura());
    }
}
