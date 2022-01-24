package com.steven.todopeliculas.data.remote

import com.steven.todopeliculas.application.AppConstants
import com.steven.todopeliculas.data.model.MovieList
import javax.inject.Inject

class RemoteMovieDataSource @Inject constructor(private val webService: WebService) {
    
    suspend fun getUpcomingMovies(): MovieList = webService.getUpcomingMovie(AppConstants.API_KEY)

    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovie(AppConstants.API_KEY)

    suspend fun getPopularMovies(): MovieList = webService.getPopularMovie(AppConstants.API_KEY)
}