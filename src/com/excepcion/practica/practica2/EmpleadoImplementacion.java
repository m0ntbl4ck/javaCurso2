
package com.excepcion.practica.practica2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mont_
 */
public class EmpleadoImplementacion {
    
    private static Empleado[] empleadoArray = new Empleado[10];

    public EmpleadoImplementacion() {
    }
    
    public void agregar(Empleado emp) throws InvalidOperationException{
        if(empleadoArray[emp.getId()] != null){
            throw new InvalidOperationException("Error al agregar empleado, "
                    + "el empleado ya existe "+ emp.getId());
        }
        try{
            empleadoArray[emp.getId()] = emp;
        }catch(ArrayIndexOutOfBoundsException ex){
            throw new InvalidOperationException("Error al agregar el empleado, "
                    + "solo se pueden agregar más de "+ empleadoArray.length +" Empleados");
        }
    }
    public void eliminar(int id) throws InvalidOperationException{
        if(empleadoArray[id] == null){
            throw new InvalidOperationException("Error al eliminar el Empleado,"
                    + " el Empleado con el id número "+id +" no existe ");
        }
        
        
        try{
            empleadoArray[id] = null;
            
        }catch(ArrayIndexOutOfBoundsException e){
            throw new InvalidOperationException ("Error eliminando el empleado"
                    + " "+empleadoArray.length);
        }
    }
    
    public Empleado[] getTodosLosEmpleado(){
        List<Empleado> emps = new ArrayList<>();
        
        for(Empleado e: empleadoArray){
            if(e != null ){
                emps.add(e);
            }
        }
        return emps.toArray(new Empleado[0]);
    }
    
    
    public Empleado encontrarPorID (int id) throws InvalidOperationException{
        try{
            return empleadoArray[id];
        }catch(ArrayIndexOutOfBoundsException e){
            throw new InvalidOperationException("Error al buscar al empleado "+e);
        }
    }
}
