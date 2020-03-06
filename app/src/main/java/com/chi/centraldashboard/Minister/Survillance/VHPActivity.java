package com.chi.centraldashboard.Minister.Survillance;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.VHPData;
import com.chi.centraldashboard.apiCall.bin.VHPDataList;
import com.chi.centraldashboard.apiCall.bin.VHP_District;
import com.chi.centraldashboard.apiCall.bin.VHP_Regional;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VHPActivity extends MiSurvillanceActivity {
    Button btnOrange, btnBlue;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    private List<VHPDataList> vhpDataListList;
    private List<VHP_Regional> vhp_regionalList;
    private List<VHP_District> vhp_districtList;
    Call<VHPData> vhpDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_vhp, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_vhporange);
        btnBlue = (Button) findViewById(R.id.btn_vhpblue);

        recyclerView = (RecyclerView) findViewById(R.id.recview_vhp);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        vhpDataListList = new ArrayList<>();
        vhp_regionalList = new ArrayList<>();
        vhp_districtList = new ArrayList<>();
        vhpDataCall = apiInterface.vhpData();
        vhpDataCall.enqueue(new Callback<VHPData>() {
            @Override
            public void onResponse(Call<VHPData> call, Response<VHPData> response) {
                vhpDataListList.addAll(response.body().getVhpDataListList());
                vhp_regionalList.addAll(vhpDataListList.get(0).getVhp_regionalList());
                vhp_districtList.addAll(vhpDataListList.get(0).getVhp_districtList());

                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), vhp_regionalList, vhp_districtList, "VHP_regional", 1.2, 1.2);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(vhp_regionalList.get(1).getTotal_Regional_labs_doing_enhanced_case_reporting());
                btnBlue.setText(vhp_districtList.get(1).getTotal_Districts_reporting_on_acute_hepatitis_surveillance());
            }

            @Override
            public void onFailure(Call<VHPData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), vhp_regionalList, vhp_districtList, "VHP_regional", 1.2, 1.2);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (vhp_districtList.get(1).getSR_NO().equalsIgnoreCase("")) {
                    recyclerView.setVisibility(View.INVISIBLE);
                } else {
                    recyclerView.setVisibility(View.VISIBLE);

                    pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), vhp_regionalList, vhp_districtList, "VHP_districts", 1.2, 1.2);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                    pbsCusRecViewThreeAdapter.notifyDataSetChanged();
                }
            }
        });
    }
}
