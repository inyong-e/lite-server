package com.lite.litemainserver.api.content

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class ContentRepository(@Autowired private var contentJpaRepository: IContentJpaRepository) {

    fun getContent():List<Content>{
        return contentJpaRepository.findAll()
    }
}