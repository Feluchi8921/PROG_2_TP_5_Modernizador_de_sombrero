import java.util.ArrayList;

public class Casa {
    //Atributos
    private String nombreCasa;
    private int tamanioMax;
    private boolean enemistad;
    private ArrayList<String> cualidadesCasa = new ArrayList<>();
    protected ArrayList<Alumno> alumnos = new ArrayList<>();

    //Constructor
    public Casa(String nombreCasa, int tamanioMax, boolean enemistad) {
        this.nombreCasa = nombreCasa;
        this.tamanioMax = tamanioMax;
        this.enemistad=enemistad;
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

    public boolean isEnemistad() {
        return enemistad;
    }

    public void setEnemistad(boolean enemistad) {
        this.enemistad = enemistad;
    }

    //Agregar cualidad
    public void addCualidadCasa(String cualidad) {
        cualidadesCasa.add(cualidad);
    }

    //Se puede agregar al alumno?
    public void addAlumno(Alumno alumno) {
        if (existeCapacidad() == true && cumpleCualidadesCasa(alumno) == true && alumno.isAsignado() == false) { //Si hay lugar y cumple cualidades
            alumnos.add(alumno); //entonces lo agrego
            //Cambio asignado a true
            alumno.setAsignado(true);
        }
    }

    public boolean existeCapacidad() {
        return tamanioMax > alumnos.size();
    }

    public boolean cumpleCualidadesCasa(Alumno alumno) {
        for (String c : cualidadesCasa) {  //No debo acceder directamente a los datos de otra clase (me lo corrijio el profe)
            if (!alumno.tieneCualidad(c)) {
                return false;

            }
        }
        return true;
    }

}