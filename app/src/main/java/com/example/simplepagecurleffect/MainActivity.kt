package com.example.simplepagecurleffect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.num.numandroidpagecurleffect.PageCurlView
import java.util.*


class MainActivity : AppCompatActivity() {
    var pageCurlView: PageCurlView? = null
    var images: MutableList<Int>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //pagecurl
        pageCurlView = findViewById(R.id.pagecurlView)
        images = ArrayList()
        (images as ArrayList<Int>).add(R.drawable.id_one)
        (images as ArrayList<Int>).add(R.drawable.id_two)
        (images as ArrayList<Int>).add(R.drawable.id_three)
        (images as ArrayList<Int>).add(R.drawable.id_four)
        pageCurlView!!.setCurlView(images)
        pageCurlView!!.SetCurlMode(PageCurlView.CURLMODE_SIMPLE)
        //pageCurlView.SetCurlMode(PageCurlView.CURLMODE_DYNAMIC);
        pageCurlView!!.setCurlSpeed(600)
    }
}

