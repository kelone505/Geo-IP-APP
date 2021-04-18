package com.kelone505.ipappretrofit


import retrofit2.Call
import retrofit2.http.GET

interface JSON {
    @GET("/json")
    fun getPost(): Call<Ip>
}