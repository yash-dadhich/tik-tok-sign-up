package com.uigitdev.tiktoksignup.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.uigitdev.tiktoksignup.R
import kotlinx.android.synthetic.main.ui_sign_up.view.*

class SignUp(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs) {

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.ui_sign_up, this, true)
        designInit()
    }

    private fun designInit() {
        setButtonSetting()
    }

    private fun setButtonSetting() {
        sign_up_phone_email.setButtonTitle("Use phone or email")
        sign_up_phone_email.setButtonIcon(R.drawable.ic_baseline_person_24)

        sign_up_facebook.setButtonTitle("Continue with Facebook")
        sign_up_facebook.setButtonIcon(R.drawable.ic_facebook)

        sign_up_google.setButtonTitle("Continue with Google")
        sign_up_google.setButtonIcon(R.drawable.ic_google)

        sign_up_twitter.setButtonTitle("Continue with Twitter")
        sign_up_twitter.setButtonIcon(R.drawable.ic_twitter)
    }

    fun getPhoneEmailButton(): RelativeLayout{
        return sign_up_phone_email.getButton()
    }

    fun getFacebookButton(): RelativeLayout{
        return sign_up_facebook.getButton()
    }

    fun getGoogleButton(): RelativeLayout{
        return sign_up_google.getButton()
    }

    fun getTwitterButton(): RelativeLayout{
        return sign_up_twitter.getButton()
    }

    fun getCloseButton(): ImageView{
        return item_close
    }

    fun getInfoButton(): ImageView{
        return item_info
    }

    fun getLogInButton(): LinearLayout{
        return item_log_in
    }
}