
package com.interfaces;

/**
 *
 * @author mont_
 */
public interface Interfaz extends Interfaz2 {
    //Los campos y atributos de las interfaces deben ser constantes
    public static final int NUMERO =12;
    
    
    public void metodo1();
    
    public default void metodoDefault(){
        System.out.println("Este es un metodo default");
    }
    
    public static void metodoStatic(){
        System.out.println("Este es un metodo Static");
    }
    
    
}
