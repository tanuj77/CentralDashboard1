package com.chi.centraldashboard.Minister.QualityOfHealthServices;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import com.chi.centraldashboard.Fragments.EhospitalDsFragment;
import com.chi.centraldashboard.Fragments.EhospitalSnapshotFragment;
import com.chi.centraldashboard.Minister.QualityOfHealthServices.ui.main.SectionsPagerAdapter;
import com.chi.centraldashboard.R;

import java.util.ArrayList;
import java.util.List;

public class EHospitalActivity extends MiQualityOfHealthServiceActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_qualityofhealthservicesframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_tehospital, contentFrameLayout);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

        viewPager = (ViewPager) findViewById(R.id.viewpagerehospital);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabsehospital);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        EHospitalActivity.ViewPagerAdapter adapter = new EHospitalActivity.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new EhospitalSnapshotFragment(), "Snapshot");
        adapter.addFragment(new EhospitalDsFragment(), "Detail Status");

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