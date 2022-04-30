package com.martin.trendingmovie.data.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.martin.trendingmovie.data.local.models.FavoritesTable
import com.martin.trendingmovie.data.local.models.TvShowsRemoteKeysTable
import com.martin.trendingmovie.data.local.models.TrendingTvShowsTable

@Database(entities = [TrendingTvShowsTable::class, TvShowsRemoteKeysTable::class, FavoritesTable::class], version = 1)
abstract class TvShowDatabase :RoomDatabase(){

    abstract fun trendingTvShowsDao(): TrendingTvShowsDao
    abstract fun tvShowsRemoteKeysDao(): TvShowsRemoteKeysDao
    abstract fun favoriteShowsDao():FavoritesDao
}