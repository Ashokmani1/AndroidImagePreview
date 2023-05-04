package com.sampleapps.testlibrary

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.sampleapps.image_preview.loadImageUsingUrl


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivBasicImage = findViewById<ImageView>(R.id.image_view) as ImageView
        loadImageUsingUrl()?.into(ivBasicImage)
    }
}