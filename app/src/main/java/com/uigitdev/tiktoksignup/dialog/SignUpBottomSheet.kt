package com.uigitdev.tiktoksignup.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.uigitdev.tiktoksignup.R
import kotlinx.android.synthetic.main.bottom_sheet_sign_up.*
import kotlinx.android.synthetic.main.bottom_sheet_sign_up.view.*
import kotlinx.android.synthetic.main.ui_sign_up.view.*

class SignUpBottomSheet: BottomSheetDialogFragment(){

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return BottomSheetDialog(requireContext(), theme).apply {
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
            behavior.peekHeight = ViewGroup.LayoutParams.MATCH_PARENT
            behavior.isDraggable = false
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.bottom_sheet_sign_up, container, false)
        apply(view)
        return view
    }

    private fun apply(view: View){
        view.sign_up.getCloseButton().setOnClickListener {
            dismiss()
        }

        view.sign_up.getInfoButton().setOnClickListener {
            Toast.makeText(context, "Information", Toast.LENGTH_SHORT).show()
        }
        signUpButtons(view)
    }

    private fun signUpButtons(view: View){
        view.sign_up.getPhoneEmailButton().setOnClickListener {
            Toast.makeText(context, "Use phone or email", Toast.LENGTH_SHORT).show()
        }

        view.sign_up.getFacebookButton().setOnClickListener {
            Toast.makeText(context, "Continue with Facebook", Toast.LENGTH_SHORT).show()
        }

        view.sign_up.getGoogleButton().setOnClickListener {
            Toast.makeText(context, "Continue with Google", Toast.LENGTH_SHORT).show()
        }

        view.sign_up.getTwitterButton().setOnClickListener {
            Toast.makeText(context, "Continue with Twitter", Toast.LENGTH_SHORT).show()
        }

        view.sign_up.getLogInButton().setOnClickListener {
            Toast.makeText(context, "Log in", Toast.LENGTH_SHORT).show()
        }
    }
}