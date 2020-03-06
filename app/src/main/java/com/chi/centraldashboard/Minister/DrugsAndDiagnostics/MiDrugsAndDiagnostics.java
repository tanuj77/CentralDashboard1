package com.chi.centraldashboard.Minister.DrugsAndDiagnostics;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.chi.centraldashboard.Minister.MinisterMainActivity;
import com.chi.centraldashboard.R;

public class MiDrugsAndDiagnostics extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_drugs_and_diagnostics);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        FloatingActionButton fab = findViewById(R.id.fab);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mi_drugs_and_diagnostics, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(MiDrugsAndDiagnostics.this, MinisterMainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_dvdms) {
            Intent intent = new Intent(MiDrugsAndDiagnostics.this, DVDMSActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_freedsi) {
            Intent intent = new Intent(MiDrugsAndDiagnostics.this, FreeDSIActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_amrit) {
            Intent intent = new Intent(MiDrugsAndDiagnostics.this, AmritActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_hpe) {
            Intent intent = new Intent(MiDrugsAndDiagnostics.this, HPEActiviy.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
