package com.example.springbootpostmanager.service

import com.example.springbootpostmanager.dto.PostDTO
import org.springframework.stereotype.Service

@Service
class PostManageServiceImpl:PostManageService {
    override fun createPost(postDTO: PostDTO): String {
        TODO("Not yet implemented")
    }

    override fun updatePost(postDTO: PostDTO): String {
        TODO("Not yet implemented")
    }

    override fun deletePost(postDTO: PostDTO): String {
        TODO("Not yet implemented")
    }

    override fun readPostByAuth(author: String): String {
        TODO("Not yet implemented")
    }

    override fun readPostAll(): String {
        TODO("Not yet implemented")
    }
}