package com.mesum.chatgpt.data

import com.google.gson.annotations.SerializedName

data class GeneratorResponse(
    @SerializedName("generated_text") val generatedText: String
)
