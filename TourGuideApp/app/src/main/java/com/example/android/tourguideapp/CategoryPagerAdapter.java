package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


class CategoryPagerAdapter extends FragmentPagerAdapter{

    private static final int TAB_ATTRACTIONS = 0;
    private static final int TAB_EVENTS = 1;
    private static final int TAB_HOTELS = 2;
    private static final int TAB_RESTAURANTS = 3;
    private static final int NO_OF_TABS = 4;

    private final Context mContext;

    public CategoryPagerAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount(){
        return NO_OF_TABS;
    }

    @Override
    public Fragment getItem(int position){

        switch(position){
            case TAB_ATTRACTIONS:
                return new AttractionsFragment();
            case TAB_EVENTS:
                return new EventsFragment();
            case TAB_HOTELS:
                return new HotelsFragment();
            case TAB_RESTAURANTS:
                return new RestaurantsFragment();
            default:
                return null;


        }
    }

    @Override
    public CharSequence getPageTitle(int position){

        switch(position){

            case TAB_ATTRACTIONS:
                return mContext.getString(R.string.tab_attractions);
            case TAB_EVENTS:
                return mContext.getString(R.string.tab_events);
            case TAB_HOTELS:
                return mContext.getString(R.string.tab_hotels);
            case TAB_RESTAURANTS:
                return mContext.getString(R.string.tab_restaurants);
            default:
                return null;
        }
    }

}
