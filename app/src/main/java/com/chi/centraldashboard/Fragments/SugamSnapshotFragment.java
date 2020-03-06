package com.chi.centraldashboard.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.chi.centraldashboard.Minister.Regulations.SugamCusRecviewSevenAdapter;
import com.chi.centraldashboard.Minister.Regulations.SugamRecyclerviewActivity;
import com.chi.centraldashboard.Minister.Regulations.SugamCusRecviewThreeAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamAppApprovedDMDC;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamAppApprovedPersonalUse;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamAppReceivedDMDC;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamAppReceivedPersonalUse;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamApprovedCT;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamApprovedTL;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamCDSCO;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamConductingCT;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamData;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamFirmsRegDMDC;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamFormulationData;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamManufacturingSite;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamReceivedTL;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SugamSnapshotFragment extends Fragment {

    Button btn_manufacturingsite, btn_formulationdata, btn_tappCDSCO, btn_regimportDMDC, btn_appreceivedTL, btn_appapprovedTL, btn_appreceivedimportDMDC, btn_appapprovedimportDMDC, btn_appreceivedconductingCTI, btn_appapprovedconductingCTI, btn_appreceivedpersonaluse, btn_appapprovedpersonaluse;
    private ApiInterface apiInterface;
    ConnectionDetector cd;
    private SugamCusRecviewSevenAdapter sugamCusRecviewSevenAdapter;
    private SugamCusRecviewThreeAdapter sugamCusRecviewThreeAdapter;


    private List<MinisterSugamDataList> ministerSugamDataListList;
    private List<MinisterSugamManufacturingSite> ministerSugamManufacturingSiteList;
    private List<MinisterSugamFormulationData> ministerSugamFormulationDataList;
    private List<MinisterSugamCDSCO> ministerSugamCDSCOList;

    private List<MinisterSugamFirmsRegDMDC> ministerSugamFirmsRegDMDCList;
    private List<MinisterSugamReceivedTL> ministerSugamReceivedTLList;
    private List<MinisterSugamApprovedTL> ministerSugamApprovedTLList;
    private List<MinisterSugamAppReceivedDMDC> ministerSugamAppReceivedDMDCList;
    private List<MinisterSugamAppApprovedDMDC> ministerSugamAppApprovedDMDCList;
    private List<MinisterSugamConductingCT> ministerSugamConductingCTList;
    private List<MinisterSugamApprovedCT> ministerSugamApprovedCTList;
    private List<MinisterSugamAppReceivedPersonalUse> ministerSugamAppReceivedPersonalUseList;
    private List<MinisterSugamAppApprovedPersonalUse> ministerSugamAppApprovedPersonalUseList;


    Call<MinisterSugamData> ministerSugamDataCall;


//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        try {
//            sugamRecviewInterface = (SugamRecviewInterface) context;
//        } catch (ClassCastException e) {
//            throw new ClassCastException(context.toString()
//                    + " must implement SugamRecviewInterface");
//        }
//    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sugam_snapshot, container, false);

        btn_manufacturingsite = (Button) view.findViewById(R.id.btn_manufacturingsite);
        btn_formulationdata = (Button) view.findViewById(R.id.btn_formulationdata);
        btn_tappCDSCO = (Button) view.findViewById(R.id.btn_tappCDSCO);
        btn_regimportDMDC = (Button) view.findViewById(R.id.btn_regimportDMDC);


        btn_appreceivedTL = (Button) view.findViewById(R.id.btn_appreceivedTL);
        btn_appapprovedTL = (Button) view.findViewById(R.id.btn_appapprovedTL);
        btn_appreceivedimportDMDC = (Button) view.findViewById(R.id.btn_appreceivedimportDMDC);
        btn_appapprovedimportDMDC = (Button) view.findViewById(R.id.btn_appapprovedimportDMDC);


        btn_appreceivedconductingCTI = (Button) view.findViewById(R.id.btn_appreceivedconductingCTI);
        btn_appapprovedconductingCTI = (Button) view.findViewById(R.id.btn_appapprovedconductingCTI);
        btn_appreceivedpersonaluse = (Button) view.findViewById(R.id.btn_appreceivedpersonaluse);
        btn_appapprovedpersonaluse = (Button) view.findViewById(R.id.btn_appapprovedpersonaluse);


        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        ministerSugamDataListList = new ArrayList<>();
        ministerSugamManufacturingSiteList = new ArrayList<>();
        ministerSugamFormulationDataList = new ArrayList<>();
        ministerSugamCDSCOList = new ArrayList<>();
        ministerSugamFirmsRegDMDCList = new ArrayList<>();
        ministerSugamReceivedTLList = new ArrayList<>();
        ministerSugamApprovedTLList = new ArrayList<>();
        ministerSugamAppReceivedDMDCList = new ArrayList<>();
        ministerSugamAppApprovedDMDCList = new ArrayList<>();
        ministerSugamConductingCTList = new ArrayList<>();
        ministerSugamApprovedCTList = new ArrayList<>();
        ministerSugamAppReceivedPersonalUseList = new ArrayList<>();
        ministerSugamAppApprovedPersonalUseList = new ArrayList<>();

        ministerSugamDataCall = apiInterface.ministerSugamData();
        ministerSugamDataCall.enqueue(new Callback<MinisterSugamData>() {
            @Override
            public void onResponse(Call<MinisterSugamData> call, Response<MinisterSugamData> response) {
                Log.i("RSsugam", "" + response);
                ministerSugamDataListList.addAll(response.body().getMinisterSugamDataListList());
                ministerSugamManufacturingSiteList.addAll(ministerSugamDataListList.get(0).getMinisterSugamManufacturingSiteList());
                ministerSugamFormulationDataList.addAll(ministerSugamDataListList.get(0).getMinisterSugamFormulationDataList());
                ministerSugamCDSCOList.addAll(ministerSugamDataListList.get(0).getMinisterSugamCDSCOList());
                ministerSugamFirmsRegDMDCList.addAll(ministerSugamDataListList.get(0).getMinisterSugamFirmsRegDMDCList());
                ministerSugamReceivedTLList.addAll(ministerSugamDataListList.get(0).getMinisterSugamReceivedTLList());
                ministerSugamApprovedTLList.addAll(ministerSugamDataListList.get(0).getMinisterSugamApprovedTLList());
                ministerSugamAppReceivedDMDCList.addAll(ministerSugamDataListList.get(0).getMinisterSugamAppReceivedDMDCList());
                ministerSugamAppApprovedDMDCList.addAll(ministerSugamDataListList.get(0).getMinisterSugamAppApprovedDMDCList());
                ministerSugamConductingCTList.addAll(ministerSugamDataListList.get(0).getMinisterSugamConductingCTList());
                ministerSugamApprovedCTList.addAll(ministerSugamDataListList.get(0).getMinisterSugamApprovedCTList());
                ministerSugamAppReceivedPersonalUseList.addAll(ministerSugamDataListList.get(0).getMinisterSugamAppReceivedPersonalUseList());
                ministerSugamAppApprovedPersonalUseList.addAll(ministerSugamDataListList.get(0).getMinisterSugamAppApprovedPersonalUseList());


                btn_manufacturingsite.setText(ministerSugamManufacturingSiteList.get(1).getTotal_Number_of_Manufacturing_Site());
                btn_formulationdata.setText(ministerSugamFormulationDataList.get(1).getTotal_Number_of_Formulation_Data());
                btn_tappCDSCO.setText(ministerSugamCDSCOList.get(1).getSum_Application_in_CDSCO());
                btn_regimportDMDC.setText(ministerSugamFirmsRegDMDCList.get(1).getTotal_Firms_Registered_for_Import_of_Drug_Medical_Devices_Cosmetics());
                btn_appreceivedTL.setText(ministerSugamReceivedTLList.get(1).getTotal_Received_for_Test_Licenses());
                btn_appapprovedTL.setText(ministerSugamApprovedTLList.get(1).getTotal_Approved_for_Test_Licenses());
                btn_appreceivedimportDMDC.setText(ministerSugamAppReceivedDMDCList.get(1).getTotal_Received_for_Import_of_Drug_Medical_Devices_Cosmetics());
                btn_appapprovedimportDMDC.setText(ministerSugamAppApprovedDMDCList.get(1).getTotal_Approved_for_Import_of_Drug_Medical_Devices_Cosmetics());
                btn_appreceivedconductingCTI.setText(ministerSugamConductingCTList.get(1).getTotal_Received_for_Conducting_Clinical_Trial_in_India());
                btn_appapprovedconductingCTI.setText(ministerSugamApprovedCTList.get(1).getTotal_Approved_for_Clinical_Trial_in_India());
                btn_appreceivedpersonaluse.setText(ministerSugamAppReceivedPersonalUseList.get(1).getTotal_Received_for_Import_of_Life_Saving_Drugs_for_Personal_Use());
                btn_appapprovedpersonaluse.setText(ministerSugamAppApprovedPersonalUseList.get(1).getTotal_Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use());

            }

            @Override
            public void onFailure(Call<MinisterSugamData> call, Throwable t) {


            }
        });

        btn_manufacturingsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SugamRecyclerviewActivity.class);
                intent.putExtra("RSkey", "manufacturing");
                getActivity().startActivity(intent);
            }
        });

        btn_formulationdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SugamRecyclerviewActivity.class);
                intent.putExtra("RSkey", "formulation");
                getActivity().startActivity(intent);
            }
        });

        btn_tappCDSCO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//


                Intent intent = new Intent(getActivity(), SugamRecyclerviewActivity.class);
                intent.putExtra("RSkey", "cdsco");
                getActivity().startActivity(intent);
            }
        });

        btn_regimportDMDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SugamRecyclerviewActivity.class);
                intent.putExtra("RSkey", "regimportDMDC");
                getActivity().startActivity(intent);
            }
        });

        btn_appreceivedTL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SugamRecyclerviewActivity.class);
                intent.putExtra("RSkey", "appreceivedTL");
                getActivity().startActivity(intent);
            }
        });

        btn_appapprovedTL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SugamRecyclerviewActivity.class);
                intent.putExtra("RSkey", "appapprovedTL");
                getActivity().startActivity(intent);
            }
        });

        btn_appreceivedimportDMDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SugamRecyclerviewActivity.class);
                intent.putExtra("RSkey", "receivedDMDC");
                getActivity().startActivity(intent);
            }
        });

        btn_appapprovedimportDMDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SugamRecyclerviewActivity.class);
                intent.putExtra("RSkey", "approvedDMDC");
                getActivity().startActivity(intent);
            }
        });

        btn_appreceivedconductingCTI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SugamRecyclerviewActivity.class);
                intent.putExtra("RSkey", "receivedCT");
                getActivity().startActivity(intent);
            }
        });
        btn_appapprovedconductingCTI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SugamRecyclerviewActivity.class);
                intent.putExtra("RSkey", "approvedCT");
                getActivity().startActivity(intent);
            }
        });


        btn_appreceivedpersonaluse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SugamRecyclerviewActivity.class);
                intent.putExtra("RSkey", "receivedPersonalUse");
                getActivity().startActivity(intent);
            }
        });

        btn_appapprovedpersonaluse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SugamRecyclerviewActivity.class);
                intent.putExtra("RSkey", "approvedPersonalUse");
                getActivity().startActivity(intent);
            }
        });
        return view;

    }


}
