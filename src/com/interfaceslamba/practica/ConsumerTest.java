
package com.interfaceslamba.practica;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author mont_
 */
public class ConsumerTest {
    public static void main(String[] args) {
        List<Empleado> lista = Empleado.crearLista();
        Empleado primerValor = lista.get(0);
        
        Consumer<Empleado> consumer = e -> System.out.println(
                        "Nombre: " + e.getPrimerNombre()+" "+ e.getSegundoNombre()+
                        " Rol: "+e.getRol()+ " Salario: "  +e.getSalario());
        
        System.out.println("\n");
        System.out.println("====Primer salario====");
        consumer.accept(primerValor);
    }
 
}
