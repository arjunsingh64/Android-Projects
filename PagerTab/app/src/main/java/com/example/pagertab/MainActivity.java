package com.example.pagertab;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab = (TabLayout) findViewById(R.id.TabId);
        pager = (ViewPager) findViewById(R.id.PagerId);

        pager.setAdapter(new myAdapter(getSupportFragmentManager()));
        tab.setupWithViewPager(pager);
    }

    class myAdapter extends FragmentPagerAdapter{

        String [] arr = {"First","Second","Third"};

        public myAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {

            if(position==0)
            {
                return new First_java();
            }else if(position==1)
            {
                return new Second_java();
            }else if(position==2)
            {
                return new Third_java();
            }else {
                return null;
            }

        }

        @Override
        public int getCount() {
            return arr.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return arr[position];
        }
    }
}