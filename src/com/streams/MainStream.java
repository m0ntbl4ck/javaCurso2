
package com.streams;

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
        //crear una coleccion stream
        
        Stream<String> streamDeStrings= Stream.of("Antonio","Maria","Juan","Pedro");
   
        
        
        
        
        //convertir una lista a un stream
        
   List<String> lista =Arrays.asList("Antonio","Maria","Juan","Pedro");
   Stream<String> streamDeLista=lista.stream();
   
   
  //Convertir un Stream a  unalsta
   List<String> StreamALista =streamDeStrings.collect(Collectors.toList());
   
   //Si imprimo una lista me imprime la referencia
        System.out.println(streamDeStrings);
        
        
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
 StreamALista.stream()
          .filter(s->s.contains("a"))
          .filter(s->s.startsWith("M"))
          .forEach(s->System.out.println(s));

    }
  
   
}
