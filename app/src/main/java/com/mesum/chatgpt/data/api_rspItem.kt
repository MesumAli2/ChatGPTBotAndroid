package com.mesum.chatgpt.data


import com.google.gson.annotations.SerializedName

data class api_rspItem(
    @SerializedName("generated_text")
    val generatedText: String
)