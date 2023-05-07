package com.cem.superherobookproject

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val shList:ArrayList<String>, val shPictures:ArrayList<Int>): RecyclerView.Adapter<RecyclerAdapter.SuperHeroVH>() {

    class SuperHeroVH (itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVH {

        //Inflater, LayoutInflater, MenuInflater
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperHeroVH(itemView)
    }

    override fun getItemCount(): Int {
        return shList.size
    }

    override fun onBindViewHolder(holder: SuperHeroVH, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.recyclerViewText).text= shList.get(position)

        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("heroName",shList.get(position))
            intent.putExtra("heroImage",shPictures.get(position))
            /*
            val singleton=SingletonClass.SecilenKahraman
            singletonorsel=shPictures.get(position)
            */
            holder.itemView.context.startActivity(intent)


}
}
}