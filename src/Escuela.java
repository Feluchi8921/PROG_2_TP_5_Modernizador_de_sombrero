import java.util.ArrayList;

public class Escuela {
    //Atributos
    private String nombre;
    private ArrayList<Casa> casas = new ArrayList<>();
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    //Constructor
    public Escuela(String nombre){
        this.nombre = nombre;
    }
    //Getters

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

}
