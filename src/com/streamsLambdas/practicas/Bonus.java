
package com.streamsLambdas.practicas;

/**
 *
 * @author mont_
 */
public enum Bonus {
    STAFF(0.02),
    MANAGER(0.04), 
    EJECUTIVO(0.06);
    
    private final double porciento;

    private Bonus(double porciento) {
        this.porciento = porciento;
    }

    public double porciento() {
        return porciento;
    }
    
    public static double porRol(Rol r){
        double bonusPorciento= 0.0d;
        switch(r){
            case EJECUTIVO: bonusPorciento  = EJECUTIVO.porciento;
            break;
            case MANAGER:bonusPorciento  = MANAGER.porciento;
            break;
            case STAFF:bonusPorciento  = STAFF.porciento;
            break;
            
            
        }
        return bonusPorciento;
        
    }
    
    
    
}
