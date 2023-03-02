package com.generation.pruebajavamariajosepaillavil.models;

public class Materia extends Alumno {

    public Integer vecesPorSemana;

    public Materia() {
        super();
    }

    public Materia(Integer curso, String nombre, String apellido, String materia, String profesor, Double notas,
            Integer vecesPorSemana) {
        super(curso, nombre, apellido, materia, profesor, notas);
        this.vecesPorSemana = vecesPorSemana;
    }

    public Integer getVecesPorSemana() {
        return vecesPorSemana;
    }

    public void setVecesPorSemana(Integer vecesPorSemana) {
        this.vecesPorSemana = vecesPorSemana;
    }

    @Override
    public String toString() {
        return super.toString() + "Materia [vecesPorSemana=" + vecesPorSemana + "]";
    }

    
}
