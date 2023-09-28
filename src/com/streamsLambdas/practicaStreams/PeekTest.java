
package com.streamsLambdas.practicaStreams;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author mont_
 */
public class PeekTest {
    public static void main(String[] args) {
          List<VentasTxn>tLista = VentasTxn.createTxnList();
          Consumer<VentasTxn> reporteDeimpuesto =
                  t-> System.out.println("Id: "+t.getTxnId()
                  + " Comprador "+ t.getCompradorNombre()+
                          " Transaccion : "+ t.getTransaccionTotal());
          
          System.out.println("=== Ventas de Comedor impuesto en Antioquia ");
          
          tLista.stream()
                  .filter(t -> t.getDepartamento().equals(Departamento.ANT))
                  .filter(t-> t.getProducto().equals("Comedor"))
                  .peek(reporteDeimpuesto)
                  .map(t-> t.getTransaccionTotal() * RangoImpuesto.porDepartamento(t.getDepartamento()))
                  .forEach (t-> System.out.println("Impuesto: "+t));
    }
}
