/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author ESTACION
 */
public class Director {
 
    private Builder builder;

    public void setBuilder(Builder bd) {
        builder = bd;
    }
    
    public void construirBebida(Builder builder, String base) {
        builder.crearBebida();
        builder.construirBase(base);
        builder.construirHelado();
        builder.construirSabor();
    }
}
