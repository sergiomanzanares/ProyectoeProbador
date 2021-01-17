package com.example.proyectoeprobador;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class FragmentoConjunto extends Fragment {
    ImageView imgCamisa, imgPantalon,imgZapatilla,imgOtros;
    TextView txtDescCamiseta, txtDescPantalon, txtDescZapatilla, txtDescOtros;
    TextView txtPrecioCamiseta, txtPrecioPantalon, txtPrecioZapatillas, txtPrecioOtros;
    TextView txtTotal;
    Button btnCamiseta, btnPantalon, btnZapatilla, btnOtros;

    public FragmentoConjunto() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vw =  inflater.inflate(R.layout.fragment_fragmento_conjunto, container, false);

        return vw;
    }
}