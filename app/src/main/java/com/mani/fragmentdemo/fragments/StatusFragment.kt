package com.mani.fragmentdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.mani.fragmentdemo.R

class StatusFragment : Fragment(), View.OnClickListener {

    lateinit var etName : EditText
    lateinit var tvSave : TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.status_fragment,container,false)

        etName = view.findViewById(R.id.etName)
        tvSave = view.findViewById(R.id.tvSave)

        tvSave.setOnClickListener(this)
        return view
    }

    override fun onClick(p0: View?) {

        val name = etName.text.toString()

        val fragment = CallsFragment()
        val bundle = Bundle()
        bundle.putString("NAME",name)
        fragment.arguments = bundle
        fragmentCalling(fragment)
    }

    private fun fragmentCalling(fragment: Fragment) {

        val fragmentManager = activity?.supportFragmentManager
        val fragmentTransaction = fragmentManager?.beginTransaction()
        fragmentTransaction?.replace(R.id.flMainContainer,fragment)?.commit()
    }
}