package com.example.movies;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieApi {

    @GET("v3/da374fcf-ae4b-49f9-9f11-38187d2a5de0")
    Call<List<Movie>> getMovies();
}
