package com.example.senac_marketing.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Indicador extends  EntiyId{

    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "descricao",nullable = false)
    private String descricao;
    @Column(name = "setor",nullable = false)
    private String setor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Indicador{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", setor='" + setor + '\'' +
                '}';
    }
}
