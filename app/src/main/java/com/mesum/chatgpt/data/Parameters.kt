package com.mesum.chatgpt.data

import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("max_new_tokens") val maxNewTokens: Int = 50,
    @SerializedName("temperature") val temperature: Double = 0.7,
    @SerializedName("top_p") val topP: Double = 0.9
)

