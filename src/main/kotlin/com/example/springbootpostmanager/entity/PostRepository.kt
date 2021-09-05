package com.example.springbootpostmanager.entity

import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository:JpaRepository<Post,Long> {
}