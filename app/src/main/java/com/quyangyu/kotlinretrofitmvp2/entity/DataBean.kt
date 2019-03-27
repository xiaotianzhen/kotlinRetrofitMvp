package com.quyangyu.kotlinretrofitmvp2.entity

data class DataBean(var id: Int, var username: String, var password: String, var email: String, var phone: String,
                    var question: String, var answer: String, var role: Int, var createTime: Long, var updateTime: Long) {
}