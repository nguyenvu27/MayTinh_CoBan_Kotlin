package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCong.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var soThu1 : Int = edt1.text.toString().toInt()
                var soThu2 : Int = edt2.text.toString().toInt()

                var  Tong : Int = soThu1 + soThu2
                tvKQ.text = Tong.toString()

            }

        })

        btnTru.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var soThu1 : Int = edt1.text.toString().toInt()
                var soThu2 : Int = edt2.text.toString().toInt()

                var  Tong : Int = soThu1 - soThu2
                tvKQ.text = Tong.toString()

            }

        })

        btnNhan.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var soThu1 : Int = edt1.text.toString().toInt()
                var soThu2 : Int = edt2.text.toString().toInt()

                var  Tong : Int = soThu1 * soThu2
                tvKQ.text = Tong.toString()

            }

        })

        btnChia.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var soThu1 : Int = edt1.text.toString().toInt()
                var soThu2 : Int = edt2.text.toString().toInt()

                var  Tong : Int = soThu1 / soThu2
                tvKQ.text = Tong.toString()

            }

        })
    }
}
