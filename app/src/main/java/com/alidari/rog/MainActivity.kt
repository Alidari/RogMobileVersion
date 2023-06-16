package com.alidari.rog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alidari.rog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var gameList : ArrayList<Game>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        gameList = ArrayList<Game>()

        val deadSpace = Game("Dead Space Remake","Aksiyon, Gerilim","EA Games",89,8.7,"Yeni nesil konsollar ve PC için özel olarak geliştirildi ve Frostbite oyun motoru tarafından desteklenen çarpıcı görseller, ses ve kontroller aracılığıyla korku ve sürükleyicilik seviyesini seri için benzeri görülmemiş yüksekliklere çıkarıyor. Hayranlar, ıssız maden yıldız gemisi USG Ishimura'da yaşayan bir kabusta hayatta kalmak için savaşırken, katledilen mürettebata ve gemiye olanların korkunç gizemini açığa çıkarırken gelişmiş bir hikaye, karakterler, oyun mekaniği ve daha fazlasını deneyimleyecek.",R.drawable.deadspace)
        val hogwarts = Game("Hogwarts Legacy","Role Playing Game","Avalanche Studios - Warner Bros. Interactive Entertainment",83,8.0,"Hogwarts Legacy, ilk olarak Harry Potter kitaplarında tanıtılan dünyada geçen sürükleyici, açık dünya bir aksiyon RPG'sidir. Artık aksiyonun kontrolünü elinize alabilir ve büyücülük dünyasında kendi maceranızın merkezinde olabilirsiniz. Fantastik canavarları keşfedip keşfederken, karakterinizi özelleştirip iksirler yaparken, büyü yapmada ustalaşın, yeteneklerinizi yükseltin ve olmak istediğiniz sihirbaz olurken tanıdık ve yeni konumlarda bir yolculuğa çıkın.",R.drawable.hogwarts)

        gameList.add(deadSpace)
        gameList.add(hogwarts)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        val gameAdaptor = GameAdaptor(gameList)
        binding.recycler.adapter = gameAdaptor

    }
}