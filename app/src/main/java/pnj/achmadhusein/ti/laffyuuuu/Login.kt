package pnj.achmadhusein.ti.laffyuuuu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {

    lateinit var home: Button
    lateinit var register: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        home = findViewById(R.id.home)
        register = findViewById(R.id.register)

        home.setOnClickListener() {
            val intentDestination = Intent(this@Login, Home::class.java)
            startActivity(intentDestination)

            register.setOnClickListener() {
                val intentDestination = Intent(this@Login, Register::class.java)
                startActivity(intentDestination)

            }

        }
    }
}

