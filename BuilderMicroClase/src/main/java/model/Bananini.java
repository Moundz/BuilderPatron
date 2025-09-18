/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Builder.Builder;
import Builder.Director;

/**
 *
 * @author ESTACION
 */
public class Bananini extends Builder{

    @Override
    public void construirBase(String base) {
        bebida.setBase(base); //Cambiar
    }

    @Override
    public void construirSabor() {
        bebida.setSabor("Banano");
    }

    @Override
    public boolean construirHelado() {
        return true;
    }
    
}
