package com.generation.pruebajavamariajosepaillavil.models;

public class Alumno {

    public Integer curso;
    public String nombre;
    public String apellido;
    public String materia;
    public String profesor;
    public Double notas;

    public Alumno() {
    }

    public Alumno(Integer curso, String nombre, String apellido, String materia, String profesor, Double notas) {
        this.curso = curso;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.profesor = profesor;
        this.notas = notas;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Double getNotas() {
        return notas;
    }

    public void setNotas(Double notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno [curso=" + curso + ", nombre=" + nombre + ", apellido=" + apellido + ", materia=" + materia
                + ", profesor=" + profesor + ", notas=" + notas + "]";
    }
    
    
    
}
