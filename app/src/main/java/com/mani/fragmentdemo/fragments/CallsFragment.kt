package com.mani.fragmentdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.mani.fragmentdemo.R

class CallsFragment : Fragment() {

    lateinit var tvName : TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.call_fragment,container,false)
        tvName = view.findViewById(R.id.tvName)
        val givenName = requireArguments().getString("NAME")
        tvName.text = givenName
        return view

    }
}