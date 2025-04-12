/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.implementasonoro;

/**
 *
 * @author HP
 */
public class Tambor extends InstrumentoMusical {

    @Override
    public void sonar(int volumen) {
        System.out.println("Paf Paf Paf Paf " + "a un volumen"+volumen);
    }

    @Override
    public void integranteOrquesta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
