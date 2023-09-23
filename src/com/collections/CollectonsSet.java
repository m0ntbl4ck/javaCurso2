
package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mont_
 */
public class CollectonsSet {
    public static void main(String[] args) {
        //Implementan la interfaz Set
        //HashSet Lista desordenada pero se garantiza que no hay duplicidad
        //La Interfaz set no manejan indice
        
        Set<String> listHashSet =  new HashSet();
        listHashSet.add("MEDELLIN");
        listHashSet.add("BOGOTA");
        listHashSet.add("CALI");
        listHashSet.add("CARTAGENA");
        listHashSet.add("BARRANQUILLA");
        listHashSet.add("TUNJA");
        listHashSet.add("RISARALDA");
        listHashSet.add("CUCUTA");
        
        listHashSet.add("CUCUTA");
        listHashSet.add("BOGOTA");
        listHashSet.add("MEDELLIN");
        
        System.out.println("\t\t\tHashSet");
        System.out.println("\t\t\t=======");
        System.out.println("HashSet Lista desordenada pero se garantiza que no hay duplicidad");
        for(String ciudad: listHashSet){
            System.out.println("ciudad: "+ciudad);
        }
        
        System.out.println(listHashSet);
        
        System.out.println();
        
        
        //TreeSet tiene ordenamiento natural de menor a mayor
        TreeSet<Integer> listaTreeSet = new TreeSet<>();
        
        listaTreeSet.add(41212);
        listaTreeSet.add(1);
        listaTreeSet.add(3);
        listaTreeSet.add(2);
        listaTreeSet.add(5);
        listaTreeSet.add(45);
        System.out.println("\t\t\tTreeSet");
        System.out.println("\t\t\t=======");
        System.out.println("TreeSet tiene ordenamiento natural de menor a mayor");
        System.out.println(listaTreeSet);
       listaTreeSet.add(1);
        
        TreeSet<String> listaTreeSet2 = new TreeSet<>();
        
        listaTreeSet2.add("Z");
        listaTreeSet2.add("A");
        listaTreeSet2.add("B");
        listaTreeSet2.add("C");
        listaTreeSet2.add("H");
        listaTreeSet2.add("E"); 
       
        System.out.println(listaTreeSet2);
        System.out.println();
        
        
        listaTreeSet2.remove("Z");
        System.out.println(listaTreeSet2);
        System.out.println("no tienen indice");
        System.out.println();
        
        
        //Lista LinkedHashSet permite se guardan en el orden que se insertan y no admite duplicidad
        Set<String> listaLinkedHashSet = new LinkedHashSet<>();
        
        listaLinkedHashSet.add("Andrea");
        listaLinkedHashSet.add("Jesus");
        listaLinkedHashSet.add("Viviana");
        listaLinkedHashSet.add("Felipe");
        listaLinkedHashSet.add("Alberto");
        listaLinkedHashSet.add("Sofia");
        System.out.println("\t\t\tListaLinkedHashSet");
        System.out.println("\t\t\t==================");
        System.out.println("ListaLinkedHashSet permite se guardan en el orden que se insertan y no admite duplicidad");
        System.out.println(listaLinkedHashSet);
        System.out.println();
        listaLinkedHashSet.remove(3);
        System.out.println("HashSet, TreeSet y LinkedHashSet no tienen indice");
    }
       
        
}
