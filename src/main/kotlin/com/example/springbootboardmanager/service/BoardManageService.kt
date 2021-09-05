package com.example.springbootboardmanager.service

import com.example.springbootboardmanager.dto.BoardDTO
import org.springframework.stereotype.Service

@Service
interface BoardManageService {
    fun createBoard(boardDTO: BoardDTO):String
    fun updateBoard(boardDTO: BoardDTO):String
    fun deleteBoard(boardDTO: BoardDTO):String
    fun readBoardByAuth(author: String):String
    fun readBoardAll():String
}