package com.quyangyu.kotlinretrofitmvp2.network

import android.util.Log
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.quyangyu.kotlinretrofitmvp2.App
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

class RetrofitUtil {

    private var mRetrofit:Retrofit?=null

    private val cacheDictionary:File=App().getInstance()!!.cacheDir
    private val cacheFile=File(cacheDictionary,"cachetest")
    private val cacheSize:Long=10*1024*1024
    private val  mHttpLoggingInterceptor=HttpLoggingInterceptor(HttpLoggingInterceptor.Logger{
        message -> Log.d("RetrofitUtil", "message:$message")
    })
    private val mOkHttpClient = OkHttpClient.Builder().addInterceptor(mHttpLoggingInterceptor)
            .connectTimeout(8*1000,TimeUnit.SECONDS)
            .cache(Cache(cacheFile,cacheSize))
            .build()!!

    fun  getRetorfit(): Retrofit?{
       if(mRetrofit==null){
           synchronized(RetrofitUtil::class.java){
               if(mRetrofit==null){
                   //用了自定义的拦截就不能打印日志
                   mHttpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
                   mRetrofit=Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                           .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                           .client(mOkHttpClient)
                           .baseUrl(baseUrl)
                           .build()
               }
           }
       }
       return mRetrofit
    }

    companion object {
        val baseUrl:String="http://192.168.1.102:8080/"
    }
}