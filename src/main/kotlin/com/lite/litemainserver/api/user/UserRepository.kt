package com.lite.litemainserver.api.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class UserRepository(@Autowired private var userJapRepository: IUserJpaRepository) {

    fun getUser(): List<User>{
        return userJapRepository.findAll()
    }
}