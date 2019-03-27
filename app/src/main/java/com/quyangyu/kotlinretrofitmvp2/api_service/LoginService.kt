package com.quyangyu.kotlinretrofitmvp2.api_service

import com.quyangyu.kotlinretrofitmvp2.entity.ModelLogin
import io.reactivex.Observable
import retrofit2.http.GET

interface LoginService {

    @GET("mmall/user/login.do?username=yicooll&password=111111")
     fun login():Observable<ModelLogin>
}