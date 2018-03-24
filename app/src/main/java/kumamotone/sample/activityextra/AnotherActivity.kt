package kumamotone.sample.activityextra

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kumamotone.sample.activityextra.databinding.ActivityAnotherBinding

class AnotherActivity : AppCompatActivity() {
//        val userId: Int = intent.getIntExtra(AnotherActivity::userId.name, -1)  // ぬるぽで死ぬ
//        val userId: Int get() = intent.getIntExtra(AnotherActivity::userId.name, -1)  // -1
//        val userId: Int get() = intent.extras.getInt(AnotherActivity::userId.name)  // 1
//        val userId: Int get() = intent.extras.get(AnotherActivity::userId.name) as Int
    val userId: Int by extra()    // うまくいく (1)
//    var userId: Int = -1

    private lateinit var user: User

    companion object {
        fun createIntent(context: Context, userId: Int): Intent {
            return Intent(context, AnotherActivity::class.java).putExtra("userId", userId)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        userId = intent.extras.getInt("userId")
        user = User(Integer.toString(userId))

        val binding = DataBindingUtil.setContentView<ActivityAnotherBinding>(this, R.layout.activity_another)
        binding.user = user

    }
}