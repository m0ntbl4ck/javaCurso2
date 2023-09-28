
package com.streamsLambdas.practicas;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author mont_
 */
public class ConsumerTest {
    public static void main(String[] args) {
        List<Empleado> lista = Empleado.crearLista();
        Empleado primero = lista.get(0);
        
        Consumer<Empleado> cons = e -> System.out.println(
        "NoMBRE: "+e.getPrimerNombre()+" "+e.getSegundoNombre()
        + " Rol: "+e.getRol() + " Salario: "+ e.getSalario()
        );
        
        System.out.println("==== Primer Salario");
        cons.accept(primero);
    }
}
