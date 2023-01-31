package com.haruta.harutyan.janken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haruta.harutyan.janken.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        var winNumber: Int = 0
        var loseNumber: Int = 0
        var drawNumber: Int = 0

        binding.gooButton.setOnClickListener {
            binding.playerImage.setImageResource(R.drawable.goo)

            var number: Int = Random.nextInt(3)

            when (number) {
                0 -> {
                    binding.cpuImage.setImageResource(R.drawable.goo)
                    binding.resultText.text = "引き分けです"
                    binding.resultText.setTextColor(Color.GRAY)
                    drawNumber += 1
                }
                1 -> {
                    binding.cpuImage.setImageResource(R.drawable.choki)
                    binding.resultText.text = "あなたの勝ちです"
                    binding.resultText.setTextColor(Color.RED)
                    winNumber += 1
                }
                2 -> {
                    binding.cpuImage.setImageResource(R.drawable.paa)
                    binding.resultText.text = "あなたの負けです"
                    binding.resultText.setTextColor(Color.BLUE)
                    loseNumber += 1
                }
            }

            binding.winRateText.text = winNumber.toString() + "勝" + loseNumber.toString() + "負" + drawNumber.toString() + "分"

        }

        binding.chokiButton.setOnClickListener {
            binding.playerImage.setImageResource(R.drawable.choki)

            var number: Int = Random.nextInt(3)

            when (number) {
                0 -> {
                    binding.cpuImage.setImageResource(R.drawable.goo)
                    binding.resultText.text = "あなたの負けです"
                    binding.resultText.setTextColor(Color.BLUE)
                    loseNumber += 1
                }
                1 -> {
                    binding.cpuImage.setImageResource(R.drawable.choki)
                    binding.resultText.text = "引き分けです"
                    binding.resultText.setTextColor(Color.GRAY)
                    drawNumber += 1
                }
                2 -> {
                    binding.cpuImage.setImageResource(R.drawable.paa)
                    binding.resultText.text = "あなたの勝ちです"
                    binding.resultText.setTextColor(Color.RED)
                    winNumber += 1
                }
            }

            binding.winRateText.text = winNumber.toString() + "勝" + loseNumber.toString() + "負" + drawNumber.toString() + "分"
        }

        binding.paaButton.setOnClickListener {
            binding.playerImage.setImageResource(R.drawable.paa)

            var number: Int = Random.nextInt(3)

            when (number) {
                0 -> {
                    binding.cpuImage.setImageResource(R.drawable.goo)
                    binding.resultText.text = "あなたの勝ちです"
                    binding.resultText.setTextColor(Color.RED)
                    winNumber += 1
                }
                1 -> {
                    binding.cpuImage.setImageResource(R.drawable.choki)
                    binding.resultText.text = "あなたの負けです"
                    binding.resultText.setTextColor(Color.BLUE)
                    loseNumber += 1
                }
                2 -> {
                    binding.cpuImage.setImageResource(R.drawable.paa)
                    binding.resultText.text = "引き分けです"
                    binding.resultText.setTextColor(Color.GRAY)
                    drawNumber += 1
                }
            }

            binding.winRateText.text = winNumber.toString() + "勝" + loseNumber.toString() + "負" + drawNumber.toString() + "分"

        }

    }

}