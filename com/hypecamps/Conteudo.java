package com.hypecamps;

public abstract class Conteudo {
    public String name;
    public String descricao;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer CalcularXp(){
        return 0;
    }
}
