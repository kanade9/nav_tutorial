package com.example.navsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.default_fragment.view.*

class DefaultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.default_fragment, container, false)

        view.button3?.setOnClickListener {
            findNavController().navigate(
                DefaultFragmentDirections.actionDefaultFragmentToBlankFragment(
                    backArgument  = view.editText3.text.toString()
                )
            )
        }
        return view
    }
}
