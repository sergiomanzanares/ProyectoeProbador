package com.example.proyectoeprobador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaPantalon extends AppCompatActivity {

    Adaptador adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pantalon);

        // data to populate the RecyclerView with


        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.RVPantalones);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adaptador(this);
        adapter.setClickListener(new Adaptador.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(), "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);

        Button b = findViewById(R.id.btnMasPantalones);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String[]> info = new ArrayList<>();
                String[] s = new String[2];

                s[0] = "Titulo pantalon 1";
                s[1] = "Descripción pantalon 1";
                info.add(s);

                s = new String[2];
                s[0] = "Titulo pantalon 2";
                s[1] = "Descripción pantalon 2";
                info.add(s);

                s = new String[2];
                s[0] = "Titulo pantalon 3";
                s[1] = "Descripción pantalon 3";
                info.add(s);

                s = new String[2];
                s[0] = "Titulo pantalon 4";
                s[1] = "Descripción pantalon 4";
                info.add(s);

                s = new String[2];
                s[0] = "Titulo pantalon 5";
                s[1] = "Descripción pantalon 5";
                info.add(s);
                adapter.addData(info);
            }
        });
    }
}