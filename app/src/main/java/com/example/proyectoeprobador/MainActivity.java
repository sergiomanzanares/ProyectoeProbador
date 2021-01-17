package com.example.proyectoeprobador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intAbrirPrendas = new Intent(MainActivity.this, PrendasActivity.class);
        final Intent intAbrirArmario = new Intent(MainActivity.this, ArmarioActivity.class);
        final Intent intAbrirFeed = new Intent(MainActivity.this, FeedActivity.class);
        final Intent intAbrirPerfil = new Intent(MainActivity.this, Perfil.class);

        findViewById(R.id.buttonPrendas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirPrendas);
            }
        });

        findViewById(R.id.buttonArmario).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirArmario);
            }
        });

        findViewById(R.id.buttonFeed).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirFeed);
            }
        });

        findViewById(R.id.buttonPerfil).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirPerfil);
            }
        });

    }
}