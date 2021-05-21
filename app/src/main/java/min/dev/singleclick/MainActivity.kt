package min.dev.singleclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import min.dev.singleclick.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.txtTest.setOnSingleClickListener(600) {
            //do Something
        }

        binding.txtTest2.setOnSingleClickListener(2000) {
            //do Something
        }
    }
}