package co.csadev.gradleplaypublisher.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.net.Uri
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (findViewById<View>(R.id.version) as TextView).text = BuildConfig.VERSION_NAME
    }

    fun openProject(v: View?) {
        startActivity(
                Intent(Intent.ACTION_VIEW)
                        .setData(Uri.parse("https://github.com/Triple-T/gradle-play-publisher"))
        )
    }
}
