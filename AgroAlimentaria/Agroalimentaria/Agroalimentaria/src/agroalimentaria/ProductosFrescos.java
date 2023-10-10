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
public class ProductosFrescos extends Productos{
    
     private String fechaEnvasado;
     private String paisOrigen;

    
     
     
     public ProductosFrescos(String nombre, String fechaCaducidad, String lote){
         super( nombre, fechaCaducidad, lote);
         
     }
     
     public void setfechaEnvasado (String fechaEnvasado){
        this.fechaEnvasado = fechaEnvasado;
    }
     
    public String getfechaEnvasado(){
        return fechaEnvasado;
    }
    
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }
    
    public void mostrar(){
        JOptionPane.showInternalMessageDialog(null, "Nombre del Producto: " + getNombre() + "\nFecha de caducidad: " + getFechaCaducidad() 
                + "\nLote: " + getLote() + "\nFecha de envasado: " + getfechaEnvasado() + "\nPais de origen: " + getPaisOrigen());
        
    }
    
    
}
