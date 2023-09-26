/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interfaceslamba.practica;

/**
 *
 * @author mont_
 */
public enum Bonus {
    STAFF(0.02), 
    MANAGER(0.04), 
    EJECUTIVO(0.06);
    
    public final double porciento;

    Bonus(double porciento){
    this.porciento = porciento;
    }

    public double porciento(){
        return porciento;
    }

      public static double porRol(Rol r){
            double bonusPorciento = 0.0d;
            
            switch(r){
            case EJECUTIVO: 
                bonusPorciento =  EJECUTIVO.porciento; break;
            case STAFF: 
                bonusPorciento =  STAFF.porciento; break;
            case MANAGER: 
                bonusPorciento = MANAGER.porciento; break;
        }   
            
            return bonusPorciento;
        }
      
}
