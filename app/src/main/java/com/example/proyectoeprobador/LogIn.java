package com.example.proyectoeprobador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.proyectoeprobador.Identificacion.LoginRequest;
import com.example.proyectoeprobador.Identificacion.LoginResponse;
import com.example.proyectoeprobador.Identificacion.PollClient;
import com.example.proyectoeprobador.Identificacion.SesionManager;

public class LogIn extends AppCompatActivity {

    EditText user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        user = findViewById(R.id.editTextUser);
        pass = findViewById(R.id.editTextPass);

        PollClient apiClient = new PollClient();
        SesionManager sesion = new SesionManager(this);

        apiClient.getLogin(new LoginRequest(user.getText().toString(),pass.getText().toString()))
        .observe(this, new Observer<LoginResponse>() {
            @Override
            public void onChanged(LoginResponse loginResponse) {
                if (loginResponse.getStatusCode()!= 200){
                    sesion.saveAuthToken(loginResponse.getAuthToken());
                }
            }
        });


        final Intent intAbrirMain = new Intent(LogIn.this, MainActivity.class);
        final Intent intAbrirRegistro = new Intent(LogIn.this, Registro.class);

        findViewById(R.id.buttonLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirMain);
            }
        });

        findViewById(R.id.buttonRegistrerOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirRegistro);
            }
        });
    }
}