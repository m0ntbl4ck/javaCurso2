
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
public class RecorrerDirectorios {
  public static void main(String[] args) {        
    try (Stream<Path> archivos = Files.walk(Paths.get("."))) {

        System.out.println("\n=== Recorrido de directorios ===");
        archivos.forEach(linea -> System.out.println(linea));  

    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }

    try (Stream<Path> archivos = Files.walk(Paths.get("."))) {

        System.out.println("\n=== Construir directorios ===");
        archivos
            .filter(ruta -> ruta.toString().contains("build"))
            .forEach(linea -> System.out.println(linea));  

    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
  
  } 
}
