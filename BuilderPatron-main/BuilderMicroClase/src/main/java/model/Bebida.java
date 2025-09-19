/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ESTACION
 */
public class Bebida {
    
    private String base;
    private String sabor;
    private boolean helado;

    public void setBase(String base) {
        this.base = base;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setHelado(boolean helado) {
        this.helado = helado;
    }

    @Override
    public String toString() {
        
        if (helado){
        return "Base: " + base + ", Sabor: " + sabor + ", Helado: Si contiene";    
        }else{
            return "Base: " + base + ", Sabor: " + sabor + ", Helado: No contiene";
        }
        
    }

   
    
}
