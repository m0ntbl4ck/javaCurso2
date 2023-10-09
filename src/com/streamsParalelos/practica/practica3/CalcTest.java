
package com.streamsParalelos.practica.practica3;

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
        double t2 = tList.stream()
            .filter(t -> t.getCompradorNombre().equals("MercadoLibre CO"))
            .mapToDouble( t -> t.getTransaccionTotal())
            .parallel()
            .reduce(0, (sum, e) -> sum + e);
        
        System.out.println("MercadoLibre CO Total: "+ t2);

        double c2 = tList.stream()
            .filter(t -> t.getCompradorNombre().equals("Camisas y Pantalones SA"))
            .mapToDouble(t -> t.getTransaccionTotal())
            .parallel()
            .reduce(0, (sum, e) -> sum + e);
        
        System.out.println("Camisas y Pantalones SA Transacciones: "+ c2);
        
    }
}
