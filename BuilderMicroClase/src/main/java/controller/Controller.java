/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Builder.Builder;
import Builder.Director;
import model.Bananini;
import vista.Vista;

/**
 *
 * @author ESTACION
 */
public class Controller {
    
    private Vista vista;
    
    public Controller(){
        vista = new Vista();
    }
    
    public void run(){
        
        //Hacer el menú
        //Preguntar tipo de leche
        
        //Se crea el director y la interfaz Builder
        Director director = new Director();
        Builder builder;
        
        builder = new Bananini();
        
        //Preguntar que tipo de leche
        int base = Integer.parseInt(vista.leerDato("Tipo de leche para su bebida\n1. Deslactosada\n2. Almendras\n3.Entera\n"));
        
        //Verificar el tipo de leche y crearlo con la bebida pedida
        switch (base){
            case 1:
                director.construirBebida(builder, "Deslactosada");
                break;
                
            case 2:
                director.construirBebida(builder, "Almendras");
                break;
                
            case 3:
                director.construirBebida(builder, "Entera");
                break;
                
            default:
                System.out.println("Opcion erronea");
        }
        
        
                
        
    }
    
}
