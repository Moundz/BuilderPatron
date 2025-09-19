/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builder;

import model.Bebida;

/**
 *
 * @author ESTACION
 */
public abstract class Builder {

    protected Bebida bebida;
    
    public Bebida obtenerBebida(){
        return bebida;
    }
    
    public void crearBebida(){
        bebida = new Bebida();
    }
    
    public abstract void construirBase(String base);
    public abstract void construirSabor();
    public abstract void construirHelado();
    
}
