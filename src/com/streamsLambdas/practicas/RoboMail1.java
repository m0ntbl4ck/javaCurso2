
package com.streamsLambdas.practicas;

/**
 *
 * @author mont_
 */
public class RoboMail1 {
    public void roboMail(Empleado p){
        System.out.println("Enviado correo "+ p.getPrimerNombre()
                +" "+p.getSegundoNombre()+" edad "+p.getEdad()
        +" al "+ p.getEmail());
    }
    
    public void roboText(Empleado p){
        System.out.println("Escribiendo: "+p.getPrimerNombre()
                +" "+p.getSegundoNombre()+" edad "+p.getEdad()
        +" al "+p.getTelefono());
    }
}
