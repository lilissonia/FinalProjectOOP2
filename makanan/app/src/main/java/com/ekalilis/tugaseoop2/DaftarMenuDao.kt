package com.ekalilis.tugaseoop2

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DaftarMenuDao {
    @Query("SELECT * FROM Daftar_Menu")
    fun getAll(): List<DaftarMenu>

    @Query("SELECT * FROM Daftar_Menu WHERE kode IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<DaftarMenu>

    @Query("SELECT * FROM Daftar_Menu WHERE makanan LIKE :makanan AND " +
            "minuman LIKE :minuman AND " + "harga LIKE : harga LIMIT 1")
    fun findByName(nama: String, penjual: String, harga: Int): DaftarMenu

    @Insert
    fun insertAll(vararg Daftar_Menu: DaftarMenu)

    @Delete
    fun delete(customer: DaftarMenu)
}