package com.uigitdev.tiktoksignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uigitdev.tiktoksignup.dialog.SignUpBottomSheet
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        open_sign_up.setOnClickListener {
            val signUpBottomSheet = SignUpBottomSheet()
            signUpBottomSheet.show(supportFragmentManager, "signUpBottomSheet")
        }
    }
}