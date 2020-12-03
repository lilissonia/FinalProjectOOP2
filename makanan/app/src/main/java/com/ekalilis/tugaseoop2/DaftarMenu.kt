package com.ekalilis.tugaseoop2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Daftar_Menu")
data class DaftarMenu(
    @PrimaryKey val kode: Int,
    @ColumnInfo(name = "Makan") val makanan: String?,
    @ColumnInfo(name = "Minuman") val minuman: String?,
    @ColumnInfo(name = "Harga") val harga: Int?

)