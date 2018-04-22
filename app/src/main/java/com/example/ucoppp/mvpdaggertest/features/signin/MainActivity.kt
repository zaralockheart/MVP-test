package com.example.ucoppp.mvpdaggertest.features.signin

import android.os.Bundle
import android.widget.Toast
import com.example.ucoppp.mvpdaggertest.BuildConfig
import com.example.ucoppp.mvpdaggertest.R
import com.example.ucoppp.mvpdaggertest.utils.BaseActivity
import com.example.ucoppp.mvpdaggertest.utils.toEditable
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), ISignInView {

    @Inject
    private lateinit var presenter: SignInPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (BuildConfig.DEBUG) {
            etUsername.text = "username".toEditable()
            etPassword.text = "somePassword".toEditable()
        }

//        presenter = SignInPresenter(this)



        btnSignin.setOnClickListener {
            presenter.loginUser(
                    etUsername.text.toString(),
                    etPassword.text.toString())
        }
    }

    override fun navigateToLanding() {
        Toast.makeText(this, "Sign In!!", Toast.LENGTH_LONG).show()
    }

    override fun signInFail() {
        Toast.makeText(this, "Sign in Fail!!", Toast.LENGTH_LONG).show()
    }
}
