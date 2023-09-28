
package com.streamsLambdas.practicaStreams;

import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author mont_
 */
public class CalculoTest {
    public static void main(String[] args) {
       List<VentasTxn> tList = VentasTxn.createTxnList();
        
        
        System.out.println("=== Total Transacciones ===");
       
        double t1 = tList.stream() 
            .filter(t -> t.getCompradorNombre().equals("Aseo SA"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .sum();
        
        System.out.printf("Aseo Total: " + t1);
        
        // Replace with Stream
        double t2 = tList.stream() 
            .filter(t -> t.getCompradorNombre().equals("Camisas y Pantalones SA"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .sum();
        
        System.out.printf("Camisas y Pantalones SA: "+ t2);
        // Replace with stream
        double t3 = tList.stream() 
            .filter(t -> t.getCompradorNombre().equals("Hogar CO"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .sum();
        
        System.out.printf("Hogar CO: "+ t3);
        
        // Print out Average Unit Count
        System.out.println("=== Average Conteo unidad ===");
        // Replace with Stream
        OptionalDouble a1 = tList.stream()
            .filter(t -> t.getProducto().equals("Fundas de celular"))
            .mapToDouble( t-> t.getCantidadUnidades())
            .average();
        
        if (a1.isPresent()){
            System.out.printf("Fundas de celular Avg: "+ a1.getAsDouble());
        }
        
        // Replace with stream
        OptionalDouble a2 = tList.stream()
            .filter(t -> t.getProducto().equals("Televisor LG"))
            .mapToDouble( t -> t.getCantidadUnidades())
            .average();
        
        if (a2.isPresent()){
            System.out.printf("Televisor LG AVG: "+ a2.getAsDouble());        
        } 
    }
     
}
