
package com.forkJoinFramework.practica;


import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author mont_
 */
public class Main {

    // Utilizamos mucha memoria
    // Las propiedades del proyecto deben tener una opción de ejecución VM de -Xmx1024m
    public static void main(String[] args) {
        int[] datos = new int[1024 * 1024 * 128]; // 512 MB

//        for (int i = 0; i < datos.length; i++) {
//            datos[i] = ThreadLocalRandom.current().nextInt();
//        }

//        int maximo = Integer.MIN_VALUE;
//        for (int valor : datos) {
//            if (valor > maximo) {
//                maximo = valor;
//            }
//        }
//        System.out.println("Valor máximo encontrado:" + maximo);
        
        ForkJoinPool pool = new ForkJoinPool();
        
        AccionArrayAleatorio accion = new AccionArrayAleatorio(datos, 0, datos.length-1, datos.length/16);
        pool.invoke(accion);
        
        TareaEncontrarMaximo tarea = new TareaEncontrarMaximo(datos, 0, datos.length-1, datos.length/16);
        Integer resultado = pool.invoke(tarea);
        System.out.println("Valor máximo encontrado:" + resultado);
        
    }
}

