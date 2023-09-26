
package com.interfaceslamba.practica;

import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author mont_
 */
public class SupplierTest {
   
    public static void main(String[] args) {
        List<Empleado> lista = Empleado.crearLista();
        Empleado primerValor = lista.get(0);
        
        Supplier<Empleado> supp =
                ()-> new Empleado.Builder()
    .primerNombre("Carolina")
    .segundoNombre("Vasquez")
    .edad(25)
    .genero(Genero.FEMENINO)
    .rol(Rol.STAFF)
    .deptLaboral("Ventas")
            .salario(45000)
    .email("CAROLINA@email.com")
    .telefono("31453680992")
    .direccion("calle 10 # 22-33")
            .departamento("Bogota DC")
            .ciudad("Bogota")
            .build();
        
        System.out.println("\n");
        System.out.println("====Lista antes de guardar el empleado====");
        lista.stream().forEach(Empleado::imprimir);
        
        lista.add(supp.get());
        System.out.println("====Lista despues de guardar el empleado====");
        lista.stream().forEach(Empleado::imprimir);
    }

}
