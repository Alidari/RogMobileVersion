package com.alidari.rog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alidari.rog.databinding.ActivityGameDetailsBinding
import com.alidari.rog.databinding.ActivityMainBinding

class GameDetails : AppCompatActivity() {
    private lateinit var binding: ActivityGameDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        val özellikler = intent.getSerializableExtra("Oyun") as Game

        binding.gameTitleR.text = özellikler.isim
        binding.gameImg.setImageResource(özellikler.resim)
        binding.gameTur.text = özellikler.tur
        binding.gameYapimci.text = özellikler.yapimci
        binding.metaScore.text = özellikler.metaSkor.toString()
        if (özellikler.metaSkor < 100){
            binding.metaScore.setBackgroundColor(111111)
        }
        binding.userScore.text = özellikler.kullaniciSkor.toString()
        binding.description.text = özellikler.aciklama

    }
}