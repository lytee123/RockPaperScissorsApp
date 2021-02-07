package com.example.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.media.MediaPlayer

const val EXTRA_MESSAGE = "com.example.rockpaperscissors.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // This has the song start when the app launches
        var mediaPlayer = MediaPlayer.create(this, R.raw.sixth)
        mediaPlayer.start()
    }


    fun startGame(view: View){
        //Intents are good for directing to another page
        val intent = Intent(this, MakeChoiceActivity::class.java)
        startActivity(intent)
    }

}