
package com.excepcion.practica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mont_
 */
public class ExceptionMain {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        try{
            System.out.println("Leyendo un archivo" + args[0]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Archivo no especificado"+ e.getMessage());
           //System.exit(1);
        } 
        
        try (BufferedReader b = new BufferedReader(new FileReader(args[0]));){
            
        String s = null;
        
        while((s = b.readLine()) != null){
         System.out.println(s);
        }    
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Archivo no fue encontrado: "+e.getMessage());
        }
        catch(FileNotFoundException e){
            System.out.println("Archivo no fue encontrado: "+args[0]);
           // System.exit(1);
        }catch(IOException e){
            System.out.println("Error de lectura del archivo: "+e.getMessage());
           // System.exit(1);
        }

    }
 
}
