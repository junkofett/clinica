/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestionagenda;

import gestionintervencion.Intervencion;
import gestionpacientes.Paciente;
import java.text.SimpleDateFormat;
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
    private Date fecha;
    private int consulta;
    private Paciente paciente;
    private Intervencion intervencion;
    private boolean realizada;
    
    public Cita(int consulta, Paciente p, Intervencion inter, boolean realizada, Date fecha){
        id = ++idStatic;
        this.realizada = realizada;
        this.consulta = consulta;
        paciente = p;
        intervencion = inter;
        this.fecha = fecha;
    }
    
    public Object[] datosTabla(){
        Object[] s = {id, paciente.getNombre()+", "+paciente.getApellido1(),
                    intervencion.getNombre(),getConsulta(),getFecha(), new Boolean(realizada)};   
    
        return s;            
    }
    
    public boolean getRealizada(){
        return realizada;
    }
    
    public String getFecha() {
        //return fechaInicio.getHours()+":"+fechaInicio.getMinutes();
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        return sd.format(fecha);
    }
    
    public int getConsulta(){
        return consulta;
    }
    public String toString(){
        return "Cita: "+id+"\n Consulta: "+consulta+"\n Paciente: "+paciente+"\n Precio: "+intervencion.getPrecio();
    }
    
    
}
