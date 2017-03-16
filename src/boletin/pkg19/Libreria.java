/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg19;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Libreria {
    ArrayList<Libro> lectura= new ArrayList<Libro>();
    
    public void engadirLibro(Libro l){
        lectura.add(l);
    }
    public void vender(){
    int borrar=Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion do elemento que se quiere eliminar: "));
    lectura.remove(borrar);
    }
    public String amosar(){
     Collections.sort(lectura);
          String z="g";
          for(Libro l:lectura){
              z +="\n" + l.toString();
          }
          return z;
         }
}
