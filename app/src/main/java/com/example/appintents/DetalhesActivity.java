package com.example.appintents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class DetalhesActivity extends AppCompatActivity {

    public static final String EXTRA_TITULO = "titulo";
    public static final String EXTRA_NOTA = "nota";
    public static final String EXTRA_GENERO = "genero";
    public static final String EXTRA_SINOPSE = "sinopse";
    public static final String EXTRA_TRAILER = "trailer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        String titulo = getIntent().getStringExtra(EXTRA_TITULO);
        String nota = getIntent().getStringExtra(EXTRA_NOTA);
        String genero = getIntent().getStringExtra(EXTRA_GENERO);
        String sinopse = getIntent().getStringExtra(EXTRA_SINOPSE);
        String trailer = getIntent().getStringExtra(EXTRA_TRAILER);

        TextView textTitulo = findViewById(R.id.textTitulo);
        TextView textNota = findViewById(R.id.textNota);
        TextView textGenero = findViewById(R.id.textGenero);
        TextView textSinopse = findViewById(R.id.textSinopse);
        Button buttonTrailer = findViewById(R.id.buttonTrailer);

        textTitulo.setText(valorOuVazio(titulo).toUpperCase(Locale.getDefault()));
        textNota.setText("★ " + valorOuVazio(nota));
        textGenero.setText(valorOuVazio(genero));
        textSinopse.setText(valorOuVazio(sinopse));

        buttonTrailer.setOnClickListener(view -> abrirTrailer(valorOuVazio(trailer)));
    }

    //Intent implícita
    private void abrirTrailer(String trailer) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(trailer));
        startActivity(intent);
    }

    private String valorOuVazio(String valor) {
        return valor == null ? "" : valor;
    }
}
