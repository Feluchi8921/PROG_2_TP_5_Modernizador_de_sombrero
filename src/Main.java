public class Main {
    public static void main(String[] args) {
        //Creo una escuela
        Escuela Hogwarts = new Escuela("Hogwarts");

        //Creo casas
        Casa casa1 = new Casa("Casa 1", 4);

        //Le agrego cualidades
        casa1.addCualidadCasa("Tolerancia");
        casa1.addCualidadCasa("Respeto");
        casa1.addCualidadCasa("Compromiso");
        casa1.addCualidadCasa("Responsabilidad");

        //Creo alumnos
        Alumno alumno1 = new Alumno("Juana");
        Alumno alumno2 = new Alumno("Maria");
        Alumno alumno3 = new Alumno("Sara");
        Alumno alumno4 = new Alumno("Tomas");

        //Le agrego cualidades
        alumno1.addCualidadAlumno("Tolerancia");
        alumno1.addCualidadAlumno("Respeto");
        alumno1.addCualidadAlumno("Compromiso");
        alumno1.addCualidadAlumno("Responsabilidad");
        alumno1.addCualidadAlumno("Educación");

        alumno2.addCualidadAlumno("Tolerancia");
        alumno2.addCualidadAlumno("Respeto");
        alumno2.addCualidadAlumno("Compromiso");
        alumno2.addCualidadAlumno("Responsabilidad");

        alumno3.addCualidadAlumno("Tolerancia");
        alumno3.addCualidadAlumno("Respeto");
        alumno3.addCualidadAlumno("Compromiso");

        alumno4.addCualidadAlumno("sarasa");


        //Agrego a los alumnos a la casa 1
        casa1.addAlumno(alumno1);
        casa1.addAlumno(alumno2);
        casa1.addAlumno(alumno3);
        casa1.addAlumno(alumno4);


    }
}