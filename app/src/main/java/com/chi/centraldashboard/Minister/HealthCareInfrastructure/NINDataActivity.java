package com.chi.centraldashboard.Minister.HealthCareInfrastructure;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;

public class NINDataActivity extends MiHealthCareInfrastructureActivity {
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    Button btnOrange;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_nhrrdata);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_healthcareinfraframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_nindata, contentFrameLayout);


        btnOrange = (Button) findViewById(R.id.btn_orange);

        recyclerView = (RecyclerView) findViewById(R.id.rec_view_nindata);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        ninRecyclerView();
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void ninRecyclerView() {

    }
}
