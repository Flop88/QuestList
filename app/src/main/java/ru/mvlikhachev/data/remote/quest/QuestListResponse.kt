package ru.mvlikhachev.data.remote.quest

import com.google.gson.annotations.SerializedName
import ru.mvlikhachev.data.remote.common.RemoteListItem
import java.sql.Struct

data class QuestListResponse(val items : List<QuestListItems>)

data class QuestListItems(

    @SerializedName("questId")
    val questId : String,

    @SerializedName("questName")
    val name : String,

    @SerializedName("questSubtitle")
    val subtitle : String,

    @SerializedName("questImage")
    val image : String,

    @SerializedName("description")
    val description : List<RemoteListItem>

)
