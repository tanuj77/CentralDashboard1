package com.chi.centraldashboard.Minister.HealthServiceDelivery;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import com.chi.centraldashboard.Fragments.CghsDSFragment;
import com.chi.centraldashboard.Fragments.CghsSnapshotFragment;
import com.chi.centraldashboard.R;

import java.util.ArrayList;
import java.util.List;

public class CGHSActivity extends MiHealthServiceDeliveryActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_healthservicedeliveryframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_t_cghs, contentFrameLayout);

        viewPager = (ViewPager) findViewById(R.id.viewpagercghs);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabcghs);
        tabLayout.setupWithViewPager(viewPager);
    }




    private void setupViewPager(ViewPager viewPager) {
        CGHSActivity.ViewPagerAdapter adapter =new CGHSActivity.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CghsSnapshotFragment(), "Snapshot");
        adapter.addFragment(new CghsDSFragment(), "Detailed Status");

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