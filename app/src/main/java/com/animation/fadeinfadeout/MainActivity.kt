package com.animation.fadeinfadeout

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_fade_in.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            img_doit.startAnimation(animation)
        }

        btn_fade_out.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            img_doit.startAnimation(animation)
        }
    }
}