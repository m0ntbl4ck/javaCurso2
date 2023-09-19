
package com.example;

import com.example.domain.Admin;
import com.example.domain.Dias;
import com.example.domain.Director;
import com.example.domain.Doctor;
import com.example.domain.Empleado;
import com.example.domain.Engineer;
import com.example.domain.Manager;
import static java.lang.Math.*;

/**
 *
 * @author mont_
 */
public class TestMain {
    
    public static void main(String[] args) {
        
        abs(0);
        random();
        
        
        Empleado empleado1= new Admin("Andres Lopez",00001,23.23,"Administrador");
        
        Admin admin1 = new Admin("Jose Lopez",00002,23239.32,"Administrador");
        //tiene su espaco en memoria
        Admin admin2 = new Admin("Jose Lopez",00002,23239.32,"Administrador");
        
        
        //tiene otro espacio en memoria
        Director director1 = new Director("Andres Garzon",00003,12312.32,"Director","Tesoreria", 100000000);
        
        Engineer ingeniero1 = new Engineer("Andrea Cortes",00004,1238213.3223,"Ingenierio");
        
        Manager manager1= new Manager("Felipe Rodriguez",5,71839,"Manager","Recursos Humanos");
        Empleado manager2= new Manager("Felipe Rodriguez",5,71839,"Manager","Recursos Humanos");
        
        
        ((Manager)manager2).getNombreDepartamento();
        
      
        
        empleado1.datosDeEmpleado();
        admin1.datosDeEmpleado();
        director1.datosDeEmpleado();
        ingeniero1.datosDeEmpleado();
        manager1.datosDeEmpleado();
        int[] array = {1,2,3};
        String nombre = "nombre";
        String nombre2 = "nombre";
        System.out.println(manager1);
        System.out.println(ingeniero1);
        
        System.out.println(admin1.equals(admin2)); 
        System.out.println(manager2.equals(manager1));
        
        //hascode
        
        System.out.println(admin1.hashCode());
        System.out.println(admin2.hashCode());
        //colapso de metodos
        System.out.println(empleado1.suma("Hola"," Mundo","!","","",""));
        
    
        
        for(int i :empleado1.crearArreglos(12,23,42,12,31,14,1221,31)){
            System.out.print(i+",");
        }
        System.out.println();
     
        if(manager1 instanceof Manager){
            ((Manager)manager1).getNombreDepartamento();
        }
        
        
        ((Manager)manager2).getNombreDepartamento();
        
        
        Manager manager3 = ((Manager)manager2);
        
        
        manager3.getNombreDepartamento();
        
        manager2 = ((Manager)manager2);
        
         System.out.println(manager3);
         System.out.println(manager2);
         
         manager3.setNombre("Juan Perez");
         System.out.println();
         System.out.println(manager3);
         System.out.println(manager2);
       
         
         //casteo de clases
         
         Manager manager4 = director1;
         
         Empleado empleado3 = manager1;
         
         Empleado empleado4 = director1;
         
         System.out.println(manager4);
         
         System.out.println(empleado3);
         
         System.out.println(empleado4);
         
       
         Empleado maanger10 = new Engineer ("Andrea Cortes",00004,1238213.3223,"Ingenierio");
         
         System.out.println(director1);
         
         //Instancia de una Clase miembro anidada
        // Doctor doctor = new Doctor();
         //Doctor.AgedarCitas cita = doctor.new AgedarCitas();
         
         //Instancia de una Clase estatica anidada
         Doctor.AgedarCitas cita1= new Doctor.AgedarCitas();
         
         System.out.println(Dias.DOMINGO);
         System.out.println(Dias.LUNES.getIngles());
         System.out.println(Dias.DOMINGO.getIngles());
         
         String dia = Dias.SABADO.getIngles();
         
         switch(dia){
             case "MONDAY":
                 System.out.println("Hoy es :" +dia);
             break;
             case "SUNDAY":
                 System.out.println("Hoy es :" +dia);
                 break;
             default:
                 System.out.println("El dia no es correcto");
         }
         
    }
    
}