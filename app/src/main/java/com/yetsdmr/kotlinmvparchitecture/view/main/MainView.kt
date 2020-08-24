package com.yetsdmr.kotlinmvparchitecture.view.main

import com.yetsdmr.kotlinmvparchitecture.model.User

interface MainView {
    interface View{
        fun onSuccess(message : String)
        fun onError(message : String)
    }
    interface Presenter{
        fun doLogin(user : User)
    }
}