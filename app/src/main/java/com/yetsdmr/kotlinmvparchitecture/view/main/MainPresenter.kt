package com.yetsdmr.kotlinmvparchitecture.view.main

import com.yetsdmr.kotlinmvparchitecture.model.User


class MainPresenter (private val view: MainView.View): MainView.Presenter {

    override fun doLogin(user: User) {
        //username: yetsdmr
        //password: Pass123
        if (user.username == "yetsdmr" && user.password == "Pass123"){
            view.onSuccess("Successful!")
        }else {
            view.onError("Wrong username or password!")
        }
    }
}