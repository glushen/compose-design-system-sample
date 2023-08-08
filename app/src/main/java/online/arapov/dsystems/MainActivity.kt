package online.arapov.dsystems

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import online.arapov.dsystems.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var screen: AppScreen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerAppComponent.create()
            .inject(this)
        setContent {
            screen()
        }
    }
}
