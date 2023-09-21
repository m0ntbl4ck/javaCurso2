
package com.clasesanidades;

/**
 *
 * @author mont_
 */
public class MainClasesAnidadas {
    public static void main(String[] args) {
        ClaseExterna externa = new ClaseExterna(); 
        ClaseExterna.ClaseInterna interna = externa.new ClaseInterna();
        
        
        ClaseExterna.ClaseStatic claseStatic = new ClaseExterna.ClaseStatic();
        // los emtodos de clase externa deben instanciarse de la clase externa
        
        
        /*los metodos de clases static dentro de clases externas deben instanciarse de
        la clase static*/
        claseStatic.metodoDelaClaseStatic();
        
        InterfazAnonima miInterfazAnonima = new InterfazAnonima(){
            @Override
            public void metodo() {
                System.out.println("Esto es el metodo de la clase anonima");
            }
            
            
        };
        
        miInterfazAnonima.metodo();
        
        Clase claseAnonima = new Clase();
        
        
        externa.metodoDelaClaseExterna( new Clase(){
            @Override
            public void ejecutarAlgo(){
                System.out.println("Ejecutar el metodo de la clase anonima que pasamos como argumento");
    }
        });
        
        
    }
}
