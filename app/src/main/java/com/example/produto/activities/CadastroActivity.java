package com.example.produto.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.produto.R;
import com.example.produto.controller.ProdutoDAO;
import com.example.produto.model.Produto;

public class CadastroActivity extends AppCompatActivity {

    EditText etNome;
    EditText etMarca;
    EditText etValor;
    EditText etQuantidade;
    Button   bSalvar;

    ProdutoDAO produtoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etNome       = findViewById(R.id.etNome);
        etMarca      = findViewById(R.id.etMarca);
        etValor      = findViewById(R.id.etValor);
        etQuantidade = findViewById(R.id.etQuantidade);
        bSalvar      = findViewById(R.id.bSalvar);

        produtoDAO = new ProdutoDAO();

        bSalvar.setOnClickListener(v -> {
            if (etNome.getText().toString().isEmpty() ||
                etMarca.getText().toString().isEmpty() ||
                etValor.getText().toString().isEmpty() ||
                etQuantidade.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Preencha todos os campos ", Toast.LENGTH_SHORT).show();
            } else {
                Produto produto = new Produto(
                        etNome.getText().toString(),
                        etMarca.getText().toString(),
                        Float.parseFloat(etValor.getText().toString()),
                        Integer.parseInt(etQuantidade.getText().toString())
                );

                produtoDAO.addProduto(produto);

                Toast.makeText(this, "Produto Cadastrada com sucesso!", Toast.LENGTH_SHORT).show();

                finish();
            }
        });

    }
}