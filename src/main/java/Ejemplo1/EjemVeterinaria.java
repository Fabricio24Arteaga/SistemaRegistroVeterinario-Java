package Ejemplo1;

import java.util.ArrayList;
import java.util.Scanner;

public class EjemVeterinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Propietario> propietarios = new ArrayList<>();
        ArrayList<Mascota> mascotas = new ArrayList<>();
        
        int opcion;
        do {
            System.out.println("\n--- Menú Veterinaria ---");
            System.out.println("1. Registrar Propietario");
            System.out.println("2. Registrar Mascota");
            System.out.println("3. Ver todos los registros");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("== Registrar Propietario ==");
                    System.out.print("ID: ");
                    int idP = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");
                    String nomP = sc.nextLine();
                    System.out.print("Teléfono: ");
                    int tel = sc.nextInt();sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Dirección: ");
                    String dir = sc.nextLine();
                    propietarios.add(new Propietario(idP, nomP, tel, email, dir));
                }

                case 2 -> {
                    System.out.println("== Registrar Mascota ==");
                    System.out.print("ID: ");
                    int idM = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");
                    String nomM = sc.nextLine();
                    System.out.print("Especie: ");
                    String esp = sc.nextLine();
                    System.out.print("Raza: ");
                    String raza = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt(); sc.nextLine();
                    System.out.print("Sexo: ");
                    String sexo = sc.nextLine();
                    System.out.print("Peso: ");
                    double peso = sc.nextDouble(); sc.nextLine();
                    System.out.print("ID del propietario: ");
                    int idProp = sc.nextInt(); sc.nextLine();
                    mascotas.add(new Mascota(idM, nomM, esp, raza, edad, sexo, peso, idProp));
                }
                    
                case 3 -> {
                    System.out.println("\n--- Propietarios ---");
                    for (Propietario p : propietarios) p.mostrarDatos();
                    System.out.println("\n--- Mascotas ---");
                    for (Mascota m : mascotas) m.mostrarDatos();
                }

                case 0 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción no válida.");
            }
        } while (opcion !=0);
        sc.close();
    }
}

