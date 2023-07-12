package br.com.renancsdev.sky.api

import br.com.renancsdev.sky.model.Result
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    //@GET("/users")
    @GET("3/movie/popular")
    fun pegarFilmesMaisPopulares(@Query("api_key") apiKey: String): Call<Result>

}