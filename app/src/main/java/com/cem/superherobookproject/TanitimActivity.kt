package com.cem.superherobookproject

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cem.superherobookproject.databinding.ActivityTanitimBinding

class TanitimActivity : AppCompatActivity() {
    private lateinit var binding:ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTanitimBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        //Kahraman ismini intent ile aldık
        val intent= intent
        val secilenHeroName=intent.getStringExtra("heroName")
        binding.nameText.text=secilenHeroName
        val secilenHeroGorsel=intent.getIntExtra("heroImage",0)
        val bitmap=BitmapFactory.decodeResource(applicationContext.resources,secilenHeroGorsel)
        binding.imageView.setImageBitmap(bitmap)
        /*
        val secilenHeroGorsel=SingletonClass.SecilenKahraman
        val secilenGorsel=secilenHeroGorsel.gorsel
        binding.imageView.setImageBitmap(secilenGorsel)
         */
    }
}