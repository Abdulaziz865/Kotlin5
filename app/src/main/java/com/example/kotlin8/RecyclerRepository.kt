package com.example.kotlin8

class RecyclerRepository {

    private val listOfCharacters: ArrayList<RecyclerModel> = ArrayList()

    fun getListOfCelebrities(): ArrayList<RecyclerModel> {
        listOfCharacters.add(
            RecyclerModel(
                "https://img.freepik.com/premium-photo/astronaut-outer-open-space-planet-earth-stars-provide-background-erforming-space-planet-earth-sunrise-sunset-our-home-iss-elements-this-image-furnished-by-nasa_150455-16829.jpg?w=2000",
                "Kocmoc",
                21,
                "Kane"
            )
        )
        listOfCharacters.add(
            RecyclerModel(
                "https://miro.medium.com/max/1200/1*mk1-6aYaf_Bes1E3Imhc0A.jpeg",
                "Baby",
                7,
                "Yoda"
            )
        )
        listOfCharacters.add(
            RecyclerModel(
                "https://h5p.org/sites/default/files/h5p/content/1209180/images/file-6113d5f8845dc.jpeg",
                "Tieger",
                51,
                "West"

            )
        )
        listOfCharacters.add(
            RecyclerModel(
                "https://tinypng.com/images/social/website.jpg",
                "Kung Phu",
                27,
                "Panda"
            )
        )
        listOfCharacters.add(
            RecyclerModel(
                "https://imagej.nih.gov/ij/images/baboon.jpg",
                "Marshal",
                32,
                "Tinder"
            )
        )
        return listOfCharacters
    }
}