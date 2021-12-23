package com.tony.listviewaddress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private  val name = arrayOf("big", "cam", "dany", "hed", "hen", "her", "job", "mac",
                                "mar", "tru", "tal", "pow", "sha", "pet", "pen", "nim")

    private  val image = arrayOf(R.drawable.big, R.drawable.cam, R.drawable.dany,
                    R.drawable.hed, R.drawable.hen, R.drawable.her, R.drawable.job, R.drawable.mac,
        R.drawable.mar, R.drawable.tru, R.drawable.tal, R.drawable.pow,
        R.drawable.sha, R.drawable.pet, R.drawable.pen, R.drawable.nim
            )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list_view : ListView = findViewById(R.id.list_view)

        list_view.adapter = ListAdapter(this, image, name)

    }
}