package com.example.navsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_blank2.view.*

class BlankFragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank2, container, false)

        val args: BlankFragment2Args by navArgs()
        val code = args.code
        val type = args.type
        val line = args.line
        view.textView.text=code
        view.textView2.text=type
        view.textView3.text=line
        return view
    }

}
