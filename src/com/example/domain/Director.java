
package com.example.domain;

/**
 *
 * @author mont_
 */
public class Director extends Manager {
    
    private  double presupuesto;
    public Director(String nombre, int empleadoID, double salario, String cargo,String nombreDepartamento,double presupuesto) {
        super(nombre, empleadoID, salario, cargo, nombreDepartamento);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
}
