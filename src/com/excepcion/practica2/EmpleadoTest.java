/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.excepcion.practica2;

/**
 *
 * @author mont_
 */
public class EmpleadoTest {
    public static void main(String[] args) {
        
        EmpleadoImpl empArr = new EmpleadoImpl();
        
        Empleado e1 = new Empleado(0,"Juan","Castro",123.43f);
        Empleado e2 = new Empleado(1,"Sebatian","Rodriguez",123.43f);
        Empleado e3 = new Empleado(2,"Juliana","Mendez",123.43f);
        Empleado e4 = new Empleado(3,"Viviana","Vargas",123.43f);
        
        Empleado[] todosEmps = empArr.getTodosLosEmpleados();
        
        
        for (Empleado empleado : todosEmps)
        {
            System.out.println(empleado+ "\n");
        }
        
        try{
            Empleado e = empArr.encontrarPorId(5);
            if(e != null){
            System.out.println(empArr +"\n");
        }else{
            System.out.println("\n\n Empleado no se encuentra");
        }
            
        }
        catch(InvalidOperationException e){
            System.out.println(e.getMessage());
        }
        
        try
        {
            empArr.delete(9);
        }
     catch(InvalidOperationException e){
         System.out.println(e.getMessage());
     }
        
    }
}
