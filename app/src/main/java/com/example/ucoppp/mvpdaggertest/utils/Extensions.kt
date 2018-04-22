package com.example.ucoppp.mvpdaggertest.utils

import android.text.Editable


fun String.toEditable () : Editable = Editable.Factory.getInstance().newEditable(this)