
package com.streamsLambdas.practicaStreams.practica3;

import com.streamsLambdas.practicaStreams.*;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 *
 * @author mont_
 */
public class AseoTest {
    
    public static void main(String[] args) {
        
        
        
         List<VentasTxn> tLista = VentasTxn.createTxnList();
         System.out.println(tLista);
              
        
     Consumer<VentasTxn> reporteAseo =
             t -> System.out.printf("ID: "+ t.getTxnId()+" Vendedor: "+
                     t.getPersonaVenta()+ " -- Comprador: "+ t.getCompradorNombre()+" -- Departamento"
             +t.getDepartamento() + " --Transaccion: "+ t.getTransaccionTotal());
     
     
        System.out.println("=== Transacciones de Aseo SA ===");
        
        
        tLista.stream()
                .filter( t-> t.getCompradorNombre().equals("Aseo SA"))
                .forEach(reporteAseo);
        
        System.out.println("Total transacciones: ");
        long tConteo = tLista.stream()
                .filter(t-> t.getCompradorNombre().equals("Aseo SA"))
                .count();
        
        System.out.println(tConteo);
        
        
        System.out.println("=== Compra mas grande de Aseo SA ===");
        Optional<VentasTxn> tLargo = tLista.stream()
                .filter(t-> t.getCompradorNombre().equals("Aseo SA"))
                .max(Comparator.comparing(VentasTxn :: getTransaccionTotal));
        
        if(tLargo.isPresent()){
            reporteAseo.accept(tLargo.get());
        }
        
        System.out.println("=== Compra mas pequeña de Aseo SA ===");
        Optional<VentasTxn> tSmall = tLista.stream()
                .filter(t -> t.getCompradorNombre().equals("Aseo SA"))
               .min(Comparator.comparing(VentasTxn::getTransaccionTotal));
        
        if(tSmall.isPresent()){
            reporteAseo.accept(tSmall.get());
        }
        
       
    }
     
     
     

}
