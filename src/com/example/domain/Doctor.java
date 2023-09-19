/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author mont_
 */
public class Doctor {

    public static AgedarCitas AgedarCitas;
    private String nombre;
    private int ID;
    private String especialidad;

    //Clase miembro anidada
    private class Citas{
        
    }
   
    //Clase estatica anidada
    public static class AgedarCitas{
        private String paciente;
        private Date fecha;
        private Time hora;
       
    }
    
    AgendarCitas nuevaCita = new AgendarCitas();
    
    
}
