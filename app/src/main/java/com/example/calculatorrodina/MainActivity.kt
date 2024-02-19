package com.example.calculatorrodina


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculatorrodina.ui.theme.CalculatorRodinaTheme
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private lateinit var inputTextView: TextView
    private lateinit var clearButton: Button
    private lateinit var plusOrMinusButton: Button
    private lateinit var percentButton: Button
    private lateinit var divideButton: Button
    private lateinit var sevenButton: Button
    private lateinit var eightButton: Button
    private lateinit var nineButton: Button
    private lateinit var multiplyButton: Button
    private lateinit var fourButton: Button
    private lateinit var fiveButton: Button
    private lateinit var sixButton: Button
    private lateinit var minusButton: Button
    private lateinit var oneButton: Button
    private lateinit var twoButton: Button
    private lateinit var threeButton: Button
    private lateinit var plusButton: Button
    private lateinit var zeroButton: Button
    private lateinit var pointButton: Button
    private lateinit var equalsButton: Button

    private val calculatorViewModel: CalculatorViewModel by lazy {
        ViewModelProviders.of(this).get(CalculatorViewModel::class.java)
    }

    fun initElements() {
        inputTextView = findViewById(R.id.input_num_tv)
        clearButton = findViewById(R.id.clear_btn)
        plusOrMinusButton = findViewById(R.id.plus_minus_btn)
        percentButton = findViewById(R.id.percent_btn)
        divideButton = findViewById(R.id.divide_btn)
        sevenButton = findViewById(R.id.seven_btn)
        eightButton = findViewById(R.id.eight_btn)
        nineButton = findViewById(R.id.nine_btn)
        multiplyButton = findViewById(R.id.multiply_btn)
        fourButton = findViewById(R.id.four_btn)
        fiveButton = findViewById(R.id.five_btn)
        sixButton = findViewById(R.id.six_btn)
        minusButton = findViewById(R.id.minus_btn)
        oneButton = findViewById(R.id.one_btn)
        twoButton = findViewById(R.id.two_btn)
        threeButton = findViewById(R.id.three_btn)
        plusButton = findViewById(R.id.plus_btn)
        zeroButton = findViewById(R.id.zero_btn)
        pointButton = findViewById(R.id.point_btn)
        equalsButton = findViewById(R.id.equals_btn)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initElements()

        clearButton.setOnClickListener {
            inputTextView.setText("0")
        }
        plusOrMinusButton.setOnClickListener {

        }
        percentButton.setOnClickListener {

        }
        divideButton.setOnClickListener {

        }
        sevenButton.setOnClickListener {
            inputTextView.setText("7")
        }
        eightButton.setOnClickListener {
            inputTextView.setText("8")
        }
        nineButton.setOnClickListener {
            inputTextView.setText("9")
        }
        multiplyButton.setOnClickListener {

        }
        fourButton.setOnClickListener {
            inputTextView.setText("4")
        }
        fiveButton.setOnClickListener {
            inputTextView.setText("5")
        }
        sixButton.setOnClickListener {
            inputTextView.setText("6")
        }
        minusButton.setOnClickListener {

        }
        oneButton.setOnClickListener {
            inputTextView.setText("1")
        }
        twoButton.setOnClickListener {
            inputTextView.setText("2")
        }
        threeButton.setOnClickListener {
            inputTextView.setText("3")
        }
        plusButton.setOnClickListener {

        }
        zeroButton.setOnClickListener {
            inputTextView.setText("0")
        }
        pointButton.setOnClickListener {

        }
        equalsButton.setOnClickListener {

        }
    }
}