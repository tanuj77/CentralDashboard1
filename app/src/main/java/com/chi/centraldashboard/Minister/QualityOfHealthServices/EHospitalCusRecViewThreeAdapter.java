package com.chi.centraldashboard.Minister.QualityOfHealthServices;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.CEAAdopted;
import com.chi.centraldashboard.apiCall.bin.CEANotAdopted;
import com.chi.centraldashboard.apiCall.bin.CEATreatmentGuidline;
import com.chi.centraldashboard.apiCall.bin.FSSAIFSWS;
import com.chi.centraldashboard.apiCall.bin.MinisterEHospitalDoneToday;
import com.chi.centraldashboard.apiCall.bin.MinisterEHospitalOnboarded;
import com.chi.centraldashboard.apiCall.bin.MinisterEHospitalRegistration;

import java.util.ArrayList;
import java.util.List;

public class EHospitalCusRecViewThreeAdapter extends RecyclerView.Adapter<EHospitalCusRecViewThreeAdapter.MyViewHolder> {

    Context mCtx;
    String typeMain;
    int no_use = 0;
    private List<MinisterEHospitalOnboarded> ministerEHospitalOnboardedList;
    private List<MinisterEHospitalRegistration> ministerEHospitalRegistrationList;
    private List<MinisterEHospitalDoneToday> ministerEHospitalDoneTodayList;

    private List<CEAAdopted> ceaAdoptedList;
    private List<CEANotAdopted> ceaNotAdoptedList;
    private List<CEATreatmentGuidline> ceaTreatmentGuidlineList;

    private List<FSSAIFSWS> fssaifswsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tv_project, tvStateName, tvLocatoin, tvPhase, tvProjectStatus, tvOpdStatus, tvMcStatus, tvPhysicalProgress, tvCount;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_ehsrno);
            tv_project = (TextView) view.findViewById(R.id.tv_ehproject);
            tvStateName = (TextView) view.findViewById(R.id.tv_ehstatename);


        }
    }


    public EHospitalCusRecViewThreeAdapter(Context applicationContext, List<MinisterEHospitalOnboarded> ministerEHospitalOnboardedList, List<MinisterEHospitalRegistration> ministerEHospitalRegistrationList, List<MinisterEHospitalDoneToday> ministerEHospitalDoneTodayList, String type) {
        this.mCtx = applicationContext;
        this.ministerEHospitalOnboardedList = ministerEHospitalOnboardedList;
        this.ministerEHospitalRegistrationList = ministerEHospitalRegistrationList;
        this.ministerEHospitalDoneTodayList = ministerEHospitalDoneTodayList;
        this.typeMain = type;
    }

    public EHospitalCusRecViewThreeAdapter(Context applicationContext, List<CEAAdopted> ceaAdoptedList, List<CEANotAdopted> ceaNotAdoptedList, List<CEATreatmentGuidline> ceaTreatmentGuidlineList, String type, int no_use) {
        this.mCtx = applicationContext;
        this.ceaAdoptedList = ceaAdoptedList;
        this.ceaNotAdoptedList = ceaNotAdoptedList;
        this.ceaTreatmentGuidlineList = ceaTreatmentGuidlineList;
        this.typeMain = type;
        this.no_use = no_use;
    }

    public EHospitalCusRecViewThreeAdapter(Context applicationContext, List<FSSAIFSWS> fssaifswsList, String type) {
        this.mCtx = applicationContext;
        this.fssaifswsList = fssaifswsList;
        this.typeMain = type;
    }


    @Override
    public EHospitalCusRecViewThreeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mehospital_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new EHospitalCusRecViewThreeAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EHospitalCusRecViewThreeAdapter.MyViewHolder holder, int position) {
        Log.i("position", "" + position);
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
                final MinisterEHospitalOnboarded ehOnboarded = ministerEHospitalOnboardedList.get(position);

                holder.tvSno.setText(String.valueOf(ehOnboarded.getSR_NO()));
                holder.tvStateName.setText(ehOnboarded.getState_Name());
                holder.tv_project.setText(String.valueOf(ehOnboarded.getNo_of_Hospitals_On_boarded()));
                break;

            case "registration":
                final MinisterEHospitalRegistration tAppoinments = ministerEHospitalRegistrationList.get(position);
                holder.tvSno.setText(String.valueOf(tAppoinments.getSR_NO()));
                holder.tvStateName.setText(tAppoinments.getState_Name());
                holder.tv_project.setText(String.valueOf(tAppoinments.getNo_of_Total_Registration()));
                break;

            case "today":

                final MinisterEHospitalDoneToday tToday = ministerEHospitalDoneTodayList.get(position);
                holder.tvSno.setText(String.valueOf(tToday.getSR_NO()));
                holder.tvStateName.setText(tToday.getState_Name());
                holder.tv_project.setText(String.valueOf(tToday.getNo_of_Registration_done_Today()));
                break;

            case "Adopted":
                final CEAAdopted adopted = ceaAdoptedList.get(position);
                holder.tvSno.setText(adopted.getSR_NO());
                holder.tvStateName.setText(adopted.getState_Name());

                break;

            case "NotAdopted":
                final CEANotAdopted notAdopted = ceaNotAdoptedList.get(position);
                holder.tvSno.setText(notAdopted.getSR_NO());
                holder.tvStateName.setText(notAdopted.getState_Name());
                holder.tv_project.setText(notAdopted.getTypess());
                break;

            case "TreatmentGuidelines":
                final CEATreatmentGuidline treatmentGuidline = ceaTreatmentGuidlineList.get(position);
                holder.tvSno.setText(treatmentGuidline.getSR_NO());
                holder.tvStateName.setText(treatmentGuidline.getAllopathic());
                holder.tv_project.setText(treatmentGuidline.getAyush());
                break;

            case "FSSAIfsws":
                final FSSAIFSWS fssaifsws = fssaifswsList.get(position);
                holder.tvSno.setText(fssaifsws.getSR_NO());
                holder.tvStateName.setText(fssaifsws.getState_Name());
                holder.tv_project.setText(fssaifsws.getNumber_of_Food_Safety_on_Wheels_FSWS_provided());
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

        if (typeMain.equalsIgnoreCase("onboard") || typeMain.equals("onboard")) {
            return ministerEHospitalOnboardedList.size();
        } else if (typeMain.equalsIgnoreCase("registration") || typeMain.equals("registration")) {
            return ministerEHospitalRegistrationList.size();
        } else if (typeMain.equalsIgnoreCase("Adopted") || typeMain.equals("Adopted")) {
            return ceaAdoptedList.size();
        } else if (typeMain.equalsIgnoreCase("NotAdopted") || typeMain.equals("NotAdopted")) {
            return ceaNotAdoptedList.size();
        } else if (typeMain.equalsIgnoreCase("TreatmentGuidelines") || typeMain.equals("TreatmentGuidelines")) {
            return ceaTreatmentGuidlineList.size();
        } else if (typeMain.equalsIgnoreCase("FSSAIfsws") || typeMain.equals("FSSAIfsws")) {
            return fssaifswsList.size();
        } else {
            return ministerEHospitalDoneTodayList.size();
        }

    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterEHospitalOnboarded> facilityTypeDetailsLists) {
        for (MinisterEHospitalOnboarded ftdl : facilityTypeDetailsLists) {
            ministerEHospitalOnboardedList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterEHospitalOnboarded> newList) {
        ministerEHospitalOnboardedList = new ArrayList<>();
        ministerEHospitalOnboardedList.addAll(newList);
        notifyDataSetChanged();
    }
}
