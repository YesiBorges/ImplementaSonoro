/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.implementasonoro;

/**
 *
 * @author HP
 */
public class ImplementaSonoro {

    public static void main(String[] args) {

        Tambor t = new Tambor();
        Sirena s = new Sirena();
        Trompeta tr = new Trompeta();
        
       // InstrumentoMusical im = new InstrumentoMusical();
        
        
        s.sonar(11);
        t.sonar(10);
        t.orquesta();
        tr.sonar(23);
        tr.orquesta();
        
        
        
        
    }
}
