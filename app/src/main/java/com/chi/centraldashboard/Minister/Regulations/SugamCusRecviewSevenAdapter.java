package com.chi.centraldashboard.Minister.Regulations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamCDSCO;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamFormulationData;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamManufacturingSite;
import com.chi.centraldashboard.apiCall.bin.NFHS_12_13immunized;
import com.chi.centraldashboard.apiCall.bin.NFHS_5years_stunted;
import com.chi.centraldashboard.apiCall.bin.NFHS_5years_wasted;
import com.chi.centraldashboard.apiCall.bin.SRS_CDR;
import com.chi.centraldashboard.apiCall.bin.SRS_IMR;
import com.chi.centraldashboard.apiCall.bin.SRS_U5;


import java.util.ArrayList;
import java.util.List;

public class SugamCusRecviewSevenAdapter extends RecyclerView.Adapter<SugamCusRecviewSevenAdapter.MyViewHolder> {

    Context mCtx;
    String typeMain;
    private List<MinisterSugamManufacturingSite> ministerSugamManufacturingSiteList;
    private List<MinisterSugamFormulationData> ministerSugamFormulationDataList;
    private List<MinisterSugamCDSCO> ministerSugamCDSCOList;

    private List<NFHS_12_13immunized> nfhs_12_13immunizedList;
    private List<NFHS_5years_stunted> nfhs_5years_stuntedList;
    private List<NFHS_5years_wasted> nfhs_5years_wastedList;

    private List<SRS_CDR> srs_cdrList;
    private List<SRS_IMR> srs_imrList;
    private List<SRS_U5> srs_u5List;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvOne, tvTwo, tvThree, tvFour, tvFive, tvSix, tvSeven;


        public MyViewHolder(View view) {
            super(view);

            tvOne = (TextView) view.findViewById(R.id.tv_one);
            tvTwo = (TextView) view.findViewById(R.id.tv_two);
            tvThree = (TextView) view.findViewById(R.id.tv_three);
            tvFour = (TextView) view.findViewById(R.id.tv_four);
            tvFive = (TextView) view.findViewById(R.id.tv_five);
            tvSix = (TextView) view.findViewById(R.id.tv_six);
            tvSeven = (TextView) view.findViewById(R.id.tv_seven);


        }
    }


    public SugamCusRecviewSevenAdapter(Context applicationContext, List<MinisterSugamManufacturingSite> ministerSugamManufacturingSiteList, List<MinisterSugamFormulationData> ministerSugamFormulationDataList, List<MinisterSugamCDSCO> ministerSugamCDSCOList, String type) {
        this.mCtx = applicationContext;
        this.ministerSugamManufacturingSiteList = ministerSugamManufacturingSiteList;
        this.ministerSugamFormulationDataList = ministerSugamFormulationDataList;
        this.ministerSugamCDSCOList = ministerSugamCDSCOList;
        this.typeMain = type;
    }


    ////NFHS
    public SugamCusRecviewSevenAdapter(Context context, List<NFHS_12_13immunized> nfhs_12_13immunizedList, List<NFHS_5years_stunted> nfhs_5years_stuntedList, List<NFHS_5years_wasted> nfhs_5years_wastedList, String nfhs_12_13immunized, int i) {
        this.mCtx = context;
        this.nfhs_12_13immunizedList = nfhs_12_13immunizedList;
        this.nfhs_5years_stuntedList = nfhs_5years_stuntedList;
        this.nfhs_5years_wastedList = nfhs_5years_wastedList;
        this.typeMain = nfhs_12_13immunized;
    }

    /////SRS
    public SugamCusRecviewSevenAdapter(Context context, List<SRS_CDR> srs_cdrList, List<SRS_IMR> srs_imrList, List<SRS_U5> srs_u5List, double v, String srs_cdr) {
        this.mCtx = context;
        this.srs_cdrList = srs_cdrList;
        this.srs_imrList = srs_imrList;
        this.srs_u5List = srs_u5List;
        this.typeMain = srs_cdr;
    }


    @Override
    public SugamCusRecviewSevenAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.msugam_sevenrecview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new SugamCusRecviewSevenAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SugamCusRecviewSevenAdapter.MyViewHolder holder, int position) {
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
            case "manufacturing":
                final MinisterSugamManufacturingSite manufacturingSite = ministerSugamManufacturingSiteList.get(position);

                holder.tvOne.setText(manufacturingSite.getSR_NO());
                holder.tvTwo.setText(manufacturingSite.getState_Name());
                holder.tvThree.setText(manufacturingSite.getTotalApplication1());
                holder.tvFour.setText(manufacturingSite.getSubmitted());
                holder.tvFive.setText(manufacturingSite.getApproved());
                holder.tvSix.setText(manufacturingSite.getRejected());
                break;

            case "formulation":
                final MinisterSugamFormulationData formulationData = ministerSugamFormulationDataList.get(position);
                holder.tvOne.setText(formulationData.getSR_NO());
                holder.tvTwo.setText(formulationData.getState_Name());
                holder.tvThree.setText(formulationData.getTotalApplication());
                holder.tvFour.setText(formulationData.getSubmitted());
                holder.tvFive.setText(formulationData.getApproved());
                holder.tvSix.setText(formulationData.getRejected());
                break;
            case "cdsco":
                final MinisterSugamCDSCO cdsco = ministerSugamCDSCOList.get(position);
                holder.tvOne.setText(cdsco.getSR_NO());
                holder.tvTwo.setText(cdsco.getDivision());
                holder.tvThree.setText(cdsco.getTotal_New_Applications_in_CDSCO());
                holder.tvFour.setText(cdsco.getTotal_Under_Process_Applications_in_CDSCO());
                holder.tvFive.setText(cdsco.getTotal_Raised_Applications_in_CDSCO());
                holder.tvSix.setText(cdsco.getTotal_Approved_Applications_in_CDSCO());
                holder.tvSeven.setText(cdsco.getTotal_Rejected_Applications_in_CDSCO());
                break;

            case "NFHS_12_13immunized":
                final NFHS_12_13immunized immunized = nfhs_12_13immunizedList.get(position);
                holder.tvOne.setText(immunized.getSR_NO());
                holder.tvTwo.setText(immunized.getState_Name());
                holder.tvThree.setText(immunized.getTotal());
                holder.tvFour.setText(immunized.getRural());
                holder.tvFive.setText(immunized.getUrban());
                holder.tvSix.setText(immunized.getMale());
                holder.tvSeven.setText(immunized.getFemale());
                break;

            case "NFHS_5years_stunted":
                final NFHS_5years_stunted stunted = nfhs_5years_stuntedList.get(position);
                holder.tvOne.setText(stunted.getSR_NO());
                holder.tvTwo.setText(stunted.getState_Name());
                holder.tvThree.setText(stunted.getTotal());
                holder.tvFour.setText(stunted.getRural());
                holder.tvFive.setText(stunted.getUrban());
                holder.tvSix.setText(stunted.getMale());
                holder.tvSeven.setText(stunted.getFemale());
                break;

            case "NFHS_5years_wasted":
                final NFHS_5years_wasted wasted = nfhs_5years_wastedList.get(position);
                holder.tvOne.setText(wasted.getSR_NO());
                holder.tvTwo.setText(wasted.getState_Name());
                holder.tvThree.setText(wasted.getTotal());
                holder.tvFour.setText(wasted.getRural());
                holder.tvFive.setText(wasted.getUrban());
                holder.tvSix.setText(wasted.getMale());
                holder.tvSeven.setText(wasted.getFemale());
                break;

            case "SRS_CDR":
                final SRS_CDR cdr = srs_cdrList.get(position);
                holder.tvOne.setText(cdr.getSR_NO());
                holder.tvTwo.setText(cdr.getState_Name());
                holder.tvThree.setText(cdr.getTotal());
                holder.tvFour.setText(cdr.getRural());
                holder.tvFive.setText(cdr.getUrban());
                holder.tvSix.setText(cdr.getMale());
                holder.tvSeven.setText(cdr.getFemale());
                break;


            case "SRS_IMR":
                final SRS_IMR imr = srs_imrList.get(position);
                holder.tvOne.setText(imr.getSR_NO());
                holder.tvTwo.setText(imr.getState_Name());
                holder.tvThree.setText(imr.getTotal());
                holder.tvFour.setText(imr.getRural());
                holder.tvFive.setText(imr.getUrban());
                holder.tvSix.setText(imr.getMale());
                holder.tvSeven.setText(imr.getFemale());
                break;

            case "SRS_U5":
                final SRS_U5 u5 = srs_u5List.get(position);
                holder.tvOne.setText(u5.getSR_NO());
                holder.tvTwo.setText(u5.getState_Name());
                holder.tvThree.setText(u5.getTotal());
                holder.tvFour.setText(u5.getRural());
                holder.tvFive.setText(u5.getUrban());
                holder.tvSix.setText(u5.getMale());
                holder.tvSeven.setText(u5.getFemale());
                break;
        }

    }

