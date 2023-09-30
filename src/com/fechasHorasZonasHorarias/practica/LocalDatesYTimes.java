
package com.fechasHorasZonasHorarias.practica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import static java.time.Month.*;
import static java.time.temporal.ChronoUnit.*;

/**
 *
 * @author mont_
 */
public class LocalDatesYTimes {
    public static void main(String[] args) {
        
        LocalDate fechaNacimiento = LocalDate.of(1809, FEBRUARY, 12);
        LocalDate fechaDeMuerte = LocalDate.of(1855, APRIL, 12);
        
        System.out.println("La persona vivio: "+fechaNacimiento.until(fechaDeMuerte,YEARS)+" años");
        
        LocalDate biciesto = LocalDate.of(1976,JULY, 19);
        
        System.out.println("Es año biciesto: "+biciesto.isLeapYear());
        
        LocalDate now = LocalDate.now();
        
        System.out.println("Han trascurrido "+biciesto.until(now,DECADES)+" decadas");
        
        System.out.println("El dia de la semana de la fecha es un: "+biciesto.plusYears(21).getDayOfWeek());
        
        
        LocalTime tiempo = LocalTime.of(12,45);
        LocalTime llegada = LocalTime.of(19,34 );
        
        System.out.println("Faltan: "+tiempo.until(llegada, MINUTES)+" minutos");
        
        System.out.println("Se corrio la hora "+llegada.plusHours(4).plusMinutes(120));
        
        
        
        LocalDateTime fechas = LocalDateTime.of(2014,MARCH,23,12,32);
        System.out.println(fechas.getDayOfYear());
        
        System.out.println(fechas.minusDays(40));
        
        
        
    }
}
