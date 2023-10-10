/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agroalimentaria;

/**
 *
 * @author Jasmin
 */
public class Productos {
    
    private String nombre;
    private String fechCaducidad;
    private String lote;

    public Productos(String nombre, String fechCaducidad, String lote) {
        
        this.nombre = nombre;
        this.fechCaducidad = fechCaducidad;
        this.lote = lote;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getFechaCaducidad () {
        return fechCaducidad; 
    }
    
    public  String  getLote(){
        return  lote;
    }
    
    
   
}
