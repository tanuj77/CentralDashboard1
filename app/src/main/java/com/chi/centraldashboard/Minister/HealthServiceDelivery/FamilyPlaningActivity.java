package com.chi.centraldashboard.Minister.HealthServiceDelivery;

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
import com.chi.centraldashboard.apiCall.bin.FamilyPlaningData;
import com.chi.centraldashboard.apiCall.bin.FamilyPlaningDoses;
import com.chi.centraldashboard.apiCall.bin.FamilyPlaningList;
import com.chi.centraldashboard.apiCall.bin.FamilyPlaningPPIUCD;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FamilyPlaningActivity extends MiHealthServiceDeliveryActivity {
    Button btnOrange, btnBlue;
    RecyclerView recyclerView;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private FamilyPlaningRecviewCusFiveAdapter familyPlaningRecviewCusAdapter;
    private PMJAYCusRecViewThreeAdapter pmjayCusRecViewThreeAdapter;
    private ApiInterface apiInterface;

    private List<FamilyPlaningList> familyPlaningListList;
    private List<FamilyPlaningPPIUCD> familyPlaningPPIUCDList;
    private List<FamilyPlaningDoses> familyPlaningDosesList;

    Call<FamilyPlaningData> familyPlaningDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content_healthservicedeliveryframe);
        getLayoutInflater().inflate(R.layout.activity_familyplaning, frameLayout);

        btnOrange = (Button) findViewById(R.id.btn_fporange);
        btnBlue = (Button) findViewById(R.id.btn_fpblue);
        recyclerView = (RecyclerView) findViewById(R.id.recview_fp);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        familyPlaningListList = new ArrayList<>();
        familyPlaningPPIUCDList = new ArrayList<>();
        familyPlaningDosesList = new ArrayList<>();

        familyPlaningDataCall = apiInterface.familyPlaning();
        familyPlaningDataCall.enqueue(new Callback<FamilyPlaningData>() {
            @Override
            public void onResponse(Call<FamilyPlaningData> call, Response<FamilyPlaningData> response) {
                familyPlaningListList.addAll(response.body().getFamilyPlaningListList());
                familyPlaningPPIUCDList.addAll(familyPlaningListList.get(0).getFamilyPlaningPPIUCDList());
                familyPlaningDosesList.addAll(familyPlaningListList.get(0).getFamilyPlaningDosesList());

                familyPlaningRecviewCusAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), familyPlaningPPIUCDList,"FamilyPlaning");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusAdapter);
                familyPlaningRecviewCusAdapter.notifyDataSetChanged();

                btnOrange.setText(familyPlaningPPIUCDList.get(1).getPost_Partum_Intrauterine_Copper_Device_PPIUCD_Acceptance_Rate_Public());
                btnBlue.setText(familyPlaningDosesList.get(1).getNumber_of_Injectable_Doses_Given());
            }

            @Override
            public void onFailure(Call<FamilyPlaningData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), familyPlaningPPIUCDList,"FamilyPlaning");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusAdapter);
                familyPlaningRecviewCusAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getBaseContext(), familyPlaningDosesList,"doses");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();

            }
        });
    }
}
