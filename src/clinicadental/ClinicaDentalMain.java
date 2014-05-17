/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clinicadental;

import gestionempleados.*;
import gestionintervencion.*;
import gestionpacientes.*;
import gestionagenda.*;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Portati
 */
public class ClinicaDentalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> emples = new ArrayList<>();
        Empleado em1 = new Empleado(4,"Antuan", "El", "Trenes", 9, Roles.ODONTOLOGO, "odon", "odon");
        Empleado em2 = new Empleado(8,"Dolor", "A.", "Nal", 55, Roles.PROPIETARIO, "proper", "proper");
        Empleado em3 = new Empleado(468,"Tete", "Colorado", "Nal", 345, Roles.RECEPCIONISTA, "tete", "tete");        
        Paciente[] p = {new Paciente(77, "Loreto", "Prieto", "Memoles", 98698),
                        new Paciente(2534, "Manuel", "Revilla", "Tosco", 32752),
                        new Paciente(0130, "Wiliamsito", "Vargas", "Motoche", 572357)};      
        Intervencion i1 = new Intervencion(emples, "Ortodoncia", 30);
        Intervencion i2 = new Intervencion(emples, "Limpieza", 80);
        Intervencion i3 = new Intervencion(emples, "Empaste", 50);
        
        Clinica.anadirCliente(p);
        
        Clinica.anadirEmpleado(em1);
        Clinica.anadirEmpleado(em2);
        Clinica.anadirEmpleado(em3);
        
        Clinica.anadirIntervencion(i1);
        Clinica.anadirIntervencion(i2);
        Clinica.anadirIntervencion(i3);
        
        Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
          Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
          Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
          Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
          Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
         Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
          Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
          Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
          Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
          Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
         Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
          Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
          Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
          Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
          Clinica.anadirCita(4, p[0], i1,true);
        Clinica.anadirCita(2, p[1], i2,true);
        Clinica.anadirCita(4, p[0], i1,false);
        Clinica.anadirCita(2, p[1], i2,false);
        Clinica.anadirCita(2, p[1], i2,true);
        
        AgendaUI.main(args);
    }
}
