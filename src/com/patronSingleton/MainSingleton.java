/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patronSingleton;



/**
 *
 * @author mont_
 */
public class MainSingleton {
    public static void main(String[] args) {
        //PATRON SINGLETON
        
        PatronSingleton patron1 = PatronSingleton.getInstanciaSingleton();
        PatronSingleton patron2 = PatronSingleton.getInstanciaSingleton();
        
        for(String ip : patron1.getHOST_IP()){
            System.out.println("El host por la IP: "+ip);
        }
    }
}
