
package com.example.domain;

/**
 *
 * @author mont_
 */
public final class PatronSingleton {
    
    private static final String[] HOST_IP = new String[5]; 
    static{
        HOST_IP[0]="192.168.1.1";
        HOST_IP[1]="192.168.1.2";
        HOST_IP[2]="192.168.1.3";
        HOST_IP[3]="192.168.1.4";
        HOST_IP[4]="192.168.1.100";
}
    private  static final PatronSingleton instanciaSingleton = new PatronSingleton();

    private PatronSingleton() {}

    public static PatronSingleton getInstanciaSingleton() {
        return instanciaSingleton;
    }

    public String[] getHOST_IP() {
        return HOST_IP;
    }
 
}
