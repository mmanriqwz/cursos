package com.mari.cursos.domain.models;

/*Representa una persona dentro del sistema de gestión de cursos.
  Contiene los datos personales que comparten estudiantes y profesores.*/
 
public class Persona {

    private int idPersona;
    private String nombre;
    private String apellido;
    private String documento;
    private String correo;

    /*Obtiene el identificador de la persona.
     @return identificador de la persona */
    public int getIdPersona() {
        return idPersona;
    }

    /*Establece el identificador de la persona.*/
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /*Obtiene el nombre de la persona.
     @return nombre de la persona*/
    public String getNombre() {
        return nombre;
    }

    /*Establece el nombre de la persona.*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /* Obtiene el apellido de la persona.
    @return apellido de la persona*/
    public String getApellido() {
        return apellido;
    }

    /*Establece el apellido de la persona.*/
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /*Obtiene el documento de identidad.
    @return documento de la persona*/
    public String getDocumento() {
        return documento;
    }

    /*Establece el documento de identidad.*/
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /*Obtiene el correo electrónico de la persona.
    @return correo electrónico*/
    public String getCorreo() {
        return correo;
    }

    /*Establece el correo electrónico de la persona.*/
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
