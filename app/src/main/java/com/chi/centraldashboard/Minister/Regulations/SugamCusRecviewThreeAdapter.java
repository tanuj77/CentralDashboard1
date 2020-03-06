package com.chi.centraldashboard.Minister.Regulations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamAppApprovedDMDC;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamAppApprovedPersonalUse;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamAppReceivedDMDC;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamAppReceivedPersonalUse;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamApprovedCT;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamApprovedTL;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamConductingCT;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamFirmsRegDMDC;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamReceivedTL;

import java.util.ArrayList;
import java.util.List;

public class SugamCusRecviewThreeAdapter extends RecyclerView.Adapter<SugamCusRecviewThreeAdapter.MyViewHolder> {

    Context mCtx;
    String typeMain;
    private List<MinisterSugamFirmsRegDMDC> ministerSugamFirmsRegDMDCList;
    private List<MinisterSugamReceivedTL> ministerSugamReceivedTLList;
    private List<MinisterSugamApprovedTL> ministerSugamApprovedTLList;
    private List<MinisterSugamAppReceivedDMDC> ministerSugamAppReceivedDMDCList;
    private List<MinisterSugamAppApprovedDMDC> ministerSugamAppApprovedDMDCList;
    private List<MinisterSugamConductingCT> ministerSugamConductingCTList;
    private List<MinisterSugamApprovedCT> ministerSugamApprovedCTList;
    private List<MinisterSugamAppReceivedPersonalUse> ministerSugamAppReceivedPersonalUseList;
    private List<MinisterSugamAppApprovedPersonalUse> ministerSugamAppApprovedPersonalUseList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvOne, tvTwo, tvThree;


