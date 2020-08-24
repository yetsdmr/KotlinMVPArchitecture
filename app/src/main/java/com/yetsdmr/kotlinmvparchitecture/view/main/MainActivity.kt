package com.yetsdmr.kotlinmvparchitecture.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.Toast
import com.yetsdmr.kotlinmvparchitecture.R
import com.yetsdmr.kotlinmvparchitecture.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView.View {


    lateinit var presenter : MainView.Presenter
    lateinit var user : User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)

        login.setOnClickListener{



            user = User(username.text.toString(),pasword.text.toString())
            if (TextUtils.isEmpty(user!!.username) || TextUtils.isEmpty(user!!.password)){
                onError("Field(s) Required!")
            }else {
                presenter?.doLogin(user!!)
            }
        }


    }

    override fun onSuccess(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }

    override fun onError(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}