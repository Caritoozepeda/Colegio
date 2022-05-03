/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.util.HashSet;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Caro_Z
 */
public class Alumno {
     private int legajo;

    private String apellido;

    private String nombre;

    private HashSet<Materia> materiasAl = new HashSet <>();

    public Alumno(int p_legajo, String p_apellido, String p_nombre) {
        legajo=p_legajo;
        apellido=p_apellido;
        nombre=p_nombre;
    }

    public Alumno() {
    }
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo=legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido=apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public boolean agregarMateria(Materia m) {
        if(materiasAl.add(m)==true){
            JOptionPane.showMessageDialog(null, "Se ha realizado la inscripción ");
        }else{
            JOptionPane.showMessageDialog(null, "El alumno ya se encuentra inscripto en ésta materia ");
        }
        
        return materiasAl.add(m);
    }
    
    public int cantindadMaterias() {
        return materiasAl.size();
    }

    @Override
    public String toString() {
        return (nombre+ " "+apellido);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.legajo;
        hash = 67 * hash + Objects.hashCode(this.apellido);
        hash = 67 * hash + Objects.hashCode(this.nombre);
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
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
}
