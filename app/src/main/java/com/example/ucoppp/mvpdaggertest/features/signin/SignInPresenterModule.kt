package com.example.ucoppp.mvpdaggertest.features.signin

import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Module
class SignInPresenterModule(val iSignInView: ISignInView) {

    @Inject
    lateinit var synchronousLoginInteractor: SynchronousLoginInteractor

    @Provides
    @Singleton
    fun provideSigninPresentor(): SignInPresenter = SignInPresenter(iSignInView, synchronousLoginInteractor)
}