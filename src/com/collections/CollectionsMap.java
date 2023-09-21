
package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author mont_
 */
public class CollectionsMap {
    public static void main(String[] args) {
        //MAP recibe Clave y valor (K,V) y realiza un mapeo es una lista desordenada
        Map<Integer,String> listHashMap = new HashMap();
        listHashMap.put(2, "Rocky");  
        listHashMap.put(5, "Peppa");
        listHashMap.put(6, "Zeus");
        listHashMap.put(4, "Coffe");
        listHashMap.put(3, "Firulais");
        
        //No lo agrega
        listHashMap.put(2, "Rocky");
        
        //Reemplazo el valor y recibe el ultimo
        listHashMap.put(2, "Buster");
        
        
        System.out.println("\t\t\tHasMap");
        System.out.println("\t\t\t======");
       System.out.println("HasMap recibe Clave y valor (K,V) y realiza un mapeo es una lista en cualquier orden y no permite duplicados");
        System.out.println(listHashMap);
        for(Entry<Integer,String> entry :listHashMap.entrySet() ){
            System.out.println("Clave: "+entry.getKey()+" Valor: "+entry.getValue());
        }
        System.out.println();
        
        
        
        Map<String,Integer> listTreeMap = new TreeMap();

        listTreeMap.put("3", 5000);
        listTreeMap.put("4", 50000);
        listTreeMap.put("5", 50000);
        listTreeMap.put("1", 50);
        listTreeMap.put("2", 500);
        //System.out.println("\t\t\tTreeMap");
        //System.out.println("\t\t\t=======");
       //System.out.println("TreeMap recibe Clave y valor (K,V) y realiza un mapeo es una lista ordenada y n permite duplicados");
        //System.out.println(listTreeMap);
        for(Entry<String,Integer> entry :listTreeMap.entrySet() ){
           //System.out.println("Clave: "+entry.getKey()+" Valor: "+entry.getValue());
        }
        System.out.println();
        
        
        
   
        Map<String,Integer> linkedHasMap = new LinkedHashMap();
        
        
        linkedHasMap.put("3", 5000);
        linkedHasMap.put("4", 50000);
        linkedHasMap.put("5", 50000);
        linkedHasMap.put("1", 50);
        linkedHasMap.put("2", 500);
        //System.out.println("\t\t\tLinkedHasMap");
        //System.out.println("\t\t\t============");
       //System.out.println("linkedHasMap recibe Clave y valor (K,V) y realiza un mapeo es una lista en e ordenque se almacena");
       // System.out.println(linkedHasMap);
        for(Entry<String,Integer> entry :linkedHasMap.entrySet() ){
           //System.out.println("Clave: "+entry.getKey()+" Valor: "+entry.getValue());
        }
        System.out.println();
       // System.out.println("Ninguno de los tres metodos permite duplicados");
    }
}
