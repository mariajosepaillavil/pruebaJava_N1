package com.generation.pruebajavamariajosepaillavil.models;

public class Curso extends Alumno{

    public String jornada;

    public Curso() {
        super();
    }

    public Curso(Integer curso, String nombre, String apellido, String materia, String profesor, Double notas,
            String jornada) {
        super(curso, nombre, apellido, materia, profesor, notas);
        this.jornada = jornada;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public String toString() {
        return super.toString() + "Curso [jornada=" + jornada + "]";
    }

    
}
