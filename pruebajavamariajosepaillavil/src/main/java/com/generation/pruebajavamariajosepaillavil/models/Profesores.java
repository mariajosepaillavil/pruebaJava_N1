package com.generation.pruebajavamariajosepaillavil.models;

public class Profesores extends Alumno {

    public Integer edadProfesor;

    public Profesores() {
        super();
    }

    public Profesores(Integer curso, String nombre, String apellido, String materia, String profesor, Double notas,
            Integer edadProfesor) {
        super(curso, nombre, apellido, materia, profesor, notas);
        this.edadProfesor = edadProfesor;
    }

    public Integer getEdadProfesor() {
        return edadProfesor;
    }

    public void setEdadProfesor(Integer edadProfesor) {
        this.edadProfesor = edadProfesor;
    }

    @Override
    public String toString() {
        return super.toString() +  "Profesores [edadProfesor=" + edadProfesor + "]";
    }

    
    
}
