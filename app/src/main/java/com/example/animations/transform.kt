package com.example.animations

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.transform.*

class transform : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transform)

        lateinit var image : ImageView

        image = findViewById(R.id.imageView3)
        var animation : Animation = AnimationUtils.loadAnimation(this, R.anim.animation)
        imageView3.startAnimation(animation)
    }
}