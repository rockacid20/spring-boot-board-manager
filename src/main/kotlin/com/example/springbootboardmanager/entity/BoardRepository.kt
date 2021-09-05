package com.example.springbootboardmanager.entity

import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository:JpaRepository<Board,Long> {
}