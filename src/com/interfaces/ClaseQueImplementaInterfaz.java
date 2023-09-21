
package com.interfaces;

/**
 *
 * @author mont_
 */
public class ClaseQueImplementaInterfaz extends SuperClase implements Interfaz,Interfaz2{

    @Override
    public void metodo1() {
        System.out.println("Este es el metodo abstracto de la interfaz");
    }
    
    public void metodoPropioDelaClase(){
        System.out.println("metodo Propio De la Clase");
    }
}
