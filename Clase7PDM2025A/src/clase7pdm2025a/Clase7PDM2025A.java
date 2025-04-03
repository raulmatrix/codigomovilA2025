package clase7pdm2025a;

import java.util.ArrayList;
import java.util.Scanner;

public class Clase7PDM2025A {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("Menu de opciones");
            System.out.println("1. Insertar nuevo registro");
            System.out.println("0. Salir del programa y mostrar registros");
            System.out.print("Ingrese un valor: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Insertar registro");
                    System.out.print("Ingrese su nombre: ");
            String nombre = teclado.nextLine();
            System.out.print("Ingrese su apellido: ");
            String apellido = teclado.nextLine();
            System.out.print("Ingrese la carrera en la que estudia: ");
            String carrera = teclado.nextLine();
            System.out.print("Ingrese su codigo: ");
            int codEst = teclado.nextInt();
            
            estudiantes.add(new Estudiante(nombre, apellido, carrera, codEst));
            break;
            
                case 0: 
                    System.out.println("Saliendo del programa");
                    for(int i=0; i<estudiantes.size();i++){
                        estudiantes.get(i).mostrarDatos();
                    }
                break;
                
                default:
                    System.out.println("Opcion incorrecta, ingreso 1 o 0");
            }
        }while(opcion!=0);
        
        
    }
}
