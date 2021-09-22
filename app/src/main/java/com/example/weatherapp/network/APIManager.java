package com.example.weatherapp.network;

import com.example.weatherapp.model.Weather;

import java.util.List;

import retrofit2.http.GET;

import retrofit2.Call;

public interface APIManager {

    public static String BASE_URL = "https://developer.accuweather.com/";

    @GET("/forecasts/v1/hourly/12hour/353412?apikey=XIvDmdBd308DZhybNtpZW2icAc68LMyp&language=en-us&details=false&metric=false")
    Call<List<Weather>> getHour();

    @GET("/forecasts/v1/daily/5day/353412?apikey=XIvDmdBd308DZhybNtpZW2icAc68LMyp&language=en-us&details=false&metric=false")
    Call<List<Weather>> getDay();
}
