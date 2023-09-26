
package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author mont_
 */
public class MainStream {
    public static void main(String[] args) {
        
        List<String> paises = new ArrayList();
        String pais = "COLOMBIA";
        paises.add("USA");
        paises.add("ECUADOR");
        paises.add(2, pais);
        paises.add("VENEZUELA");
        paises.add(3,"ARGENTINA");
        paises.add("ECUADOR");
        paises.add("ECUADOR");
        
        paises.stream()
                .filter(p ->p.contains("A"))
                .filter(p-> p.endsWith("IA"))
                .forEach(p->System.out.println(p));
        
        
        
        Stream<String> paises2 = Stream.of("COLOMBIA","USA","ECUADOR");
        
        System.out.println(paises2);
        
        
     List<String> paisesfiltrados=   paises2
        .filter(p ->p.contains("A"))
        .filter(p-> p.endsWith("IA"))
        .collect(Collectors.toList());
        
        
        
        //System.out.println(paisesfiltrados);
        
        //crear una coleccion stream
        
        Stream<String> streamDeStrings= Stream.of("Antonio","Maria","Juan","Pedro");
   
     
        
        //convertir una lista a un stream
        
 //  List<String> lista =Arrays.asList("Antonio","Maria","Juan","Pedro");
   //Stream<String> streamDeLista=lista.stream();
   
   
  //Convertir un Stream a  unalsta
   List<String> StreamALista =streamDeStrings.collect(Collectors.toList());
   
   //Si imprimo una lista me imprime la referencia
    //    System.out.println(streamDeStrings);
        
        
      //Imprimir como lista  
    //System.out.println(StreamALista);
    
    
    
    //filtar archivos deacuerdo a expresiones lambda
   //streamDeStrings=streamDeStrings.filter(s->s.contains("a"));
   
   
   
   //recorrda de stream con una expreson lambda
   //streamDeStrings = streamDeStrings.map(s-> s.toUpperCase());
   
   
   
   //devuelve los elementos del stream
  //long count1 = streamDeStrings.count();
  
  //Devuelve un boolean cuando  al menos un valor cumple una condicion lambda
  //boolean match = streamDeStrings.anyMatch(s->s.contains("M"));
  
  
  //Manipular un list -- ArrayList lINKEDLIST
/* StreamALista.stream()
          .filter(s->s.contains("a"))
          .filter(s->s.startsWith("M"))
          .forEach(s->System.out.println(s));
*/
    }
  
   
}
