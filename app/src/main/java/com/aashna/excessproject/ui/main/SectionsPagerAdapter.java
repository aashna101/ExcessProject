package com.aashna.excessproject.ui.main;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.widget.Toast;

import com.aashna.excessproject.FoodTruck;
import com.aashna.excessproject.MainActivity;
import com.aashna.excessproject.R;
import com.aashna.excessproject.Restaurant;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
String CAT;
    int[] tabsT;




    private static  String[] TAB_TITLES ;//{R.array.food};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        if(MainActivity.selected_item.equals("Food & Beverages")){//CAT.equals("Food & Beverages")
            TAB_TITLES=mContext.getResources().getStringArray(R.array.food);
            //tabsT= {R.array.food};
        }else if(MainActivity.selected_item.equals("Entertainment")){
            TAB_TITLES=mContext.getResources().getStringArray(R.array.entertainment);
           // int[] tabsT= {R.array.entertainment};
        }
    }


    @Override
    public Fragment getItem(int position) {

      //
        if (TAB_TITLES[position].equals("Restaurant")){
            return new Restaurant();
        }else if(TAB_TITLES[position].equals("Bars")){
            return new FoodTruck();
        }
        else return new Restaurant();


    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
      //  tabsValue();
       // return mContext.getResources().getString(TAB_TITLES[position]);
        return TAB_TITLES[position];
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return TAB_TITLES.length;
    }
}