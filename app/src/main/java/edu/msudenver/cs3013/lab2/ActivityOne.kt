package edu.msudenver.cs3013.lab2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat

class ActivityOne : AppCompatActivity() {

    private val TAG = "Activity 1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        Log.d(TAG, "onCreate in Num1")

        val buttonClickListener = View.OnClickListener { view ->
        //  "What is the below code section doing?"
            /*
            Type your answer here


            */

            when (view.id) {
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

        findViewById<View>(R.id.number1).setOnClickListener(buttonClickListener)
        findViewById<View>(R.id.number2).setOnClickListener(buttonClickListener)
        findViewById<View>(R.id.number3).setOnClickListener(buttonClickListener)
    }

    //  "What is the below function doing?"
    /*
     Type your answer here


     */
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "onNewIntent in One")
    }
}