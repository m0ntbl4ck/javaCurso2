
package com.streamsLambdas.practicaStreams.practica2;

import com.streamsLambdas.practicaStreams.*;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 *
 * @author mont_
 */
public class LazyTest {
    public static void main(String[] args) {
        List<VentasTxn>tLista = VentasTxn.createTxnList();
        Consumer<VentasTxn> reporteCantidad = 
                t-> System.out.println("Vendedor: "+
                t.getPersonaVenta()+ "-- Comprador: "+ t.getCompradorNombre()
                + "Cantidad: "+t.getCantidadUnidades());
        
        Consumer<VentasTxn> inicioStream =
                t-> System.out.println("Inicio del flujo: "+t.getPersonaVenta()
                +" ID: "+t.getTxnId());
        
        Consumer<VentasTxn> buscarDepart =
                t-> System.out.println("Departamento buscado: "+ t.getPersonaVenta()
                        +"Departamento: "+ t.getDepartamento());
        
        Consumer<VentasTxn> buscarProducto =
                 t-> System.out.println("Producto a buscar");
        
        
        System.out.println("\n=== Cantidad de Fundas de celular en Boyacá ===");
        
        tLista.stream()
                .filter(t -> t.getDepartamento().equals(Departamento.BOY))
                .filter(t-> t.getProducto().equals("Fundas de celular"))
                .forEach(reporteCantidad);
        
        System.out.println("\n=== Cantidad de Fundas de celular en Boyacá (FindFirst) ===");
        
        Optional<VentasTxn> ft= tLista.stream()
                .peek(inicioStream)
                .filter(t-> t.getDepartamento().equals(Departamento.BOY))
                .peek(buscarDepart)
                .filter(t -> t.getProducto().equals("Fundas de celular"))
                .peek(buscarProducto)
                .findFirst();
        
        if(ft.isPresent()){
            reporteCantidad.accept(ft.get());
        }
        
        
        
        
    }
   
      
}
