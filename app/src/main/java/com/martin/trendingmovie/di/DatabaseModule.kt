package com.martin.trendingmovie.di

import android.content.Context
import androidx.room.Room
import com.martin.trendingmovie.data.local.dao.TvShowDatabase
//import com.example.paging3demo.data.local.UnsplashDatabase
//import com.example.paging3demo.util.Constants.UNSPLASH_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): TvShowDatabase {
        return Room.databaseBuilder(
            context,
            TvShowDatabase::class.java,
            "movies_database"
        ).allowMainThreadQueries().build()
    }

}