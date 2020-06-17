package com.example.animations


import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.kadr.*


class kadr: AppCompatActivity() {

    lateinit var anim: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kadr)

        imageView2.setBackgroundResource(R.drawable.gif)
        (imageView2.background as AnimationDrawable).start()
    }
}