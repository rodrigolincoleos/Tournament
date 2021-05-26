/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author Rodrigo
 */
public class hashsetter {
   String nombre;
   int puntaje;
   int desempeno;

    public hashsetter(String nombre, int puntaje, int desempeno) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.desempeno = desempeno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getDesempeno() {
        return desempeno;
    }

    public void setDesempeno(int desempeno) {
        this.desempeno = desempeno;
    }

    @Override
    public String toString() {
        return nombre+" "+puntaje+" "+desempeno+"\n"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
         return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final hashsetter other = (hashsetter) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
}
