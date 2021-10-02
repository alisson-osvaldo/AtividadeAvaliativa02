package com.example.produto.controller;

import com.example.produto.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private static List<Produto> listaProdutos = new ArrayList<>();

    public void addProduto(Produto p){ //vai receber um objeto p
        listaProdutos.add(p);
    }

    public Produto getProduto(int position){
        return listaProdutos.get(position);
    }

    //método q vai retornar nossa lista de produtos
    public List<Produto> getListaProdutos(){
        return listaProdutos;
    }

}
