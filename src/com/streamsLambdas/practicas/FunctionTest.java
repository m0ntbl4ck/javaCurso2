
package com.streamsLambdas.practicas;

import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author mont_
 */
public class FunctionTest {
    public static void main(String[] args) {
        
        List<Empleado> lista = Empleado.crearLista();
        Empleado primero = lista.get(0);
        
        ToDoubleFunction<Empleado> tofunct = e -> e.getSalario()* Bonus.porRol(e.getRol());
        
        System.out.println("==== Primer Bonus de Empleado");
        primero.imprimirResumen();
        System.out.println("Bonus: "+tofunct.applyAsDouble(primero));
        
    }
    
   
      
}
