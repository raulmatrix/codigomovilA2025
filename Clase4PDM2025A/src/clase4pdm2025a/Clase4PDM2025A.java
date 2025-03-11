
package clase4pdm2025a;

import java.util.ArrayList;

public class Clase4PDM2025A {

    
    public static void main(String[] args) {
       
        /*int fila = 5;
        int col = 6;
        
        for(int i=1;i<=fila;i++){
            for(int j=1;j<=col;j++){
                if(j==col){
                    System.out.print(i*j);
                }else{
                    System.out.print(i*j+"-");
                }   
            }
            System.out.println(" ");
        }*/
        
        //Math
        
        /*System.out.println(Math.random());
        int valor = (int)(Math.random()*11);
        System.out.println(valor);
        System.out.println(Math.sqrt(144));
        System.out.println(Math.pow(4, 2));*/
        
        //break y continue
        
        /*for(int x=0;x<10;x++){
            if(x==5){
                //break;
                //continue;
            }
            System.out.println(x);
        }*/
        
        //arrays
        
        int edades [] = new int[6];
        /*edades[0] = 15;
        edades[4] = 20;
        
        System.out.println(edades[4]);*/
        /*for(int i=0;i<edades.length;i++){
            edades[i] = i+1;
            System.out.println(edades[i]);
        }*/
        
        //lista dinamicas
        ArrayList <Integer> lista = new ArrayList<Integer>();
        //ArrayList <String> lista2 = new ArrayList<String>();
        lista.add(15); //insertar al final
        lista.add(50);
        lista.add(30);
        System.out.println(""+lista.get(2));
      
        lista.add(2, 100); //adicion con indice
        System.out.println(""+lista.get(2));
        
        //20,25,30,35,40,45,46
        //si existe
        System.out.println("Existe?: "+lista.contains(50));
        
        //saber si la lista esta vacia
        System.out.println("Esta vacia: "+lista.isEmpty());
        
        System.out.println("Posicion de 50: "+lista.indexOf(50));
        
        lista.remove(1); //remover como tal el elemento
        
        System.out.println("Lista"+lista);
        //tamaño
        System.out.println("Tamaño "+lista.size());
        
        lista.set(1, 200);
        
        //ejercicio
        String datos[] = {
            "Jose Perez Sotelo",
            "Alicia Ampuero Gonzales",
            "Ana Salazar Contreras",
            "Sergio Veliz Zeballos",
            "Arnold Caceres Cembo"
        };

        for (int i = 0; i < datos.length; i++) {
            String nombreCompleto = datos[i].toLowerCase(); 
            String[] partes = nombreCompleto.split(" ");

            String inicialNombre = partes[0].substring(0, 1); 
            String primerApellido = partes[1];
            String inicialSegundoApellido = partes[2].substring(0, 1);

            String correo = inicialNombre + primerApellido + inicialSegundoApellido;
            System.out.println(correo + "@incos.edu");
        } 
        
        
        
        
        
        
    }
    
}
