
package com.concurrencia.practica.practica1;

/**
 *
 * @author mont_
 */
// Importa las clases necesarias para trabajar con hilos y ejecutores
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Clase principal del programa
public class Main {

    // Método principal del programa
    public static void main(String[] args) {
        // Configura el Executor (Ejecutor) utilizando un grupo de hilos (ThreadPool) de tamaño variable
        ExecutorService es = Executors.newFixedThreadPool(5);
        CountRunnable a =  new CountRunnable(5, "A");
        // Envía las instancias de CountRunnable al Executor para que sean ejecutadas
        es.submit(new CountRunnable(5, "A")); // Envia un hilo que cuenta hasta 20 con nombre "A"
        es.submit(new CountRunnable(5, "B")); // Envia otro hilo que cuenta hasta 20 con nombre "B"
        es.submit(new CountRunnable(5, "C")); // Envia un tercer hilo que cuenta hasta 20 con nombre "C"
        es.submit(a);
       Future futuro = es.submit(a);
       try{
           System.out.println(futuro.get());
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
        
       
        // Detiene el ExecutorService después de que todos los hilos han terminado
        es.shutdown();
    }
}

