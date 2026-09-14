package com.example.appintents;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(view -> abrirDetalhes(
                "Michael",
                "7,4",
                "Drama",
                "A trajetória inicial do músico Michael Jackson, desde a descoberta de seu talento como líder do Jackson Five até o artista cuja ambição criativa o levou a querer se tornar o maior artista do mundo.",
                "https://www.youtube.com/watch?v=14YXeHKOBUY"
        ));

        findViewById(R.id.button2).setOnClickListener(view -> abrirDetalhes(
                "Toy Story 5",
                "7,4",
                "Animação",
                "Os trabalhos de Woody, Buzz, Jessie e do resto da turma ficam em risco quando eles são apresentados aos aparelhos eletrônicos, uma nova ameaça à hora de brincar.",
                "https://www.youtube.com/watch?v=-YbiBclEEgo"
        ));

        findViewById(R.id.button3).setOnClickListener(view -> abrirDetalhes(
                "Homem-Aranha: Um Novo Dia",
                "8",
                "Ação",
                "Peter Parker tenta se concentrar na faculdade e deixar o Homem-Aranha para trás. Mas quando uma nova ameaça surge, ele quebra sua promessa, veste o traje e se une a um aliado inesperado para protegê-los.",
                "https://www.youtube.com/watch?v=PlulyWs1kS4"
        ));

        findViewById(R.id.button4).setOnClickListener(view -> abrirDetalhes(
                "A Odisseia",
                "8,4",
                "Ação épica",
                "Após a Guerra de Troia, o herói grego Odisseu retorna a Ítaca, na Grécia, enfrentando figuras da mitologia grega como o Ciclope Polifemo, as Sereias e Calipso.\n",
                "https://www.youtube.com/watch?v=Y-Dcn-qnnjs"
        ));
    }

    private void abrirDetalhes(
            String titulo,
            String nota,
            String genero,
            String sinopse,
            String trailer
    ) {
        //Intent explícita
        Intent intent = new Intent(this, DetalhesActivity.class);
        intent.putExtra(DetalhesActivity.EXTRA_TITULO, titulo);
        intent.putExtra(DetalhesActivity.EXTRA_NOTA, nota);
        intent.putExtra(DetalhesActivity.EXTRA_GENERO, genero);
        intent.putExtra(DetalhesActivity.EXTRA_SINOPSE, sinopse);
        intent.putExtra(DetalhesActivity.EXTRA_TRAILER, trailer);
        startActivity(intent);
    }
}
