package com.example.springbootboardmanager.service

import com.example.springbootboardmanager.dto.BoardDTO
import org.springframework.stereotype.Service

@Service
class BoardManageServiceImpl:BoardManageService {
    override fun createBoard(boardDTO: BoardDTO): String {
        TODO("Not yet implemented")
    }

    override fun updateBoard(boardDTO: BoardDTO): String {
        TODO("Not yet implemented")
    }

    override fun deleteBoard(boardDTO: BoardDTO): String {
        TODO("Not yet implemented")
    }

    override fun readBoardByAuth(author: String): String {
        TODO("Not yet implemented")
    }

    override fun readBoardAll(): String {
        TODO("Not yet implemented")
    }
}