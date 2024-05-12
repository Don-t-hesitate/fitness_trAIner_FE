@file:OptIn(InternalAPI::class)

package com.overeasy.smartfitness.domain.ai.impl

import com.overeasy.smartfitness.BuildConfig
import com.overeasy.smartfitness.domain.ai.AiRepository
import com.overeasy.smartfitness.domain.ai.entity.PostAiReq
import com.overeasy.smartfitness.domain.ai.entity.PostAiRes
import com.overeasy.smartfitness.simplePost
import io.ktor.client.HttpClient
import io.ktor.util.InternalAPI

class AiRepositoryImpl(
    private val client: HttpClient
) : AiRepository {
    private val baseUrl = "${BuildConfig.BASE_URL}/ai"

    override suspend fun postAi(req: PostAiReq): PostAiRes =
        client.simplePost(baseUrl) {
            body = req
        }
}