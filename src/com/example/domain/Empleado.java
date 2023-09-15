
package com.example.domain;

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
  
}
