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
import com.chi.centraldashboard.apiCall.bin.MaternalHealth;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthANCCheckup;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthAntenatalCare;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthInstitutionalDelivery;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthList;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthNationallyCertified;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthPHF;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthPMSMA;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthStateCertified;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MaternalHealthActivity extends MiHealthServiceDeliveryActivity {
    Button btnOrange, btnBlue, btnGreen, btnOrange2, btnBlue2, btnGreen2, btnOrange3;
    RecyclerView recyclerView;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private FamilyPlaningRecviewCusFiveAdapter familyPlaningRecviewCusAdapter;
    private PMJAYCusRecViewThreeAdapter pmjayCusRecViewThreeAdapter;
    private ApiInterface apiInterface;

    private List<MaternalHealthList> maternalHealthListList;
    private List<MaternalHealthAntenatalCare> antenatalCareList;
    private List<MaternalHealthInstitutionalDelivery> institutionalDeliveryList;
    private List<MaternalHealthANCCheckup> ancCheckupList;
    private List<MaternalHealthPMSMA> pmsmaList;
    private List<MaternalHealthPHF> phfList;
    private List<MaternalHealthStateCertified> stateCertifiedList;
    private List<MaternalHealthNationallyCertified> nationallyCertifiedList;
    Call<MaternalHealth> maternalHealthCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content_healthservicedeliveryframe);
        getLayoutInflater().inflate(R.layout.activity_maternalhealth, frameLayout);

        btnOrange = (Button) findViewById(R.id.btn_mhorange);
        btnBlue = (Button) findViewById(R.id.btn_mhblue);
        btnGreen = (Button) findViewById(R.id.btn_mhgreen);
        btnOrange2 = (Button) findViewById(R.id.btn_mhorange2);
        btnBlue2 = (Button) findViewById(R.id.btn_mhblue2);
        btnGreen2 = (Button) findViewById(R.id.btn_mhgreen2);
        btnOrange3 = (Button) findViewById(R.id.btn_mhorange3);

        recyclerView = (RecyclerView) findViewById(R.id.recview_maternalhealth);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        maternalHealthListList = new ArrayList<>();
        antenatalCareList = new ArrayList<>();
        institutionalDeliveryList = new ArrayList<>();
        ancCheckupList = new ArrayList<>();
        pmsmaList = new ArrayList<>();
        phfList = new ArrayList<>();
        stateCertifiedList = new ArrayList<>();
        nationallyCertifiedList = new ArrayList<>();

        maternalHealthCall = apiInterface.maternalHealth();
        maternalHealthCall.enqueue(new Callback<MaternalHealth>() {
            @Override
            public void onResponse(Call<MaternalHealth> call, Response<MaternalHealth> response) {
                maternalHealthListList.addAll(response.body().getMaternalHealthListList());
                antenatalCareList.addAll(maternalHealthListList.get(0).getMaternalHealthAntenatalCareList());
                institutionalDeliveryList.addAll(maternalHealthListList.get(0).getMaternalHealthInstitutionalDeliveryList());
                ancCheckupList.addAll(maternalHealthListList.get(0).getMaternalHealthANCCheckupList());
                pmsmaList.addAll(maternalHealthListList.get(0).getMaternalHealthPMSMAList());
                phfList.addAll(maternalHealthListList.get(0).getMaternalHealthPHFList());
                stateCertifiedList.addAll(maternalHealthListList.get(0).getMaternalHealthStateCertifiedList());
                nationallyCertifiedList.addAll(maternalHealthListList.get(0).getMaternalHealthNationallyCertifiedList());

                familyPlaningRecviewCusAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), antenatalCareList, institutionalDeliveryList, ancCheckupList, "antenatalCare");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusAdapter);
                familyPlaningRecviewCusAdapter.notifyDataSetChanged();

                btnOrange.setText(antenatalCareList.get(1).getTotal_Antenatal_Care());
                btnBlue.setText(institutionalDeliveryList.get(1).getTotal_Institutional_Delivery());
                btnGreen.setText(ancCheckupList.get(1).getTotal_ANC_Checkup());
                btnOrange2.setText(pmsmaList.get(1).getTotal_ANC_conducted());
                btnBlue2.setText(phfList.get(1).getTotal_public_health_laQshya());
                btnGreen2.setText(stateCertifiedList.get(1).getTotal_Labour_Rooms_and_Operation_Theatres_state());
                btnOrange3.setText(nationallyCertifiedList.get(1).getTotal_Labour_Rooms_and_Operation_Theatres_Nationally());

            }

            @Override
            public void onFailure(Call<MaternalHealth> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), antenatalCareList, institutionalDeliveryList, ancCheckupList, "antenatalCare");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusAdapter);
                familyPlaningRecviewCusAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), antenatalCareList, institutionalDeliveryList, ancCheckupList, "institutional");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusAdapter);
                familyPlaningRecviewCusAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), antenatalCareList, institutionalDeliveryList, ancCheckupList, "anccheckup");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusAdapter);
                familyPlaningRecviewCusAdapter.notifyDataSetChanged();
            }
        });

        btnOrange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), pmsmaList, phfList, stateCertifiedList, nationallyCertifiedList, "pmsma");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), pmsmaList, phfList, stateCertifiedList, nationallyCertifiedList, "phf");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnGreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), pmsmaList, phfList, stateCertifiedList, nationallyCertifiedList, "statecertified");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnOrange3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), pmsmaList, phfList, stateCertifiedList, nationallyCertifiedList, "nationallycertified");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
    }
}
