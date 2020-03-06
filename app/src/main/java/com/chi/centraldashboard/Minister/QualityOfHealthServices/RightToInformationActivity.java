package com.chi.centraldashboard.Minister.QualityOfHealthServices;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.RTIData;
import com.chi.centraldashboard.apiCall.bin.RTIDataList;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RightToInformationActivity extends MiQualityOfHealthServiceActivity {
    Button btnOrange, btnBlue, btnLGreen, btnGreen;
    private ApiInterface apiInterface;
    private List<RTIDataList> rtiDataListList;
    Call<RTIData> rtiDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_qualityofhealthservicesframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_righttoinformation, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_rtiorange);
        btnBlue = (Button) findViewById(R.id.btn_rtiblue);
        btnLGreen = (Button) findViewById(R.id.btn_rtilgreen);
        btnGreen = (Button) findViewById(R.id.btn_rtigreen);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        rtiDataListList = new ArrayList<>();
        rtiDataCall = apiInterface.rtiData();
        rtiDataCall.enqueue(new Callback<RTIData>() {
            @Override
            public void onResponse(Call<RTIData> call, Response<RTIData> response) {
                rtiDataListList.addAll(response.body().getRtiDataListList());
                btnOrange.setText(rtiDataListList.get(0).getRTI_Applications_Received());
                btnBlue.setText(rtiDataListList.get(0).getRTI_Application_Disposed_Off());
                btnLGreen.setText(rtiDataListList.get(0).getFirst_Appeal_Received());
                btnGreen.setText(rtiDataListList.get(0).getFirst_Appeal_Disposed_Off());
            }

            @Override
            public void onFailure(Call<RTIData> call, Throwable t) {

            }
        });

    }
}
