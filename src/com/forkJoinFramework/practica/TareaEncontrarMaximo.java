
package com.forkJoinFramework.practica;


import java.util.concurrent.RecursiveTask;
/**
 *
 * @author mont_
 */
public class TareaEncontrarMaximo extends RecursiveTask<Integer> {
    private final int umbral;
    private final int[] miArray;
    private int inicio;
    private int fin;

    // Constructor para inicializar los atributos con los valores dados
    public TareaEncontrarMaximo(int[] miArray, int inicio, int fin, int umbral) {
        this.umbral = umbral;
        this.miArray = miArray;
        this.inicio = inicio;
        this.fin = fin;
    }

    // Método compute() obligatorio para las tareas RecursiveTask
    @Override
    protected Integer compute() {
        // Si el tamaño del sub-array es menor que el umbral, encontrar el máximo directamente
        if (fin - inicio < umbral) {
            int maximo = Integer.MIN_VALUE;
            for (int i = inicio; i <= fin; i++) {
                int n = miArray[i];
                if (n > maximo) {
                    maximo = n;
                }
            }
            return maximo;
        } else {
            // Si el tamaño es mayor que el umbral, dividir la tarea en dos sub-tareas
            int mitad = (fin - inicio) / 2 + inicio;
            TareaEncontrarMaximo a1 = new TareaEncontrarMaximo(miArray, inicio, mitad, umbral);
            a1.fork(); // Bifurcar la primera sub-tarea
            TareaEncontrarMaximo a2 = new TareaEncontrarMaximo(miArray, mitad + 1, fin, umbral);
            
            // Combinar los resultados de las sub-tareas y encontrar el máximo global
            return Math.max(a2.compute(), a1.join());
        }
    }
}

