/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Builder.Builder;
import Builder.Director;
import model.Bananini;
import model.Bebida;
import model.ChocoTin;
import model.Frezzberry;
import vista.Vista;

/**
 *
 * @author ESTACION
 */
public class Controller {

    private Vista vista;

    public Controller() {
        vista = new Vista();
    }

    public void run() {

        //Hacer el menú
        //Preguntar tipo de leche
        //Se crea el director y la interfaz Builder
        Director director = new Director();
        Builder builder;
        String nombreBebida;

        //Se crea el switch para elegir que bebida
        int opcion = Integer.parseInt(vista.leerDato("Bienvenido/a a la tienda de Bebida\nSeleccine su bebida por favor\n1. Bananini\n2. ChocoTin\n3.Frezzberry\n"));

        switch (opcion) {
            case 1:
                builder = new Bananini(); //Se instancia la bebida en especifico
                nombreBebida = "Bananini"; //Se guarda el nombre para mostrar resultado, esto es "estético"
                break;

            case 2:
                builder = new ChocoTin();
                nombreBebida = "ChocoTin";
                break;

            case 3:
                builder = new Frezzberry();
                nombreBebida = "Frezzberry";
                break;

            default:
                vista.mostrarInformacion("Opcion invalida");
                return;
        }

        // Si es opcion = 3, es Frezzberry (que lleva agua)
        // De lo contrario, debe seleccionar el tipo de leche (ChocoTin o Banini)
        if (opcion == 3) {
            director.construirBebida(builder, "Agua");
        } else {
            int base = Integer.parseInt(vista.leerDato("Tipo de leche para su bebida\n1. Deslactosada\n2. Almendras\n3.Entera\n"));

            switch (base) {
                case 1:
                    director.construirBebida(builder, "Leche Deslactosada");
                    break;
                case 2:
                    director.construirBebida(builder, "Leche de Almendras");
                    break;
                case 3:
                    director.construirBebida(builder, "Leche Entera");
                    break;

                default:
                    vista.mostrarInformacion("Opcion invalida");
                    return;

            }

            //Obtiene el objeto bebida (Chocotin, Bananini, Frezzberry)
            //Y muestra la informacion de la bebida
            Bebida bebida = builder.obtenerBebida();
            System.out.println("Su bebida es: " + nombreBebida + "\nY contiene: " + bebida);
        }

    }

    public int preguntarLeche() {
        //Trae el tipo de leche y devuelve la opcion en entero (1,2 o 3)
        int base = Integer.parseInt(vista.leerDato("Tipo de leche para su bebida\n1. Deslactosada\n2. Almendras\n3.Entera\n"));
        return base;

    }

}
