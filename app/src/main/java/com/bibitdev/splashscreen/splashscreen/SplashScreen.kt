package com.bibitdev.splashscreen.splashscreen

import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.AnimationSet
import android.view.animation.TranslateAnimation
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bibitdev.splashscreen.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val tvTagline = findViewById<TextView>(R.id.tv_tagline)
        val tvSubtitle = findViewById<TextView>(R.id.tv_subtitle)

        val taglineAnimationSet = AnimationSet(true).apply {
            addAnimation(TranslateAnimation(0f, 0f, 500f, 0f).apply {
                duration = 1000
                fillAfter = true
            })
            addAnimation(AlphaAnimation(0.0f, 1.0f).apply {
                duration = 1000
            })
        }
        tvTagline.startAnimation(taglineAnimationSet)

        val subtitleAnimationSet = AnimationSet(true).apply {
            addAnimation(TranslateAnimation(0f, 0f, 500f, 0f).apply {
                duration = 1000
                startOffset = 1200
                fillAfter = true
            })
            addAnimation(AlphaAnimation(0.0f, 1.0f).apply {
                duration = 1000
                startOffset = 1200
            })
        }
        tvSubtitle.startAnimation(subtitleAnimationSet)
    }
}
