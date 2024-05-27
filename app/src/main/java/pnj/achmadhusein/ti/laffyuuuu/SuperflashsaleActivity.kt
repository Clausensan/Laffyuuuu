package pnj.achmadhusein.ti.laffyuuuu

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SuperflashsaleActivity : AppCompatActivity() {

    lateinit var back: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_superflashsale)

        back = findViewById(R.id.back)

        back.setOnClickListener() {
            val intentDestination = Intent (this@SuperflashsaleActivity, HomeFragment::class.java)
            startActivity(intentDestination)
        }
    }
}