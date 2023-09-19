
package com.example.domain;

/**
 *
 * @author mont_
 */
public class Engineer extends Empleado{

    public Engineer(String nombre, int empleadoID, double salario, String cargo) {
        super(nombre, empleadoID, salario, "Ingenierio");
    }

    @Override
    public void MetodoAbstrat() {
        System.out.println("METODO ABSTRACTO");
    }
    
    
    
}
