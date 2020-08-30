package com.example.plants_ecommerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem signup,register;
    public PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            tabLayout=(TabLayout)findViewById(R.id.tablayout);
            signup=(TabItem)findViewById(R.id.indoortab);
            register=(TabItem)findViewById(R.id.outdoortab);
            viewPager=(ViewPager)findViewById(R.id.viewpager);


            pagerAdapter= new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
            viewPager.setAdapter(pagerAdapter);
            tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                    if(tab.getPosition()==0){
                        pagerAdapter.notifyDataSetChanged();
                    }
                    else if(tab.getPosition()==1){
                        pagerAdapter.notifyDataSetChanged();
                    }
                    else if(tab.getPosition()==2){
                        pagerAdapter.notifyDataSetChanged();
                    }
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });
            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));;
    }
}