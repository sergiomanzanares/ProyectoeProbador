package com.example.proyectoeprobador.Identificacion;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface PollService {
    @POST(Urls.URLLOGIN)
    @FormUrlEncoded
    public Call<LoginResponse> login(@Body LoginRequest request);
}

