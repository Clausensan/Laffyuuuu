package pnj.achmadhusein.ti.laffyuuuu

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoveActivity : AppCompatActivity() {

    lateinit var backhome: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_love)
        backhome = findViewById(R.id.backhome)

        backhome.setOnClickListener() {
            val intentDestination = Intent (this@LoveActivity, HomeFragment::class.java)
            startActivity(intentDestination)
        }
        }
    }
