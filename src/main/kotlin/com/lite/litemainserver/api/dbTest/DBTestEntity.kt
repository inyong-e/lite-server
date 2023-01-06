package com.lite.litemainserver.api.dbTest

import org.springframework.boot.ApplicationArguments

interface DBTestEntity {
    fun foo(): String;
    fun run(args: ApplicationArguments?): Unit;
}
