package com.chi.centraldashboard.Minister.Regulations;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import com.chi.centraldashboard.Fragments.SugamDSFragment;
import com.chi.centraldashboard.Fragments.SugamSnapshotFragment;
import com.chi.centraldashboard.R;

import java.util.ArrayList;
import java.util.List;

public class SugamActivity extends MiRegulations {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_regulationsframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_tsugam, contentFrameLayout);

        viewPager = (ViewPager) findViewById(R.id.viewpagersugam);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabssugam);
        tabLayout.setupWithViewPager(viewPager);
    }


    private void setupViewPager(ViewPager viewPager) {
        SugamActivity.ViewPagerAdapter adapter = new SugamActivity.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SugamSnapshotFragment(), "Snapshot");
        adapter.addFragment(new SugamDSFragment(), "Detailed Status");

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