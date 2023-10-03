
package com.excepcion.practica2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mont_
 */
public class EmpleadoImpl {
    private  static Empleado[] empleadoArray = new Empleado[10];

    public EmpleadoImpl() {
    }
    
    public void add(Empleado emp) throws InvalidOperationException {
        if(empleadoArray[emp.getId()]!= null){
            throw new InvalidOperationException("Error agregando un empleado, el emplead ya existe "+ emp.getId());
        }
        try{
            empleadoArray[emp.getId()] = emp;
            
        }catch(ArrayIndexOutOfBoundsException e){
            throw new InvalidOperationException("Error agregando empleado, no se pueden agregar mas de: "+ empleadoArray.length);
        }
                
    }
    
    public void delete(int id) throws InvalidOperationException{
        
        if(empleadoArray[id] ==null){
            throw new InvalidOperationException ("Error de eliminacion de empleado, el empleado no existe "+ id);
        }
        try{
            empleadoArray[id]= null;
            
        }catch(ArrayIndexOutOfBoundsException e){
            throw new InvalidOperationException("Error eliminando empleado, no se pueden elimnar  mas de: "+ empleadoArray.length);
        }
    }
    
    public Empleado encontrarPorId (int id) throws InvalidOperationException {
        try{
            return empleadoArray[id];
        }catch(ArrayIndexOutOfBoundsException e){
            throw new InvalidOperationException("Error al encontar el empleao: "+ e);
        }
    }
    
    public Empleado[] getTodosLosEmpleados(){
        List<Empleado> emps =new ArrayList();
        for(Empleado e: empleadoArray){
            if(e != null){
                emps.add(e);
            }
        }
        return emps.toArray(new Empleado[0]);
    }
}
