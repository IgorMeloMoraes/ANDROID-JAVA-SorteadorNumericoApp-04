package com.example.sorteadornumericoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    Button btnSortear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txt_resultado);
        btnSortear = findViewById(R.id.btn_sortear);

        // Gerador de numeros aleatorios utilizando o NewRandom e setando em uma variavel
       btnSortear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int numero_sorteado = new Random().nextInt(101);
               txtResultado.setText("O número sorteado foi: " + numero_sorteado);
           }
       });
    }
}