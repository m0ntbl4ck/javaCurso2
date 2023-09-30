
package com.excepcion.practica.practica2;

/**
 *
 * @author mont_
 */
public class EmpleadoTest {
    public static void main(String[] args) throws InvalidOperationException {
        
        EmpleadoImplementacion empArr = new EmpleadoImplementacion();
        Empleado e1 = new Empleado(0,"Sara","Montero",123.43f);
        empArr.agregar(e1);
        Empleado e2 = new Empleado(1,"Juan","Rodriguez",123.43f);
        empArr.agregar(e2);
        Empleado e3 = new Empleado(2,"Pedro","Castro",123.43f);
        empArr.agregar(e3);
        Empleado e4 = new Empleado(3,"Miguel","Ramirez",123.43f);
        empArr.agregar(e4);
        Empleado e5 = new Empleado(4,"Orlando","Vargas",123.43f);
        empArr.agregar(e5);
        Empleado e6 = new Empleado(5,"Gloria","Montenegro",123.43f);
        empArr.agregar(e6);
        Empleado e7 = new Empleado(6,"Andrea","Cortes",123.43f);
        empArr.agregar(e7);
        Empleado e8 = new Empleado(7,"Sergio","Velasquez",123.43f);
        empArr.agregar(e8);
        Empleado e9 = new Empleado(8,"Maria","Lopez",123.43f);
        empArr.agregar(e9);
        Empleado e10 = new Empleado(9,"Samuel","Casas",123.43f);
        empArr.agregar(e10);
        
        Empleado[] todosLosEmpleados = empArr.getTodosLosEmpleado();
        
        for(Empleado empleado: todosLosEmpleados){
            System.out.println(empleado+"\n");
        }
        
        Empleado e = empArr.encontrarPorID(5);
        if(e != null){
            System.out.println("Empleado Encontrado");
            System.out.println(e+"\n");
        }else{
            System.out.println("\n\n Empleado no encontrado");
        }
        
            empArr.eliminar(1);
        
        
    }
}
