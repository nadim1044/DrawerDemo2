package com.app.drawerdemo2

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DrawerActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtHelloWorld.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

    }
}