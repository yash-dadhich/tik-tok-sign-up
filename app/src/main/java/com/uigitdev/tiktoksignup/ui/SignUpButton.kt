package com.uigitdev.tiktoksignup.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.uigitdev.tiktoksignup.R
import kotlinx.android.synthetic.main.ui_sign_up_button.view.*

class SignUpButton(context: Context, attributeSet: AttributeSet) :
    RelativeLayout(context, attributeSet) {

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.ui_sign_up_button, this, true)
    }

    fun setButtonTitle(title: String) {
        item_button_title.text = title
    }

    fun setButtonIcon(icon: Int) {
        item_button_icon.setImageResource(icon)
    }

    fun getButton(): RelativeLayout {
        return item_button_click_parent
    }
}