/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.excepcion;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mont_
 */
public class ExcepcionesyErrores {

    public static void main(String[] args)  {
        
       Utilidades util = new Utilidades();
       
        try {
             util.metodoTres();
             util.metodoUno();
              util.metodoDos();
            
           
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Error de Tipo RUntimeException"+e.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
          
        }finally{
            System.out.println("Metodo finally");
        }
        
       util.crearArray(5);
        try{
             
            util.modificarArray(2, 44);
            util.modificarArray(0, 23);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
           
        
        System.out.println(util.getArray());
        
    }
}
