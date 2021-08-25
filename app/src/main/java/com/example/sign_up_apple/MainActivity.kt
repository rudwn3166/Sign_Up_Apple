package com.example.sign_up_apple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okBtn.setOnClickListener {

            val Id=adminId.text.toString()
            val Pw=adminPw.text.toString()
            if (Id=="admin@test.com"&& Pw=="qwer"){
                var name="오경주"
                Toast.makeText(this, "${name} 관리자입니다", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }

        }
    }
}