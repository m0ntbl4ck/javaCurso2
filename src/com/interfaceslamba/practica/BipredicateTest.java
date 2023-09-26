
package com.interfaceslamba.practica;

import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author mont_
 */
public class BipredicateTest {
    public static void main(String[] args) {
        List<Empleado> lista = Empleado.crearLista();
        Empleado primerValor = lista.get(0);
        String departamento = "Antioquia";
        
        BiPredicate<Empleado, String> bipre=
                (e,s)-> e.getDepartamento().equals(s);
        
        System.out.println("\n");
        System.out.println("====Departamentos encontrados====");
        for(Empleado e: lista){
            if(bipre.test(e, departamento)){
                e.imprimir();
            }
        }
        
        
    }
}
