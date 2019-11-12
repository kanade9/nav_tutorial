package com.example.navsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
//
//import com.example.navigationsample.R
import kotlinx.android.synthetic.main.fragment_blank.view.*

class BlankFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)

        view.button?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_blankFragment_to_blankFragment2)
        }
        return view
    }
}
