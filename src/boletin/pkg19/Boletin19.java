/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg19;

/**
 *
 * @author slagogonzalez
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Libreria libr= new Libreria();
     libr.engadirLibro(new Libro("Libro1","YO","", 23 ,24));
     System.out.println(libr.amosar());
    }
    
}
