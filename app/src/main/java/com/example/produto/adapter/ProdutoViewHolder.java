package com.example.produto.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.produto.R;

public class ProdutoViewHolder extends RecyclerView.ViewHolder {

    //Criar atributos da interface
    TextView tvNome;
    TextView tvMarca;
    TextView tvValor;
    TextView tvQuantidade;

    public ProdutoViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNome       = itemView.findViewById(R.id.tvNome);
        tvMarca      = itemView.findViewById(R.id.tvMarca);
        tvValor      = itemView.findViewById(R.id.tvValor);
        tvQuantidade = itemView.findViewById(R.id.tvQuantidade);
    }
}
