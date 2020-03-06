package com.chi.centraldashboard.Minister.HealthServiceDelivery;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.chi.centraldashboard.Minister.MinisterMainActivity;
import com.chi.centraldashboard.R;

public class MiHealthServiceDeliveryActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_health_service_delivery);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);////to display all icons
        navigationView.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        navigationView.setItemTextColor(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));
        navigationView.setItemBackground(getDrawable(R.drawable.navviewline));


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_home) {
            Intent intent = new Intent(MiHealthServiceDeliveryActivity.this, MinisterMainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_hwc) {
            // Handle the camera action
        } else if (id == R.id.nav_pmjay) {
            Intent intent = new Intent(MiHealthServiceDeliveryActivity.this, PMJAYActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_cghs) {
            Intent intent = new Intent(MiHealthServiceDeliveryActivity.this, CGHSActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_hcoe) {
            Intent intent = new Intent(MiHealthServiceDeliveryActivity.this, ElderlyActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_tb) {

        } else if (id == R.id.nav_mhealth) {
            Intent intent = new Intent(MiHealthServiceDeliveryActivity.this, MhealthActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_rch) {
            Intent intent = new Intent(MiHealthServiceDeliveryActivity.this, RCHActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_familyplaning) {
            Intent intent = new Intent(MiHealthServiceDeliveryActivity.this, FamilyPlaningActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_maternalhealth) {
            Intent intent = new Intent(MiHealthServiceDeliveryActivity.this, MaternalHealthActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_immunization) {
            Intent intent = new Intent(MiHealthServiceDeliveryActivity.this, ImmunizationActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_childhealth) {
            Intent intent = new Intent(MiHealthServiceDeliveryActivity.this, ChildHealthActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_emr) {
            Intent intent = new Intent(MiHealthServiceDeliveryActivity.this, EMRActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
