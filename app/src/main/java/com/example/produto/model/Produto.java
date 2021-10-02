package com.example.produto.model;

public class Produto {

    private String nome;
    private String marca;
    private float  valor;
    private int    quantidade;

    public Produto() { }

    public Produto(String nome, String marca, float valor, int quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
