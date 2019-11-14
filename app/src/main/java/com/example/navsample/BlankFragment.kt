package com.example.navsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_blank.view.*
class BlankFragment : Fragment() {

    val args: BlankFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)

        val back_args = args.backArgument
        view.textView4.text = back_args

        view.button?.setOnClickListener {
            //            Navigation.findNavController(it).navigate(R.id.action_blankFragment_to_blankFragment2)
            findNavController().navigate(
                BlankFragmentDirections.actionBlankFragmentToBlankFragment2(
                    line = view.editText.text.toString(),
                    code = "hello!! from BlankFragment1",
                    type = "normal"
                )
            )
        }
        return view
    }
}
