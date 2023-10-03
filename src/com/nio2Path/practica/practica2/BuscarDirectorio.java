
package com.nio2Path.practica.practica2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
/**
 *
 * @author mont_
 */




public class BuscarDirectorio {
    
    public static void main(String[] args) {
        

        try (Stream<Path> archivos = 
              Files.find(Paths.get("."), 9, (ruta, atributos) -> atributos.isDirectory())) {
            
            System.out.println("\n=== Encontrar todos los directorios ===");
            archivos.forEach(linea -> System.out.println(linea));
                
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    } 
}
