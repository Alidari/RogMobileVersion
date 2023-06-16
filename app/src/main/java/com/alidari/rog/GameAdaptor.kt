package com.alidari.rog

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alidari.rog.databinding.ItemsBinding


class GameAdaptor(val gameList : ArrayList<Game>): RecyclerView.Adapter<GameAdaptor.GameHolder>() {
    class GameHolder(val binding: ItemsBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameHolder {
        val binding = ItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return GameHolder(binding)
    }

    override fun onBindViewHolder(holder: GameHolder, position: Int) {
        holder.binding.imagee.setImageResource(gameList[position].resim)
        holder.binding.text.text = gameList[position].isim
        holder.binding.text1.text = "Yapımcı - Yayıncı: ${gameList[position].yapimci} \n\n Tür:${gameList[position].tur}"

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,GameDetails::class.java)
            intent.putExtra("Oyun",gameList[position])
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return gameList.size
    }
}