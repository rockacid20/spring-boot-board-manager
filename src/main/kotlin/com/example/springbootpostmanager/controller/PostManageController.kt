package com.example.springbootpostmanager.controller

import com.example.springbootpostmanager.dto.PostDTO
import org.springframework.web.bind.annotation.*

@RestController
class PostManageController {


    @PostMapping("/post")
    fun createPost(@RequestBody postDTO: PostDTO): String {
        TODO("Not yet implemented")
    }

    @PutMapping("/post/{title}")
    fun updatePost(@RequestBody postDTO: PostDTO): String {
        TODO("Not yet implemented")
    }

    @DeleteMapping("/post/{title}")
    fun deletePost(@RequestBody postDTO: PostDTO): String {
        TODO("Not yet implemented")
    }

    @GetMapping("/post/{title}")
    fun readPostByAuth(@RequestBody author: String): String {
        TODO("Not yet implemented")
    }

    @GetMapping("/post")
    fun readPostAll(): String {
        TODO("Not yet implemented")
    }
}