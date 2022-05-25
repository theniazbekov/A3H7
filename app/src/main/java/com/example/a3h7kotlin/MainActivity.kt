package com.example.a3h7kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a3h7kotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var itemList: ArrayList<Items>
    private lateinit var itemAdapter: ItemAdapter

/*
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        itemList = ArrayList()

        itemList.add(Items(R.drawable.homer, "Homer", "VIII century BC"))
        itemList.add(Items(R.drawable.omar_hajyam, "Omar Khayyam", "1048-1123"))
        itemList.add(Items(R.drawable.william_shakespeare, "William Shakespeare", "1564-1616"))

        itemList.add(Items(R.drawable.zhukovsky, "Vasily Andreevich Zhukovsky", "1783-1852"))
        itemList.add(Items(R.drawable.pushkin, "Alexander Pushkin", "1799-1837"))
        itemList.add(Items(R.drawable.nekrasov, "Nikolai Nekrasov", "1821-1877"))
        itemList.add(Items(R.drawable.pablo, "Pablo Neruda", "1904-1973"))




        itemAdapter = ItemAdapter(itemList)
        recyclerView.adapter = itemAdapter

         /*layoutManager = LinearLayoutManager(this)
        recycler_view.LayoutManager = layoutManager

         adapter = RecyclerAdapter()
         recyclerView.adapter = adapter*/
    }
}