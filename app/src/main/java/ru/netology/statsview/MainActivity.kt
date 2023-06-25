package ru.netology.statsview

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ru.netology.statsview.ui.StatsView


class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = findViewById<StatsView>(R.id.statsView)
        val repeatButton = findViewById<Button>(R.id.repeat)
        view.postDelayed(
            {
                view.data = listOf(
                    500F,
                    500F,
                    500F,
                    500F,
                )
            }, 500
        )
        repeatButton.setOnClickListener {
            view.update()
        }
    }

}