package com.kolumbo.chineserecipes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kolumbo.chineserecipes.fragment.FragmentMain

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, FragmentMain.newInstance())
                    .commitNow()
        }
    }
}