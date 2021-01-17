package com.example.proyectoeprobador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        abrirProbador(R.id.btnPrecioConjuntoFeed1);
        abrirProbador(R.id.btnPrecioConjuntoFeed2);
        abrirProbador(R.id.btnPrecioConjuntoFeed3);

        abrirPrendas(R.id.btnCamisaConjuntoFeed1);
        abrirPrendas(R.id.btnPantalonConjuntoFeed1);
        abrirPrendas(R.id.btnZapatosConjuntoFeed1);
        abrirPrendas(R.id.btnCalcetinesConjuntoFeed1);
        abrirPrendas(R.id.btnCamisaConjuntoFeed2);
        abrirPrendas(R.id.btnPantalonConjuntoFeed2);
        abrirPrendas(R.id.btnZapatosConjuntoFeed2);
        abrirPrendas(R.id.btnCalcetinesConjuntoFeed2);
        abrirPrendas(R.id.btnCamisaConjuntoFeed3);
        abrirPrendas(R.id.btnPantalonConjuntoFeed3);
        abrirPrendas(R.id.btnZapatosConjuntoFeed3);
        abrirPrendas(R.id.btnCalcetinesConjuntoFeed3);

    }

    void abrirProbador(int id) {

        final Intent intAbrirProbrador = new Intent(this, Probador.class);

        findViewById(id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intAbrirProbrador);
            }
        });
    }

    void abrirPrendas(int id) {

        final Intent intAbrirPrendas = new Intent(this, PrendasActivity.class);

        findViewById(id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirPrendas);
            }
        });
    }
}