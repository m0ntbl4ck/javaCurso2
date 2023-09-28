
package com.streamsLambdas.practicaStreams.practica1;

import com.streamsLambdas.practicaStreams.*;
import java.util.List;

/**
 *
 * @author mont_
 */
public class MapTest {
    public static void main(String[] args) {
        List<VentasTxn>tLista = VentasTxn.createTxnList();
        System.out.println(tLista);
        System.out.println("=== Ventas de Smarth Watch inpuesto en Bogotá ===");
        tLista.stream()
                .filter(t-> t.getDepartamento().equals(Departamento.DC))
                .filter(t-> t.getProducto().equals("Smarth Watch"))
                .map(t-> t.getTransaccionTotal()* RangoImpuesto.porDepartamento(t.getDepartamento()))
                .forEach(t -> System.out.println("Impuesto de Transacion: "+t));
    }
   
   
   
}
