package com.example.googleplaystore

class App() {
    var logoPath: String = ""
    var title: String = ""
    var rating: Double = 0.0

    constructor(logoPath: String, title: String, rating: Double): this(){
        this.logoPath = logoPath
        this.title = title
        this.rating = rating
    }
}