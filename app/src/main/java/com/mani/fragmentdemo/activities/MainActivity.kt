package com.mani.fragmentdemo.activities

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.mani.fragmentdemo.R
import com.mani.fragmentdemo.fragments.CallsFragment
import com.mani.fragmentdemo.fragments.ChatFragment
import com.mani.fragmentdemo.fragments.CommunityFragment
import com.mani.fragmentdemo.fragments.SettingsFragment
import com.mani.fragmentdemo.fragments.StatusFragment

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var tvStatus : TextView
    lateinit var tvCalls : TextView
    lateinit var tvChat : TextView
    lateinit var tvCommunity : TextView
    lateinit var tvSettings : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvStatus = findViewById(R.id.tvStatus)
        tvCalls = findViewById(R.id.tvCalls)
        tvChat = findViewById(R.id.tvChat)
        tvSettings = findViewById(R.id.tvSettings)
        tvCommunity = findViewById(R.id.tvComminity)

        tvStatus.setOnClickListener(this)
        tvSettings.setOnClickListener(this)
        tvCalls.setOnClickListener(this)
        tvChat.setOnClickListener(this)
        tvCommunity.setOnClickListener(this)

        val fragment = StatusFragment()
        fragmentCalling(fragment)


    }

    private fun fragmentCalling(fragment: Fragment) {

        /*val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.flMainContainer,fragment).commit()
        fragmentTransaction.commit()
        */

        supportFragmentManager.beginTransaction().replace(R.id.flMainContainer,fragment).commit()


    }

    override fun onClick(view: View?) {

        when(view?.id) {

            R.id.tvStatus -> {

                val fragment = StatusFragment()
                fragmentCalling(fragment)

            }

            R.id.tvComminity -> {

                val fragment = CommunityFragment()
                fragmentCalling(fragment)
            }

            R.id.tvCalls -> {

                val fragment = CallsFragment()

                fragmentCalling(fragment)

            }

            R.id.tvChat -> {

                val fragment = ChatFragment()
                fragmentCalling(fragment)

            }

            R.id.tvSettings -> {

                val fragment = SettingsFragment()
                fragmentCalling(fragment)

            }


        }
    }
}