package com.chi.centraldashboard.Minister.Survillance;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.chi.centraldashboard.Fragments.DiseaseSummaryFragment;
import com.chi.centraldashboard.Fragments.NcdDetailedStatusFragment;
import com.chi.centraldashboard.Fragments.NcdSnapshotFragment;
import com.chi.centraldashboard.Fragments.OtbreakSummaryFragment;
import com.chi.centraldashboard.Fragments.PbsSnapshotFragment;
import com.chi.centraldashboard.Fragments.ReportingSummaryFragment;
import com.chi.centraldashboard.Minister.Survillance.ui.main.SectionsPagerAdapter;
import com.chi.centraldashboard.R;

import java.util.ArrayList;
import java.util.List;




    public class PbsActivity extends MiSurvillanceActivity {

        private Toolbar toolbar;
        private TabLayout tabLayout;
        private ViewPager viewPager;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
            getLayoutInflater().inflate(R.layout.activity_pbs, contentFrameLayout);
            // setContentView(R.layout.activity_ihip);

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            viewPager = (ViewPager) findViewById(R.id.viewpager);
            setupViewPager(viewPager);

            tabLayout = (TabLayout) findViewById(R.id.tabs);
            tabLayout.setupWithViewPager(viewPager);
        }

        private void setupViewPager(ViewPager viewPager) {
          PbsActivity.ViewPagerAdapter adapter = new PbsActivity.ViewPagerAdapter(getSupportFragmentManager());
            adapter.addFragment(new PbsSnapshotFragment(), "PBS Snapshot");
            adapter.addFragment(new NcdSnapshotFragment(), "NCD Snapshot");
            adapter.addFragment(new NcdDetailedStatusFragment(), "NCD Detailed Status");
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