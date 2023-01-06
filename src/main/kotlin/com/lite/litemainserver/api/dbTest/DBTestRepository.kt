package com.lite.litemainserver.api.dbTest

import com.lite.litemainserver.api.dbTest.user.IUserJpaRepository
import com.lite.litemainserver.api.dbTest.user.User
import jakarta.persistence.EntityManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service


@Repository
class DBTestRepository(@Autowired private var userJpaRepository: IUserJpaRepository) {

    fun search_user():List<User>{
        return userJpaRepository.findAll()
    }
}
