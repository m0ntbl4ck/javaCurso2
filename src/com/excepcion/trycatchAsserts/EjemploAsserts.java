
package com.excepcion.trycatchAsserts;

import java.time.LocalDate;

/**
 *-ea -Xmx512m
 * @author mont_
 */
public class EjemploAsserts {
    public static void main(String[] args) {
        int edad = 25;

        // Utilizamos assert para verificar si la edad es mayor o igual a 18
        assert edad >= 18 : "La persona es menor de edad";

        
        
        System.out.println("La persona tiene " + edad + " años.");
        
        
        
        LocalDate fecha = LocalDate.of(2023, 9, 26);

        verificarFecha(fecha);

        System.out.println("Fecha: " + fecha);
        System.out.println("Fecha verificada correctamente.");
    }
    
    private static void verificarFecha(LocalDate fecha) {
        // Verifica el año
        assert fecha.getYear() >= 1000 && fecha.getYear()<=2023 : "Año incorrecto";

        // Verifica el mes
        assert fecha.getMonthValue() >=1&& fecha.getMonthValue()<=12 : "Mes incorrecto";

        // Verifica el día
        assert fecha.getDayOfMonth() >= 1 && fecha.getDayOfMonth() <=31 : "Día incorrecto";
    }
}
