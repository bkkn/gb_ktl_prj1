package me.bkkn.gb_ktl_prj1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    data class DummyData(val value1: String, val value2: Double)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button)
            .setOnClickListener {
                for (i in 1..2) {
                    repeat(2) {
                        val data = Repo.getCopy();
                        Toast.makeText(
                            this,
                            "value of is " + data.value1 + " " + data.value2,
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
    }


    object Repo {
        private val dummyData: DummyData = DummyData("pi", 3.14)

        fun getCopy(): DummyData {
            return dummyData.copy(value2 = 3.1415)
        }
    }
}