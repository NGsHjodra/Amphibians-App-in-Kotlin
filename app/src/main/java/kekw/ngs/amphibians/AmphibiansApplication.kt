package kekw.ngs.amphibians

import android.app.Application
import kekw.ngs.amphibians.data.AppContainer
import kekw.ngs.amphibians.data.DefaultAppContainer

class AmphibiansApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}