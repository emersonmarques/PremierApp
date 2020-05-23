package com.example.premierapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 : EditText = findViewById(R.id.num1)
        val num2 : EditText = findViewById(R.id.num2)
        val sumBt : Button = findViewById(R.id.sumButton)
        val minusBt : Button = findViewById(R.id.minusButton)
        val multBt : Button = findViewById(R.id.multButton)
        val divBt : Button = findViewById(R.id.divButton)

        var total: Double? = 0.0


        sumBt.setOnClickListener{_ ->

            val n1 = num1.text.toString().toDouble()
            val n2 = num2.text.toString().toDouble()

            total = n1+n2

            val toast = Toast.makeText(applicationContext, "TOTAL: $total" , Toast.LENGTH_SHORT)
                toast.show()
        }

        minusBt.setOnClickListener{_->

            val n1 = num1.text.toString().toDouble()
            val n2 = num2.text.toString().toDouble()

            total = n1 - n2

            Toast.makeText(applicationContext, "RESULTADO: $total", Toast.LENGTH_SHORT).show()
        }

        multBt.setOnClickListener { _->

            val n1 = num1.text.toString().toDouble()
            val n2 = num2.text.toString().toDouble()

            total = n1*n2

            Toast.makeText(applicationContext, "RESULTADO: $total", Toast.LENGTH_SHORT).show()
        }

        divBt.setOnClickListener { _->

            val n1 = num1.text.toString().toDouble()
            val n2 = num2.text.toString().toDouble()

            if (num2.text.toString().toInt()!=0){

                total = n1 / n2

                Toast.makeText(applicationContext, "RESULTADO: $total", Toast.LENGTH_SHORT).show()

            }else{

                Toast.makeText(applicationContext, "NÃO É POSSÍVEL DIVIDIR POR 0", Toast.LENGTH_SHORT).show()

            }
        }

    }
}
