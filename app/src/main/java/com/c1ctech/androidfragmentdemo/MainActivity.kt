package com.c1ctech.androidfragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_fragmentOne.setOnClickListener {
            supportFragmentManager.commit {
                add<FragmentOne>(R.id.fragment_container_view)
            }
        }

        btn_fragmentTwo.setOnClickListener {
            supportFragmentManager.commit {
                add<FragmentTwo>(R.id.fragment_container_view)
            }
        }
    }
}