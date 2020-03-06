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
import com.chi.centraldashboard.apiCall.bin.ChildHealthData;
import com.chi.centraldashboard.apiCall.bin.ChildHealthDataList;
import com.chi.centraldashboard.apiCall.bin.ChildHealthHBNC;
import com.chi.centraldashboard.apiCall.bin.ChildHealthIDCF;
import com.chi.centraldashboard.apiCall.bin.ChildHealthNDD;
import com.chi.centraldashboard.apiCall.bin.ChildHealthRBSK;
import com.chi.centraldashboard.apiCall.bin.ChildHealthSNCU;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChildHealthActivity extends MiHealthServiceDeliveryActivity {
    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown;

    private PMJAYCusRecViewThreeAdapter pmjayCusRecViewThreeAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    private RecyclerView recyclerView;

    private List<ChildHealthDataList> childHealthDataListList;
    private List<ChildHealthNDD> childHealthNDDList;
    private List<ChildHealthIDCF> childHealthIDCFList;
    private List<ChildHealthRBSK> childHealthRBSKList;
    private List<ChildHealthHBNC> childHealthHBNCList;
    private List<ChildHealthSNCU> childHealthSNCUList;

    Call<ChildHealthData> childHealthDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_healthservicedeliveryframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_childhealth, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_chorange);
        btnBlue = (Button) findViewById(R.id.btn_chblue);
        btnLGreen = (Button) findViewById(R.id.btn_chlgreen);
        btnGreen = (Button) findViewById(R.id.btn_chgreen);
        btnBrown = (Button) findViewById(R.id.btn_chbrown);

        recyclerView = (RecyclerView) findViewById(R.id.recview_childhealth);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        childHealthDataListList = new ArrayList<>();
        childHealthNDDList = new ArrayList<>();
        childHealthIDCFList = new ArrayList<>();
        childHealthRBSKList = new ArrayList<>();
        childHealthHBNCList = new ArrayList<>();
        childHealthSNCUList = new ArrayList<>();

        childHealthDataCall = apiInterface.childHealthData();
        childHealthDataCall.enqueue(new Callback<ChildHealthData>() {
            @Override
            public void onResponse(Call<ChildHealthData> call, Response<ChildHealthData> response) {
                childHealthDataListList.addAll(response.body().getChildHealthDataListList());
                childHealthNDDList.addAll(childHealthDataListList.get(0).getChildHealthNDDList());
                childHealthIDCFList.addAll(childHealthDataListList.get(0).getChildHealthIDCFList());
                childHealthRBSKList.addAll(childHealthDataListList.get(0).getChildHealthRBSKList());
                childHealthHBNCList.addAll(childHealthDataListList.get(0).getChildHealthHBNCList());
                childHealthSNCUList.addAll(childHealthDataListList.get(0).getChildHealthDataSNCUList());

                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), childHealthNDDList, childHealthIDCFList, childHealthRBSKList, childHealthHBNCList, childHealthSNCUList, "NDD");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(childHealthNDDList.get(1).getTotal_National_Deworming_Day_Coverage());
                btnBlue.setText(childHealthIDCFList.get(1).getTotal_Intensified_Diarrhoea_Control_Fortnight_Coverage());
                btnLGreen.setText(childHealthRBSKList.get(1).getTotal_no_of_children_screened());
                btnGreen.setText(childHealthHBNCList.get(1).getTotal_no_of_newborns_received());
                btnBrown.setText(childHealthSNCUList.get(1).getTotal_no_of_children_received());


            }

            @Override
            public void onFailure(Call<ChildHealthData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), childHealthNDDList, childHealthIDCFList, childHealthRBSKList, childHealthHBNCList, childHealthSNCUList, "NDD");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), childHealthNDDList, childHealthIDCFList, childHealthRBSKList, childHealthHBNCList, childHealthSNCUList, "IDCF");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), childHealthNDDList, childHealthIDCFList, childHealthRBSKList, childHealthHBNCList, childHealthSNCUList, "RBSK");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), childHealthNDDList, childHealthIDCFList, childHealthRBSKList, childHealthHBNCList, childHealthSNCUList, "HBNC");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });


        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), childHealthNDDList, childHealthIDCFList, childHealthRBSKList, childHealthHBNCList, childHealthSNCUList, "SNCU");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
    }
}
