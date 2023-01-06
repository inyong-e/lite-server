package com.lite.litemainserver.api.dbTest.user

import org.springframework.data.jpa.repository.JpaRepository

interface IUserJpaRepository: JpaRepository<User, Long> {
}