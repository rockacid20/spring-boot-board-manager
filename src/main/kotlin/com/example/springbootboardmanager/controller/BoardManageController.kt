package com.example.springbootboardmanager.controller

import com.example.springbootboardmanager.dto.BoardDTO
import org.springframework.web.bind.annotation.*

@RestController
class BoardManageController {


    @PostMapping("/Board")
    fun createBoard(@RequestBody boardDTO: BoardDTO): String {
        TODO("Not yet implemented")
    }

    @PutMapping("/Board/{title}")
    fun updateBoard(@RequestBody boardDTO: BoardDTO): String {
        TODO("Not yet implemented")
    }

    @DeleteMapping("/Board/{title}")
    fun deleteBoard(@RequestBody boardDTO: BoardDTO): String {
        TODO("Not yet implemented")
    }

    @GetMapping("/Board/{title}")
    fun readBoardByAuth(@RequestBody author: String): String {
        TODO("Not yet implemented")
    }

    @GetMapping("/Board")
    fun readBoardAll(): String {
        TODO("Not yet implemented")
    }
}