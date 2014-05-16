/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestionempleados;

import clinicadental.Persona;
import java.util.Calendar;

/**
 *
 * @author ROCA
 */
public class Empleado extends Persona{
    
    private Roles rol;
    private String usuario;
    private String contrasena;

    public Empleado(int dni, String nombre, String apellido1, String apellido2, int telefono, Roles rol, String usuario, String contrasena){
        super(dni, nombre, apellido1, apellido2, telefono);
    
        this.rol = rol;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Roles getRol() {
        return rol;
    }

    public String getUsuario() {
        return usuario;
    }
    
    
    
    public String toString(){
        return getNombre() +" "+ getApellido1() +" "+ rol;
    }
    
    
    
}