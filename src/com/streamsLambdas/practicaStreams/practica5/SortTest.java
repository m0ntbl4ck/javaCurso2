
package com.streamsLambdas.practicaStreams.practica5;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author mont_
 */
public class SortTest {
    public static void main(String[] args) {
        List<VentasTxn> tList = VentasTxn.createTxnList();
        Consumer<VentasTxn> transReporte = 
          t -> System.out.printf("Id: " + t.getTxnId() 
            + " Vendedor: " + t.getPersonaVenta()+ " Comprador: " 
            + t.getCompradorNombre()+ " Transaccion: "+ t.getTransaccionTotal());
        
     
        System.out.println("=== Transactiones ===");
        tList.stream()
            .sorted(Comparator.comparing(VentasTxn::getTransaccionTotal))
            .forEach(transReporte);
        
        System.out.println("\n=== Transactiones Camisas y Pantalones SA Reversed ===");
        tList.stream()
         
            .sorted(Comparator.comparing(VentasTxn::getTransaccionTotal).reversed())
            .forEach(transReporte);
                 
        
      
        System.out.println("\n=== Triple Transacciones Sort ===");
        tList.stream()
            .sorted(Comparator
                .comparing(VentasTxn::getCompradorNombre)
                .thenComparing(VentasTxn::getPersonaVenta)
                .thenComparing(VentasTxn::getTransaccionTotal)
            )
            .forEach(transReporte);
        
        
        
    }
}
