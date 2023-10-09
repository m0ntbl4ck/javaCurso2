
package com.streamsParalelos;


import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mont_
 */

public class Paralelos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Operación en paralelo para calcular la suma de los números
        double sumaParalela = numeros.parallelStream()
                                   .mapToDouble(Integer::doubleValue)
                                   .sum();
        
        
        System.out.println("Suma en paralelo: " + sumaParalela);

        // Operación secuencial para calcular la suma de los números
        double sumaSecuencial = numeros.stream()
                                     .mapToDouble(Integer::doubleValue)
                                     .sequential()
                                     .sum();
        
        System.out.println("Suma secuencial: " + sumaSecuencial);
        
        //Statelessness  
                                    numeros.stream()
                                     .mapToDouble(Integer::doubleValue)
                                     .parallel()
                                     .forEach(t->System.out.println(t));
                                    
                                    //Usar metodos como sum(), Collectors, cortocircuito
    }
}

