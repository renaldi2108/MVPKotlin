package id.renaldirey.mvpkotlin.presenter

import id.renaldirey.mvpkotlin.view.BaseView

interface BasePresenter<V : BaseView> {
    val isViewAttached:Boolean
    fun attachView(view:V)
    fun detachView()
}