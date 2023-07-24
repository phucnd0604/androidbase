package com.fatherofapps.androidbase.ui.dialog_rating

import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.fatherofapps.androidbase.R

class DialogRatingFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        getDialog()!!.getWindow()?.setBackgroundDrawableResource(R.drawable.round_corner);
        val dialog = inflater.inflate(R.layout.fragment_dialog_rating, container, false)

        val imgReact : ImageView = dialog.findViewById(R.id.img_reaction)
        val tvTitle : TextView = dialog.findViewById(R.id.tv_title)

        val btn1Star : ImageButton = dialog.findViewById(R.id.btn_1star)
        val btn2Star : ImageButton = dialog.findViewById(R.id.btn_2star)
        val btn3Star : ImageButton = dialog.findViewById(R.id.btn_3star)
        val btn4Star : ImageButton = dialog.findViewById(R.id.btn_4star)
        val btn5Star : ImageButton = dialog.findViewById(R.id.btn_5star)

        btn1Star.setImageResource(R.drawable.star_not_rate)
        btn2Star.setImageResource(R.drawable.star_not_rate)
        btn3Star.setImageResource(R.drawable.star_not_rate)
        btn4Star.setImageResource(R.drawable.star_not_rate)
        btn5Star.setImageResource(R.drawable.star_not_rate)

        imgReact.setImageResource(R.drawable.react_start)
        tvTitle.text = "Do you like the app?"
        tvTitle.setTypeface(tvTitle.typeface, Typeface.BOLD)

        val btnRate : Button = dialog.findViewById(R.id.btn_rate)
        val btnExit : Button = dialog.findViewById(R.id.btn_exit)

        btnRate.setOnClickListener {
            dismiss()
        }

        btnExit.setOnClickListener {
            dismiss()
        }

        btn1Star.setOnClickListener {
            btn1Star.setImageResource(R.drawable.star_rated)
            btn2Star.setImageResource(R.drawable.star_not_rate)
            btn3Star.setImageResource(R.drawable.star_not_rate)
            btn4Star.setImageResource(R.drawable.star_not_rate)
            btn5Star.setImageResource(R.drawable.star_not_rate)
            imgReact.setImageResource(R.drawable.react_1star)
            tvTitle.text = "Oh, no!"
        }
        btn2Star.setOnClickListener {
            btn1Star.setImageResource(R.drawable.star_rated)
            btn2Star.setImageResource(R.drawable.star_rated)
            btn3Star.setImageResource(R.drawable.star_not_rate)
            btn4Star.setImageResource(R.drawable.star_not_rate)
            btn5Star.setImageResource(R.drawable.star_not_rate)
            imgReact.setImageResource(R.drawable.react_2star)
            tvTitle.text = "Oh, no!"
        }
        btn3Star.setOnClickListener {
            btn1Star.setImageResource(R.drawable.star_rated)
            btn2Star.setImageResource(R.drawable.star_rated)
            btn3Star.setImageResource(R.drawable.star_rated)
            btn4Star.setImageResource(R.drawable.star_not_rate)
            btn5Star.setImageResource(R.drawable.star_not_rate)
            imgReact.setImageResource(R.drawable.react_3star)
            tvTitle.text = "Oh, no!"
        }
        btn4Star.setOnClickListener {
            btn1Star.setImageResource(R.drawable.star_rated)
            btn2Star.setImageResource(R.drawable.star_rated)
            btn3Star.setImageResource(R.drawable.star_rated)
            btn4Star.setImageResource(R.drawable.star_rated)
            btn5Star.setImageResource(R.drawable.star_not_rate)
            imgReact.setImageResource(R.drawable.react_4star)
            tvTitle.text = "We love you too!"
        }
        btn5Star.setOnClickListener {
            btn1Star.setImageResource(R.drawable.star_rated)
            btn2Star.setImageResource(R.drawable.star_rated)
            btn3Star.setImageResource(R.drawable.star_rated)
            btn4Star.setImageResource(R.drawable.star_rated)
            btn5Star.setImageResource(R.drawable.star_rated)
            imgReact.setImageResource(R.drawable.react_5star)
            tvTitle.text = "We love you too!"
        }

        return dialog
    }



    override fun onStart() {
        super.onStart()

        val width = (resources.displayMetrics.widthPixels * 0.85).toInt()
        val height = (resources.displayMetrics.heightPixels * 0.40).toInt()
        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
    }
}