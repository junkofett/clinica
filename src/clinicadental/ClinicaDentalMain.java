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
        Empleado em1 = new Empleado(446464625,"Antuan", "El", "Trenes", 955893215,new Date(82,4,5), Roles.ODONTOLOGO, "odon", "odon");
        Empleado em2 = new Empleado(888979760,"Dolor", "A.", "Nal", 555984565, new Date(66,2,2),Roles.PROPIETARIO, "proper", "proper");
        Empleado em3 = new Empleado(468456456,"Tete", "Colorado", "Nal", 34587535, new Date(77,5,3), Roles.RECEPCIONISTA, "tete", "tete");        
        Paciente[] p = {new Paciente(74564667, "Loreto", "Prieto", "Memoles", 986980253, new Date(84,11,11)),
                        new Paciente(25343579, "Manuel", "Revilla", "Tosco", 327529898, new Date(55,7,9)),
                        new Paciente(41305468, "Wiliamsito", "Vargas", "Motoche", 572357535, new Date(92,2,3)),
                        new Paciente(33356484, "Vaca", "Pascual", "Miura", 985432154, new Date(84,2,3)),
                        new Paciente(99874536, "Toro", "Coronado", "Feito", 485623218, new Date(54,10,20)),
                        new Paciente(56894523, "Rosas", "Mogollón", "Majadas", 598746579, new Date(60,9,14)),
                        new Paciente(98863585, "Marcilla", "Moctezuma", "Teruel", 987956423, new Date(2,9,22)),
                        new Paciente(12458987, "Alvaro", "Marín", "Alvaro", 673421892, new Date(72,12,16)),
                        new Paciente(67634997, "Rebeca", "Jorge", "García", 856549873, new Date(66,4,4)),
                        new Paciente(45663279, "Margarita", "Del Campo", "Cerda", 195948735, new Date(56,3,3)),
                        new Paciente(84956722, "Mola", "Pascual", "Ojete", 878965376, new Date(81,1,24)),
                        new Paciente(66549872, "Rosas", "Ramos", "Melones", 876377337, new Date(79,2,11)),
                        new Paciente(78654325, "Francisco Javier", "Fernando", "Diego", 828995354, new Date(77,3,11)),
                        new Paciente(47532735, "Antonio", "Cabezón", "Salido", 456324589, new Date(61,5,5)),};      
        Intervencion i1 = new Intervencion(em1, "Ortodoncia", 30,120);
        Intervencion i2 = new Intervencion(em1, "Limpieza", 80,90);
        Intervencion i3 = new Intervencion(em1, "Empaste", 50,210);
        Intervencion i4 = new Intervencion(em1, "Revisión",0,15);
        Intervencion i5 = new Intervencion(em1, "Extracción",45,30);
        Intervencion i6 = new Intervencion(em1, "Reconstruccion",100,210);
        
        
        Clinica.anadirPaciente(p);
        
        Clinica.anadirEmpleado(em1);
        Clinica.anadirEmpleado(em2);
        Clinica.anadirEmpleado(em3);
        
        Clinica.anadirIntervencion(i1);
        Clinica.anadirIntervencion(i2);
        Clinica.anadirIntervencion(i3);
        Clinica.anadirIntervencion(i4);
        Clinica.anadirIntervencion(i5);
        Clinica.anadirIntervencion(i6);
        
        Clinica.anadirCita(4, p[0], i3, true, new Date(114, 5 - 1, 20, 9, 30));
        Clinica.anadirCita(2, p[1], i5, true, new Date(114, 5 - 1, 20, 10, 00));
        Clinica.anadirCita(4, p[0], i4, true, new Date(114, 5 - 1, 20, 10, 45));
        Clinica.anadirCita(2, p[2], i2, true, new Date(114, 5 - 1, 20, 11, 15));
        Clinica.anadirCita(2, p[1], i3, true, new Date(113, 5 - 1, 20, 10, 45));
        Clinica.anadirCita(4, p[0], i4, true, new Date(114, 5 - 1, 20, 11, 00));
        Clinica.anadirCita(2, p[2], i6, true, new Date(114, 5 - 1, 20, 11, 15));
        Clinica.anadirCita(4, p[0], i1, true, new Date(114, 5 - 1, 20, 11, 30));
        Clinica.anadirCita(2, p[2], i6, true, new Date(114, 5 - 1, 20, 11, 45));
        Clinica.anadirCita(2, p[1], i2, true, new Date(114, 5 - 1, 20, 12, 00));
        Clinica.anadirCita(4, p[2], i5, true, new Date(114, 5 - 1, 20, 12, 15));
        Clinica.anadirCita(4, p[0], i1, false, new Date(114, 5 - 1, 21, 9, 30));
        Clinica.anadirCita(2, p[1], i2, false, new Date(114, 5 - 1, 21, 11, 30));
        Clinica.anadirCita(4, p[0], i4, false, new Date(114, 5 - 1, 21, 13, 00));
        Clinica.anadirCita(2, p[2], i4, false, new Date(114, 5 - 1, 21, 13, 15));
        Clinica.anadirCita(2, p[1], i5, false, new Date(113, 5 - 1, 21, 13, 30));
        Clinica.anadirCita(4, p[0], i1, false, new Date(114, 5 - 1, 21, 14, 00));
        Clinica.anadirCita(2, p[2], i3, false, new Date(114, 5 - 1, 22, 9, 30));
        Clinica.anadirCita(4, p[0], i4, false, new Date(114, 5 - 1, 22, 13, 45));
        Clinica.anadirCita(2, p[2], i4, false, new Date(114, 5 - 1, 23, 9, 30));
        Clinica.anadirCita(2, p[1], i2, false, new Date(114, 5 - 1, 23, 9, 45));
        Clinica.anadirCita(4, p[2], i1, false, new Date(114, 5 - 1, 23, 11, 15));
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
        
        Date d = new Date(114, 8, 9, 10, 0);
        String st = d.toString();
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        st = sd.format(d);
        try {
        d = sd.parse(st);
        System.out.println(st);
        } catch (Throwable e){
            System.out.println("error");    
        }
        
        /* NOMBRES WAPETONES
        new Paciente(33356484, "Vaca", "Pascual", "Miura", 985432154, new Date(84,2,3)),
        new Paciente(99874536, "Toro", "Coronado", "Feito", 485623218, new Date(54,10,20)),
        new Paciente(56894523, "Rosas", "Mogollón", "Majadas", 598746579, new Date(60,9,14)),
        new Paciente(98863585, "Marcilla", "Moctezuma", "Teruel", 9879564236, new Date(2,9,22)),
        new Paciente(12458987, "Alvaro", "Marín", "Alvaro", 673421892, new Date(72,12,16)),
        new Paciente(67634997, "Rebeca", "Jorge", "García", 856549873, new Date(66,4,4)),
        new Paciente(45663279, "Margarita", "Del Campo", "Cerda", 195948735, new Date(56,3,3)),
        new Paciente(84956722, "Mola", "Pascual", "Ojete", 878965376, new Date(81,1,24)),
        new Paciente(66549872, "Rosas", "Ramos", "Melones", 876377337, new Date(79,2,11)),
        new Paciente(78654325, "Francisco Javier", "Fernando", "Diego", 828995354, new Date(77,3,11)),
        new Paciente(47532735, "Antonio", "Cabezón", "Salido", 456324589, new Date(61,5,5)),
            Vaca Pascual
            Porro Minondo
            Toro Coronado
            Margarita Flores
            Margarita del Campo
            Rebeca Jorge García
            Leña del Pino
            Rosas Ramos
            María Almudena de Antonio y Antonio
            Mogollón
            Marcilla de Teruel Moctezuma Capelo
            Ruiz de Gaunas
            Jacob Añonuevo
            Alvaro Marín Alvaro
            Cabezón
            Blau Schwipl
            Cerda
            Mola Pascual
            Paja
            Majadas
            Gordo
            Ojete
            Salido
            Melones
            Cotillas
            Cabello Barbero
            Francisco Javier Fernando Diego
            Sayans
            Conejo
            Enamorado
            Feito
            Peleo
            Nieves Blancas
            Da Pena
            Mangitani Mangitani
            Cogollos        
        */
        
        
          
        //LoginJframe.main(args);
        //JFrameAgenda.main(args);
        //JFrameEmpleados.main(args);
        JFramePacientes.main(args);
        //JFrameNuevaCita.main(args);
    }
}
