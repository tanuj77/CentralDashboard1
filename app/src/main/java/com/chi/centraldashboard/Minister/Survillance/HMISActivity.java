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

import com.chi.centraldashboard.Fragments.ChcAnnualFragment;
import com.chi.centraldashboard.Fragments.ChcBiannualFragment;
import com.chi.centraldashboard.Fragments.DiseaseSummaryFragment;
import com.chi.centraldashboard.Fragments.IpdMonthlyFragment;
import com.chi.centraldashboard.Fragments.NcdDetailedStatusFragment;
import com.chi.centraldashboard.Fragments.NcdSnapshotFragment;
import com.chi.centraldashboard.Fragments.OpdMonthlyFragment;
import com.chi.centraldashboard.Fragments.OtbreakSummaryFragment;
import com.chi.centraldashboard.Fragments.PbsSnapshotFragment;
import com.chi.centraldashboard.Fragments.PhcAnnualFragment;
import com.chi.centraldashboard.Fragments.PhcBiannualFragment;
import com.chi.centraldashboard.Fragments.ReportingSummaryFragment;
import com.chi.centraldashboard.Minister.Survillance.ui.main.SectionsPagerAdapter;
import com.chi.centraldashboard.R;

import java.util.ArrayList;
import java.util.List;




public class HMISActivity extends MiSurvillanceActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_hmis, contentFrameLayout);
        // setContentView(R.layout.activity_ihip);

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpagerhmis);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabshmis);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        com.chi.centraldashboard.Minister.Survillance.HMISActivity.ViewPagerAdapter adapter = new com.chi.centraldashboard.Minister.Survillance.HMISActivity.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new PhcAnnualFragment(), "Grading of Health Facilities PHC(Annual)");
        adapter.addFragment(new PhcBiannualFragment(), "Grading of Health Facilities PHC(Bi-Annual)");
        adapter.addFragment(new ChcAnnualFragment(), "Grading of Health Facilities CHC(Annual)");
        adapter.addFragment(new ChcBiannualFragment(), "Grading of Health Facilities CHC(Bi-Annual)");
        adapter.addFragment(new OpdMonthlyFragment(), "Grading of Health Facilities OPD(Monthly)");
        adapter.addFragment(new IpdMonthlyFragment(), "Grading of Health Facilities IPD(Monthly)");
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