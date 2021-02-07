package com.example.rockpaperscissors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MakeChoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_choice)
    }


    fun sendMessageRock(view: View) {
        //Find the button, find the string attached to it
        val editText = findViewById<Button>(R.id.button9)
        val message = editText.text.toString()
        //When going to the next page, bring along the name of the choice
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun sendMessagePaper(view: View) {
        //Find the button, find the string attached to it
        val editText = findViewById<Button>(R.id.button3)
        val message = editText.text.toString()
        //When going to the next page, bring along the name of the choice
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun sendMessageScissors(view: View) {
        //Find the button, find the string attached to it
        val editText = findViewById<Button>(R.id.button2)
        val message = editText.text.toString()
        //When going to the next page, bring along the name of the choice
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}