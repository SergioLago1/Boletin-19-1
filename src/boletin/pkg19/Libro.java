/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg19;

import java.util.Objects;

/**
 *
 * @author slagogonzalez
 */
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private double prezo;
    private int numUnidades;
    
    
    Libro(String titulo,String autor, String ISBN,double prezo,int numUnidades){
        this.titulo=titulo;
        this.ISBN=ISBN;
        this.autor=autor;
        this.prezo=prezo;
        this.numUnidades=numUnidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", numUnidades=" + numUnidades + '}';
    }
    public int compareTo(Libro t) {
        if(titulo.compareToIgnoreCase(t.titulo)<0){
            return -1;         
        }else if(titulo.compareToIgnoreCase(t.titulo)>0){
            return 1;
        }else{
            return 0;
        }
    }     
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        return hash;
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
    if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
}

