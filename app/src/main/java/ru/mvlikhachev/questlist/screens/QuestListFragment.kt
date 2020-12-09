package ru.mvlikhachev.questlist.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import ru.mvlikhachev.QuestApp
import ru.mvlikhachev.data.remote.quest.QuestApi
import ru.mvlikhachev.questlist.R

class QuestListFragment : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val questListViewModel = ViewModelProviders.of(this).get(QuestListViewModel::class.java)
        questListViewModel.fetchQuestList((activity?.application as? QuestApp)?.questApi)
    }


}