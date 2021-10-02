package com.example.produto.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.produto.R;
import com.example.produto.controller.ProdutoDAO;
import com.example.produto.model.Produto;

public class ProdutoAdapter extends RecyclerView.Adapter {

    private Context context;
    private ProdutoDAO produtoDAO;

    //Construtor do adapter
    public ProdutoAdapter(Context context, ProdutoDAO produtoDAO) {
        this.context = context;
        this.produtoDAO = produtoDAO;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View viewProduto = LayoutInflater.from(context).inflate(R.layout.layout_produto, parent,false);

        //Determinar qual viewHolder será utilizado por este adapter
        ProdutoViewHolder produtoViewHolder = new ProdutoViewHolder(viewProduto);

        return produtoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ProdutoViewHolder produtoViewHolder = (ProdutoViewHolder) holder;

        Produto p = produtoDAO.getProduto(position);
        produtoViewHolder.tvNome.setText(p.getNome());
        produtoViewHolder.tvMarca.setText("Marca: " + p.getMarca());
        produtoViewHolder.tvValor.setText("Valor: " + p.getValor());
        produtoViewHolder.tvQuantidade.setText("Quantidade: " + p.getQuantidade());

    }

    @Override
    public int getItemCount() { return produtoDAO.getListaProdutos().size(); }
}
