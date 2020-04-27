package com.example.todoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    //リストとして表示するデータビューの生成
    private  val texts = arrayOf("Title_1","Title_2","Title_3","Title_4","Title_5","Title_6","Title_7","Title_8","Title_9","Title_10","Title_11","Title_12","Title_13","Title_14","Title_15","Title_16","Title_17","Title_18","Title_19","Title_20","Title_21","Title_22","Title_23","Title_24","Title_25","Title_26","Title_27","Title_28","Title_29","Title_30")

    //1行で配列を作る記述。
    val items = Array(30) { i -> "Title-$i" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1.リストビューのインスタンスを生成
        val listView = ListView(this)

        // 2.setContentViewにリストビューのインスタンスを設定
        setContentView(listView)

        // 3.ArrayAdapterのインスタンス生成。　第一引数にContextを指定するのでthis,第二引数にレイアウトのID指定,第三引数にはリストとして表示するデータを指定。今回の場合はtexts。
        val arrayAdapter = ArrayAdapter(this, R.layout.list, texts)

        // 4.生成したArrayAdapterをlistViewにセットして表示する。
        listView.setAdapter(arrayAdapter)





    }
}
