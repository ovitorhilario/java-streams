package com.hypecamps;

import java.util.LinkedHashSet;
import java.util.Set;
import java.time.LocalDate;

public class Bootcamp {
    public String nome, descricao;
    public LocalDate dataInicial;
    public LocalDate dataFinal;

    Set<Mentoria> mentorias = new LinkedHashSet<>();
    Set<Curso> cursos = new LinkedHashSet<>();
    Set<Dev> devs = new LinkedHashSet<>();

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public Set<Mentoria> getMentorias() {
        return mentorias;
    }

    public void exibirCursos(){
        cursos.stream().map(Curso::toString).forEach(System.out::println);
    }
}
