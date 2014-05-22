/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestionpacientes;

import clinicadental.Persona;
import gestionagenda.Cita;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ROCA
 */
public class Paciente extends Persona {
    
    private ArrayList<String> alergias;
    private ArrayList<Cita> historial;
    

    public Paciente(int dni, String nomb, String ape1, String ape2, int tlf, Date fechaNac){
        super(dni, nomb, ape1, ape2, tlf, fechaNac);
    }
    
    /**
     * 
     * @return recopilacion de los datos del paciente
     */
    public Object[] datosTabla(){
        Date d = getFechaNac();
        String st = d.toString();
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        st = sd.format(d);
        
        Object[] datos = {getNombre(),getApellido1(),getApellido2(), st, getDni(), getTelefono()};
        
        return datos;
    }
   
    public void anadirIntervencion(Cita c){
        historial.add(c);
    }
    
    public String toString(){
        return getNombre() +" "+ getApellido1() +" "+ getDni();
    }
}
