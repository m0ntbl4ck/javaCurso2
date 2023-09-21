
package com.interfaces;

/**
 *
 * @author mont_
 */
public class MainInterfaces {
    public static void main(String[] args) {
        //Instancia de una interfaz
        Interfaz referenciaDeInterfaz = new ClaseQueImplementaInterfaz();
        //Llamando metodos de las interfaces
        referenciaDeInterfaz.metodo1();
        
        referenciaDeInterfaz.metodoDefault();
        
        Interfaz.metodoStatic();
        //constante static dela interfaz
        int num =Interfaz.NUMERO;
        
    }
}
