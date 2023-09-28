/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.streamsLambdas.practicas;

import static com.streamsLambdas.practicas.Bonus.EJECUTIVO;
import static com.streamsLambdas.practicas.Bonus.MANAGER;
import static com.streamsLambdas.practicas.Bonus.STAFF;

/**
 *
 * @author mont_
 */
public enum valorAcumulacion {
     STAFF(2*7/365d),
    MANAGER(2.5/365d), 
    EJECUTIVO(3*7/365d);

   
    private final double porDay;
    
     private valorAcumulacion(double porDay) {
        this.porDay = porDay;
    }

    public double porDay() {
        return porDay;
    }
    
    public static double porRol(Rol r){
        double tasaDeAcumulacion = 0.0d;
        
      switch(r){
            case EJECUTIVO: tasaDeAcumulacion  = EJECUTIVO.porDay;
            break;
            case MANAGER:tasaDeAcumulacion  = MANAGER.porDay;
            break;
            case STAFF:tasaDeAcumulacion  = STAFF.porDay;
            break;
            
            
        }
        return tasaDeAcumulacion;
    }
}
