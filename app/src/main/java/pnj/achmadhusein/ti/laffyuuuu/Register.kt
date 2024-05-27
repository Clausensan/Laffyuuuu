package pnj.achmadhusein.ti.laffyuuuu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Register : AppCompatActivity() {

    lateinit var signup : Button
    lateinit var signin : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        signup = findViewById(R.id.signup)
        signin = findViewById(R.id.signin)

        signup.setOnClickListener(){
            val intentDestination = Intent (this@Register, Login::class.java)
            startActivity(intentDestination)
        }

        signin.setOnClickListener(){
            val intentDestination = Intent (this@Register, Login::class.java)
            startActivity(intentDestination)

        }
    }
}