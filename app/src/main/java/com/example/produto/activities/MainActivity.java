package com.example.produto.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.produto.R;
import com.example.produto.adapter.ProdutoAdapter;
import com.example.produto.controller.ProdutoDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvProdutos;
    FloatingActionButton fabadd;

    ProdutoDAO produtoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProdutos = findViewById(R.id.rvProdutos);
        fabadd     = findViewById(R.id.fabAdd);

        produtoDAO = new ProdutoDAO();

        //Ação do click
        fabadd.setOnClickListener(v -> {
            startActivity(new Intent(this, CadastroActivity.class));
        });

        // criar um layout manager para setar na recycler view
        RecyclerView.LayoutManager meuLayout = new LinearLayoutManager(
                this,                  //qual o contexto
                LinearLayoutManager.VERTICAL, //qual a direção
                false              //quero q seja normal do primeiro ao ultimo, e não o reverso.
        );

        rvProdutos.setLayoutManager(meuLayout);

    }

    @Override
    protected void onResume() {
        super.onResume();

        ProdutoAdapter meuAdapter = new ProdutoAdapter( this, produtoDAO);

        rvProdutos.setAdapter(meuAdapter);
    }
}