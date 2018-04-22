package com.example.ucoppp.mvpdaggertest.features.signin

import com.example.ucoppp.mvpdaggertest.utils.validateString

class SignInPresenter(val view: ISignInView, private val synchronousLoginInteractor: SynchronousLoginInteractor) {

    fun loginUser(username: String, password: String) {

        if (validateString(data = username) && validateString(data = password)) {
            view.navigateToLanding()
            print(synchronousLoginInteractor.validateUser())
        }

        view.signInFail()
    }
}