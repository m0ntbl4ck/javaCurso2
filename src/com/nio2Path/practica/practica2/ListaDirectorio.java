
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
public class ListaDirectorio {
  public static void main(String[] args) {
                
    try (Stream<Path> archivos = Files.list(Paths.get("."))) {

        System.out.println("\n=== Lista de Directorios ===");
        archivos.forEach(linea -> System.out.println(linea));            

    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
  } 
}

