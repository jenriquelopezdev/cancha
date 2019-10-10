package com.elopez.myapplication.models

data class Reservation(
    val name: String = "", val address: String = "",
    val datetime: String = "", val price: String = "",
    val code: String = "", val state: String = ""
)