        public MyViewHolder(View view) {
            super(view);

            tvOne = (TextView) view.findViewById(R.id.tv_tone);
            tvTwo = (TextView) view.findViewById(R.id.tv_ttwo);
            tvThree = (TextView) view.findViewById(R.id.tv_tthree);

        }
    }


    public SugamCusRecviewThreeAdapter(Context applicationContext, List<MinisterSugamFirmsRegDMDC> ministerSugamFirmsRegDMDCList, List<MinisterSugamReceivedTL> ministerSugamReceivedTLList, List<MinisterSugamApprovedTL> ministerSugamApprovedTLList, List<MinisterSugamAppReceivedDMDC> ministerSugamAppReceivedDMDCList, List<MinisterSugamAppApprovedDMDC> ministerSugamAppApprovedDMDCList, List<MinisterSugamConductingCT> ministerSugamConductingCTList, List<MinisterSugamApprovedCT> ministerSugamApprovedCTList, List<MinisterSugamAppReceivedPersonalUse> ministerSugamAppReceivedPersonalUseList, List<MinisterSugamAppApprovedPersonalUse> ministerSugamAppApprovedPersonalUseList, String type) {
        this.mCtx = applicationContext;
        this.ministerSugamFirmsRegDMDCList = ministerSugamFirmsRegDMDCList;

        this.ministerSugamReceivedTLList = ministerSugamReceivedTLList;
        this.ministerSugamApprovedTLList = ministerSugamApprovedTLList;
        this.ministerSugamAppReceivedDMDCList = ministerSugamAppReceivedDMDCList;
        this.ministerSugamAppApprovedDMDCList = ministerSugamAppApprovedDMDCList;
        this.ministerSugamConductingCTList = ministerSugamConductingCTList;
        this.ministerSugamApprovedCTList = ministerSugamApprovedCTList;
        this.ministerSugamAppReceivedPersonalUseList = ministerSugamAppReceivedPersonalUseList;
        this.ministerSugamAppApprovedPersonalUseList = ministerSugamAppApprovedPersonalUseList;

        this.typeMain = type;
    }


    @Override
    public SugamCusRecviewThreeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.msugam_threerecview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new SugamCusRecviewThreeAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SugamCusRecviewThreeAdapter.MyViewHolder holder, int position) {
        if (position == 0) {
            holder.itemView.setBackgroundResource(R.color.colorPrimaryDark);
        } else if (position % 2 == 0) {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
        } else {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.itemView.setBackgroundResource(R.color.White);
            //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        switch (typeMain) {
            case "regimportDMDC":
                final MinisterSugamFirmsRegDMDC dmdc = ministerSugamFirmsRegDMDCList.get(position);

                holder.tvOne.setText(dmdc.getSR_NO());
                holder.tvTwo.setText(dmdc.getState_Name());
                holder.tvThree.setText(dmdc.getValue());
                break;

            case "appreceivedTL":
                final MinisterSugamReceivedTL receivedTL = ministerSugamReceivedTLList.get(position);
                holder.tvOne.setText(receivedTL.getSR_NO());
                holder.tvTwo.setText(receivedTL.getState_Name());
                holder.tvThree.setText(receivedTL.getReceived_for_Test_Licenses());
                break;
            case "appapprovedTL":
                final MinisterSugamApprovedTL approvedTL = ministerSugamApprovedTLList.get(position);
                holder.tvOne.setText(approvedTL.getSR_NO());
                holder.tvTwo.setText(approvedTL.getState_Name());
                holder.tvThree.setText(approvedTL.getApproved_for_Test_Licenses());
                break;
            case "receivedDMDC":
                final MinisterSugamAppReceivedDMDC receivedDMDC = ministerSugamAppReceivedDMDCList.get(position);
                holder.tvOne.setText(receivedDMDC.getSR_NO());
                holder.tvTwo.setText(receivedDMDC.getState_Name());
                holder.tvThree.setText(receivedDMDC.getReceived_for_Import_of_Drug_Medical_Devices_Cosmetics());
                break;

            case "approvedDMDC":
                final MinisterSugamAppApprovedDMDC approvedDMDC = ministerSugamAppApprovedDMDCList.get(position);
                holder.tvOne.setText(approvedDMDC.getSR_NO());
                holder.tvTwo.setText(approvedDMDC.getState_Name());
                holder.tvThree.setText(approvedDMDC.getApproved_for_Import_of_Drug_Medical_Devices_Cosmetics());
                break;

            case "receivedCT":
                final MinisterSugamConductingCT conductingCT = ministerSugamConductingCTList.get(position);
                holder.tvOne.setText(conductingCT.getSR_NO());
                holder.tvTwo.setText(conductingCT.getState_Name());
                holder.tvThree.setText(conductingCT.getReceived_for_Conducting_Clinical_Trial_in_India());
                break;
            case "approvedCT":
                final MinisterSugamApprovedCT approvedCT = ministerSugamApprovedCTList.get(position);
                holder.tvOne.setText(approvedCT.getSR_NO());
                holder.tvTwo.setText(approvedCT.getState_Name());
                holder.tvThree.setText(approvedCT.getApproved_for_Clinical_Trial_in_India());
                break;

            case "receivedPersonalUse":
                final MinisterSugamAppReceivedPersonalUse receivedPersonalUse = ministerSugamAppReceivedPersonalUseList.get(position);
                holder.tvOne.setText(receivedPersonalUse.getSR_NO());
                holder.tvTwo.setText(receivedPersonalUse.getState_Name());
                holder.tvThree.setText(receivedPersonalUse.getReceived_for_Import_of_Life_Saving_Drugs_for_Personal_Use());
                break;

            case "approvedPersonalUse":
                final MinisterSugamAppApprovedPersonalUse approvedPersonalUse = ministerSugamAppApprovedPersonalUseList.get(position);
                holder.tvOne.setText(approvedPersonalUse.getSR_NO());
                holder.tvTwo.setText(approvedPersonalUse.getState_Name());
                holder.tvThree.setText(approvedPersonalUse.getApproved_for_Import_of_Life_Saving_Drugs_for_Personal_Use());
                break;
        }

//        if (typeMain.equalsIgnoreCase("regimportDMDC") || typeMain.equals("regimportDMDC")) {
//            final MinisterSugamFirmsRegDMDC dmdc = ministerSugamFirmsRegDMDCList.get(position);
//
//            holder.tvOne.setText(dmdc.getSR_NO());
//            holder.tvTwo.setText(dmdc.getState_Name());
//            holder.tvThree.setText(dmdc.getValue());
//
//        } else if (typeMain.equalsIgnoreCase("appreceivedTL") || typeMain.equals("appreceivedTL")) {
//            final MinisterSugamReceivedTL receivedTL = ministerSugamReceivedTLList.get(position);
//            holder.tvOne.setText(receivedTL.getSR_NO());
//            holder.tvTwo.setText(receivedTL.getState_Name());
//            holder.tvThree.setText(receivedTL.getReceived_for_Test_Licenses());
//
//        } else if (typeMain.equalsIgnoreCase("appapprovedTL") || typeMain.equals("appapprovedTL")) {
//            final MinisterSugamApprovedTL approvedTL = ministerSugamApprovedTLList.get(position);
//            holder.tvOne.setText(approvedTL.getSR_NO());
//            holder.tvTwo.setText(approvedTL.getState_Name());
//            holder.tvThree.setText(approvedTL.getApproved_for_Test_Licenses());
//
//        } else if (typeMain.equalsIgnoreCase("receivedDMDC") || typeMain.equals("receivedDMDC")) {
//            final MinisterSugamAppReceivedDMDC receivedDMDC = ministerSugamAppReceivedDMDCList.get(position);
//            holder.tvOne.setText(receivedDMDC.getSR_NO());
//            holder.tvTwo.setText(receivedDMDC.getState_Name());
//            holder.tvThree.setText(receivedDMDC.getReceived_for_Import_of_Drug_Medical_Devices_Cosmetics());
//
//        } else if (typeMain.equalsIgnoreCase("approvedDMDC") || typeMain.equals("approvedDMDC")) {
//            final MinisterSugamAppApprovedDMDC approvedDMDC = ministerSugamAppApprovedDMDCList.get(position);
//            holder.tvOne.setText(approvedDMDC.getSR_NO());
//            holder.tvTwo.setText(approvedDMDC.getState_Name());
//            holder.tvThree.setText(approvedDMDC.getApproved_for_Import_of_Drug_Medical_Devices_Cosmetics());
//
//        } else if (typeMain.equalsIgnoreCase("receivedCT") || typeMain.equals("receivedCT")) {
//            final MinisterSugamConductingCT conductingCT = ministerSugamConductingCTList.get(position);
//            holder.tvOne.setText(conductingCT.getSR_NO());
//            holder.tvTwo.setText(conductingCT.getState_Name());
//            holder.tvThree.setText(conductingCT.getReceived_for_Conducting_Clinical_Trial_in_India());
//
//        } else if (typeMain.equalsIgnoreCase("approvedCT") || typeMain.equals("approvedCT")) {
//            final MinisterSugamApprovedCT approvedCT = ministerSugamApprovedCTList.get(position);
//            holder.tvOne.setText(approvedCT.getSR_NO());
//            holder.tvTwo.setText(approvedCT.getState_Name());
//            holder.tvThree.setText(approvedCT.getApproved_for_Clinical_Trial_in_India());
//
//        } else if (typeMain.equalsIgnoreCase("receivedPersonalUse") || typeMain.equals("receivedPersonalUse")) {
//            final MinisterSugamAppReceivedPersonalUse receivedPersonalUse = ministerSugamAppReceivedPersonalUseList.get(position);
//            holder.tvOne.setText(receivedPersonalUse.getSR_NO());
//            holder.tvTwo.setText(receivedPersonalUse.getState_Name());
//            holder.tvThree.setText(receivedPersonalUse.getReceived_for_Import_of_Life_Saving_Drugs_for_Personal_Use());
//
//        } else if (typeMain.equalsIgnoreCase("approvedPersonalUse") || typeMain.equals("approvedPersonalUse")) {
//            final MinisterSugamAppApprovedPersonalUse approvedPersonalUse = ministerSugamAppApprovedPersonalUseList.get(position);
//            holder.tvOne.setText(approvedPersonalUse.getSR_NO());
//            holder.tvTwo.setText(approvedPersonalUse.getState_Name());
//            holder.tvThree.setText(approvedPersonalUse.getApproved_for_Import_of_Life_Saving_Drugs_for_Personal_Use());
//
//        }

    }


    @Override
    public int getItemCount() {

        if (typeMain.equalsIgnoreCase("regimportDMDC") || typeMain.equals("regimportDMDC")) {
            return ministerSugamFirmsRegDMDCList.size();
        } else if (typeMain.equalsIgnoreCase("appreceivedTL") || typeMain.equals("appreceivedTL")) {
            return ministerSugamReceivedTLList.size();
        } else if (typeMain.equalsIgnoreCase("appapprovedTL") || typeMain.equals("appapprovedTL")) {
            return ministerSugamApprovedTLList.size();
        } else if (typeMain.equalsIgnoreCase("receivedDMDC") || typeMain.equals("receivedDMDC")) {
            return ministerSugamAppReceivedDMDCList.size();
        } else if (typeMain.equalsIgnoreCase("approvedDMDC") || typeMain.equals("approvedDMDC")) {
            return ministerSugamAppApprovedDMDCList.size();
        } else if (typeMain.equalsIgnoreCase("receivedCT") || typeMain.equals("receivedCT")) {
            return ministerSugamConductingCTList.size();
        } else if (typeMain.equalsIgnoreCase("approvedCT") || typeMain.equals("approvedCT")) {
            return ministerSugamApprovedCTList.size();
        } else if (typeMain.equalsIgnoreCase("receivedPersonalUse") || typeMain.equals("receivedPersonalUse")) {
            return ministerSugamAppReceivedPersonalUseList.size();
        } else {
            return ministerSugamAppApprovedPersonalUseList.size();


        }
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterSugamFirmsRegDMDC> facilityTypeDetailsLists) {
        for (MinisterSugamFirmsRegDMDC ftdl : facilityTypeDetailsLists) {
            ministerSugamFirmsRegDMDCList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterSugamFirmsRegDMDC> newList) {
        ministerSugamFirmsRegDMDCList = new ArrayList<>();
        ministerSugamFirmsRegDMDCList.addAll(newList);
        notifyDataSetChanged();
    }
}

