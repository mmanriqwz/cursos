package com.mari.cursos;

import com.mari.cursos.domain.models.*;

/*Clase utilizada para probar el funcionamiento de las clases
del Sistema de Gestion de Cursos.
Permite crear objetos de estudiante, curso e inscripcion
y comprobar sus relaciones y metodos.*/
public class PruebaSistema {

    /*Metodo principal que ejecuta la prueba del sistema.*/
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Mariana");
        estudiante.setApellido("Manriquez");

        Curso curso = new Curso();
        curso.setNombre("Programacion");

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setFecha("21/10/2026");
        inscripcion.setEstado("Activa");
        inscripcion.setEstudiante(estudiante);
        inscripcion.setCurso(curso);

        System.out.println("SISTEMA DE GESTION DE CURSOS");

        System.out.println("Estudiante: "
                + estudiante.getNombre() + " "
                + estudiante.getApellido());

        System.out.println("Curso: " + curso.getNombre());

        System.out.println("Estado: " + inscripcion.getEstado());

        inscripcion.registrarInscripcion();
        estudiante.consultarCursos();
    }
}
