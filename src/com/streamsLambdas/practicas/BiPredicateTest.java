
package com.streamsLambdas.practicas;

import java.util.List;
import java.util.function.BiPredicate;
/**
 *
 * @author mont_
 */
public class BiPredicateTest {
   
    public static void main(String[] args) {
        List<Empleado> lista = Empleado.crearLista();
        Empleado primero = lista.get(0);
        String buscarDepartamento ="Antioquia";
        
        BiPredicate<Empleado, String> biPred=(e,s)-> e.getDepartamento().equals(s);
        
        System.out.println("===Imprimir lista de encontrados");
        
        for(Empleado e : lista){
            if(biPred.test(e,buscarDepartamento)){
                e.imprimirResumen();
            }
        }
    }
}
