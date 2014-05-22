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
    
    /**
     * Metodo para anadir una cita a la base de datos
     * @param consulta de la consulta donde se realizara la cita
     * @param p que será intervenido
     * @param inter a realizar
     * @param realizada
     * @param momento 
     */
    public static void anadirCita(int consulta, Paciente p, Intervencion inter, boolean realizada, Date momento)
    {
        agenda.add(new Cita(consulta,p,inter,realizada, momento));
    }
    
    /**
     * Anade un empleado a la base de datos
     * 
     * @param empleado a anadir 
     */
    public static void anadirEmpleado(Empleado empleado)
    {
        empleados.add(empleado);
    }
    
    /**
     * Anade un paciente a la base de datos
     * 
     * @param paciente a anadir 
     */
    public static void anadirPaciente(Paciente[] paciente)
    {
        for(Paciente p: paciente){
            pacientes.add(p);
        }
    }
    
    /**
     * Anade un articulo a la base de datos
     * TODO
     * 
     * @param articulo a anadir
     */
    public static void anadirArticulo(Articulo articulo)
    {
        
    }
    
    /**
     * Anade una intervencion a la base de datos
     * 
     * @param intervencion a anadir
     */
    public static void anadirIntervencion(Intervencion intervencion)
    {
        intervenciones.add(intervencion);
    }

    /**
     * 
     * @return arrayList con las citas guardadas en la base de datos
     */
    public static ArrayList<Cita> getAgenda() {
        return agenda;
    }

    /**
     * 
     * @return arrayList con los empleados guardados en la base de datos
     */
    public static ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * 
     * @return arrayList con los pacientes guardados en la base de datos
     */
    public static ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    /**
     * 
     * @return arrayList con los articulos guardados en la base de datos
     */
    public static ArrayList<Articulo> getInventario() {
        return inventario;
    }

    /**
     * 
     * @return arrayList con las intervencioness guardadas en la base de datos
     */
    public static ArrayList<Intervencion> getIntervenciones() {
        return intervenciones;
    }
    
    /**
     * 
     * @return arrayList con las citas pendientes de realizar
     */
    public static ArrayList<Cita> getCitasPendientes(){
        ArrayList<Cita> citasPendientes = new ArrayList<>();
        
        for(Cita c: agenda){
            if (!c.getRealizada())
                citasPendientes.add(c);
        }
        
        return citasPendientes;
    }
    
    /**
     * 
     * @return arrayList con los pacientes que estan de alta en la clinica
     */
    public static ArrayList<Paciente> getPacientesEnAlta(){
        ArrayList<Paciente> pacientesEnAlta = new ArrayList<>(); 
        
        for (Paciente p: pacientes)
            if (p.isAlta())
                pacientesEnAlta.add(p);
         
         return pacientesEnAlta;
         
         
    }
}
