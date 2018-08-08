package id.renaldirey.mvpkotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import id.renaldirey.mvpkotlin.presenter.LearnPresenter
import id.renaldirey.mvpkotlin.view.DataView

class MainActivity : AppCompatActivity(), DataView {
    var learnPresenter: LearnPresenter = LearnPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadPresenter()
    }

    fun loadPresenter() {
        learnPresenter.attachView(this)

        if(learnPresenter.isViewAttached){
            learnPresenter.displayText()
        }
    }

    override fun showData(data: String) {
        Log.e(MainActivity::class.java.simpleName+".success", data)
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show()
    }

    override val context: Context
        get() = applicationContext

    override fun isError(message: String) {
        Log.e(MainActivity::class.java.simpleName+".error", message)
    }
}
