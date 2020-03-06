package com.chi.centraldashboard.Minister.Survillance;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.FrameLayout;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.PCZDData;
import com.chi.centraldashboard.apiCall.bin.PCZDDataList;
import com.chi.centraldashboard.apiCall.bin.PCZDTrained;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PCZDActivity extends MiSurvillanceActivity {

    Button btnOrange, btnBlue;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;

    private List<PCZDDataList> pczdDataListList;
    private List<PCZDTrained> pczdTrainedList;
    Call<PCZDData> pczdDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_pczd, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_pczdorange);

        recyclerView = (RecyclerView) findViewById(R.id.recview_pczd);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        pczdDataListList = new ArrayList<>();
        pczdTrainedList = new ArrayList<>();
        pczdDataCall = apiInterface.pczdData();
        pczdDataCall.enqueue(new Callback<PCZDData>() {
            @Override
            public void onResponse(Call<PCZDData> call, Response<PCZDData> response) {
                pczdDataListList.addAll(response.body().getPczdDataListList());
                pczdTrainedList.addAll(pczdDataListList.get(0).getPczdTrainedList());

                btnOrange.setText(pczdTrainedList.get(1).getTotal_Health_and_Veterinary_professionals_trained());
            }

            @Override
            public void onFailure(Call<PCZDData> call, Throwable t) {

            }
        });
    }
}
