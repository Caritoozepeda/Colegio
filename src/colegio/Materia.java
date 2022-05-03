/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author Caro_Z
 */
public class Materia {
    private int idMateria;

    private String nombre;

    private int anio;
    
    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public Materia() {
    }
    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
        /*
        int hash = 7;
        hash = 71 * hash + this.idMateria;
        return hash;
        */
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Materia) {
            Materia materia2=(Materia) obj;
            if(idMateria==materia2.idMateria){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    } 

    @Override
    public String toString() {
        return ( nombre );
    }
    
    
}
