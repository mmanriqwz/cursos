package com.mari.cursos.domain.models;

import java.util.ArrayList;

/*Representa a un profesor del sistema.
Hereda los datos personales de Persona y administra
la información de sus cursos.*/
public class Profesor extends Persona {

    private String codigoProfesor;
    private String especialidad;

    private ArrayList<Curso> cursos = new ArrayList<>();

    /*Permite consultar los cursos asignados al profesor.*/
    public void consultarCursos() {
        System.out.println("Consultando cursos...");
    }

    /*Registra una calificación de un estudiante.*/
    public void registrarCalificacion() {
        System.out.println("Calificación registrada.");
    }

    /*Modifica una calificación registrada.*/
    public void modificarCalificacion() {
        System.out.println("Calificación modificada.");
    }

    /*Obtiene el código del profesor.
    @return código del profesor*/
    public String getCodigoProfesor() {
        return codigoProfesor;
    }

    /*Establece el código del profesor.*/
    public void setCodigoProfesor(String codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    /*Obtiene la especialidad del profesor.
    @return especialidad del profesor*/
    public String getEspecialidad() {
        return especialidad;
    }

    /*Establece la especialidad del profesor.*/
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /*Obtiene la lista de cursos del profesor.
    @return lista de cursos asignados*/
    public ArrayList<Curso> getCursos() {
        return cursos;
    }
}

