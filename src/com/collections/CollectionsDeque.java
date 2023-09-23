
package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author mont_
 */
public class CollectionsDeque {
    public static void main(String[] args) {
        //ArrayDeque
    
    Deque<String> nombresBiblicos = new ArrayDeque<>();
    nombresBiblicos.add("Jesus");
    nombresBiblicos.add("Maria");
    nombresBiblicos.add("Jose");
    nombresBiblicos.add("Pablo");
    nombresBiblicos.add("Pedro");
    
    
    //nombresBiblicos.remove();
    
    
    /*El método peek() se utiliza para acceder al elemento 
    en la parte frontal de la cola (el extremo que se considera 
    el "principio") sin eliminarlo.*/
    String variablePeek = nombresBiblicos.peek();
    
        System.out.println(variablePeek);
        System.out.println();
        System.out.println(nombresBiblicos);
        
   /*El método poll() se utiliza para eliminar y devolver 
el elemento en la parte frontal de la cola (el extremo que se
considera el "principio").*/
   
   /*se utiliza para eliminar y devolver el elemento en 
   el extremo frontal de la cola (el "principio").*/
      System.out.println(nombresBiblicos.poll());
      System.out.println();
      
        System.out.println(nombresBiblicos);
        
        
       System.out.println(nombresBiblicos.pop()); 
        System.out.println();
        
        System.out.println(nombresBiblicos);


   nombresBiblicos.addLast("Moises");
    nombresBiblicos.addFirst("Juan");
    
        System.out.println(nombresBiblicos);
    for(String elemento: nombresBiblicos){
      System.out.println("Nombre: "+elemento);
    }
    
    
    /*Elimina el primer elemento*/
    
    System.out.println(nombresBiblicos.remove());
    
   
        /*Inserta un elemento al principio de la lista*/
      nombresBiblicos.push("David");
      System.out.println(nombresBiblicos);
    }
}
