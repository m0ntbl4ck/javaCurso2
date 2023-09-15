
package com.example.domain;

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
    
    
}
