public class CasaExigente extends Casa {
    //Mismos atributos
    //Constructor
    public CasaExigente(String nombreCasa, int tamanioMax, boolean enemistad) {
        super(nombreCasa, tamanioMax, enemistad);
    }

    public boolean viveFamiliar(Alumno alumno) {
        for (Alumno a : alumnos) { //ver si esta bien, le puse protected
            return !a.equals(alumno);
        }
        return false;
    }

    @Override
    public void addAlumno(Alumno alumno) {
        if (existeCapacidad() == true && cumpleCualidadesCasa(alumno) == true && alumno.isAsignado() == false && viveFamiliar(alumno) == true) { //Si hay lugar y cumple cualidades
            alumnos.add(alumno); //entonces lo agrego
            //Cambio asignado a true
            alumno.setAsignado(true);
        }
    }
}
