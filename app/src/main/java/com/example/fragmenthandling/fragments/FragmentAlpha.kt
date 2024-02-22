package com.example.fragmenthandling.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmenthandling.R

class FragmentAlpha : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_alpha, container, false)
        // get the string from arguments
        var displayText = arguments?.getString("txtA_B")

        // link the textview
        var txtRecieve = view.findViewById<TextView>(R.id.tvDataFromBeta)

        // set the text in the text view to the string we got from arguments.
        txtRecieve.setText(displayText)

        return view
    }


}