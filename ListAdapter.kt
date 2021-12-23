package com.tony.listviewaddress

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val context: Context, var image: Array<Int>,
                    var name: Array<String>) : BaseAdapter() {

    override fun getCount(): Int {
        return image.size
    }

    override fun getItem(position: Int): Any {
       return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var view : View? = convertView
        val viewHolder : ViewHolder
        if (view == null){
            viewHolder = ViewHolder()
            val  inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
                    as LayoutInflater
            view = inflater.inflate(R.layout.list_item, null, true)

            viewHolder.name = view.findViewById(R.id.name)
            viewHolder.image = view.findViewById(R.id.img)

            view.tag = viewHolder

        }
        else{
            viewHolder = view.tag as ViewHolder
        }
        return  view
    }
    private inner class  ViewHolder(
        var name : TextView ? = null,
        internal var image : ImageView ? = null
    )
}