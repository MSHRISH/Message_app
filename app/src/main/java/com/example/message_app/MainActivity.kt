package com.example.message_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val phnNumber=findViewById<EditText>(R.id.phn_num)
        val msg=findViewById<EditText>(R.id.msg)
        val btnSend=findViewById<Button>(R.id.send)

        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.SEND_SMS),10)

        btnSend.setOnClickListener {
            val number=phnNumber.text.toString()
            val Msg=msg.text.toString()
            val smsmanager:SmsManager
            smsmanager=SmsManager.getDefault()
            smsmanager.sendTextMessage(number,null,Msg,null,null)

        }



    }
}