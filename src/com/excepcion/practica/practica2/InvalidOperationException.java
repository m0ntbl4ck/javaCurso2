
package com.excepcion.practica.practica2;

/**
 *
 * @author mont_
 */
public class InvalidOperationException extends Exception{

    public InvalidOperationException(String message) {
        super(message);
    }

    public InvalidOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidOperationException(Throwable cause) {
        super(cause);
    }
    
    
}
