package com.chi.centraldashboard.Minister.HealthCareInfrastructure;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import com.chi.centraldashboard.Fragments.PmssyDSFragment;
import com.chi.centraldashboard.Fragments.PmssySnapshotFragment;
import com.chi.centraldashboard.R;

import java.util.ArrayList;
import java.util.List;

public class PMSSYDataActivity extends MiHealthCareInfrastructureActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_healthcareinfraframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_pmssy, contentFrameLayout);

        viewPager = (ViewPager) findViewById(R.id.viewpagerpmssy);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabspmssy);
        tabLayout.setupWithViewPager(viewPager);
    }




    private void setupViewPager(ViewPager viewPager) {
        com.chi.centraldashboard.Minister.HealthCareInfrastructure.PMSSYDataActivity.ViewPagerAdapter adapter = new com.chi.centraldashboard.Minister.HealthCareInfrastructure.PMSSYDataActivity.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new PmssySnapshotFragment(), "Snapshot");
        adapter.addFragment(new PmssyDSFragment(), "Detailed Status");

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