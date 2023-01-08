package com.hypecamps;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Dev {
    private String name;
    private Set<Curso> cursosIncritos = new LinkedHashSet<>();
    private Set<Curso> cursosConcluidos = new LinkedHashSet<>();
    private static double XP_INITIAL = 10d;

    public Dev(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        cursosIncritos.addAll(bootcamp.cursos);
    }

    public void progredir(){
        if(cursosIncritos.size() >= 1){
            Curso toRemove = cursosIncritos.stream().limit(1).collect(Collectors.toList()).get(0);
            if(cursosIncritos.size() == 1)
                System.out.println("Parabens! voce concluiu todos os curso!");
            cursosIncritos.remove(toRemove);
            cursosConcluidos.add(toRemove);

        }
    }

    public Double calcularXpTotal() {
        if (cursosConcluidos.size() != 0) {
            double valor = cursosConcluidos.stream().map(e -> e.cargaHoraria).reduce(0, (sub, next) -> sub + next);
            valor = (XP_INITIAL * valor);
            return valor;
        }
        return 0d;
    }

    public void exibirCursos(){
        cursosIncritos.stream().forEach(e -> System.out.println(e));
    }

}
