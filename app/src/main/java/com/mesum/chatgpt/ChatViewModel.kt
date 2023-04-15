package com.mesum.chatgpt

import android.util.Log
import androidx.lifecycle.ViewModel
import com.mesum.chatgpt.api.`interface`.network.ApiClient
import com.mesum.chatgpt.data.GeneratorRequestBody
import com.mesum.chatgpt.data.GeneratorResponse
import com.mesum.chatgpt.data.Parameters
import com.mesum.chatgpt.data.api_rsp
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ChatViewModel : ViewModel() {

init {
    sendMessage()
}

    private fun sendMessage(value : String = "whats the best phone to buy"){
        val inputText = GeneratorRequestBody(inputText =  value, parameters = Parameters())
        ApiClient.api.generateText(requestBody = inputText).enqueue(object : Callback<api_rsp>{
            override fun onResponse(call: Call<api_rsp>, response: Response<api_rsp>) {

                Log.d("ResponseData", response.body().toString())
            }

            override fun onFailure(call: Call<api_rsp>, t: Throwable) {
                Log.d("ResponseData", t.message.toString())
            }

        })
    }

    }

