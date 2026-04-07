package com.example.examen.Retrofit


import com.example.examen.RecyclerView.MyItem
import retrofit2.Response
import retrofit2.http.*


interface ItemService {

   // READ - Obtenir un post per ID
   @GET("login")
   suspend fun getPostById(@Path("id") id: Int): Response<MyItem>


   // CREATE - Crear un nou post
   @POST("reserves/usuari/{idusuari}")
   suspend fun createPost(@Body item: MyItem): Response<MyItem>

}
