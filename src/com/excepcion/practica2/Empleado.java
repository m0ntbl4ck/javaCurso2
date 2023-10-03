
package com.excepcion.practica2;

import java.text.NumberFormat;

/**
 *
 * @author mont_
 */
public class Empleado {
   private int id;
   private String primerNombre;
   private String apellido;
   private float salario;

    public Empleado(int id, String primerNombre, String apellido, float salario) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado id:" + id + "\n"+  ", Empleado Nombre=" + getPrimerNombre() + getApellido() +"\n"+ " salario: " +
                NumberFormat.getCurrencyInstance().format((double)getSalario());
               
    }
   
   
}
