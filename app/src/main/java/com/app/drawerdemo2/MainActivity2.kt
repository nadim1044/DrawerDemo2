package com.app.drawerdemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : DrawerActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}