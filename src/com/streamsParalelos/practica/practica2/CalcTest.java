
package com.streamsParalelos.practica.practica2;

import java.util.List;

/**
 *
 * @author mont_
 */
public class CalcTest {
    public static void main(String[] args) {

        List<VentasTxn> tList = VentasTxn.createTxnList();
        
        // Print out Transaction Totals
        System.out.println("=== Transacciones Totales ===");
        double t1 = tList.parallelStream()
            .filter(t -> t.getCompradorNombre().equals("MercadoLibre CO"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .sum();
        
        System.out.printf("MercadoLibre CO Total: $%,9.2f%n", t1);
        
        double t2 = tList.stream()
            .filter(t -> t.getCompradorNombre().equals("Electronics CO"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .parallel()
            .sum();
        
        System.out.printf("Electronics CO Total: $%,9.2f%n", t2);
        
        double t3 = tList.stream()
            .filter(t -> t.getCompradorNombre().equals("Aseo SA"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .sequential()
            .sum();
        
        System.out.printf("Aseo SA Total: $%,9.2f%n", t3);                 
        
    }
}

