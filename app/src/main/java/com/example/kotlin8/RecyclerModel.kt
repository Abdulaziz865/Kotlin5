package com.example.kotlin8

import java.io.Serializable

class RecyclerModel(
    var imageUrl: String,
    var name: String,
    var age: Int,
    var family: String
) : Serializable