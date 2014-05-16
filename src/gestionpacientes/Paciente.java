/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestionpacientes;

import clinicadental.Persona;
import gestionagenda.Cita;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author ROCA
 */
public class Paciente extends Persona {
    
    private ArrayList<String> alergias;
    private ArrayList<Cita> historial;
    

    public Paciente(int dni, String nomb, String ape1, String ape2, int tlf){
        super(dni, nomb, ape1, ape2, tlf);
    }
   
    public void anadirIntervencion(Cita c){
        historial.add(c);
    }
    
    public String toString(){
        return getNombre() +" "+ getApellido1() +" "+ getDni();
    }
}
