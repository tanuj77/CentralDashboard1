package com.chi.centraldashboard.Minister.Survillance;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import com.chi.centraldashboard.Fragments.NFHSFragment;
import com.chi.centraldashboard.Fragments.PhcBiannualFragment;
import com.chi.centraldashboard.Fragments.SRSFragment;
import com.chi.centraldashboard.R;

import java.util.ArrayList;
import java.util.List;

public class NFHS_SRSActivity extends MiSurvillanceActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_nfhs__srs, contentFrameLayout);
        // setContentView(R.layout.activity_ihip);

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpagernfhs);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabsnfhs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
    NFHS_SRSActivity.ViewPagerAdapter adapter = new NFHS_SRSActivity.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new NFHSFragment(), "National Family Health Survey(NFHS)");
        adapter.addFragment(new SRSFragment(), "Sample Registration System(SRS)");

        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}