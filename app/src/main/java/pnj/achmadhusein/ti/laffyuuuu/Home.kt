package pnj.achmadhusein.ti.laffyuuuu

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        (HomeFragment())

        bottomNav = findViewById(R.id.bottomNav)

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.explore -> {
                    val intent = Intent(this, ExploreActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.cart -> {
                    val intent = Intent(this, CartActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.offer -> {
                    val intent = Intent(this, OfferActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.account -> {
                    val intent = Intent(this, AccountActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
        }
    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
    }
