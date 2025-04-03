
package clase6pdm2025a;

public class Clase6PDM2025A {

   
    public static void main(String[] args) {
        
        //System.out.println("Multiplicacion: "+multiplicar(10));
        
        Figura figura1 = new Figura(5, 8, "Triangulo");
        Figura figura2 = new Figura(15, 18, "Cuadrado");
        
        figura1.setNombre("Pentagono");
        System.out.println("Figura 1:"
                +figura1.getNombre());
        
    }
    
    //funciones y/o metodos
    public static int multiplicar(int valor){
        return valor*50;
    }
    
    
    
}
