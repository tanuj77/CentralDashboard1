package com.chi.centraldashboard.Minister.HealthCareInfrastructure;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.MinisterPmssyDataMedicalCollege;

import java.util.ArrayList;
import java.util.List;

public class PMSSYMedicalCollegeCusRecviewEightAdapter extends RecyclerView.Adapter<PMSSYMedicalCollegeCusRecviewEightAdapter.MyViewHolder> {
    Context mCtx;
    private List<MinisterPmssyDataMedicalCollege> medicalCollegeListmain;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tv_project, tvStateName, tvLocatoin, tvPhase, tvApprovedCost, tvProjectStatus, tvPhysicalProgress;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_srno);
            tv_project = (TextView) view.findViewById(R.id.tv_project);
            tvStateName = (TextView) view.findViewById(R.id.tv_statename);
            tvLocatoin = (TextView) view.findViewById(R.id.tv_location);
            tvPhase = (TextView) view.findViewById(R.id.tv_phase);
            tvProjectStatus = (TextView) view.findViewById(R.id.tv_projectstatus);
            tvApprovedCost = (TextView) view.findViewById(R.id.tv_approvedcost);

            tvPhysicalProgress = (TextView) view.findViewById(R.id.tv_physicalprogress);


        }
    }


    public PMSSYMedicalCollegeCusRecviewEightAdapter(Context context, List<MinisterPmssyDataMedicalCollege> medicalCollegeList) {
        this.medicalCollegeListmain = medicalCollegeList;
        this.mCtx = context;
    }

    @Override
    public PMSSYMedicalCollegeCusRecviewEightAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mmedicalcollege_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new PMSSYMedicalCollegeCusRecviewEightAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PMSSYMedicalCollegeCusRecviewEightAdapter.MyViewHolder holder, int position) {

        if (position % 2 == 0) {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
        } else {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.itemView.setBackgroundResource(R.color.White);
            //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (position == 1) {
            holder.tvSno.setText("S_No");
            holder.tvStateName.setText("State Name");

        }

        final MinisterPmssyDataMedicalCollege medicalCollege = medicalCollegeListmain.get(position);

        holder.tvSno.setText(String.valueOf(medicalCollege.getS_no()));
        holder.tv_project.setText(medicalCollege.getProject());
        holder.tvStateName.setText(medicalCollege.getState());
        holder.tvLocatoin.setText(medicalCollege.getLocation());
        holder.tvPhase.setText(medicalCollege.getPhase());
        holder.tvApprovedCost.setText(medicalCollege.getApprovedcost());
        holder.tvProjectStatus.setText(medicalCollege.getProject_status());

        holder.tvPhysicalProgress.setText(medicalCollege.getPhy_progress());


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
        return medicalCollegeListmain.size();
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterPmssyDataMedicalCollege> facilityTypeDetailsLists) {
        for (MinisterPmssyDataMedicalCollege ftdl : facilityTypeDetailsLists) {
            medicalCollegeListmain.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterPmssyDataMedicalCollege> newList) {
        medicalCollegeListmain = new ArrayList<>();
        medicalCollegeListmain.addAll(newList);
        notifyDataSetChanged();
    }
}
