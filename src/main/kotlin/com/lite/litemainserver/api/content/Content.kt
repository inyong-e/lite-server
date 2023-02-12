package com.lite.litemainserver.api.content

import jakarta.persistence.*

@Entity
@Table(name="content", schema = "public")
class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var title: String? = null
    var description: String? = null

    @Column(name = "author_id")
    var authorID: Int? = null
}

class Data {
    var text: String? = null
    var level: Int? = null
}

class ContentBlock {
    var type: String? = null
    var data: Data? = null

}

