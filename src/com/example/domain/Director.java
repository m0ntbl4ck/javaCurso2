
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

   
    @Override
    public String toString() {
        return super.toString()+ " El presupuesto es: "+ this.getPresupuesto();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Director other = (Director) obj;
        return (super.equals(other)&&Double.doubleToLongBits(this.presupuesto) == Double.doubleToLongBits(other.presupuesto));
    }
    
}
