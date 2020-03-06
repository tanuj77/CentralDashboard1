package com.chi.centraldashboard.Minister.HealthCareInfrastructure;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;

import com.chi.centraldashboard.apiCall.bin.MinisterDialysisDistrict;
import com.chi.centraldashboard.apiCall.bin.MinisterDialysisPMNDP;

import java.util.ArrayList;
import java.util.List;

public class DialysisCusRecviewFourAdapter extends RecyclerView.Adapter<DialysisCusRecviewFourAdapter.MyViewHolder> {
    Context mCtx;
    private List<MinisterDialysisDistrict> ministerDialysisDistrictList;
    private List<MinisterDialysisPMNDP> ministerDialysisPMNDPList;
    String flagType;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tvStateName, tvDialysis, tvDistrictHospital;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_dsrno);
            tvStateName = (TextView) view.findViewById(R.id.tv_dstatename);
            tvDialysis = (TextView) view.findViewById(R.id.tv_ddialysis);
            tvDistrictHospital = (TextView) view.findViewById(R.id.tv_dtotaldistricthospital);
        }
    }


    public DialysisCusRecviewFourAdapter(Context context, List<MinisterDialysisDistrict> ministerDialysisDistrictList, List<MinisterDialysisPMNDP> ministerDialysisPMNDPList, String flagType) {
        this.ministerDialysisDistrictList = ministerDialysisDistrictList;
        this.ministerDialysisPMNDPList = ministerDialysisPMNDPList;
        this.flagType = flagType;
        this.mCtx = context;
    }

    @Override
    public DialysisCusRecviewFourAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mdialysis_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new DialysisCusRecviewFourAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DialysisCusRecviewFourAdapter.MyViewHolder holder, int position) {

        if (position % 2 == 0) {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
        } else {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.itemView.setBackgroundResource(R.color.White);
            //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
        }


        if (flagType.equalsIgnoreCase("ddistrict") || flagType == "ddistrict") {
            final MinisterDialysisDistrict dialysisDistrict = ministerDialysisDistrictList.get(position);

            holder.tvSno.setText(dialysisDistrict.getSR_NO());
            holder.tvStateName.setText(dialysisDistrict.getState_Name());
            holder.tvDialysis.setText(dialysisDistrict.getNo_of_districts_with_functional_dialysis_units());
            holder.tvDistrictHospital.setText(dialysisDistrict.getUnits_against_the_total_districts());

        }
        if (flagType.equalsIgnoreCase("dPMNDP") || flagType == "dPMNDP") {
            final MinisterDialysisPMNDP dialysisPMNDP = ministerDialysisPMNDPList.get(position);

            holder.tvSno.setText(dialysisPMNDP.getSR_NO());
            holder.tvStateName.setText(dialysisPMNDP.getState_Name());
            holder.tvDialysis.setText(dialysisPMNDP.getNo_of_patients_receiving_treatment());
            // holder.tvDistrictHospital.setText(dialysisPMNDP.getNo_of_functional_fru());
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
        if (flagType.equalsIgnoreCase("ddistrict") || flagType == "ddistrict") {
            return ministerDialysisDistrictList.size();
        }else {
            return ministerDialysisPMNDPList.size();
        }
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterDialysisDistrict> ministerDialysisDistrictList) {
        for (MinisterDialysisDistrict ftdl : ministerDialysisDistrictList) {
            ministerDialysisDistrictList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterDialysisDistrict> newList) {
        ministerDialysisDistrictList = new ArrayList<>();
        ministerDialysisDistrictList.addAll(newList);
        notifyDataSetChanged();
    }
}
