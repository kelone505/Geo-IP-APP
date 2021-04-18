package com.kelone505.ipappretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    lateinit var objetoRetrofit: JSON
    lateinit var tvIp:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvIp=findViewById(R.id.tvIp)
        getPost()
    }
    fun getPost(){
        var retrofit= Retrofit.Builder()
                .baseUrl("https://freegeoip.app")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        objetoRetrofit=retrofit.create(JSON::class.java)
        val call= objetoRetrofit.getPost()
        call.enqueue(object : Callback<Ip>{
            override fun onResponse(call: Call<Ip>, response: Response<Ip>) {
                if(response.isSuccessful){
                    var ip=response.body()
                    tvIp.text=ip.toString()
                }
            }
            override fun onFailure(call: Call<Ip>, t: Throwable) {
                Toast.makeText(this@MainActivity,"Error ${t}", Toast.LENGTH_LONG).show()
            }
        })
    }
}