package com.example.manga

interface MangaItemCallback {
    fun onCellClick(manga:Data)
    fun onSaveManga(manga:Data)
}