
package com.streamsLambdas.practicaStreams.practica6;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 *
 * @author mont_
 */
public class CollectTest {
    public static void main(String[] args) {
       List<VentasTxn> tList = VentasTxn.createTxnList();
    List<VentasTxn> rList;
    
    Consumer<VentasTxn> reporteTxn = t-> System.out.println("Id: "+t.getTxnId()+ " Vendedor: "+ t.getPersonaVenta()
                +" Comprador: "+ t.getCompradorNombre()+
                        " Transaccion: "+ t.getTransaccionTotal());
    
        System.out.println("=== Transacciones mayores a $300k"); 
        rList = tList.stream()
                .filter(t-> t.getTransaccionTotal() > 300000)
                .sorted(Comparator.comparing(VentasTxn:: getTransaccionTotal))
                .collect(Collectors.toList());
        
        
        rList.stream()
                .forEach(reporteTxn);
        
    }
     
}
