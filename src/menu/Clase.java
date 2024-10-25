/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.Scanner;


public class Clase {
  public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la fecha actual en formato 'dia, DD/MM': ");
        String fecha = scanner.nextLine().toLowerCase();  // Convertimos a minúsculas para evitar problemas de entrada
        
       
        int comaIndex = fecha.indexOf(',');
        String diaSemana = fecha.substring(0, comaIndex).trim();
        String fechaNumerica = fecha.substring(comaIndex + 1).trim();  // Recorta espacios después de la coma
        
        
        String diaStr = fechaNumerica.substring(0, 2);
        String mesStr = fechaNumerica.substring(3, 5);
        
        
        int dia = (diaStr.charAt(0) - '0') * 10 + (diaStr.charAt(1) - '0');
        int mes = (mesStr.charAt(0) - '0') * 10 + (mesStr.charAt(1) - '0');
        
       
        if (dia > 31 || mes > 12) {
            System.out.println("Error: El dia o el mes son invalidos.");
            return;
        }

        
        if (!diaSemana.equals("lunes") && !diaSemana.equals("martes") && 
            !diaSemana.equals("miercoles") && !diaSemana.equals("jueves") &&
            !diaSemana.equals("viernes")) {
            System.out.println("Error: Dia de la semana no valido.");
            return;
        }

        
        if (diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miercoles")) {
            // Estos días pueden tener exámenes
            System.out.print("¿Se tomaron examenes hoy? (sí/no): ");
            String respuestaExamen = scanner.nextLine().toLowerCase();
            if (respuestaExamen.equals("sí")) {
                System.out.print("Ingrese la cantidad de alumnos que aprobaron: ");
                int aprobados = scanner.nextInt();
                System.out.print("Ingrese la cantidad de alumnos que no aprobaron: ");
                int noAprobados = scanner.nextInt();
                int totalAlumnos = aprobados + noAprobados;
                if (totalAlumnos > 0) {
                    int porcentajeAprobados = (aprobados * 100) / totalAlumnos;
                    System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
                }
            }
        } else if (diaSemana.equals("jueves")) {
           
            System.out.print("Ingrese el porcentaje de asistencia: ");
            int asistencia = scanner.nextInt();
            if (asistencia > 50) {
                System.out.println("Asistio la mayoria.");
            } else {
                System.out.println("No asistio la mayoria.");
            }
        } else if (diaSemana.equals("viernes")) {
            // Inglés para viajeros y el ciclo comienza el 1/1 o 1/7
            if (dia == 1 && (mes == 1 || mes == 7)) {
                System.out.println("Comienzo de nuevo ciclo.");
                System.out.print("Ingrese la cantidad de alumnos del nuevo ciclo: ");
                int alumnosNuevoCiclo = scanner.nextInt();
                System.out.print("Ingrese el precio por cada alumno: ");
                int precioPorAlumno = scanner.nextInt();
                int ingresoTotal = alumnosNuevoCiclo * precioPorAlumno;
                System.out.println("Ingreso total: $" + ingresoTotal);
            }
        }

       
    }
}
