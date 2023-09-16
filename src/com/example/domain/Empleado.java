
package com.example.domain;

import java.util.Objects;

/**
 *
 * @author mont_
 */
public class Empleado {
  private String nombre;
  private int empleadoID;
  private double salario;
  private String cargo;

    public Empleado(){  
    }
    
     public Empleado(String nombre, int empleadoID, double salario, String cargo) {
        this.nombre = nombre;
        this.empleadoID = empleadoID;
        this.salario = salario;
        this.cargo = cargo;
    }
     //colapso de metodos
    public String suma(String... nombres){
        StringBuilder mensaje=new StringBuilder("");
        for(String nombre : nombres){
            
            mensaje.append(nombre);
        }
          return mensaje.toString();  
    }
    
    public int[] crearArreglos (int... arrays ){
        return arrays;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
            
   
    public void datosDeEmpleado(){
        System.out.println("El nombre del empleado :" +getNombre());
        System.out.println("El ID de empleado: "+getEmpleadoID());
        System.out.println("El salario del empleado: "+getSalario());
        System.out.println("El cargo del empleado es: "+getCargo());
        System.out.println();
    }

    @Override
    public String toString() {
        return "El nombre del empleado : " +getNombre()+
        "El ID de empleado: "+getEmpleadoID()+
        "El salario del empleado: "+getSalario()+
        "El cargo del empleado es: "+getCargo()+"\n";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.empleadoID;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.cargo);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        return hash;
    }

 
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.empleadoID != other.empleadoID) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.cargo, other.cargo);
    }

  

    
  
    
}
