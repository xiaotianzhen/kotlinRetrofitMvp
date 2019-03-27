package com.quyangyu.kotlinretrofitmvp2

import android.app.Application


class App:Application() {

    override fun onCreate() {
        super.onCreate()
        instance=this
    }

    fun getInstance():Application?{
        return instance
    }

    companion object {
        var instance:App?=null
    }
}