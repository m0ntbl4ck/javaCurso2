
package com.practica;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author mont_
 */
public class PilaDeque {
    private Deque<Integer> datos = new ArrayDeque();
    public static void main(String[] args) {
       PilaDeque pila = new PilaDeque();
       
        for (int i = 0; i < 5; i++) {
            pila.push(i);
        }
        
        System.out.println("Despues de agregar cn push 5 elementos: "+pila);
        System.out.println();
        
        int elemento = pila.pop();
        System.out.println("Despues de traer y eliminar el primer elemento(popping): "+pila);
        System.out.println();
        
        int primerElemento = pila.peek();
        System.out.println("Primer elemento = "+primerElemento);
        System.out.println("Despues de traer sin eliminar el primer elemento (peeking): "+pila);
    }
    
    
    public void push(Integer elemento){
        datos.addFirst(elemento);
    }
    public Integer pop(){
        if(datos.isEmpty()){
            System.out.println("La pila esta vacia");
        }
        return datos.removeFirst();
    }
    
    public Integer peek(){
        return datos.peekFirst();
    }

    @Override
    public String toString() {
        return datos.toString();
    }
    
    
    
}
