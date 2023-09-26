
package com.interfaceslamba.practica;

import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author mont_
 */
public class FunctionTest {
    public static void main(String[] args) {
        
    
            
    List<Empleado> lista = Empleado.crearLista();
        Empleado primerValor = lista.get(0);
        
        ToDoubleFunction<Empleado> func =
                e-> e.getSalario() * Bonus.porRol(e.getRol());
        
        System.out.println("\n");
        System.out.println("====Primer Empleado con Bonus====");
        primerValor.getResumen();
        System.out.println("Bonus: "+ func.applyAsDouble(primerValor));
        }
}
