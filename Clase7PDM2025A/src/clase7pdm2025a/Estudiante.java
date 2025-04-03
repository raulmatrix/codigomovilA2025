
package clase7pdm2025a;


public class Estudiante {
    //atributo
    private String nombre;
    private String apellidos;
    private String carrera;
    private int codEst;

    //metodo constructor
    public Estudiante(String nombre, String apellidos, String carrera, int codEst) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.codEst = codEst;
    }

    public int getCodEst() {
        return codEst;
    }

    public void setCodEst(int codEst) {
        this.codEst = codEst;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+
                            "\n Apellidos: "+apellidos+
                            "\n Carrera: "+carrera+
                            "\n Codigo Estudiante: "+codEst
                            );
        System.out.println("--------------");
    }
    
    
}
