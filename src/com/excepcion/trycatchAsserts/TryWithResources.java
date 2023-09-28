
package com.excepcion.trycatchAsserts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mont_
 */
public class TryWithResources {
     public static void main(String[] args) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader("files\\quijote.txt"));
            BufferedReader reader1 = new BufferedReader(new FileReader("files\\texto1.txt"));
        ) {
            String linea;
            System.out.println("FRAGMENTO DON QUIJOTE");
            System.out.println();
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("\n");
            System.out.println("FRAGMENTO LOREM IPSUM");
            System.out.println();
            while ((linea = reader1.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            // Maneja la excepción en caso de error de lectura
            e.getClass();
        }
    }
}
