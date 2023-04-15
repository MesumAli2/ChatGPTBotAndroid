package com.mesum.chatgpt.api.`interface`.network

import android.util.Log
import com.mesum.chatgpt.api.`interface`.HuggingFaceApi
import com.mesum.chatgpt.data.GeneratorRequestBody
import com.mesum.chatgpt.data.Parameters
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Header


val httpClient : OkHttpClient.Builder = OkHttpClient.Builder()

fun createClient(): OkHttpClient {
    httpClient.addInterceptor { chain ->
        val original = chain.request()
        val request = original.newBuilder()
            .header("Authorization", "Bearer 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")
            .build()
        chain.proceed(request)
    }
    return httpClient.build()
}

val retrofit = Retrofit.Builder()
    .baseUrl("https://api-inference.huggingface.co/models/EleutherAI/gpt-neo-1.3B/")
    .addConverterFactory(GsonConverterFactory.create())
    .client(createClient())
    .build()




    object ApiClient{
        val api = retrofit.create(HuggingFaceApi::class.java)
    }
