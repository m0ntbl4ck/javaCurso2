
package com.patronBuilder;

import java.time.LocalDate;

/**
 *
 * @author mont_
 */
public class Persona {
    //problema de tener una clase con multiples atributos
    private final String nombre;
    private final String apellidos;
    private final String documentoIdetidad;
    private final String email;
    private final String telefono;
    private final LocalDate fechaDeNacimiento;
    private final String genero;
    private final String estadoCivil;
    
    
    



    public Persona(String nombre, String apellidos, String documentoIdetidad, String email, String telefono, LocalDate fechaDeNacimiento, String genero, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documentoIdetidad = documentoIdetidad;
        this.email = email;
        this.telefono = telefono;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
    }
   
 private Persona(Builder builder){
        this.nombre = builder.nombre;
        this.apellidos = builder.apellidos;
        this.documentoIdetidad = builder.documentoIdetidad;
        this.email = builder.email;
        this.telefono = builder.telefono;
        this.fechaDeNacimiento =builder.fechaDeNacimiento;
        this.genero = builder.genero;
        this.estadoCivil = builder.estadoCivil;
    }
    
    public static class Builder{
    private String nombre ;
    private String apellidos;
    private String documentoIdetidad;
    private String email;
    private String telefono;
    private LocalDate fechaDeNacimiento;
    private String genero;
    private String estadoCivil;

        public Persona.Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

    
   //Asingnan y retornan el valor
       
        public Persona.Builder apellidos(String apellidos) {
            this.apellidos = apellidos;
            return this;
        }

        public Persona.Builder documentoIdetidad(String documentoIdetidad) {
            this.documentoIdetidad = documentoIdetidad;
            return this;
        }

        public Persona.Builder email(String email) {
            this.email = email;
            return this;
        }

        public Persona.Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Persona.Builder fechaDeNacimiento(LocalDate fechaDeNacimiento) {
            this.fechaDeNacimiento = fechaDeNacimiento;
            return this;
        }

        public Persona.Builder genero(String genero) {
            this.genero = genero;
            return this;
        }

        public Persona.Builder estadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
            return this;
        }
    
        
        //crar un metodo para crear la clase externa
        public Persona build(){
            return new Persona(this);
        }
     

        
    }
    
    
}
