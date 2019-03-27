package com.quyangyu.kotlinretrofitmvp2.mvp.ganks

import android.util.Log
import com.quyangyu.kotlinretrofitmvp2.api_service.LoginService
import com.quyangyu.kotlinretrofitmvp2.entity.Gank
import com.quyangyu.kotlinretrofitmvp2.entity.ModelLogin
import com.quyangyu.kotlinretrofitmvp2.network.RetrofitUtil
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit

class GanksPresenter : GanksContract.Presenter {

    var mGanksView: GanksContract.View? = null


    constructor(ganksView: GanksContract.View) {
        mGanksView = checkNotNull(ganksView)
        mGanksView!!.setPresenter(this)
    }


    override fun start() {
        loadGanks()
    }

    override fun loadGanks() {
        mGanksView!!.showLoading()
        val retrofit: Retrofit? = RetrofitUtil().getRetorfit()
        val service: LoginService = retrofit!!.create(LoginService::class.java)
        service.login()
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object :Observer<ModelLogin>{
                    override fun onComplete() {

                    }

                    override fun onSubscribe(d: Disposable?) {

                    }


                    override fun onNext(model: ModelLogin?) {
                        Log.i("yicooll","success")
                        mGanksView!!.showTip(model!!.data.email)
                    }

                    override fun onError(e: Throwable?) {
                       mGanksView!!.showTip("网络异常")
                    }

                })
    }


    fun processGanks(ganks: List<Gank>) {
        mGanksView!!.showGanks(ganks)
    }
}