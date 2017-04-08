package br.com.wesleyaraujo.carango.model;

import com.google.gson.annotations.SerializedName;

public class Carro {

    @SerializedName(value = "nome")
    private String nome;
    @SerializedName(value = "desc")
    private String descricao;
    @SerializedName(value = "foto")
    private String urlImagem;

    public Carro(String nome, String descricao, String urlImagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.urlImagem = urlImagem;
    }


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

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}
