package edu.msudenver.cs3013.lab2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate")

        val buttonClickListener = View.OnClickListener { view ->
           //How many activities are opened here?
           /*
           Type your answer here


           */


            when (view.id) {
                R.id.letterA -> startActivity(Intent(this, ActivityA::class.java))
                R.id.letterB -> startActivity(Intent(this, ActivityB::class.java))
                R.id.letterC -> startActivity(Intent(this, ActivityC::class.java))
                R.id.number1 -> startActivity(Intent(this, ActivityOne::class.java))
                R.id.number2 -> startActivity(Intent(this, ActivityTwo::class.java))
                R.id.number3 -> startActivity(Intent(this, ActivityThree::class.java))
                else -> {
                    Toast.makeText(
                        this,
                        getString(R.string.unexpected_button_pressed),
                        Toast.LENGTH_LONG
                    )
                        .show()
                }
            }
        }

        findViewById<View>(R.id.letterA).setOnClickListener(buttonClickListener)
        findViewById<View>(R.id.letterB).setOnClickListener(buttonClickListener)
        findViewById<View>(R.id.letterC).setOnClickListener(buttonClickListener)
        findViewById<View>(R.id.number1).setOnClickListener(buttonClickListener)
        findViewById<View>(R.id.number2).setOnClickListener(buttonClickListener)
        findViewById<View>(R.id.number3).setOnClickListener(buttonClickListener)
    }
}