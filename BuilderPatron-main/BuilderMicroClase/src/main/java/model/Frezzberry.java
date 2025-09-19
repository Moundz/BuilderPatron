/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Builder.Builder;

/**
 *
 * @author ESTACION
 */
public class Frezzberry extends Builder {

    @Override
    public void construirBase(String base) {
        bebida.setBase(base); //Cambiar
    }

    @Override
    public void construirSabor() {
        bebida.setSabor("Arandano");
    }

    @Override
    public void construirHelado() {
        bebida.setHelado(true);

    }

}