//    @Override
//    public NHRRStatewiseCustomRecViewThreeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        return null;
//    }

//    @Override
//    public void onBindViewHolder(@NonNull NHRRStatewiseCustomRecViewThreeAdapter.MyViewHolder myViewHolder, int i) {
//
//    }

    @Override
    public int getItemCount() {

        if (typeMain.equalsIgnoreCase("manufacturing") || typeMain.equals("manufacturing")) {
            return ministerSugamManufacturingSiteList.size();
        } else if (typeMain.equalsIgnoreCase("formulation") || typeMain.equals("formulation")) {
            return ministerSugamFormulationDataList.size();
        } else if (typeMain.equalsIgnoreCase("NFHS_12_13immunized") || typeMain.equals("NFHS_12_13immunized")) {
            return nfhs_12_13immunizedList.size();
        } else if (typeMain.equalsIgnoreCase("NFHS_5years_stunted") || typeMain.equals("NFHS_5years_stunted")) {
            return nfhs_5years_stuntedList.size();
        } else if (typeMain.equalsIgnoreCase("NFHS_5years_wasted") || typeMain.equals("NFHS_5years_wasted")) {
            return nfhs_5years_wastedList.size();
        } else if (typeMain.equalsIgnoreCase("SRS_CDR") || typeMain.equals("SRS_CDR")) {
            return srs_cdrList.size();
        } else if (typeMain.equalsIgnoreCase("SRS_IMR") || typeMain.equals("SRS_IMR")) {
            return srs_imrList.size();
        } else if (typeMain.equalsIgnoreCase("SRS_U5") || typeMain.equals("SRS_U5")) {
            return srs_u5List.size();
        } else {
            return ministerSugamCDSCOList.size();


        }
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterSugamManufacturingSite> facilityTypeDetailsLists) {
        for (MinisterSugamManufacturingSite ftdl : facilityTypeDetailsLists) {
            ministerSugamManufacturingSiteList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterSugamManufacturingSite> newList) {
        ministerSugamManufacturingSiteList = new ArrayList<>();
        ministerSugamManufacturingSiteList.addAll(newList);
        notifyDataSetChanged();
    }
}

