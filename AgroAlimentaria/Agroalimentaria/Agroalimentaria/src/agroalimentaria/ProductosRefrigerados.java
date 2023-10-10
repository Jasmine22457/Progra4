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
public class ProductosRefrigerados extends Productos{

    private String codigo;
    
    public ProductosRefrigerados(String nombre, String fechaCaducidad, String lote){
         super(nombre, fechaCaducidad, lote);
         
     }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
 
    public void mostrar(){
        JOptionPane.showInternalMessageDialog(null, "Nombre del Producto: " + getNombre() + "\nFehca caducidad: " + getFechaCaducidad() + "\nLote: " + getLote() + "\nCodigo: " + getCodigo());
    }
}
