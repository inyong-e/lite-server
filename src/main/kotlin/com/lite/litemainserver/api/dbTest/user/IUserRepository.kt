package com.lite.litemainserver.api.dbTest.user

interface IUserRepository {
    fun findAll() : List<User>
}