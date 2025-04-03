
package clase6pdm2025a;


public class Figura {
    
    //atributos
    private int x;
    private int y;
    private String nombre;
    
    //acciones o los metodos
    //metodo constructor

    public Figura(int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //metodos get y set
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    
    
    

    
    
    
}
