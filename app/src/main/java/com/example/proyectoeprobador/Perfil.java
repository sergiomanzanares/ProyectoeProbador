package com.example.proyectoeprobador;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class Perfil extends AppCompatActivity {

    ProfileFragment fragmento;
    List<String> friends;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        friends = new ArrayList<>();
    }

    @Override
    public void onAttachFragment(@NonNull Fragment fragment) {
        super.onAttachFragment(fragment);
        if(fragment instanceof ProfileFragment)
            fragmento = (ProfileFragment)fragment;

        fragmento.cogerDatos(new ProfileFragment.MirarPerfil() {
            @Override
            public void llamadaPerfil() {

            }
        });
    }
}