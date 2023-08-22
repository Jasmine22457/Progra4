/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.noma;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
/**
 *
 * @author Jasmin
 */
public class NomA {

    public static void main(String[] args) {
        
        String nombre; 
        String apellido;
        
        DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss z");
 
         String date = dateFormat.format(new Date());
        
         nombre= JOptionPane.showInputDialog ( "Por favor ingrese su nombre :" );
       

         apellido = JOptionPane.showInputDialog ( "Por favor ingrese su apellido :");
       
         JOptionPane.showMessageDialog ( null, "Su nombre y apellido es:" + " " +nombre + " " + apellido + "\n" + "La fecha y hora de hoy es :" + date , "Resultados", JOptionPane.PLAIN_MESSAGE );
        
    }
}
