package com.example.fragmenthandling

import android.os.Bundle

// interface lets us communicate between different fragments
interface Comm2 {
    fun passTheData(passingtext: String): Bundle

}