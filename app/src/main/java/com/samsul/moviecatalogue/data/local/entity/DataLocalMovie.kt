package com.samsul.moviecatalogue.data.local.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "data_movie")
data class DataLocalMovie(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "movieId")
    val movieId: Int? = 0,

    @ColumnInfo(name = "titleMovie")
    val titleMovie: String? = "",

    @ColumnInfo(name = "imageMovie")
    val imagePoster: String? = "",

    @ColumnInfo(name = "favorite")
    var favorite: Boolean = false

): Parcelable
