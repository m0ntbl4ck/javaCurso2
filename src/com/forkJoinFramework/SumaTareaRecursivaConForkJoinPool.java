

package com.forkJoinFramework;


import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;
/**
 *
 * @author mont_
 */


public class SumaTareaRecursivaConForkJoinPool extends RecursiveTask<Integer> {
    private static final int UMBRAL = 5;
    private int[] array;
    private int inicio;
    private int fin;

    public SumaTareaRecursivaConForkJoinPool(int[] array, int inicio, int fin) {
        this.array = array;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    protected Integer compute() {
        if (fin - inicio <= UMBRAL) {
            int suma = 0;
            for (int i = inicio; i < fin; i++) {
                suma += array[i];
            }
            return suma;
        } else {
            int mitad = (inicio + fin) / 2;
            SumaTareaRecursiva tareaIzquierda = new SumaTareaRecursiva(array, inicio, mitad);
            SumaTareaRecursiva tareaDerecha = new SumaTareaRecursiva(array, mitad, fin);

            // Realizar la bifurcación (fork) de las sub-tareas y obtener los resultados
            invokeAll(tareaIzquierda, tareaDerecha);

            // Combinar los resultados y devolver el resultado total
            return tareaIzquierda.join() + tareaDerecha.join();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ForkJoinPool pool = new ForkJoinPool(); // Crear un ForkJoinPool

        // Crear una tarea con el array completo y ejecutarla en el ForkJoinPool
        SumaTareaRecursivaConForkJoinPool tarea = new SumaTareaRecursivaConForkJoinPool(array, 0, array.length);
        int resultado = pool.invoke(tarea); // Invocar la tarea en el pool
        System.out.println("Suma total: " + resultado);

        // Es importante cerrar el ForkJoinPool después de su uso
        pool.shutdown();
    }
}
