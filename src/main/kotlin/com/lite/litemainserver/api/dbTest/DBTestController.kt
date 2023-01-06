package com.lite.litemainserver.api.dbTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class DBTestController(
    @Autowired
    val dbTestRepository: DBTestRepository
) {
    @GetMapping("/user")
    fun getUser() = dbTestRepository.search_user()

}