/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clasesanidadas;

/**
 *
 * @author mont_
 */

//Clase Externa
public class ClaseExterna {
    //Clases anidades miembro
    //Clase interna
    /*La buena practica dice que las clases internas sean privates
    y ayuden a la logica de la clase Externa es una clase Helper*/
    public void metodoDelaClaseExterna(Clase claseAnonima){
                System.out.println("metodo De la Clase Externa");
                claseAnonima.ejecutarAlgo();
    }
    public class ClaseInterna{
        
    }
    //Es mas comun de ver en logicas de programacion POO
    //No necesita instancia
    public static class ClaseStatic{
     public void metodoDelaClaseStatic(){
                System.out.println("metodo De la Clase Static");
    }
    }
    public void metodo(){
       ClaseInterna claseInterna = new ClaseInterna();
    }
    
    
}
