
package com.streamsLambdas.practicas;

import java.util.List;
import java.util.function.Supplier;





/**
 *
 * @author mont_
 */
public class SupplierTest {
    public static void main(String[] args) {
        List<Empleado> lista = Empleado.crearLista();
        Empleado primero = lista.get(0);
        
        Supplier<Empleado> supp = ()-> new Empleado.Builder()
                .primerNombre("Sofia")
        .segundoNombre("Oviedo")
                .edad(26)
                .genero(Genero.FEMENINO)
                .rol(Rol.STAFF)
                .salario(45000)
                .cargo(Cargo.ADMINISTRADOR)
                .dept("Ventas")
                .email("sofia@email.com")
                .telefono("3173843256")
                .direccion("Cra 12 # 125-56")
                .departamento("Bogota DC")
                .ciudad("Bogota")
                .codigo("123122")
                .build();
        
        System.out.println("==== Imprimir Empleados de la lista ");
       lista.stream().forEach(Empleado::imprimirResumen);
       
       lista.add(supp.get());
       
        System.out.println("==== Imprimir Empleados despues de agregar con supplier la lista");
        lista.stream().forEach(Empleado::imprimirResumen);
    }
    
}
