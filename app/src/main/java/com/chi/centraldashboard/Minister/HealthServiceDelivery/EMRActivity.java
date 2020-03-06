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
import com.chi.centraldashboard.apiCall.bin.EMRCBRN;
import com.chi.centraldashboard.apiCall.bin.EMRData;
import com.chi.centraldashboard.apiCall.bin.EMRDataList;
import com.chi.centraldashboard.apiCall.bin.EMRMedicalPersonTrained;
import com.chi.centraldashboard.apiCall.bin.EMROperationCenters;
import com.chi.centraldashboard.apiCall.bin.EMRPersonalTrained;
import com.chi.centraldashboard.apiCall.bin.EMRSkillCenters;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EMRActivity extends MiHealthServiceDeliveryActivity {
    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown;

    private PMJAYCusRecViewThreeAdapter pmjayCusRecViewThreeAdapter;
    private FamilyPlaningRecviewCusFiveAdapter familyPlaningRecviewCusAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    private RecyclerView recyclerView;

    EMRData emrData;
    private List<EMRDataList> emrDataListList;
    private List<EMRSkillCenters> emrSkillCentersList;
    private List<EMRPersonalTrained> emrPersonalTrainedList;
    private List<EMRMedicalPersonTrained> emrMedicalPersonTrainedList;
    private List<EMRCBRN> emrcbrnList;
    private List<EMROperationCenters> emrOperationCentersList;

    Call<EMRData> emrDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_healthservicedeliveryframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_emr, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_emrorange);
        btnBlue = (Button) findViewById(R.id.btn_emrblue);
        btnLGreen = (Button) findViewById(R.id.btn_emrlgreen);
        btnGreen = (Button) findViewById(R.id.btn_emrgreen);
        btnBrown = (Button) findViewById(R.id.btn_emrbrown);

        recyclerView = (RecyclerView) findViewById(R.id.recview_emr);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        emrData = new EMRData();
        emrDataListList = new ArrayList<>();
        emrSkillCentersList = new ArrayList<>();
        emrPersonalTrainedList = new ArrayList<>();
        emrMedicalPersonTrainedList = new ArrayList<>();
        emrcbrnList = new ArrayList<>();
        emrOperationCentersList = new ArrayList<>();
        emrDataCall = apiInterface.emrData();
        emrDataCall.enqueue(new Callback<EMRData>() {
            @Override
            public void onResponse(Call<EMRData> call, Response<EMRData> response) {
                emrDataListList.addAll(response.body().getEmrDataListList());
                emrSkillCentersList.addAll(emrDataListList.get(0).getEmrSkillCentersList());
                emrPersonalTrainedList.addAll(emrDataListList.get(0).getEmrPersonalTrainedList());
                emrMedicalPersonTrainedList.addAll(emrDataListList.get(0).getEmrMedicalPersonTrainedList());
                emrcbrnList.addAll(emrDataListList.get(0).getEmrcbrnList());
                emrOperationCentersList.addAll(emrDataListList.get(0).getEmrOperationCentersList());

                recyclerView.setVisibility(View.VISIBLE);
                familyPlaningRecviewCusAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), emrSkillCentersList, emrPersonalTrainedList, emrMedicalPersonTrainedList, emrcbrnList, emrOperationCentersList, "SkillCenters");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusAdapter);
                familyPlaningRecviewCusAdapter.notifyDataSetChanged();

                btnOrange.setText(emrSkillCentersList.get(1).getTotal_No_of_Skill_Centres_on_National_Emergency_Life_Support());
                btnBlue.setText(emrPersonalTrainedList.get(1).getTotal_Number_of_personnel_trained_in_Emergency_Life_Support());
                btnLGreen.setText(emrMedicalPersonTrainedList.get(1).getTotal_Number_of_Medical_Personnel_trained());
                btnGreen.setText(emrcbrnList.get(1).getTotal_Number_of_CBRN_Medical_Management_Centres());
                btnBrown.setText(emrOperationCentersList.get(1).getTotal_Number_of_Health_Emergency_Operation_Centres());

            }

            @Override
            public void onFailure(Call<EMRData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                familyPlaningRecviewCusAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), emrSkillCentersList, emrPersonalTrainedList, emrMedicalPersonTrainedList, emrcbrnList, emrOperationCentersList, "SkillCenters");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusAdapter);
                familyPlaningRecviewCusAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                familyPlaningRecviewCusAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), emrSkillCentersList, emrPersonalTrainedList, emrMedicalPersonTrainedList, emrcbrnList, emrOperationCentersList, "PersonalTrained");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusAdapter);
                familyPlaningRecviewCusAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sr_no = emrMedicalPersonTrainedList.get(1).getSR_NO();
                if (sr_no.equalsIgnoreCase("") || sr_no == "") {
                    recyclerView.setVisibility(View.INVISIBLE);
                } else {
                    recyclerView.setVisibility(View.VISIBLE);
                    familyPlaningRecviewCusAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), emrSkillCentersList, emrPersonalTrainedList, emrMedicalPersonTrainedList, emrcbrnList, emrOperationCentersList, "MedicalPersonalTrained");
                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(familyPlaningRecviewCusAdapter);
                    familyPlaningRecviewCusAdapter.notifyDataSetChanged();
                }
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                familyPlaningRecviewCusAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), emrSkillCentersList, emrPersonalTrainedList, emrMedicalPersonTrainedList, emrcbrnList, emrOperationCentersList, "CBRN");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusAdapter);
                familyPlaningRecviewCusAdapter.notifyDataSetChanged();
            }
        });

        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                familyPlaningRecviewCusAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), emrSkillCentersList, emrPersonalTrainedList, emrMedicalPersonTrainedList, emrcbrnList, emrOperationCentersList, "OperationCenters");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusAdapter);
                familyPlaningRecviewCusAdapter.notifyDataSetChanged();
            }
        });
    }
}
