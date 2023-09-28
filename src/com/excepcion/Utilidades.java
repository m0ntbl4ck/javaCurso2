
package com.excepcion;

import java.io.IOException;


public class Utilidades {
    int[] array;
   public void metodoUno() throws Exception {
           throw new Exception  ("Mi excepcion chequeada");
          
       }
   
   public void metodoDos() throws IOException{
       throw new IOException("Mi excepcion no chequeada");
   }
   
   
   public void metodoTres() {
       System.out.println("metodo tres");
   }
   
   public void crearArray(int tamano){
       array = new int[tamano];
   }
   
   public void modificarArray(int index,int elemento) throws ArrayIndexOutOfBoundsException{
       if(index >array.length-1 && index <0){
           throw new ArrayIndexOutOfBoundsException("Ingrese una posicion adecuada entre: 0"+(array.length-1));
       }else{
           array[index]= elemento;
       }
       
       
   }

    public int[] getArray() {
        return array;
    }
   
   
}
    
   
    
    

   
