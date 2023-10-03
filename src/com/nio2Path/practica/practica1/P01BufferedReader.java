package com.nio2Path.practica.practica1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mont_
 */
public class P01BufferedReader {
    
    public static void main(String[] args) {
        
        try {
            BufferedReader bReader = new BufferedReader(new FileReader("archivos//hamlet.txt"));
            
            System.out.println("=== Archivo Completo ===");
            bReader.lines()
                .forEach(linea -> 
                    System.out.println(linea));
                        
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    } 
}
