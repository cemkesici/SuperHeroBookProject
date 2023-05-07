package com.cem.superherobookproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.cem.superherobookproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        //Veri hazırlığı
        val superKahramanIsimleri=ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Spiderman")
        superKahramanIsimleri.add("Ironman")
        superKahramanIsimleri.add("Homelander")
        /*
        //Verimsiz Yöntem
        val batmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val spidermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
        val ironmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val homelanderBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.homelander)

        val superKahramanGorsel=ArrayList<Bitmap>()
        superKahramanGorsel.add(batmanBitmap)
        superKahramanGorsel.add(supermanBitmap)
        superKahramanGorsel.add(spidermanBitmap)
        superKahramanGorsel.add(ironmanBitmap)
        superKahramanGorsel.add(homelanderBitmap)
        */
        val batmanDrawbleId=R.drawable.batman
        val ironmanDrawbleId=R.drawable.ironman
        val spidermanDrawbleId=R.drawable.spiderman
        val homelanderDrawbleId=R.drawable.homelander
        val supermanDrawbleId=R.drawable.superman

        val superHeroDrawbaleList=ArrayList<Int>()
        superHeroDrawbaleList.add(batmanDrawbleId)
        superHeroDrawbaleList.add(supermanDrawbleId)
        superHeroDrawbaleList.add(spidermanDrawbleId)
        superHeroDrawbaleList.add(ironmanDrawbleId)
        superHeroDrawbaleList.add(homelanderDrawbleId)

        val layoutManager=LinearLayoutManager(this)
        binding.recyclerView.layoutManager=layoutManager

        val adapter=RecyclerAdapter(superKahramanIsimleri,superHeroDrawbaleList)
        binding.recyclerView.adapter=adapter


    }
}