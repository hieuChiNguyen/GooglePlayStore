package com.example.googleplaystore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val arrayList: ArrayList<GroupApp> = arrayListOf()

        repeat(8) {
            val arrayAppList: ArrayList<App> = arrayListOf()
            repeat(8) {
                arrayAppList.add(
                    App(
                        logoPath = "https://ouch-cdn2.icons8.com/_US60I188UuoRurpJ9lfFmfp5baT-Gtp3bghSn-AOL8/rs:fit:456:456/czM6Ly9pY29uczgu/b3VjaC1wcm9kLmFz/c2V0cy9wbmcvOTI0/L2NjYjgwMjlkLWZh/NWMtNDU5Yy05YjBk/LWI0Yzg2MzI3Zjc0/Mi5wbmc.png",
                        title = "Instagram",
                        rating = 4.8
                    )
                )
            }
            arrayList.add(GroupApp(title = "Popular apps", appList = arrayAppList))
        }

        findViewById<RecyclerView>(R.id.rvlMain).apply {
            adapter = GroupAppAdapter(arrayList)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
    }
}