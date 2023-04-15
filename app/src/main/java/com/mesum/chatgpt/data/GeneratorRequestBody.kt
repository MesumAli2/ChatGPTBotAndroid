package com.mesum.chatgpt.data

import com.google.gson.annotations.SerializedName

data class GeneratorRequestBody(
    @SerializedName("inputs") val inputText: String,
    @SerializedName("parameters") val parameters: Parameters
)

