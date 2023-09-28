
package com.streamsLambdas.practicaStreams.practica7;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author mont_
 */
public class JoinTest {
    public static void main(String[] args) {
         List<VentasTxn> tList = VentasTxn.createTxnList();
         
         
         System.out.println("=== Lista Ordenada de Compradores");
         String resultado = tList.stream()
                 .map(t-> t.getCompradorNombre())
                 .distinct()
                 .sorted()
                 .collect(Collectors.joining(", "));
         
         System.out.println("Lista de Compradores: "+resultado);
    }
}
