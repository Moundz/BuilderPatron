/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author ESTACION
 */
public class Vista {
    
    private Scanner sc;
    
    public Vista(){
        sc = new Scanner(System.in);
    }
    
    
    public String leerDato(String mensaje){
        System.out.println(mensaje);
        String opcion = sc.nextLine();
        return opcion;
    }
    
    public void mostrarInformacion(String mensaje){
        System.out.println(mensaje);
    }
}
