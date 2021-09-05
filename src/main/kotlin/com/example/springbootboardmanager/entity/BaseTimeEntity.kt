package com.example.springbootboardmanager.entity

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseTimeEntity (
    @CreatedDate
    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    open var createdDate: LocalDateTime?=null,

    @LastModifiedDate
    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    open var modifiedDate: LocalDateTime?=null
)