package com.chi.centraldashboard.Minister.QualityOfHealthServices;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.FSSAIState;
import com.chi.centraldashboard.apiCall.bin.MinisterORSDataHospitalOnboarded;
import com.chi.centraldashboard.apiCall.bin.MinisterORSDataTakenToday;
import com.chi.centraldashboard.apiCall.bin.MinisterORSDataTotalAppointments;

import java.util.ArrayList;
import java.util.List;

public class ORSCusRecViewThreeAdapter extends RecyclerView.Adapter<ORSCusRecViewThreeAdapter.MyViewHolder> {

    Context mCtx;
    String typeMain;
    private List<MinisterORSDataHospitalOnboarded> ministerORSDataHospitalOnboardedList;
    private List<MinisterORSDataTotalAppointments> ministerORSDataTotalAppointments;
    private List<MinisterORSDataTakenToday> ministerORSDataTakenTodayList;

    private List<FSSAIState> fssaiStateList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tv_project, tvStateName, tvLocatoin, tvPhase, tvProjectStatus, tvOpdStatus, tvMcStatus, tvPhysicalProgress, tvCount;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_srno);
            tv_project = (TextView) view.findViewById(R.id.tv_project);
            tvStateName = (TextView) view.findViewById(R.id.tv_statename);


        }
    }


    public ORSCusRecViewThreeAdapter(Context applicationContext, List<MinisterORSDataHospitalOnboarded> ministerORSDataHospitalOnboardedList, List<MinisterORSDataTotalAppointments> ministerORSDataTotalAppointments, List<MinisterORSDataTakenToday> ministerPmjayHospitalsEmpanelleds, String type) {
        this.mCtx = applicationContext;
        this.ministerORSDataHospitalOnboardedList = ministerORSDataHospitalOnboardedList;
        this.ministerORSDataTotalAppointments = ministerORSDataTotalAppointments;
        this.ministerORSDataTakenTodayList = ministerPmjayHospitalsEmpanelleds;
        this.typeMain = type;
    }

    public ORSCusRecViewThreeAdapter(Context applicationContext, List<FSSAIState> fssaiStateList, String type) {
        this.mCtx = applicationContext;
        this.typeMain = type;
        this.fssaiStateList = fssaiStateList;
    }


    @Override
    public ORSCusRecViewThreeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mors_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new ORSCusRecViewThreeAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ORSCusRecViewThreeAdapter.MyViewHolder holder, int position) {

        if (position % 2 == 0) {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
        } else {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.itemView.setBackgroundResource(R.color.White);
            //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
        }


        switch (typeMain) {
            case "onboard":
                final MinisterORSDataHospitalOnboarded hOnboarded = ministerORSDataHospitalOnboardedList.get(position);

                holder.tvSno.setText(String.valueOf(hOnboarded.getSr_no()));
                holder.tvStateName.setText(hOnboarded.getState_Name());
                holder.tv_project.setText(String.valueOf(hOnboarded.getNo_of_Hospitals_On_boarded()));
                break;

            case "appoinments":
                final MinisterORSDataTotalAppointments tAppoinments = ministerORSDataTotalAppointments.get(position);
                holder.tvSno.setText(String.valueOf(tAppoinments.getSR_NO()));
                holder.tvStateName.setText(tAppoinments.getState_Name());
                holder.tv_project.setText(String.valueOf(tAppoinments.getNo_of_Total_Appointments()));
                break;

            case "today":
                final MinisterORSDataTakenToday tToday = ministerORSDataTakenTodayList.get(position);
                holder.tvSno.setText(String.valueOf(tToday.getSR_NO()));
                holder.tvStateName.setText(tToday.getState_Name());
                holder.tv_project.setText(String.valueOf(tToday.getNo_of_Appointments_Taken_Today()));
                break;

            case "FSSAIState":
                final FSSAIState state = fssaiStateList.get(position);
                holder.tvSno.setText(state.getSR_NO());
                holder.tvStateName.setText(state.getState_Name());
                holder.tv_project.setText(state.getNumber_of_State_Food_Laboratories_strengthened());
                break;

        }

//        if (typeMain.equalsIgnoreCase("onboard") || typeMain.equals("onboard")) {
//            final MinisterORSDataHospitalOnboarded hOnboarded = ministerORSDataHospitalOnboardedList.get(position);
//
//            holder.tvSno.setText(String.valueOf(hOnboarded.getSr_no()));
//            holder.tvStateName.setText(hOnboarded.getState_Name());
//            holder.tv_project.setText(String.valueOf(hOnboarded.getNo_of_Hospitals_On_boarded()));
//        } else if (typeMain.equalsIgnoreCase("appoinments") || typeMain.equals("appoinments")) {
//            final MinisterORSDataTotalAppointments tAppoinments = ministerORSDataTotalAppointments.get(position);
//            holder.tvSno.setText(String.valueOf(tAppoinments.getSR_NO()));
//            holder.tvStateName.setText(tAppoinments.getState_Name());
//            holder.tv_project.setText(String.valueOf(tAppoinments.getNo_of_Total_Appointments()));
//        } else if (typeMain.equalsIgnoreCase("today") || typeMain.equals("today")) {
//            final MinisterORSDataTakenToday tToday = ministerORSDataTakenTodayList.get(position);
//            holder.tvSno.setText(String.valueOf(tToday.getSR_NO()));
//            holder.tvStateName.setText(tToday.getState_Name());
//            holder.tv_project.setText(String.valueOf(tToday.getNo_of_Appointments_Taken_Today()));
//        }

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
        if (typeMain.equalsIgnoreCase("onboard") || typeMain.equals("onboard")) {
            return ministerORSDataHospitalOnboardedList.size();
        } else if (typeMain.equalsIgnoreCase("appoinments") || typeMain.equals("appoinments")) {
            return ministerORSDataTotalAppointments.size();
        } else if (typeMain.equalsIgnoreCase("FSSAIState") || typeMain.equals("FSSAIState")) {
            return fssaiStateList.size();
        } else {
            return ministerORSDataTakenTodayList.size();
        }
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterORSDataHospitalOnboarded> facilityTypeDetailsLists) {
        for (MinisterORSDataHospitalOnboarded ftdl : facilityTypeDetailsLists) {
            ministerORSDataHospitalOnboardedList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterORSDataHospitalOnboarded> newList) {
        ministerORSDataHospitalOnboardedList = new ArrayList<>();
        ministerORSDataHospitalOnboardedList.addAll(newList);
        notifyDataSetChanged();
    }
}
