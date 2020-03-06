package com.chi.centraldashboard.Minister.Survillance;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.FrameLayout;

import com.chi.centraldashboard.Fragments.NVBDCP_Chikungunya_Fragment;
import com.chi.centraldashboard.Fragments.NVBDCP_Dengue_Fragment;
import com.chi.centraldashboard.Fragments.NVBDCP_Japanese_Fragment;
import com.chi.centraldashboard.Fragments.NVBDCP_Lymphatic_Fragment;
import com.chi.centraldashboard.Fragments.NVBDCP_Malaria_Fragment;
import com.chi.centraldashboard.Fragments.NVBDCP_kalaazar_Fragment;
import com.chi.centraldashboard.Fragments.SONandENCFragment;
import com.chi.centraldashboard.R;

import java.util.ArrayList;
import java.util.List;

public class NVBDCPActivity extends MiSurvillanceActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_nvbdcp);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_nvbdcp, contentFrameLayout);


        viewPager = (ViewPager) findViewById(R.id.view_pagerNVBDCP);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new NVBDCP_Malaria_Fragment(), "Malaria");
        adapter.addFragment(new NVBDCP_kalaazar_Fragment(), "Kala-azar");
        adapter.addFragment(new NVBDCP_Lymphatic_Fragment(), "Lymphatic Filariasis");
        adapter.addFragment(new NVBDCP_Dengue_Fragment(), "Dengue");
        adapter.addFragment(new NVBDCP_Chikungunya_Fragment(), "Chikungunya");
        adapter.addFragment(new NVBDCP_Japanese_Fragment(), "Japanese Encephalitis");

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