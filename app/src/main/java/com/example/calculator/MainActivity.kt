package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    fun sum(a:Int,b:Int):Int = a+b
    fun sub(a:Int,b:Int):Int{
        Toast.makeText(this,"$a and $b",Toast.LENGTH_SHORT).show()
        return a-b

    }
    fun div(a:Float,b:Float):Float{
        if(b!=0f)
            return a/b
        else
            return 0f
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sum.setOnClickListener {
            Toast.makeText(this,""+sum(editText.text.toString().toInt(),editText2.text.toString().toInt()),
                Toast.LENGTH_SHORT).show()
        }
        sub.setOnClickListener {
            sub(editText.text.toString().toInt(),editText2.text.toString().toInt())
            Toast.makeText(this,""+sub(editText.text.toString().toInt(),editText2.text.toString().toInt()),
                Toast.LENGTH_LONG).show()

        }
        div.setOnClickListener {
            Toast.makeText(this,""+div(editText.text.toString().toFloat(),editText2.text.toString().toFloat()),
                Toast.LENGTH_SHORT).show()
        }
    }
}
