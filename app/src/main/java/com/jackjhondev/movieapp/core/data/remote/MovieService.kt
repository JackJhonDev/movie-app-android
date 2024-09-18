package com.jackjhondev.movieapp.core.data.remote

import com.jackjhondev.movieapp.core.data.remote.response.MovieDetailResponse
import com.jackjhondev.movieapp.core.data.remote.response.MovieResponse
import com.jackjhondev.movieapp.core.data.remote.response.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

    @GET("movie/{movie_id}")
    suspend fun getMovie(
        @Path("movie_id") movieId: Int
    ) : MovieDetailResponse

    @GET("movie/{movie_id}/similar")
    suspend fun getSimilarMovies(
        @Path("movie_id") movieId: Int,
        @Query("page") page: Int
    ) : MovieResponse

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("page") page: Int
    ) : MovieResponse

    @GET("movie/multi")
    suspend fun searchMovie(
        @Path("movie_id") movieId: Int,
        @Query("page") page: Int
    ) : SearchResponse
}