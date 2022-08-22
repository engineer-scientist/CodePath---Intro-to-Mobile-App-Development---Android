package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show the layout file "activity_main.xml":
        setContentView(R.layout.activity_main)

        // 1. User sees custom text in a label - Hello from {name}!
        // 2. User sees custom background color.
        // 3. User can tap a button to change the text color of the label.
        //  3.1. Add a button to our layout.

        //  3.2. Set up logic to know when the user has tapped on the button:
        // Get a reference to the button:
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handle button tap:
            //  3.3. Change text color.
            Log.i("Sarthak", "Tapped on button.")

            //  3.1. Get a reference of the text view:
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

            //  3.3.2. Change the text color:

        }


    }
}