package com.example.proyectoeprobador;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class ProfileFragment extends Fragment {

    TextView txtUser, txtToken, txtMail,txtFriends;
    ImageView profilePhoto;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vw =  inflater.inflate(R.layout.fragment_profile, container, false);

        profilePhoto = vw.findViewById(R.id.profilePhoto);
        txtUser = vw.findViewById(R.id.user);
        txtToken = vw.findViewById(R.id.token);
        txtMail = vw.findViewById(R.id.email);

        return vw;
    }

    public interface MirarPerfil{
        public void llamadaPerfil();
    }

    MirarPerfil interfaz;

    public void cogerDatos(MirarPerfil mirarPerfil){
        interfaz = mirarPerfil;
    }
}