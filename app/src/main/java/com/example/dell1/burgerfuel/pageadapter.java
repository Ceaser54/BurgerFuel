package com.example.dell1.burgerfuel;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class pageadapter extends FragmentStatePagerAdapter {
    public int tabs;
    public pageadapter(FragmentManager fragementmananger, int tabs)
    {
        super(fragementmananger);
        this.tabs = tabs;
    }
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                OrderingTap orderingTap = new OrderingTap();
                return orderingTap;
            case 1:
                LocationTap locationTap = new LocationTap();
                return locationTap;
            case 2:
                SocialTap socialTap = new SocialTap();
                return socialTap;
            default:
                break;
        }
        return null;
    }
    @Override
    public int getCount() {
        return tabs;
    }
}
