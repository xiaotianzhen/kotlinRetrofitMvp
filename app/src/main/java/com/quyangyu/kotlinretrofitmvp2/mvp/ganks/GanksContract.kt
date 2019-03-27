package com.quyangyu.kotlinretrofitmvp2.mvp.ganks

import com.quyangyu.kotlinretrofitmvp2.entity.Gank
import com.quyangyu.kotlinretrofitmvp2.mvp.base.BasePresenter
import com.quyangyu.kotlinretrofitmvp2.mvp.base.BaseView

interface GanksContract {


    interface View :BaseView<Presenter>{
        fun showGanks(ganks: List<Gank>)
        fun showTip(message:String)
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter :BasePresenter{
        fun loadGanks()
    }


}