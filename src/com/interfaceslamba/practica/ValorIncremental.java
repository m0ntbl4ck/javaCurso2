
package com.interfaceslamba.practica;



/**
 *
 * @author mont_
 */
public enum ValorIncremental {
    
    STAFF((2*7)/365d), 
    MANAGER((2.5*7)/365d), 
    EJECUTIVO((3*7)/365d);
    
    public final double porDia;

   ValorIncremental (double porDia){
        this.porDia = porDia;
    }

    public double porDia(){
        return porDia;
    }

      public static double porRol(Rol r){
            double valorincremendatado = 0.0d;
            
            switch(r){
            case EJECUTIVO: 
                valorincremendatado =  EJECUTIVO.porDia; break;
            case STAFF: 
                valorincremendatado =  STAFF.porDia; break;
            case MANAGER: 
                valorincremendatado = MANAGER.porDia; break;
        }   
            
            return valorincremendatado;
        }
}
