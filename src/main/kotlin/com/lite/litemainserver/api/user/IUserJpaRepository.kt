package com.lite.litemainserver.api.user

import org.springframework.data.jpa.repository.JpaRepository

interface IUserJpaRepository: JpaRepository<User, Long> {
}