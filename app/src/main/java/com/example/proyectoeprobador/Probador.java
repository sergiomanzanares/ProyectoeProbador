package com.example.proyectoeprobador;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Probador extends AppCompatActivity {

    ImageView prendas;
    Button save;
    FragmentoConjunto fragmento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probador);
        prendas = (ImageView)findViewById(R.id.prendas);
    }

    @Override
    public void onAttachFragment(@NonNull Fragment fragment) {
        super.onAttachFragment(fragment);
        if(fragment instanceof FragmentoConjunto)
            fragmento = (FragmentoConjunto) fragment;


    }
}