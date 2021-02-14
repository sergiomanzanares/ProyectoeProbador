package com.example.proyectoeprobador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaZapatos extends AppCompatActivity {

    Adaptador adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_zapatos);

        // data to populate the RecyclerView with


        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.RVZapatos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adaptador(this);
        adapter.setClickListener(new Adaptador.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(), "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);

        Button b = findViewById(R.id.btnMasZapatos);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String[]> info = new ArrayList<>();
                String[] s = new String[2];

                s[0] = "Titulo zapatillas 1";
                s[1] = "Descripción zapatillas 1";
                info.add(s);

                s = new String[2];
                s[0] = "Titulo zapatillas 2";
                s[1] = "Descripción zapatillas 2";
                info.add(s);

                s = new String[2];
                s[0] = "Titulo zapatillas 3";
                s[1] = "Descripción zapatillas 3";
                info.add(s);

                s = new String[2];
                s[0] = "Titulo zapatillas 4";
                s[1] = "Descripción zapatillas 4";
                info.add(s);

                s = new String[2];
                s[0] = "Titulo zapatillas 5";
                s[1] = "Descripción zapatillas 5";
                info.add(s);
                adapter.addData(info);
            }
        });
    }
}
