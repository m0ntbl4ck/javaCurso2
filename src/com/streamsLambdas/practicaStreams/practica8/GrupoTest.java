
package com.streamsLambdas.practicaStreams.practica8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author mont_
 */
public class GrupoTest {
    public static void main(String[] args) {
                List<VentasTxn> tList = VentasTxn.createTxnList();
                Map<String, List<VentasTxn>> tMap;
                
                System.out.println("=== Grupo de Transacciones por Comprador ===");
                tMap = tList.stream()
                        .collect(Collectors.groupingBy(VentasTxn::getCompradorNombre));
                
                tMap.forEach((k,v) -> {
                    System.out.println("\n Comprador: "+k);
                    v.forEach(VentasTxn::imprimirResumen);
                });
    }
}
