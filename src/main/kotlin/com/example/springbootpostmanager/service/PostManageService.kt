package com.example.springbootpostmanager.service

import com.example.springbootpostmanager.dto.PostDTO
import org.springframework.stereotype.Service

@Service
interface PostManageService {
    fun createPost(postDTO: PostDTO):String
    fun updatePost(postDTO: PostDTO):String
    fun deletePost(postDTO: PostDTO):String
    fun readPostByAuth(author: String):String
    fun readPostAll():String
}