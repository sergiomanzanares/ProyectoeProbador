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
import com.example.proyectoeprobador.Identificacion.PostResponse;
import com.example.proyectoeprobador.Identificacion.SesionManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogIn extends AppCompatActivity {
    PollClient apiClient;
    SesionManager sesion;
    EditText user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        final Intent intAbrirMain = new Intent(LogIn.this, MainActivity.class);
        final Intent intAbrirRegistro = new Intent(LogIn.this, Registro.class);

        user = findViewById(R.id.editTextUser);
        pass = findViewById(R.id.editTextPass);

        apiClient = new PollClient();
        //esto es para el token pero si no carga la api no funciona

        //sesion = new SesionManager(this);

        findViewById(R.id.buttonLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apiClientLoginRequest(intAbrirMain);
            }
        });

        findViewById(R.id.buttonRegistrerOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intAbrirRegistro);
            }
        });
    }

    private void apiClientLoginRequest(final Intent intAbrirMain) {
        //hace llamada a una api, para hacer las pruebas está comentado aposta
        /*apiClient.getLogin(new LoginRequest(user.getText().toString(),pass.getText().toString()))
        .observe(this, new Observer<LoginResponse>() {
            @Override
            public void onChanged(LoginResponse loginResponse) {
                if (loginResponse.getStatusCode()!= 200){
                    sesion.saveAuthToken(loginResponse.getAuthToken());
                    startActivity(intAbrirMain);
                }
            }
        });*/
        //para hacer la prueba sin la api
        if(user.getText().toString().equals("admin")&&
                pass.getText().toString().equals("admin"))
        startActivity(intAbrirMain);
    }

    public void fetchPosts(){
        apiClient.getApiService().fetchPost("Bearer ${sessionManager.fetchAuthToken()")
        .enqueue(new Callback<PostResponse>() {
            @Override
            public void onResponse(Call<PostResponse> call, Response<PostResponse> response) {

            }

            @Override
            public void onFailure(Call<PostResponse> call, Throwable t) {

            }
        });
    }
}