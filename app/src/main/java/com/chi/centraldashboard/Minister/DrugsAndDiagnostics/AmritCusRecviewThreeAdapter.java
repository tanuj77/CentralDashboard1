package com.chi.centraldashboard.Minister.DrugsAndDiagnostics;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritDrugsDispensed;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritPatientsServed;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritPharmacies;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritSavingsPatients;

import java.util.ArrayList;
import java.util.List;

public class AmritCusRecviewThreeAdapter extends RecyclerView.Adapter<AmritCusRecviewThreeAdapter.MyViewHolder> {
    Context mCtx;
    private List<MinisterAmritPharmacies> ministerAmritPharmaciesList;
    private List<MinisterAmritPatientsServed> ministerAmritPatientsServedList;
    private List<MinisterAmritDrugsDispensed> ministerAmritDrugsDispensedList;
    private List<MinisterAmritSavingsPatients> ministerAmritSavingsPatientsList;

    String flagType;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_nu1, tv_nu2, tv_nu3;


        public MyViewHolder(View view) {
            super(view);

            tv_nu1 = (TextView) view.findViewById(R.id.tv_nu1);
            tv_nu2 = (TextView) view.findViewById(R.id.tv_nu2);
            tv_nu3 = (TextView) view.findViewById(R.id.tv_nu3);

        }
    }


    public AmritCusRecviewThreeAdapter(Context context, List<MinisterAmritPharmacies> ministerAmritPharmaciesList, List<MinisterAmritPatientsServed> ministerAmritPatientsServedList, List<MinisterAmritDrugsDispensed> ministerAmritDrugsDispensedList, List<MinisterAmritSavingsPatients> ministerAmritSavingsPatientsList, String flagType) {
        this.mCtx = context;
        this.ministerAmritPharmaciesList = ministerAmritPharmaciesList;
        this.ministerAmritPatientsServedList = ministerAmritPatientsServedList;
        this.ministerAmritDrugsDispensedList = ministerAmritDrugsDispensedList;
        this.ministerAmritSavingsPatientsList = ministerAmritSavingsPatientsList;
        this.flagType = flagType;

    }

    @Override
    public AmritCusRecviewThreeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mamrit_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new AmritCusRecviewThreeAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AmritCusRecviewThreeAdapter.MyViewHolder holder, int position) {

        if (position % 2 == 0) {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
        } else {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.itemView.setBackgroundResource(R.color.White);
            //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
        }


        if (flagType.equalsIgnoreCase("pharmacies") || flagType == "pharmacies") {
            final MinisterAmritPharmacies pharmacies = ministerAmritPharmaciesList.get(position);

            holder.tv_nu1.setText(pharmacies.getSR_NO());
            holder.tv_nu2.setText(pharmacies.getState_Name());
            holder.tv_nu3.setText(pharmacies.getNumber_of_pharmacies());


        }
        if (flagType.equalsIgnoreCase("patientsServed") || flagType == "patientsServed") {
            final MinisterAmritPatientsServed patientsServed = ministerAmritPatientsServedList.get(position);

            holder.tv_nu1.setText(patientsServed.getSR_NO());
            holder.tv_nu2.setText(patientsServed.getState_Name());
            holder.tv_nu3.setText(patientsServed.getNumber_of_patients_served());

        }

        if (flagType.equalsIgnoreCase("drugsDispensed") || flagType == "drugsDispensed") {
            final MinisterAmritDrugsDispensed drugsDispensed = ministerAmritDrugsDispensedList.get(position);

            holder.tv_nu1.setText(drugsDispensed.getSR_NO());
            holder.tv_nu2.setText(drugsDispensed.getState_Name());
            holder.tv_nu3.setText(drugsDispensed.getValue_of_drugs_dispensed());

        }
        if (flagType.equalsIgnoreCase("savingsPatients") || flagType == "savingsPatients") {
            final MinisterAmritSavingsPatients savingsPatients = ministerAmritSavingsPatientsList.get(position);

            holder.tv_nu1.setText(savingsPatients.getSR_NO());
            holder.tv_nu2.setText(savingsPatients.getState_Name());
            holder.tv_nu3.setText(savingsPatients.getSavings_to_the_patients());

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
        if (flagType.equalsIgnoreCase("pharmacies") || flagType == "pharmacies") {
            return ministerAmritPharmaciesList.size();
        } else if (flagType.equalsIgnoreCase("patientsServed") || flagType == "patientsServed") {
            return ministerAmritPatientsServedList.size();
        } else if (flagType.equalsIgnoreCase("drugsDispensed") || flagType == "drugsDispensed") {
            return ministerAmritDrugsDispensedList.size();
        } else {
            return ministerAmritSavingsPatientsList.size();
        }
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterAmritPharmacies> ministerAmritPharmaciesList) {
        for (MinisterAmritPharmacies ftdl : ministerAmritPharmaciesList) {
            ministerAmritPharmaciesList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterAmritPharmacies> newList) {
        ministerAmritPharmaciesList = new ArrayList<>();
        ministerAmritPharmaciesList.addAll(newList);
        notifyDataSetChanged();
    }
}

