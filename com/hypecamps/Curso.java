package com.hypecamps;

public class Curso extends Conteudo {

    Integer cargaHoraria;

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "{" +
                "cargaHoraria=" + cargaHoraria +
                ", name='" + name + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
