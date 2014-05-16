/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clinicadental;

import java.util.Calendar;

/**
 *
 * @author ROCA
 */
public abstract class  Persona {
    
    private int dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Calendar fechaNac;
    private int telefono;
    private boolean alta;

    public Persona(int dni, String nombre, String apellido1, String apellido2, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        alta = true;
    }
    
    public void setDni(int dni){
        this.dni =  dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Calendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Calendar fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getTelefono() {
        return telefono;
    }
    
    public int getDni(){
        return dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }
    
    

    
    
    
}
