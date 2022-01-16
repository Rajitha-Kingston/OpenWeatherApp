package com.rajitha.app.weatherapp.db.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import com.rajitha.app.weatherapp.domain.model.Coord
import com.rajitha.app.weatherapp.domain.model.Geoloc
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Coord")
data class CoordEntity(
    @ColumnInfo(name = "lon")
    val lon: Double?,
    @ColumnInfo(name = "lat")
    val lat: Double?
) : Parcelable {
    @Ignore
    constructor(coord: Coord) : this(
        lon = coord.lon,
        lat = coord.lat
    )

    @Ignore
    constructor(geoloc: Geoloc?) : this(
        lon = geoloc?.lng,
        lat = geoloc?.lat
    )
}
