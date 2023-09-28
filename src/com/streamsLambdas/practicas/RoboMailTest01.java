
package com.streamsLambdas.practicas;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author mont_
 */
public class RoboMailTest01 {
    
    public static void main(String[] args) {
        List<Empleado> pl =  Empleado.crearLista();
        RoboMail1 robot = new RoboMail1();
        Predicate<Empleado> ejecutivos =
                p ->  p.getRol().equals(Rol.EJECUTIVO)
                && p.getDept().contains("Ventas");
        
        Predicate<Empleado> ejecutivosMasde50 =
                p ->  p.getEdad()>=50
                && p.getDept().contains("Ventas");
        
        
          Predicate<Empleado> ingenierosmenosde50 =
                p ->  p.getEdad()<=65
                && p.getGenero().equals(Genero.MASCULINO);
        System.out.println("\n==== RoboMail 01");
        System.out.println("\n==== enviando emails");
        
        pl.stream()
                .filter(ejecutivos)
                .forEach(p -> robot.roboMail(p) );
        
        pl.stream()
                .filter(ejecutivosMasde50)
               .forEach(p -> robot.roboMail(p));
        
         pl.stream()
                .filter(ingenierosmenosde50)
               .forEach(p -> robot.roboMail(p));
         
         
        System.out.println("\n==== enviando textos");
    List<Empleado> pl1 =    pl.stream()
                .filter(ejecutivos)
                .collect(Collectors.toList());
        
        pl.stream()
                .filter(ejecutivosMasde50)
               .forEach(p -> robot.roboText(p));
        
        System.out.println(pl);
        
        
    }
}
