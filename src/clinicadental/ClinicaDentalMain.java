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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Portati
 */
public class ClinicaDentalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        ArrayList<Empleado> emples = new ArrayList<>();
        Empleado em1 = new Empleado(4,"Antuan", "El", "Trenes", 9, Roles.ODONTOLOGO, "odon", "odon");
        Empleado em2 = new Empleado(8,"Dolor", "A.", "Nal", 55, Roles.PROPIETARIO, "proper", "proper");
        Empleado em3 = new Empleado(468,"Tete", "Colorado", "Nal", 345, Roles.RECEPCIONISTA, "tete", "tete");        
        Paciente[] p = {new Paciente(77, "Loreto", "Prieto", "Memoles", 98698),
                        new Paciente(2534, "Manuel", "Revilla", "Tosco", 32752),
                        new Paciente(0130, "Wiliamsito", "Vargas", "Motoche", 572357)};      
        Intervencion i1 = new Intervencion(em1, "Ortodoncia", 30,120);
        Intervencion i2 = new Intervencion(em1, "Limpieza", 80,90);
        Intervencion i3 = new Intervencion(em1, "Empaste", 50,200);
        Intervencion i4 = new Intervencion(em1, "Revisión",0,30);
        Intervencion i5 = new Intervencion(em1, "Extracción",45,15);
        Intervencion i6 = new Intervencion(em1, "Reconstruccion",100,200);
        
        
        Clinica.anadirCliente(p);
        
        Clinica.anadirEmpleado(em1);
        Clinica.anadirEmpleado(em2);
        Clinica.anadirEmpleado(em3);
        
        Clinica.anadirIntervencion(i1);
        Clinica.anadirIntervencion(i2);
        Clinica.anadirIntervencion(i3);
        Clinica.anadirIntervencion(i4);
        Clinica.anadirIntervencion(i5);
        Clinica.anadirIntervencion(i6);
        
        Clinica.anadirCita(4, p[0], i1, true, new Date(114, 5 - 1, 3, 16, 30));
        Clinica.anadirCita(2, p[1], i2, true, new Date(114, 3 - 1, 3, 19, 00));
        Clinica.anadirCita(4, p[0], i1, false, new Date(114, 2 - 1, 3, 22, 00));
        Clinica.anadirCita(2, p[1], i2, false, new Date(114, 6 - 1, 3, 13, 30));
        Clinica.anadirCita(2, p[1], i2, true, new Date(113, 9 - 1, 3, 18, 00));
        Clinica.anadirCita(4, p[0], i1, true, new Date(114, 4 - 1, 2, 16, 30));
        Clinica.anadirCita(2, p[1], i2, true, new Date(114, 5 - 1, 3, 2, 30));
        Clinica.anadirCita(4, p[0], i1, false, new Date(114, 7 - 1, 3, 8, 00));
        Clinica.anadirCita(2, p[1], i2, false, new Date(114, 3 - 1, 3, 11, 30));
        Clinica.anadirCita(2, p[1], i2, true, new Date(114, 5 - 1, 1, 12, 00));
        Clinica.anadirCita(4, p[0], i1, true, new Date(114, 2 - 1, 5, 16, 30));
        /*Clinica.anadirCita(2, p[1], i2,true);
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
         Clinica.anadirCita(2, p[1], i2,true);*/
        
//        Date d = new Date(114, 8, 9, 10, 0);
//        String st = d.toString();
//        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm");
//        st = sd.format(d);
//        try {
//        d = sd.parse(st);
//        System.out.println(st);
//        } catch (ParseException e){
//            System.out.println("error");    
//        }
        
        
          
        //AgendaUI.main(args);
        //JFrameAgenda.main(args);
        JFrameEmpleados.main(args);
    }
}
