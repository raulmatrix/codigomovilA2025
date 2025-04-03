package proyectoheroe;


public class Heroe {
    String nombre;
    String tipo;
    int nivelPoder;

    public Heroe(String nombre, String tipo, int nivelPoder) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivelPoder = nivelPoder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }
    
    public void mostrarDatos(){
        System.out.println("\n Nombre: "+nombre+
                            "\n Tipo: "+tipo+
                            "\n Nivel: "+nivelPoder
                            
                            );
        System.out.println("--------------");
    }
}
