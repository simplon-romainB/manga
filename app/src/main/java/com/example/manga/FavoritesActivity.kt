package com.example.manga

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.manga.databinding.ActivityFavoritesBinding


class FavoritesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavoritesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoritesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setViewItems()
    }

    private fun setViewItems() {
        val localMangas = SharedPreferencesManager().getLocalMangaStorage(this).localMangas
        displayMangaList(localMangas)
    }

    fun displayMangaList(mangas: MutableList<Data>) {
        val adapter = MangaListViewAdapter(mangas, object : MangaItemCallback {
            override fun onCellClick(manga: Data) {
            }

            override fun onSaveManga(manga: Data) {
            }
        })
        binding.mangaRv.adapter = adapter
        binding.mangaRv.layoutManager = LinearLayoutManager(applicationContext)
    }
}