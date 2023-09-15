
package com.example;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Empleado;
import com.example.domain.Engineer;
import com.example.domain.Manager;

/**
 *
 * @author mont_
 */
public class TestMain {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado("Andres Lopez",00001,23.23,"Administrador");
        
        Admin admin1 = new Admin("Jose Lopez",00002,23239.32,"Administrador");
        
        Director director1 = new Director("Andres Garzon",00003,12312.32,"Director","Tesoreria", 100000000);
        
        Engineer ingeniero1 = new Engineer("Andrea Cortes",00004,1238213.3223,"Ingenierio");
        
        Manager manager1= new Manager("Felipe Rodriguez",5,71839,"Manager","Recursos Humanos");
        
        empleado1.datosDeEmpleado();
        admin1.datosDeEmpleado();
        director1.datosDeEmpleado();
        ingeniero1.datosDeEmpleado();
        manager1.datosDeEmpleado();
        
        
    }
}
