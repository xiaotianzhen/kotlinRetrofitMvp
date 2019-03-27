package com.quyangyu.kotlinretrofitmvp2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.quyangyu.kotlinretrofitmvp2.entity.Gank
import com.quyangyu.kotlinretrofitmvp2.mvp.ganks.GanksContract
import com.quyangyu.kotlinretrofitmvp2.mvp.ganks.GanksPresenter


class MainActivity : AppCompatActivity(), GanksContract.View {


    var mPresenter: GanksContract.Presenter? = null

    override fun showGanks(ganks: List<Gank>) {
    }

    override fun showTip(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun setPresenter(presenter: GanksContract.Presenter) {
        mPresenter = checkNotNull(presenter)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter = GanksPresenter(this)
        mPresenter?.start()
        //test()
    }
}
