package com.example.nbuprovalyuta.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.nbuprovalyuta.fragments.HomeFragment
import com.example.nbuprovalyuta.fragments.SecondFragment
import com.example.nbuprovalyuta.fragments.ThirdFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {

            0 -> HomeFragment()
            1 -> SecondFragment()
            else -> ThirdFragment()
        }
    }

}