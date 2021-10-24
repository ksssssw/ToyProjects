package com.example.kotlinstudy

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val listView: ListView = findViewById(R.id.listView)

        // itemList 준비
        val carList = ArrayList<CarForList>()
        for (i in 0 until 10) {
            carList.add(CarForList("" + i + "번째 자동차11", "" + i + "순위 엔진11"))
        }

        val adapter = ListViewAdapter(carList, this@ListViewActivity as Context)
        listView.adapter = adapter
    }
}

class ListViewAdapter(val carForList: ArrayList<CarForList>, val context: Context) : BaseAdapter() {

    override fun getCount(): Int {
        // 그리고자 하는 아이템의 전제 개수
        return carForList.size
    }

    override fun getItem(position: Int): Any {
        // 그리고자 하는 아이템 리스트의 하나(포지션에 해당하는)
        return carForList.get(position)
    }

    override fun getItemId(position: Int): Long {
        // 해당 포지션에 위치해 있는 아이템의 아이디 설정
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.item_view, null)
        val carNameTextView = view.findViewById<TextView>(R.id.car_name)
        val carEngineTextView = view.findViewById<TextView>(R.id.car_engine)

        carNameTextView.setText(carForList.get(position).name)
        carEngineTextView.setText(carForList.get(position).engine)

        return view
    }

}