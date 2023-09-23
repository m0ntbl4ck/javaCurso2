
package com.genericos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mont_
 */
public class MainGenericos {
    
    public static void main(String[] args) {
        //Los genericos son usados en las listas Colecciones 
        
        //clases Wrapper Integer, String, Double, Long, Character
        List<String>  lista = new ArrayList();
        
        lista.add("Juan");
        lista.add("andres");
        
        System.out.println(lista);
        
        String[] array = lista.toArray(new String[lista.size()]);
        
        
        
        
      Generico<Integer,String> ejemploGenerico = new Generico(123,"camisa");
      
      Generico<Double,String> ejemploGenerico2 =new Generico(123,"CADENA");
        
      Integer numero = new Integer(12);
        ejemploGenerico.metodoConGenericos(numero);
        
        System.out.println(ejemploGenerico.getNombre()); 
        Generico<Integer,String> generico1 = new Generico(2,"sTRING");
        
        Generico<Integer,String> generico2 = new Generico(2,"cadena");
        
        
       /* Generico<String> generico1 = new Generico<>("Hola");
        
        System.out.println(generico1.getNumero());
        
        generico1.mostrarClaseGenerico();*/
        
    }
}
