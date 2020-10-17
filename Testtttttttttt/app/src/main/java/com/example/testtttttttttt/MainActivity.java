package com.example.testtttttttttt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager mviewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
    }
    private void InitView(){
        mviewPager= (ViewPager) findViewById(R.id.page1);
        mviewPager.setAdapter(new com.example.testtttttttttt.TabAdapter(getSupportFragmentManager()));
        TabLayout mtabLayout= (TabLayout) findViewById(R.id.tab1);
        mtabLayout.setupWithViewPager(mviewPager);
    }
}