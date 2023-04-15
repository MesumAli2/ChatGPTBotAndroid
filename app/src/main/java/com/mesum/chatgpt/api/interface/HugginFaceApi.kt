package com.mesum.chatgpt.api.`interface`

import com.mesum.chatgpt.data.GeneratorRequestBody
import com.mesum.chatgpt.data.GeneratorResponse
import com.mesum.chatgpt.data.api_rsp
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Url

interface HuggingFaceApi {

    @POST
    fun generateText(
        @Url urlString: String  = "https://api-inference.huggingface.co/models/EleutherAI/gpt-neo-1.3B",
        @Body requestBody: GeneratorRequestBody
    ): Call<api_rsp>
}
