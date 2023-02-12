package com.lite.litemainserver.api.content

import org.springframework.data.jpa.repository.JpaRepository

interface IContentJpaRepository: JpaRepository<Content, Long> {
}