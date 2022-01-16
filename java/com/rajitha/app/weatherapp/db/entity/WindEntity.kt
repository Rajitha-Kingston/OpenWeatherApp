package com.rajitha.app.weatherapp.db.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import com.rajitha.app.weatherapp.domain.model.Wind
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Wind")
data class WindEntity(
    @ColumnInfo(name = "deg")
    val deg: Double?,
    @ColumnInfo(name = "speed")
    val speed: Double?
) : Parcelable {
    @Ignore
    constructor(wind: Wind?) : this(
        deg = wind?.deg,
        speed = wind?.speed
    )
}
