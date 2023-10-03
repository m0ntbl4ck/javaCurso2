
package com.nio2Path.practica.practica1;

/**
 *
 * @author 
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @autor mont_
 */
public class P03NIOLeeTodo {
    
    public static void main(String[] args) {
        
        List<String> fileArr;
        Path file =  Paths.get("archivos//hamlet.txt");

        try {
            fileArr = Files.readAllLines(file);
            
            System.out.println("\n=== Rosencrantz ===");
            fileArr.stream()
                .filter(line -> line.contains("Ros."))
                .forEach(linea -> System.out.println(linea));
            
            System.out.println("\n=== Guildenstern ===");
            fileArr.stream()
                .filter(line -> line.contains("Guil."))
                .forEach(linea -> System.out.println(linea));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    } 
}

