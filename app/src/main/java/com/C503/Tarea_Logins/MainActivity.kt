package com.C503.Tarea_Logins

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val botonabrir = findViewById<TextView>(R.id.button8)

        botonabrir.setOnClickListener{
            val intent = Intent(this, ConstraitLayout::class.java)
            startActivity(intent)
        }
        val botonabrir2 = findViewById<TextView>(R.id.button9)

        botonabrir2.setOnClickListener{
            val intent = Intent(this, GridLayout::class.java)
            startActivity(intent)
        }

        val botonabrir3 = findViewById<TextView>(R.id.button10)

        botonabrir3.setOnClickListener{
            val intent = Intent(this, LinearLayout2::class.java)
            startActivity(intent)
        }
        val botonabrir4 = findViewById<TextView>(R.id.button11)

        botonabrir4.setOnClickListener{
            val intent = Intent(this, LinearLayout1::class.java)
            startActivity(intent)
        }
        val botonabrir5 = findViewById<TextView>(R.id.button12)

        botonabrir5.setOnClickListener{
            val intent = Intent(this, Relative::class.java)
            startActivity(intent)
        }
        val botonabrir6 = findViewById<TextView>(R.id.button13)

        botonabrir6.setOnClickListener{
            val intent = Intent(this,tableLayout::class.java)
            startActivity(intent)
        }
        val botonabrir7 = findViewById<TextView>(R.id.button14)

        botonabrir7.setOnClickListener{
            val intent = Intent(this, frameLayout::class.java)
            startActivity(intent)
        }
    }
}