
package com.streamsParalelos.practica.practica1;

/**
 *
 * @author mont_
 */
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class CalcTest {
    
    public static void main(String[] args) {

        List<VentasTxn> tList = VentasTxn.createTxnList();
        
        // Imprimir los totales de transacciones
        System.out.println("=== Totales de Transacciones ===");
        
        Stream<VentasTxn> s1 = tList.stream();
        
        
        Stream<VentasTxn> s2 = s1.filter(
            t -> t.getCompradorNombre().equals("MercadoLibre CO"));
        
        
        DoubleStream s3 = s2.mapToDouble(
            t -> t.getTransaccionTotal());
        
        
        double t1 = s3.sum();
        
        System.out.printf("Total de MercadoLibre CO: $%,9.2f%n", t1);
        
    }
}

