/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestionagenda;

import gestionintervencion.Intervencion;
import gestionpacientes.Paciente;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ROCA
 */
public class Cita {
    
    private static int idStatic;
    private int id;
    private Date fechaInicio;
    private int consulta;
    private Paciente paciente;
    private Intervencion intervencion;
    private boolean realizada;
    
    public Cita(int consulta, Paciente p, Intervencion inter, boolean realizada, Date momento){
        id = ++idStatic;
        this.realizada = realizada;
        this.consulta = consulta;
        paciente = p;
        intervencion = inter;
        fechaInicio = momento;
    }
    
    public Object[] datosTabla(){
        Object[] s = {id, paciente.getNombre()+", "+paciente.getApellido1(),
                    intervencion.getNombre(),getConsulta(),fechaInicio, new Boolean(realizada)};   
    
        return s;            
    }
    
    public boolean getRealizada(){
        return realizada;
    }
    
    public String hora() {
        return fechaInicio.getHours()+":"+fechaInicio.getMinutes();
    }
    
    public int getConsulta(){
        return consulta;
    }
    public String toString(){
        return "Cita: "+id+"\n Consulta: "+consulta+"\n Paciente: "+paciente+"\n Precio: "+intervencion.getPrecio();
    }
    
    
}
