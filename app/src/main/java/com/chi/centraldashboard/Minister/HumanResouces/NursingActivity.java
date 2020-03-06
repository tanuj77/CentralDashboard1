package com.chi.centraldashboard.Minister.HumanResouces;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.NursingCentralSector;
import com.chi.centraldashboard.apiCall.bin.NursingCourses;
import com.chi.centraldashboard.apiCall.bin.NursingData;
import com.chi.centraldashboard.apiCall.bin.NursingDataList;
import com.chi.centraldashboard.apiCall.bin.NursingInstitute;
import com.chi.centraldashboard.apiCall.bin.NursingNationalInstitute;
import com.chi.centraldashboard.apiCall.bin.NursingSeats;
import com.chi.centraldashboard.apiCall.bin.NursingStateWise;
import com.chi.centraldashboard.apiCall.bin.NursingUpgradation;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NursingActivity extends MiHumanResource {
    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown, btnRed, btnLemon, btnPink;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    NursingRecviewNineAdapter nursingRecviewNineAdapter;

    private List<NursingDataList> nursingDataListList;
    private List<NursingStateWise> nursingStateWiseList;
    private List<NursingCentralSector> nursingCentralSectorList;
    private List<NursingCourses> nursingCoursesList;
    private List<NursingNationalInstitute> nursingNationalInstituteList;
    private List<NursingSeats> nursingSeatsList;
    private List<NursingUpgradation> nursingUpgradationList;
    private List<NursingInstitute> nursingInstituteList;

    Call<NursingData> nursingDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_nursing);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_hrframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_nursing, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_nurseorange);
        btnBlue = (Button) findViewById(R.id.btn_nurseblue);
        btnLGreen = (Button) findViewById(R.id.btn_nurselgreen);
        btnGreen = (Button) findViewById(R.id.btn_nursegreen);
        btnBrown = (Button) findViewById(R.id.btn_nursebrown);
        btnRed = (Button) findViewById(R.id.btn_nursered);
        btnLemon = (Button) findViewById(R.id.btn_nurselemon);


        recyclerView = (RecyclerView) findViewById(R.id.recview_nurse);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        nursingDataListList = new ArrayList<>();
        nursingStateWiseList = new ArrayList<>();
        nursingCentralSectorList = new ArrayList<>();
        nursingCoursesList = new ArrayList<>();
        nursingNationalInstituteList = new ArrayList<>();
        nursingSeatsList = new ArrayList<>();
        nursingUpgradationList = new ArrayList<>();
        nursingInstituteList = new ArrayList<>();
        nursingDataCall = apiInterface.nursingData();
        nursingDataCall.enqueue(new Callback<NursingData>() {
            @Override
            public void onResponse(Call<NursingData> call, Response<NursingData> response) {
                nursingDataListList.addAll(response.body().getNursingDataListList());
                nursingStateWiseList.addAll(nursingDataListList.get(0).getNursingStateWiseList());
                nursingCentralSectorList.addAll(nursingDataListList.get(0).getNursingCentralSectorList());
                nursingCoursesList.addAll(nursingDataListList.get(0).getNursingCoursesList());
                nursingNationalInstituteList.addAll(nursingDataListList.get(0).getNursingNationalInstituteList());
                nursingSeatsList.addAll(nursingDataListList.get(0).getNursingSeatsList());
                nursingUpgradationList.addAll(nursingDataListList.get(0).getNursingUpgradationList());
                nursingInstituteList.addAll(nursingDataListList.get(0).getNursingInstituteList());


                nursingRecviewNineAdapter = new NursingRecviewNineAdapter(getApplicationContext(), nursingStateWiseList, nursingCentralSectorList, nursingCoursesList, nursingNationalInstituteList, nursingSeatsList, nursingUpgradationList, nursingInstituteList, "Statewise");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nursingRecviewNineAdapter);
                nursingRecviewNineAdapter.notifyDataSetChanged();

                btnOrange.setText(nursingStateWiseList.get(1).getTotal_Number_of_State_Wise_Nursing_Institute());
                btnBlue.setText(nursingCentralSectorList.get(1).getTotal_Number_of_Central_Sector_Schemes_Development_of_Nursing_Services());
                btnLGreen.setText(nursingCoursesList.get(1).getTotal_Number_of_Courses());
                btnGreen.setText(nursingNationalInstituteList.get(1).getTotal_Number_of_Nursing_Institutes());
                btnBrown.setText(nursingSeatsList.get(1).getAnnual_Admission_Capacity_Seats());
                btnRed.setText(nursingUpgradationList.get(1).getTotal_Number_of_Central_Sponsored_Upgradation_strengthening_of_Nursing_Services_ANM_GNM());
                btnLemon.setText(nursingInstituteList.get(1).getNursing_Institute());


            }

            @Override
            public void onFailure(Call<NursingData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nursingRecviewNineAdapter = new NursingRecviewNineAdapter(getApplicationContext(), nursingStateWiseList, nursingCentralSectorList, nursingCoursesList, nursingNationalInstituteList, nursingSeatsList, nursingUpgradationList, nursingInstituteList, "Statewise");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nursingRecviewNineAdapter);
                nursingRecviewNineAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nursingRecviewNineAdapter = new NursingRecviewNineAdapter(getApplicationContext(), nursingStateWiseList, nursingCentralSectorList, nursingCoursesList, nursingNationalInstituteList, nursingSeatsList, nursingUpgradationList, nursingInstituteList, "CentralSector");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nursingRecviewNineAdapter);
                nursingRecviewNineAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nursingRecviewNineAdapter = new NursingRecviewNineAdapter(getApplicationContext(), nursingStateWiseList, nursingCentralSectorList, nursingCoursesList, nursingNationalInstituteList, nursingSeatsList, nursingUpgradationList, nursingInstituteList, "Courses");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nursingRecviewNineAdapter);
                nursingRecviewNineAdapter.notifyDataSetChanged();
            }
        });
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nursingRecviewNineAdapter = new NursingRecviewNineAdapter(getApplicationContext(), nursingStateWiseList, nursingCentralSectorList, nursingCoursesList, nursingNationalInstituteList, nursingSeatsList, nursingUpgradationList, nursingInstituteList, "NationalInstitute");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nursingRecviewNineAdapter);
                nursingRecviewNineAdapter.notifyDataSetChanged();
            }
        });


        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nursingRecviewNineAdapter = new NursingRecviewNineAdapter(getApplicationContext(), nursingStateWiseList, nursingCentralSectorList, nursingCoursesList, nursingNationalInstituteList, nursingSeatsList, nursingUpgradationList, nursingInstituteList, "Seats");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nursingRecviewNineAdapter);
                nursingRecviewNineAdapter.notifyDataSetChanged();
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nursingRecviewNineAdapter = new NursingRecviewNineAdapter(getApplicationContext(), nursingStateWiseList, nursingCentralSectorList, nursingCoursesList, nursingNationalInstituteList, nursingSeatsList, nursingUpgradationList, nursingInstituteList, "Upgradation");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nursingRecviewNineAdapter);
                nursingRecviewNineAdapter.notifyDataSetChanged();
            }
        });

        btnLemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nursingRecviewNineAdapter = new NursingRecviewNineAdapter(getApplicationContext(), nursingStateWiseList, nursingCentralSectorList, nursingCoursesList, nursingNationalInstituteList, nursingSeatsList, nursingUpgradationList, nursingInstituteList, "Institute");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nursingRecviewNineAdapter);
                nursingRecviewNineAdapter.notifyDataSetChanged();
            }
        });




    }
}
