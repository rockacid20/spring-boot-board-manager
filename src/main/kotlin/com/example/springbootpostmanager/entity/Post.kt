package com.example.springbootpostmanager.entity

import javax.persistence.*

@Entity
data class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idx :Long,
    @Column(length = 200)
    var title : String,
    @Column(length = 1000)
    var content : String,
    @Column(length = 100)
    var author : String,
    var password :String
):BaseTimeEntity()
