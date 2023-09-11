import java.util.ArrayList;

public class Casa {
    //Atributos
    private String nombreCasa;
    private int tamanioMax;
    private ArrayList<String> cualidadesCasa = new ArrayList<>();
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    //Constructor
    public Casa(String nombreCasa, int tamanioMax) {
        this.nombreCasa = nombreCasa;
        this.tamanioMax = tamanioMax;
        this.alumnos = new ArrayList<>();
        this.cualidadesCasa = new ArrayList<>();
    }

    //Getters and Setters

    public String getNombreCasa() {
        return nombreCasa;
    }

    public void setNombreCasa(String nombreCasa) {
        this.nombreCasa = nombreCasa;
    }

    public int getTamanioMax() {
        return tamanioMax;
    }

    public void setTamanioMax(int tamanioMax) {
        this.tamanioMax = tamanioMax;
    }

    public ArrayList<String> getCualidadesCasa() {
        return cualidadesCasa;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    //Agregar cualidad
    public void addCualidadCasa(String cualidad) {
        cualidadesCasa.add(cualidad);
    }

    //Se puede agregar al alumno?
    public void addAlumno(Alumno alumno) {
        if (existeCapacidad()==true &&cumpleCualidadesCasa(alumno)==true && alumno.isAsignado()==false) { //Si hay lugar y cumple cualidades
                alumnos.add(alumno); //entonces lo agrego
                //Cambio asignado a true
                alumno.setAsignado(true);
        }
    }
    public boolean existeCapacidad(){
       return tamanioMax>alumnos.size();
    }
    public boolean cumpleCualidadesCasa(Alumno alumno) {
        return (alumno.getCualidades().containsAll(this.cualidadesCasa));
    }
}