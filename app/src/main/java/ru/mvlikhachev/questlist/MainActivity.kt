package ru.mvlikhachev.questlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.mvlikhachev.questlist.screens.QuestListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, QuestListFragment())
            .commit()
    }
}