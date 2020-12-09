package ru.mvlikhachev.questlist.screens

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.schedulers.Schedulers

import ru.mvlikhachev.data.remote.quest.QuestApi

class QuestListViewModel(application: Application) : AndroidViewModel(application) {

    private val compositeDisposable = CompositeDisposable()

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }

    fun fetchQuestList(questApi: QuestApi?) {

        questApi?.let {
            compositeDisposable.add(questApi.getQuestList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({

                }, {

                }))
        }

    }
}