package com.nio2Path.practica.practica1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @autor oracle
 */
public class P02NioRead {
    
    public static void main(String[] args) {
        
        try (Stream<String> lineas = Files.lines(Paths.get("archivos//hamlet.txt"))) {
            
            System.out.println("\n=== Archivo Completo ===");
            lineas.forEach(linea -> System.out.println(linea)); 
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    } 
}

