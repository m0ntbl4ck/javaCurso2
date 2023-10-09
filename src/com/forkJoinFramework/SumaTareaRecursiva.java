
package com.forkJoinFramework;

/**
 *
 * @author mont_
 */
import java.util.concurrent.RecursiveTask;

public class SumaTareaRecursiva extends RecursiveTask<Integer> {
    private static final int UMBRAL = 5;
    private int[] array;
    private int inicio;
    private int fin;

    // Constructor que inicializa los atributos con los valores dados
    public SumaTareaRecursiva(int[] array, int inicio, int fin) {
        this.array = array;
        this.inicio = inicio;
        this.fin = fin;
    }

    // Método compute() obligatorio para las tareas RecursiveTask
    @Override
    protected Integer compute() {
        // Si el tamaño del sub-array es menor o igual al umbral, calcular la suma directamente
        if (fin - inicio <= UMBRAL) {
            int suma = 0;
            for (int i = inicio; i < fin; i++) {
                suma += array[i];
            }
            return suma;
        } else {
            // Si el tamaño es mayor que el umbral, dividir la tarea en dos sub-tareas
            int mitad = (inicio + fin) / 2;
            SumaTareaRecursiva tareaIzquierda = new SumaTareaRecursiva(array, inicio, mitad);
            SumaTareaRecursiva tareaDerecha = new SumaTareaRecursiva(array, mitad, fin);

            // Realizar la bifurcación (fork) de las sub-tareas
            tareaIzquierda.fork();
            tareaDerecha.fork();

            // Obtener los resultados de las sub-tareas
            int resultadoIzquierda = tareaIzquierda.join();
            int resultadoDerecha = tareaDerecha.join();

            // Combinar los resultados y devolver el resultado total
            return resultadoIzquierda + resultadoDerecha;
        }
    }

    // Método principal para probar la tarea recursiva
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SumaTareaRecursiva tarea = new SumaTareaRecursiva(array, 0, array.length);
        int resultado = tarea.compute();
        System.out.println("Suma total: " + resultado);
    }
}

