
package com.example.domain;

import java.util.Objects;

/**
 *
 * @author mont_
 */
public class Manager extends Empleado {

    private String nombreDepartamento;
    
    public Manager(String nombre, int empleadoID, double salario, String cargo, String nombreDepartamento) {
        super(nombre, empleadoID, salario, cargo);
        this.nombreDepartamento = nombreDepartamento;
    }
    
    
    
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
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
        final Manager other = (Manager) obj;
        return (super.equals(other)&&Objects.equals(this.nombreDepartamento, other.nombreDepartamento));
    }

    @Override
    public String toString() {
        return super.toString()+" El departamento es: "+this.nombreDepartamento;
    }

    @Override
    public void MetodoAbstrat() {
        System.out.println("METODO ABSTRACTO");
    }
    
    
    
}
