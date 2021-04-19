package Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.ilhomjon.cicularindicatorintablayout.ImageFragment

class IndicatorAdapter(val list:List<String>, fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {
        return ImageFragment.newInstance(list[position])
    }
}