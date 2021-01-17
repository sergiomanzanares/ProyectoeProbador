package com.example.proyectoeprobador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ArmarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armario);


        abrirProbador(R.id.btnPrecioConjuntoArmario1);
        abrirProbador(R.id.btnPrecioConjuntoArmario2);
        abrirProbador(R.id.btnPrecioConjuntoArmario3);

        abrirPrendas(R.id.btnCamisaConjuntoArmario1);
        abrirPrendas(R.id.btnPantalonConjuntoArmario1);
        abrirPrendas(R.id.btnZapatosConjuntoArmario1);
        abrirPrendas(R.id.btnCalcetinesConjuntoArmario1);
        abrirPrendas(R.id.btnCamisaConjuntoArmario2);
        abrirPrendas(R.id.btnPantalonConjuntoArmario2);
        abrirPrendas(R.id.btnZapatosConjuntoArmario2);
        abrirPrendas(R.id.btnCalcetinesConjuntoArmario2);
        abrirPrendas(R.id.btnCamisaConjuntoArmario3);
        abrirPrendas(R.id.btnPantalonConjuntoArmario3);
        abrirPrendas(R.id.btnZapatosConjuntoArmario3);
        abrirPrendas(R.id.btnCalcetinesConjuntoArmario3);

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