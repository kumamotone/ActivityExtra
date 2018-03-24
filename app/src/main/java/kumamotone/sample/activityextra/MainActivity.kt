package kumamotone.sample.activityextra

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = AnotherActivity.createIntent(this, 1)
        startActivity(intent)
    }
}
