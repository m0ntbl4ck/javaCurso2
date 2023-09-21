
package com.genericos;

import java.util.List;

/**
 *
 * @author mont_
 */

// Clase que recibe genericos
//T tipo, E elemento, K key, V value, S y U para segundos y tercer tipos
//extends Number,String
//<Wrapper>
public class Generico <Tipo, Tipo2>{
    private Tipo numero;
    private Tipo2 cadena;
    
    public Generico(Tipo numero, Tipo2 cadena) {
        this.numero = numero;
        this.cadena = cadena;
    }
    
    public void mostrarClaseGenerico(){
        System.out.println("La clase del dato generico es: "+this.getNumero().getClass().getName());
    }

    public Tipo getNumero() {
        return numero;
    }
    
    //<Wrapper> void return 
    public void metodoConGenericos(){
        
    }

/*

    public void listas(List<? extends Number> lista){
        
    }*/
    
    
}
