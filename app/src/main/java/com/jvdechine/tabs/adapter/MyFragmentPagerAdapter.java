package com.jvdechine.tabs.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.jvdechine.tabs.fragment.FragmentA;
import com.jvdechine.tabs.fragment.FragmentB;

/**
 * Created by jvade on 13/07/2016.
 */
public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {

    private String[] aTabTitles;

    public MyFragmentPagerAdapter(FragmentManager fm, String[] aTabTitles) {
        super(fm);
        this.aTabTitles = aTabTitles;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FragmentA();
            case 1:
                return new FragmentB();
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return this.aTabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.aTabTitles[position];
    }
}
