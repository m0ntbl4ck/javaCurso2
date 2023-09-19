
package com.example.domain;

/**
 *
 * @author mont_
 */
//Archivo enums colecciones de constates
public enum Dias {
    LUNES("MONDAY"),
    MARTES("TUESDAY"),
    MIERCOLES("WEDNESDAY"),
    JUEVES("THURSDAY"),
    VIERNES("FRIDAY"),
    SABADO("SATURDAY"),
    DOMINGO("SUNDAY");
    

    private String Ingles;

    private Dias(String Ingles) {
        this.Ingles = Ingles;
    }

    public String getIngles() {
        return Ingles;
    }
    
    
}
