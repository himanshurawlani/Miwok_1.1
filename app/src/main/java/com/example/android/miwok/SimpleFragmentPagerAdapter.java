package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Himanshu on 31/12/2016.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "About", "Numbers", "Family", "Colors", "Phrases" };

    public SimpleFragmentPagerAdapter(FragmentManager fm){super(fm);}

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new AboutFragment();
        else if(position==1)
            return new NumbersFragment();
        else if(position==2)
            return new FamilyFragment();
        else if(position==3)
            return new ColorsFragment();
        else
            return new PhrasesFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }
}
