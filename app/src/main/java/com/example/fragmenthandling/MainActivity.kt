package com.example.fragmenthandling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.fragmenthandling.fragments.FragmentAlpha
import com.example.fragmenthandling.fragments.FragmentBeta

class MainActivity : AppCompatActivity(), Comm2 {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // link the buttons
        val btn_A = findViewById<Button>(R.id.btnAlpha)
        val btn_B = findViewById<Button>(R.id.btnBeta)

        // set variables equal to our fragment classes
        val fragA = FragmentAlpha()
        val fragB = FragmentBeta()

        // loads a fragment into the fragment container
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragA)
            commit()
        }

        // clicking alpha button swaps to fragment Alpha
        btn_A.setOnClickListener {
            // get our edit text
            val pass = findViewById<EditText>(R.id.etDataSendBtoA)
            /* adding the passTheData function with a passed value of the string in our edit text box
            to the arguments for fragB
             */
            fragA.arguments = passTheData(pass.text.toString())
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, fragA)
                addToBackStack(null)
                commit()
            }
        }

        // clicking alpha button swaps to fragment Beta
        btn_B.setOnClickListener {
            // get our edit text
            val pass = findViewById<EditText>(R.id.etDataSendAtoB)
            /* adding the passTheData function with a passed value of the string in our edit text box
            to the arguments for fragB
             */
            fragB.arguments = passTheData(pass.text.toString())
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, fragB)
                addToBackStack(null)
                commit()
            }
        }
    }

    override fun passTheData(passingtext: String): Bundle {
        // create a bundle that we can put information in
        val bundle = Bundle()

        bundle.putString("txtA_B", passingtext)

        return bundle
    }

}