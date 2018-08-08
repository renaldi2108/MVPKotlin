package id.renaldirey.mvpkotlin.view

import android.content.Context

interface BaseView {
    val context:Context
    fun isError(message:String)
}