package com.example.archit.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by archit on 2/8/17.
 */

public class CustomAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CustomAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1) {
            return new EventsFragment();
        } else if (position == 2) {
            return new ShopsFragment();
        } else {
            return new SightSeeingFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Food";
        } else if (position == 1) {
            return "Event's";
        } else if (position == 2) {
            return "Shop's";
        } else {
            return "Sight's";
        }
    }
}
