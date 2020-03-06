package com.chi.centraldashboard.Minister.QualityOfHealthServices;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.chi.centraldashboard.Minister.DrugsAndDiagnostics.HPECusREcviewFiveAdapter;
import com.chi.centraldashboard.Minister.HealthCareInfrastructure.BloodBankCusRecviewFourAdapter;
import com.chi.centraldashboard.Minister.InternationalHealth.IHCusRecViewSixAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.FSSAIData;
import com.chi.centraldashboard.apiCall.bin.FSSAIDataList;
import com.chi.centraldashboard.apiCall.bin.FSSAIFSWS;
import com.chi.centraldashboard.apiCall.bin.FSSAIFood;
import com.chi.centraldashboard.apiCall.bin.FSSAILicensing;
import com.chi.centraldashboard.apiCall.bin.FSSAIManPower;
import com.chi.centraldashboard.apiCall.bin.FSSAIPrimary;
import com.chi.centraldashboard.apiCall.bin.FSSAIState;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FSSAIActivity extends MiQualityOfHealthServiceActivity {
    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown, btnRed;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    ORSCusRecViewThreeAdapter orsCusRecViewThreeAdapter;
    IHCusRecViewSixAdapter ihCusRecViewSixAdapter;
    HPECusREcviewFiveAdapter hpeCusREcviewFiveAdapter;
    EHospitalCusRecViewThreeAdapter eHospitalCusRecViewThreeAdapter;
    BloodBankCusRecviewFourAdapter bloodBankCusRecviewFourAdapter;

    private List<FSSAIDataList> fssaiDataListList;
    private List<FSSAIState> fssaiStateList;
    private List<FSSAIPrimary> fssaiPrimaryList;
    private List<FSSAIManPower> fssaiManPowerList;
    private List<FSSAILicensing> fssaiLicensingList;
    private List<FSSAIFSWS> fssaifswsList;
    private List<FSSAIFood> fssaiFoodList;
    Call<FSSAIData> fssaiDataCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_qualityofhealthservicesframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_fssai, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_fssaiorange);
        btnBlue = (Button) findViewById(R.id.btn_fssaiblue);
        btnLGreen = (Button) findViewById(R.id.btn_fssailgreen);
        btnGreen = (Button) findViewById(R.id.btn_fssaigreen);
        btnBrown = (Button) findViewById(R.id.btn_fssaibrown);
        btnRed = (Button) findViewById(R.id.btn_fssaired);


        recyclerView = (RecyclerView) findViewById(R.id.recview_fssai);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        fssaiDataListList = new ArrayList<>();
        fssaiStateList = new ArrayList<>();
        fssaiPrimaryList = new ArrayList<>();
        fssaiManPowerList = new ArrayList<>();
        fssaiLicensingList = new ArrayList<>();
        fssaifswsList = new ArrayList<>();
        fssaiFoodList = new ArrayList<>();
        fssaiDataCall = apiInterface.fssaiData();
        fssaiDataCall.enqueue(new Callback<FSSAIData>() {
            @Override
            public void onResponse(Call<FSSAIData> call, Response<FSSAIData> response) {
                fssaiDataListList.addAll(response.body().getFssaiDataListList());
                fssaiStateList.addAll(fssaiDataListList.get(0).getFssaiStateList());
                fssaiPrimaryList.addAll(fssaiDataListList.get(0).getFssaiPrimaryList());
                fssaiManPowerList.addAll(fssaiDataListList.get(0).getFssaiManPowerList());
                fssaiLicensingList.addAll(fssaiDataListList.get(0).getFssaiLicensingList());
                fssaifswsList.addAll(fssaiDataListList.get(0).getFssaifswsList());
                fssaiFoodList.addAll(fssaiDataListList.get(0).getFssaiFoodList());

                orsCusRecViewThreeAdapter = new ORSCusRecViewThreeAdapter(getApplicationContext(), fssaiStateList, "FSSAIState");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(orsCusRecViewThreeAdapter);
                orsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(fssaiStateList.get(1).getTotal_Number_of_State_Food_Laboratories_strengthened());
                btnBlue.setText(fssaiPrimaryList.get(1).getTotal_Number_Primary_Food_Testing_Laboratories());
                btnLGreen.setText(fssaiManPowerList.get(1).getTotal_Number_FSSAI_Manpower_Posts());
                btnGreen.setText(fssaiLicensingList.get(1).getTotal_Number_Licensing_and_Registration_of_FBOs());
                btnBrown.setText(fssaifswsList.get(1).getTotal_Number_of_Food_Safety_On_Wheels_FSWS_Provided());
                btnRed.setText(fssaiFoodList.get(1).getTotal_Number_of_Referral_Food_Testing_Laboratories());

            }

            @Override
            public void onFailure(Call<FSSAIData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orsCusRecViewThreeAdapter = new ORSCusRecViewThreeAdapter(getApplicationContext(), fssaiStateList, "FSSAIState");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(orsCusRecViewThreeAdapter);
                orsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ihCusRecViewSixAdapter = new IHCusRecViewSixAdapter(getApplicationContext(), fssaiPrimaryList, "FSSAIPrimary");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ihCusRecViewSixAdapter);
                ihCusRecViewSixAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hpeCusREcviewFiveAdapter = new HPECusREcviewFiveAdapter(getApplicationContext(), fssaiManPowerList, fssaiLicensingList,"FSSAIManPower");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(hpeCusREcviewFiveAdapter);
                hpeCusREcviewFiveAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hpeCusREcviewFiveAdapter = new HPECusREcviewFiveAdapter(getApplicationContext(), fssaiManPowerList, fssaiLicensingList,"FSSAILicensing");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(hpeCusREcviewFiveAdapter);
                hpeCusREcviewFiveAdapter.notifyDataSetChanged();
            }
        });

        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eHospitalCusRecViewThreeAdapter = new EHospitalCusRecViewThreeAdapter(getApplicationContext(), fssaifswsList,"FSSAIfsws");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(eHospitalCusRecViewThreeAdapter);
                eHospitalCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bloodBankCusRecviewFourAdapter = new BloodBankCusRecviewFourAdapter(getApplicationContext(), fssaiFoodList,"FSSAIfood");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(bloodBankCusRecviewFourAdapter);
                bloodBankCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });
    }
}
