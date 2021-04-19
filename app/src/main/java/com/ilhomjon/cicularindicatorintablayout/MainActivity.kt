package com.ilhomjon.cicularindicatorintablayout

import Adapter.IndicatorAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var list:ArrayList<String>
    lateinit var indicatorAdapter: IndicatorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = ArrayList()
        list.add("https://storage.kun.uz/source/7/XzViXWgaexIZTjkc2okZka9gpAr8GE5_.jpg")
        list.add("https://storage.kun.uz/source/7/XzViXWgaexIZTjkc2okZka9gpAr8GE5_.jpg")
        list.add("https://storage.kun.uz/source/7/XzViXWgaexIZTjkc2okZka9gpAr8GE5_.jpg")
        list.add("https://storage.kun.uz/source/7/XzViXWgaexIZTjkc2okZka9gpAr8GE5_.jpg")
        list.add("https://storage.kun.uz/source/7/XzViXWgaexIZTjkc2okZka9gpAr8GE5_.jpg")

        indicatorAdapter = IndicatorAdapter(list, supportFragmentManager)

        view_pager.adapter=indicatorAdapter

        tab_layout.setupWithViewPager(view_pager)
        //background uchun link: https://stackoverflow.com/questions/45255780/how-to-show-a-circle-tab-indicator-along-viewpager
    }
}