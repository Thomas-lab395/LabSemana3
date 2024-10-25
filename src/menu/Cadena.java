/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.Scanner;


public class Cadena {
   
     public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto:");
        String cadena = sc.nextLine();
        
        char maxChar = ' ';
        int maxRepeticiones = -1;
        int i = 0;

        while (i < cadena.length()) {
            char actual = cadena.charAt(i);
            int repeticiones = 0;
            int j = 0;

            while (j < cadena.length()) {
                if (cadena.charAt(j) == actual) {
                    repeticiones++;
                }
                j++;
            }

            if (repeticiones > maxRepeticiones) {
                maxRepeticiones = repeticiones;
                maxChar = actual;
            }
            i++;
        }
        
        System.out.println("El caracter que mas se repite es: '" + maxChar + "' con " + maxRepeticiones + " repeticiones.");
    }
}

    
