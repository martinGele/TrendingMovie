package com.martin.trendingmovie.features.favorite

import androidx.lifecycle.ViewModel
import com.martin.trendingmovie.data.repository.DefaultRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class FavoriteViewModel @Inject constructor(private val repository: DefaultRepository) : ViewModel() {

    fun getFavoriteMovie() = repository.getFavoriteShows()

}