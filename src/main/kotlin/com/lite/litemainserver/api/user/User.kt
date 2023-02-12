package com.lite.litemainserver.api.user

import jakarta.persistence.*

@Entity
@Table(name="user", schema = "public")
class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var name: String? =null
}