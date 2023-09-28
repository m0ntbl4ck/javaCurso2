
package com.streamsLambdas.practicaStreams.practica4;


import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author mont_
 */
public class CalculoTest {
    public static void main(String[] args) {
        
       List<VentasTxn> tList = VentasTxn.createTxnList();
       System.out.println(tList);
        
        System.out.println("=== Total Transacciones ===");
       
        double t1 = tList.stream() 
            .filter(t -> t.getCompradorNombre().equals("Aseo SA"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .sum();
        
        System.out.printf("Aseo Total: " + t1);
        
     
        double t2 = tList.stream() 
            .filter(t -> t.getCompradorNombre().equals("Camisas y Pantalones SA"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .sum();
        
        System.out.printf("Camisas y Pantalones SA: "+ t2);
       
        double t3 = tList.stream() 
            .filter(t -> t.getCompradorNombre().equals("Hogar CO"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .sum();
        
        System.out.printf("Hogar CO: "+ t3);
        
        
        
     
        System.out.println("=== Average Conteo unidad ===");
       
        OptionalDouble a1 = tList.stream()
            .filter(t -> t.getProducto().equals("Fundas de celular"))
            .mapToDouble( t-> t.getCantidadUnidades())
            .average();
        
        if (a1.isPresent()){
            System.out.printf("Fundas de celular Avg: "+ a1.getAsDouble());
        }
        
      
        OptionalDouble a2 = tList.stream()
            .filter(t -> t.getProducto().equals("Televisor LG"))
            .mapToDouble( t -> t.getCantidadUnidades())
            .average();
        
        if (a2.isPresent()){
            System.out.printf("Televisor LG AVG: "+ a2.getAsDouble());        
        } 
    }
     
}
