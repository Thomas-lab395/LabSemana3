/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.Scanner;

public class Notas {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        
        int cantidadNotas = -1;
        double nota, suma = 0, promedio = 0;
        double notaMayor = -1, notaMenor = 101; 
        int i = 1;
       
        while (cantidadNotas < 0) {
            System.out.println("Ingrese la cantidad de notas:");
            cantidadNotas = sc.nextInt();
            if (cantidadNotas < 0) {
                System.out.println("Por favor, ingrese una cantidad positiva.");
            }
        }
   
        while (i <= cantidadNotas) {
            System.out.println("Nota #" + i + ": ");
            nota = sc.nextDouble();

            
            while (nota < 0 || nota > 100) {
                System.out.println("Solo se aceptan notas dentro del rango 0 a 100. Intente de nuevo.");
                System.out.println("Nota #" + i + ": ");
                nota = sc.nextDouble();
            }
            
            suma += nota;
            
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            
            if (nota < notaMenor) {
                notaMenor = nota;
            }

            i++;
        }
        
        promedio = suma / cantidadNotas;
   
        System.out.println("Promedio: " + promedio + " %");
        System.out.println("Nota mayor: " + notaMayor);
        System.out.println("Nota menor: " + notaMenor);
    }
}
