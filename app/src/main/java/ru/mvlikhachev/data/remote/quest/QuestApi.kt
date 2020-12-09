package ru.mvlikhachev.data.remote.quest

import io.reactivex.Single
import retrofit2.http.GET

interface QuestApi {

    @GET("./getQuestList")
    fun getQuestList() : Single<QuestListResponse>
}