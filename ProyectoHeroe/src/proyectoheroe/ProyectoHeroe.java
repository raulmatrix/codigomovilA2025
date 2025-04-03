package proyectoheroe;

import java.util.ArrayList;
import java.util.Scanner;

public class ProyectoHeroe {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Heroe> heroes = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\nElija la acción a realizar:");
            System.out.println("1: Insertar un nuevo héroe");
            System.out.println("2: Mostrar lista de héroes");
            System.out.println("0: Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = teclado.nextInt();
            teclado.nextLine(); 
            
            switch (opcion) {
                case 1:
                    System.out.println("\n--- Insertar nuevo héroe ---");
                    
                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();
                    
                    String tipo;
                    do {
                        System.out.print("Tipo (volador, fuerza, magico): ");
                        tipo = teclado.nextLine().toLowerCase();
                        if (!tipo.equals("volador") && !tipo.equals("fuerza") && !tipo.equals("magico")) {
                            System.out.println("Error: Tipo inválido. Debe ser 'volador', 'fuerza' o 'magico'.");
                        }
                    } while (!tipo.equals("volador") && !tipo.equals("fuerza") && !tipo.equals("magico"));
                    
                    int fuerza;
                    do {
                        System.out.print("Fuerza (1-5): ");
                        fuerza = teclado.nextInt();
                        
                        if (fuerza < 1 || fuerza > 5) {
                            System.out.println("Error: La fuerza debe estar en el rango de 1 a 5.");
                        }
                    } while (fuerza < 1 || fuerza > 5);
                    
                    heroes.add(new Heroe(nombre, tipo, fuerza));
                    System.out.println("Heroe agregado con éxito.");
                    break;
                
                case 2:
                    if (heroes.isEmpty()) {
                        System.out.println("\nNo hay héroes registrados.");
                    } else {
                        System.out.println("\nLista de héroes registrados:");
                        for (Heroe her : heroes) {
                            her.mostrarDatos();
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}

