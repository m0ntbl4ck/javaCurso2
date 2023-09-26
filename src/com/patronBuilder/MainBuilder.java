
package com.patronBuilder;

import java.time.LocalDate;

/**
 *
 * @author mont_
 */
public class MainBuilder {
    public static void main(String[] args) {
        //problema de tener una clase con multiples atributos
        
        //Persna persona2 = new Persona("Juan","Perez")
                
        Persona persona1 = new Persona.Builder()
                .nombre("Juan")
                .apellidos("Perez")
                .documentoIdetidad("12312313")
                .genero("Masculino")
                .fechaDeNacimiento(LocalDate.now())
                .telefono("3123133123")
                .estadoCivil("Soltero")
                .email("Email@email.com")
                .build();
        
      
        


/*
//nueva Instancia con el patrón Builder
      Persona persona2 =new Persona.Builder()
                .nombre("Juan")
                .apellidos("Perez")
                .documentoIdetidad("12312123123")
                .email("email@email.com")
                .telefono("3128324322")
                .fechaDeNacimiento(LocalDate.now().minusYears(20))
                .genero("Masculino")
                .estadoCivil("Soltero")
                .build();
      
      
        System.out.println(persona2);
                
                */
        
    }
}
