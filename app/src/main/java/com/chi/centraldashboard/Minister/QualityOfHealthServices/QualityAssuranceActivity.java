package com.chi.centraldashboard.Minister.QualityOfHealthServices;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterQAData;
import com.chi.centraldashboard.apiCall.bin.MinisterQADataList;
import com.chi.centraldashboard.apiCall.bin.MinisterQALaQshya;
import com.chi.centraldashboard.apiCall.bin.MinisterQANQAS;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QualityAssuranceActivity extends MiQualityOfHealthServiceActivity {
    ConnectionDetector cd;
    String strNinId;
    TextView tvFiltersHeading, tvStatetop;
    Button btnDetailedStatus, btnOrange, btnBlue, btnOrange2, btnBlue2;
    private RecyclerView recView;
    private QARecviewCusThreeAdapter qaRecviewCusThreeAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    private List<MinisterQADataList> ministerQADataListList;
    private List<MinisterQANQAS> ministerQANQASList;
    private List<MinisterQALaQshya> ministerQALaQshyaList;

    Call<MinisterQAData> ministerQADataCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_nhrrdata);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_qualityofhealthservicesframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_qualityassurance, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_qaorange);
        btnBlue = (Button) findViewById(R.id.btn_qablue);
        recView = (RecyclerView) findViewById(R.id.recview_qualityassurance);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        ministerQADataListList = new ArrayList<>();
        ministerQANQASList = new ArrayList<>();
        ministerQALaQshyaList = new ArrayList<>();

        ministerQADataCall = apiInterface.ministerQAData();
        ministerQADataCall.enqueue(new Callback<MinisterQAData>() {
            @Override
            public void onResponse(Call<MinisterQAData> call, Response<MinisterQAData> response) {
                ministerQADataListList.addAll(response.body().getMinisterQADataListList());
                ministerQANQASList.addAll(ministerQADataListList.get(0).getMinisterQANQASList());
                ministerQALaQshyaList.addAll(ministerQADataListList.get(0).getMinisterQALaQshyaList());


                qaRecviewCusThreeAdapter = new QARecviewCusThreeAdapter(getApplicationContext(), ministerQANQASList, ministerQALaQshyaList, "nqas");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(qaRecviewCusThreeAdapter);
                qaRecviewCusThreeAdapter.notifyDataSetChanged();


                btnOrange.setText(ministerQANQASList.get(1).getTotal_Number_of_facilities_NQAS_Certified());
                btnBlue.setText(ministerQALaQshyaList.get(1).getTotal_Number_of_facilities_LaQshya_Certified());
            }

            @Override
            public void onFailure(Call<MinisterQAData> call, Throwable t) {

            }
        });


        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qaRecviewCusThreeAdapter = new QARecviewCusThreeAdapter(getApplicationContext(), ministerQANQASList, ministerQALaQshyaList, "nqas");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(qaRecviewCusThreeAdapter);
                qaRecviewCusThreeAdapter.notifyDataSetChanged();
            }
        });


        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qaRecviewCusThreeAdapter = new QARecviewCusThreeAdapter(getApplicationContext(), ministerQANQASList, ministerQALaQshyaList, "laqshay");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(qaRecviewCusThreeAdapter);
                qaRecviewCusThreeAdapter.notifyDataSetChanged();
            }
        });
    }
}
