package com.lucascalderon1.apostas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView img_voltar, imageResultado;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        getSupportActionBar().hide();

        imageResultado = findViewById(R.id.imageResultado);
        textView = findViewById(R.id.textView);


        //recuperar dados

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if (numero == 0) { // cara
            imageResultado.setImageResource(R.drawable.moeda_cara);
            textView.setText("Cara");


        } else { // coroa

            imageResultado.setImageResource(R.drawable.moeda_coroa);
            textView.setText("Coroa");

        }

        img_voltar = findViewById(R.id.img_voltar);
        img_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}