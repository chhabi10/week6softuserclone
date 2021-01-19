package com.chhabi.week6assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tvsoft: TextView
    private lateinit var etusername:EditText
    private lateinit var etpassword:EditText
    private lateinit var btnlogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvsoft= findViewById(R.id.tvsoft)
        etusername=findViewById(R.id.etUsername)
        etpassword=findViewById(R.id.etpassword)
        btnlogin=findViewById(R.id.btnlogin)

        btnlogin.setOnClickListener(this)
    }
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btnlogin -> {
                if (checkEmpty()){
                    if (etusername.text.toString() == "softwarica" && etpassword.text.toString() == "coventry") {
                        val intent=  Intent(this,dashboardActivity::class.java)
                        startActivity(intent))
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Incorrect username or password.", Toast.LENGTH_SHORT).show()
                    }
                }
                else
                    return

            }
        }
    }




    private fun checkEmpty(): Boolean {
        var flag=true
        when{
            TextUtils.isEmpty(etusername.text)->{
                etusername.error="Enter  username"
                etusername.requestFocus()
                flag=false
            }
            TextUtils.isEmpty(etpassword.text)->{
                etpassword.error="Enter  password"
                etpassword.requestFocus()
                flag=false
            }
        }
        return flag
    }


}






