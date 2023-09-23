/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mont_
 */
public class CollectionsList {
    public static void main(String[] args) {
        //Implementan la interfaz List
        //ArrayList es mas eficiente para buscar elementos
        List<String> paises = new ArrayList<>();
        
  
        System.out.println("\t\t\tArrayList");
        System.out.println("\t\t\t=========");
        System.out.println("ArrayList es mas eficiente para buscar elementos");
        
        String pais = "COLOMBIA";
        paises.add("USA");
        paises.add("ECUADOR");
        paises.add(2, pais);
        paises.add("VENEZUELA");
        paises.add(3,"ARGENTINA");
        paises.add("ECUADOR");
        paises.add("ECUADOR");
       paises.remove("USA");
        
    for(String pais1 : paises){
        System.out.println(pais1);
    }
    
       // System.out.println(paises.contains(pais));
        
        System.out.println(paises);
        
        System.out.println();
       
        //LinkedList es mejor para insertar y eliminar elementos
        List <String> ciudades = new LinkedList<>();
        String ciudad = "BOGOTA";
        ciudades.add("NEW YORK");
        ciudades.add("GUAYAQUIL");
        ciudades.add(2, ciudad);
        ciudades.add("CARACAS");
        ciudades.add(3,"BUENOS AIRES");
         ciudades.add("CARACAS");
          ciudades.add("CARACAS");
        ciudades.remove(0);
        
       System.out.println("\t\t\tLinkedList");
        System.out.println("\t\t\t==========");
       System.out.println("LinkedList es mejor para insertar y eliminar elementos");
       System.out.println(ciudades);
       ciudades.remove(ciudad);
        System.out.println(ciudades);
        
        System.out.println("Ambas manejan indice y admiten duplicados");
        
    }
    
}
