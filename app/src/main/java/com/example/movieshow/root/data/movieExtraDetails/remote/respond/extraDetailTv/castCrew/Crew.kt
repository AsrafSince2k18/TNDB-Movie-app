package com.example.movieshow.root.data.movieExtraDetails.remote.respond.extraDetailTv.castCrew

data class Crew(
    val adult: Boolean,
    val department: String,
    val gender: Int,
    val id: Int,
    val known_for_department: String,
    val name: String,
    val original_name: String,
    val popularity: Double,
    val profile_path: String,
    val total_episode_count: Int
)