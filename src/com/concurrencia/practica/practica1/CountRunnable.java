
package com.concurrencia.practica.practica1;

/**
 *
 * @author mont_
 */
// Definición de la clase CountRunnable implementando la interfaz Runnable
public class CountRunnable implements Runnable {

    // Variables finales para almacenar el conteo y el nombre del hilo
    final int count; // Conteo final
    final String threadName; // Nombre del hilo

    // Constructor para inicializar las variables
    public CountRunnable(int count, String name) {
        this.count = count;
        this.threadName = name;
    }

    // Método run() que implementa la lógica del hilo
    
    
    @Override
    public synchronized void run() {
        // Realizar el conteo usando un bucle for
        for (int i = 1; i <= count; i++) {
            try{
            Thread.sleep(2000); // simula el tiempo que tarda una ejecucion
          // Imprimir el mensaje indicando el número de iteración y el nombre del hilo
            System.out.println("Hilo " + threadName + ": " + i);
    }catch(InterruptedException e){
        System.out.println(e.getMessage());
    }
          
        }
    }
}