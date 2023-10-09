
package com.nio2Path.practica.practica1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
/**
 *
 * @author mont_
 */
public class P04NIOLeerTodo {
    public static void main(String[] args) {
        Path archivo = Paths.get("files//hamlet.txt");
        List<String> lineasArchivo;

        try {
            lineasArchivo = Files.readAllLines(archivo);

            System.out.println("\n=== Contar 'Lord' ===");
            long cuentaLord = lineasArchivo.stream()
                .flatMap(linea -> Stream.of(linea.split(" ")))
                .filter(palabra -> palabra.contains("lord"))
                .peek(palabra -> System.out.println(palabra))
                .count();
            
            System.out.println("Cantidad de veces: " + cuentaLord);

            System.out.println("\n=== Contar 'Prison' ===");
            
            long cuentaPrison = lineasArchivo.stream()
                .flatMap(linea -> Stream.of(linea.split(" ")))
               .filter(palabra -> palabra.contains("prison") || palabra.equalsIgnoreCase("prison,"))
                .peek(palabra -> System.out.println(palabra))
                .count();
            
            
            System.out.println("Cantidad de veces: " + cuentaPrison);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



