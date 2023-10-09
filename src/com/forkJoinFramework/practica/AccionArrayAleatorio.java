
package com.forkJoinFramework.practica;


import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author mont_
 */
public class AccionArrayAleatorio extends RecursiveAction {
    private final int umbral;
    private final int[] miArray;
    private int inicio;
    private int fin;

    // Constructor para inicializar los atributos con los valores dados
    public AccionArrayAleatorio(int[] miArray, int inicio, int fin, int umbral) {
        this.umbral = umbral;
        this.miArray = miArray;
        this.inicio = inicio;
        this.fin = fin;
    }

    // Método compute() obligatorio para las tareas RecursiveAction
    @Override
    protected void compute() {
        // Si el tamaño del sub-array es menor que el umbral, generar números aleatorios directamente
        if (fin - inicio < umbral) {
            for (int i = inicio; i <= fin; i++) {
                miArray[i] = ThreadLocalRandom.current().nextInt();
            }
        } else {
            // Si el tamaño es mayor que el umbral, dividir la tarea en dos sub-tareas
            int mitad = (fin + inicio) / 2 ;
            AccionArrayAleatorio r1 = new AccionArrayAleatorio(miArray, inicio, mitad, umbral);
            AccionArrayAleatorio r2 = new AccionArrayAleatorio(miArray, mitad + 1, fin, umbral);           

            // Realizar la bifurcación (fork) y ejecución paralela de las sub-tareas
            invokeAll(r1, r2);
        }
    }
}

