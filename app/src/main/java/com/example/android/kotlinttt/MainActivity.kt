package com.example.android.kotlinttt

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.example.android.kotlinttt.data.TicTacToeModel
import com.example.android.kotlinttt.view.TicTacToeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ticTacToeView = findViewById(R.id.ticTacToeView) as TicTacToeView

        (findViewById(R.id.btnRestart) as Button).setOnClickListener {
            ticTacToeView.resetGame()
        }


    }

    private fun TicTacToeView.resetGame() {
        TicTacToeModel.resetModel()
        invalidate()
    }
}

