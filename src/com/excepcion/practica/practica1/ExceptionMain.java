
//package com.excepcion.practica.practica1;

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
            System.out.println("Leyendo el archivo "+ args[0]);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("El archivo no fue encontrado");
           // System.exit(1);
        }
        
        try(BufferedReader b= new BufferedReader(new FileReader(args[0])); ){
            String s= null;
            while((s= b.readLine())!= null){
                System.out.println(s);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("El archivo no fue encontrado "+ e.toString());
           // System.exit(1);
        } 
        catch(FileNotFoundException e){
            System.out.println("EL archivo no fue encontrado: "+args[0]);
          //  System.exit(1);
        }catch(IOException ex){
            System.out.println("Error de lectura del archivo "+ex.getMessage());
           // System.exit(1);
        }
    }
}
