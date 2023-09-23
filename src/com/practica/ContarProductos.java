
package com.practica;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author mont_
 */
public class ContarProductos {
    private Map <String,Long> mapConteoProductos = new HashMap();
    private Map<String,String> nombreProductos = new TreeMap();
    
    public static void main(String[] args) {
        String[] referencias = new String[]{"1S01","1S01","1S01","1S01","1S01",
        "1S02","1S02","1S02","1H01","1H01","1H01","1S02","1S01","1S01","1H01","1H01",
        "1H01","1S02","1S02","1M02","1M02","1M02","1M02","1M02"};
        
        Map<String, String> nombreProductos = new TreeMap();
         nombreProductos.put("Smart TV LG","1H01");
         nombreProductos.put("Celular Huawei", "1S01");
         nombreProductos.put("Portatil Lenovo", "1M02");
         nombreProductos.put("Celular Samsung", "1S02");
         
         
         ContarProductos piezas = new ContarProductos(nombreProductos);
         piezas.procesoDeLista(referencias);
         piezas.imprimirReporte();
         
    }
    

    public ContarProductos(Map nombreProductos) {
        this.nombreProductos =nombreProductos;
    }
   
    public void procesoDeLista(String[] referencias){
        long valor =0;
        for(String numeroItem : referencias){
            if(mapConteoProductos.containsKey(numeroItem)){
                valor=mapConteoProductos.get(numeroItem);
                valor++;
                mapConteoProductos.put(numeroItem,new Long(valor));
            }else{
                mapConteoProductos.put(numeroItem, new Long(1));
            }
        }
        
    }
    public void imprimirReporte(){
        System.out.println("\t\t\t==== Reporte De Productos ====");
        for(String key : nombreProductos.keySet()){
            System.out.print("Nombre: "+key );
            System.out.println("\t\t\tConteo: "+
                 mapConteoProductos.get(nombreProductos.get(key)));
        }
    }
    
}
