package com.nzuzi.aoppp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply {
            text = "Projecto criado pela Decide"
            textSize = 22f
            setPadding(32, 32, 32, 32)
        })
    }
}
