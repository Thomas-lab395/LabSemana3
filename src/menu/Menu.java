/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Mayra Bardales
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion; 
        System.out.println("Favor seleccione una opción:\n"
        +"1. Cadena\n"
        +"2. Clase\n"
        +"3. Notas\n"
        +"4. Salir");
        System.out.println("Seleciona una opcion");
        opcion = entrada.nextInt();
        
    switch (opcion){  
        
        case 1:
            Cadena.ejecutar();
            break;
        case 2:
            Clase.ejecutar();
            break;
            
        case 3:
            Notas.ejecutar();
            break;
        case 4:
            System.out.println("Saliendo...");
            break;
            
        
    }
        
    }}
