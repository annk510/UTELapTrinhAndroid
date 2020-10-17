package com.example.testtttttttttt;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.testtttttttttt.Fragment1;
import com.example.testtttttttttt.Fragment2;

public class TabAdapter extends FragmentStatePagerAdapter {
    private String listTab[]= {"Posts","Photos","Audio"};
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private BlankFragment blankFragment;
    public TabAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragment1= new Fragment1();
        fragment2 = new Fragment2();
        blankFragment= new BlankFragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==2){
            return fragment1;
        }else if(position==1){
            return fragment2;
        }else if(position==0){
            return blankFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return listTab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTab[position];
    }
}