package com.mari.cursos.domain.models;

import java.util.ArrayList;

/*Representa a un estudiante del sistema.
 hereda los datos personales de la clase Persona y
permite gestionar sus inscripciones y consultas.*/
public class Estudiante extends Persona {

    private String codigoEstudiante;
    private int semestre;

    private ArrayList<Inscripcion> inscripciones = new ArrayList<>();

    /*Registra la inscripción del estudiante en un curso.*/
    public void inscribirseCurso() {
        System.out.println("Estudiante inscrito en el curso.");
    }

    /*Permite consultar los cursos del estudiante.*/
    public void consultarCursos() {
        System.out.println("Consultando cursos...");
    }

    /*Permite consultar las calificaciones del estudiante.*/
    public void consultarCalificaciones() {
        System.out.println("Consultando calificaciones...");
    }

    /*Obtiene el código del estudiante.
    @return código del estudiante*/
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    /*Establece el código del estudiante.*/
    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    /*Obtiene el semestre del estudiante.
    @return semestre actual*/
    public int getSemestre() {
        return semestre;
    }

    /*Establece el semestre del estudiante.*/
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /*Obtiene la lista de inscripciones del estudiante.
    @return lista de inscripciones*/
    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }
}

