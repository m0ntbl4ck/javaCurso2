
package com.excepcion.practica.practica2;

import java.text.NumberFormat;

/**
 *
 * @author mont_
 */
public class Empleado {
   private int id;
   private String nombres;
   private String apellidos;
   private float salario;

    public Empleado(int id, String nombres, String apellidos, float salario) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado iD:  " + getId() +"\n"+ 
                "Nombre de Empleado: " + getNombres()+" "  + getApellidos() +"\n"+
                " Salario: " + NumberFormat.getCurrencyInstance().format((double)getSalario());
    }
   
   
   
}
