package com.chi.centraldashboard.Minister.HealthCareInfrastructure;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterBloodBankDH;
import com.chi.centraldashboard.apiCall.bin.MinisterBloodBankBSU;
import com.chi.centraldashboard.apiCall.bin.MinisterBloodBankData;
import com.chi.centraldashboard.apiCall.bin.MinisterBloodBankDataList;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BloodBankActivity extends MiHealthCareInfrastructureActivity {
    Button btnOrange, btnBlue;
    private RecyclerView recView;
    private BloodBankCusRecviewFourAdapter bloodBankCusRecviewAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    private List<MinisterBloodBankDataList> ministerBloodBankDataListList;
    private List<MinisterBloodBankDH> ministerBloodBankDHList;
    private List<MinisterBloodBankBSU> ministerBloodBankBSUList;

    Call<MinisterBloodBankData> ministerBloodBankDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_healthcareinfraframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_bloodbank, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_bborange);
        btnBlue = (Button) findViewById(R.id.btn_bbblue);

        recView = (RecyclerView) findViewById(R.id.recview_bloodbank);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        ministerBloodBankDataListList = new ArrayList<>();
        ministerBloodBankDHList = new ArrayList<>();
        ministerBloodBankBSUList = new ArrayList<>();

        ministerBloodBankDataCall = apiInterface.ministerBloodBankData();
        ministerBloodBankDataCall.enqueue(new Callback<MinisterBloodBankData>() {
            @Override
            public void onResponse(Call<MinisterBloodBankData> call, Response<MinisterBloodBankData> response) {
                //Log.d("SRSbloodbank", "" + response);
                ministerBloodBankDataListList.addAll(response.body().getMinisterBloodBankDataListList());

                ministerBloodBankDHList.addAll(ministerBloodBankDataListList.get(0).getMinisterBloodBankDHList());
                ministerBloodBankBSUList.addAll(ministerBloodBankDataListList.get(0).getMinisterBloodBankBSUList());

                bloodBankCusRecviewAdapter = new BloodBankCusRecviewFourAdapter(getApplicationContext(), ministerBloodBankDHList, ministerBloodBankBSUList, "dh");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(bloodBankCusRecviewAdapter);
                bloodBankCusRecviewAdapter.notifyDataSetChanged();

                btnOrange.setText(ministerBloodBankDHList.get(1).getNo_of_functional_Blood_Banks_against_the_target_of_District_Hospitals_having_morethan_100_beds());
                btnBlue.setText(ministerBloodBankBSUList.get(1).getNo_of_functional_Blood_Banks_against_no_of_functional_Bloodbanks_BSUs());
                Log.d("SRSbloodbank", "" + ministerBloodBankDHList.get(1).getNo_of_functional_Blood_Banks_against_the_target_of_District_Hospitals_having_morethan_100_beds());
            }

            @Override
            public void onFailure(Call<MinisterBloodBankData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bloodBankCusRecviewAdapter = new BloodBankCusRecviewFourAdapter(getApplicationContext(), ministerBloodBankDHList, ministerBloodBankBSUList, "dh");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(bloodBankCusRecviewAdapter);
                bloodBankCusRecviewAdapter.notifyDataSetChanged();

            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bloodBankCusRecviewAdapter = new BloodBankCusRecviewFourAdapter(getApplicationContext(), ministerBloodBankDHList, ministerBloodBankBSUList, "bsu");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(bloodBankCusRecviewAdapter);
                bloodBankCusRecviewAdapter.notifyDataSetChanged();
            }
        });
    }
}

