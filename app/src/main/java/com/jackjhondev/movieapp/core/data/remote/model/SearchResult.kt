package com.jackjhondev.movieapp.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class SearchResult(
    @SerializedName("adult")
    val adult: Boolean,
    @SerializedName("backdrop_path")
    val backdroPath: String,
    @SerializedName("first_air_date")
    val firstAirDate: String,
    @SerializedName("genre_ids")
    val genreIds: List<Int>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("media_type")
    val mediaType: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("originCountry")
    val origin_country: List<String>,
    @SerializedName("originalLanguage")
    val original_language: String,
    @SerializedName("originalName")
    val original_name: String,
    @SerializedName("originalTitle")
    val original_title: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("popularity")
    val popularity: Double,
    @SerializedName("posterPath")
    val poster_path: String,
    @SerializedName("releaseDate")
    val release_date: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("video")
    val video: Boolean,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("vote_count")
    val voteCount: Int
)