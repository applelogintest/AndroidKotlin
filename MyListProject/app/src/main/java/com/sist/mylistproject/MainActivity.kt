package com.sist.mylistproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var memList= arrayListOf<Member>(
        Member("홍길동","서울","010-1263-6345"),
        Member("심청이","경기","010-1423-7353"),
        Member("춘향이","인천","010-6254-5289"),
        Member("박문수","강원","010-7212-5123"),
        Member("이순신","부산","010-1534-5325")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter=MainListAdapter(this,memList)
        mainListView.adapter=adapter
    }
}