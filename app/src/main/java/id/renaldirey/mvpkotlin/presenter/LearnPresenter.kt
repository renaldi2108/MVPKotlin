package id.renaldirey.mvpkotlin.presenter

import id.renaldirey.mvpkotlin.view.DataView

class LearnPresenter: BasePresenter<DataView> {

    var dataView: DataView?= null

    override fun attachView(view: DataView) {
        this.dataView = view
    }

    override val isViewAttached: Boolean
        get() = this.dataView != null

    override fun detachView() {
        this.dataView = null
    }

    fun displayText() {
        var texts: String = "hellow"
        dataView!!.showData(texts)
    }
}