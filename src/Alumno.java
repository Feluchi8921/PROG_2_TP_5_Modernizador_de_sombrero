import java.util.ArrayList;

public class Alumno {
    //Atributos
    private String nombre;
    private ArrayList<String> cualidadesAlumno = new ArrayList<>();
    private ArrayList<String> familiar = new ArrayList<>();
    private boolean asignado;

    //Constructor
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.asignado=false;
        this.cualidadesAlumno =  new ArrayList<>();
        this.familiar = new ArrayList<>();
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    public boolean isAsignado() {
        return asignado;
    }

    //Agregar cualidad
    public void addCualidadAlumno(String cualidad){
        cualidadesAlumno.add(cualidad);
    }
    public boolean tieneCualidad(String cualidad){
        return cualidadesAlumno.contains(cualidad);
    }

}
