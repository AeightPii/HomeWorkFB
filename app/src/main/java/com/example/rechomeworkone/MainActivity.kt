package com.example.rechomeworkone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rechomeworkone.adapter.PersonAdapter
import com.example.rechomeworkone.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var personArray=ArrayList<Person>()
        personArray.add(Person("MIN HAN",R.drawable.me,R.drawable.carrrrr))
        personArray.add(Person("JAMES",R.drawable.unnamed,R.drawable.aaa))
        personArray.add(Person("ALITTA",R.drawable.dg,R.drawable.la))
        personArray.add(Person("HYSENBARK",R.drawable.hy,R.drawable.abb))

        var personAdapter= PersonAdapter(personArray)

        recyclerView.layoutManager= LinearLayoutManager(this)
        //recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        // recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.adapter=personAdapter
    }
}
