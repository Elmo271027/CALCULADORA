package com.example.prueba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var edtNumero1 : EditText
    lateinit var edtNumero2 : EditText
    lateinit var btnsumar : Button
    lateinit var btnrestar : Button
    lateinit var btnmulti : Button
    lateinit var btndiv : Button
    lateinit var txtResultado : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumero1 = findViewById(R.id.n1)
        edtNumero2 = findViewById(R.id.n2)
        btnsumar = findViewById(R.id.sumar)
        btnrestar = findViewById(R.id.restar)
        btnmulti = findViewById(R.id.multi)
        btndiv = findViewById(R.id.div)
        txtResultado = findViewById(R.id.resultado)

        btnsumar.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())

            txtResultado.setText("Resultado: " + sumar(num1, num2))
        })

        btnrestar.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())

            txtResultado.setText("Resultado: " + restar(num1, num2))
        })

        btnmulti.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())

            txtResultado.setText("Resultado: " + multi(num1, num2))
        })

        btndiv.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())

            txtResultado.setText("Resultado: " + div(num1, num2))
        })


    }

    fun sumar(n1: Int, n2: Int) : Int {
        return n1 + n2
    }
    fun restar(n1: Int, n2: Int) : Int {
        return n1 - n2
    }
    fun multi(n1: Int, n2: Int) : Int {
        return n1 * n2
    }
    fun div(n1: Int, n2: Int) : Any {
        if (n2 == 0){
            return "infinito"
        }
        return if (n1 > n2){
            n1 / n2
        } else {
            String.format("%.2f", n1.toDouble() / n2.toDouble())
        }

    }

}