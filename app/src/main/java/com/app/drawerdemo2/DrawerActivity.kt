package com.app.drawerdemo2

import android.util.Log
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.drawer_more.*

public open class DrawerActivity : AppCompatActivity() {
    var drawerFull: DrawerLayout? = null
    var fram: FrameLayout? = null

    override fun setContentView(layoutResID: Int) {
        super.setContentView(layoutResID)
        drawerFull = layoutInflater.inflate(R.layout.activity_drawer, null) as DrawerLayout?
        fram = drawerFull!!.findViewById(R.id.frame)

        layoutInflater.inflate(layoutResID, fram, true)

        super.setContentView(drawerFull)
        txtContactUs.setOnClickListener {  Log.e("Data","Hii txtContactUs")}

    }
}