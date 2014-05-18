/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clinicadental;

import gestionarticulos.Articulo;
import gestionagenda.Cita;
import gestionempleados.Empleado;
import gestionintervencion.Intervencion;
import gestionpacientes.Paciente;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ROCA
 */
public class Clinica {
    
    private static ArrayList<Cita> agenda = new ArrayList<>();
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    private static ArrayList<Articulo> inventario = new ArrayList<>();
    private static ArrayList<Intervencion> intervenciones = new ArrayList<>();
    
    public static void anadirCita(int consulta, Paciente p, Intervencion inter, boolean realizada, Date momento)
    {
        agenda.add(new Cita(consulta,p,inter,realizada, momento));
    }
    public static void anadirEmpleado(Empleado empleado)
    {
        empleados.add(empleado);
    }
    public static void anadirCliente(Paciente[] cliente)
    {
        for(Paciente p: cliente){
            pacientes.add(p);
        }
    }
    public static void anadirArticulo(Articulo articulo)
    {
        
    }
    public static void anadirIntervencion(Intervencion intervencion)
    {
        intervenciones.add(intervencion);
    }

    public static ArrayList<Cita> getAgenda() {
        return agenda;
    }

    public static ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public static ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public static ArrayList<Articulo> getInventario() {
        return inventario;
    }

    public static ArrayList<Intervencion> getIntervenciones() {
        return intervenciones;
    }
    
    public static void mostrarEm(){
        for(Empleado em: empleados){
            System.out.println(em);
        }
    }
    
    public static void mostrarPa(){
      for(Paciente p: pacientes){
          System.out.println(p);
      }
    }
    
    public static void mostrarIntervenciones(){
        for(Intervencion i: intervenciones){
            System.out.println(i);
        }
    }
    
    public static void mostrarCitas(){
        for(Cita c: agenda){
            System.out.println(c);
        }
    }
    
    
    
}
