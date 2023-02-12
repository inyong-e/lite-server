package com.lite.litemainserver.api

import com.lite.litemainserver.api.content.ContentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class ApiController(
    @Autowired
    val contentRepository: ContentRepository
) {
    @GetMapping("/content")
    fun getContent() = contentRepository.getContent()
}