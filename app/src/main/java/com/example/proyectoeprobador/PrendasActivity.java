package com.example.proyectoeprobador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrendasActivity extends AppCompatActivity {

    Intent intAbrirListaCamisetas;
    Intent intAbrirListaPantalones;
    Intent intAbrirListaZapatillas;
    Intent intAbrirListaCalcetines;
    Intent intAbrirListaOtros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prendas);

        intAbrirListaCamisetas = new Intent(this, ListaCamisas.class);

        findViewById(R.id.imageButtonCamisa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirListaCamisetas);
            }
        });

        intAbrirListaPantalones = new Intent(this, ListaPantalon.class);

        findViewById(R.id.imageButtonPantalon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirListaPantalones);
            }
        });

        intAbrirListaZapatillas = new Intent(this, ListaZapatos.class);

        findViewById(R.id.imageButtonZapaos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirListaZapatillas);
            }
        });

        intAbrirListaCalcetines = new Intent(this, ListaCalcetines.class);

        findViewById(R.id.imageButtonCalcetines).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirListaCalcetines);
            }
        });

        intAbrirListaOtros = new Intent(this, ListaOtros.class);

        findViewById(R.id.btnOtrasPrendas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirListaOtros);
            }
        });


    }
}