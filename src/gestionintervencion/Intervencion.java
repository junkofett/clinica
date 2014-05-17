/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestionintervencion;

import gestionarticulos.Articulo;
import gestionempleados.Empleado;
import java.util.ArrayList;

/**
 *
 * @author ROCA
 */
public class Intervencion {
    
    private String nombre;
    private ArrayList<Empleado> personal;
    private int precio;
    private ArrayList<Articulo> material;
    private int duracion;

    public Intervencion(ArrayList<Empleado> personal, String nombre, int precio, int duracion) {
        this.nombre = nombre;
        this.personal = personal;
        this.precio = precio;
        this.duracion = duracion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getPrecio(){
        return precio;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public String toString(){
        return nombre +": "+ precio;
    }
    
    
}
