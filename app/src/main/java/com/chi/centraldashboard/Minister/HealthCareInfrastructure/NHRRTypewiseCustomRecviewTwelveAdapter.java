package com.chi.centraldashboard.Minister.HealthCareInfrastructure;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.MinisterNhrrDataTypewise;

import java.util.ArrayList;
import java.util.List;

public class NHRRTypewiseCustomRecviewTwelveAdapter extends RecyclerView.Adapter<NHRRTypewiseCustomRecviewTwelveAdapter.MyViewHolder> {
    Context mCtx;
    private List<MinisterNhrrDataTypewise> typewiseListmain;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tvStateName, tvCount,tvSC,tvPHC,tvCH,tvSDH,tvMCH,tvPolyclinic,tvDiagnostic,tvBloodbank,tvpharmacy,tvPhysiontheraphy;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_srno);
            tvStateName = (TextView) view.findViewById(R.id.tv_statename);
            tvSC = (TextView) view.findViewById(R.id.tv_sc);
            tvPHC = (TextView) view.findViewById(R.id.tv_phc);
            tvCH = (TextView) view.findViewById(R.id.tv_ch);
            tvSDH = (TextView) view.findViewById(R.id.tv_sdh);
            tvMCH = (TextView) view.findViewById(R.id.tv_mch);
            tvPolyclinic = (TextView) view.findViewById(R.id.tv_polyclinic);
            tvDiagnostic = (TextView) view.findViewById(R.id.tv_diagnostic);
            tvBloodbank = (TextView) view.findViewById(R.id.tv_bloodbank);
            tvpharmacy = (TextView) view.findViewById(R.id.tv_pharmacy);
            tvPhysiontheraphy = (TextView) view.findViewById(R.id.tv_physiotherapy);


        }
    }


    public NHRRTypewiseCustomRecviewTwelveAdapter(Context context, List<MinisterNhrrDataTypewise> typewiseList) {
        this.typewiseListmain = typewiseList;
        this.mCtx = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mtypewise_recyclerview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

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
           // holder.tvCount.setText("Distribution of HE State wise");
        }

        final MinisterNhrrDataTypewise typewise = typewiseListmain.get(position);

        holder.tvSno.setText(String.valueOf(typewise.getSr_no()));
        holder.tvStateName.setText(typewise.getState_name());
        holder.tvSC.setText(typewise.getSc());
        holder.tvPHC.setText(typewise.getPhc());
        holder.tvCH.setText(typewise.getChc());
        holder.tvSDH.setText(typewise.getSdh());
        holder.tvMCH.setText(typewise.getMch());
        holder.tvPolyclinic.setText(typewise.getClinic());
        holder.tvDiagnostic.setText(typewise.getDiagnostic());
        holder.tvBloodbank.setText(typewise.getBloodbank());
        holder.tvpharmacy.setText(typewise.getPharmacy());
        holder.tvPhysiontheraphy.setText(typewise.getPhysiotherapy());


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
        return typewiseListmain.size();
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterNhrrDataTypewise> facilityTypeDetailsLists) {
        for (MinisterNhrrDataTypewise ftdl : facilityTypeDetailsLists) {
            typewiseListmain.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterNhrrDataTypewise> newList) {
        typewiseListmain = new ArrayList<>();
        typewiseListmain.addAll(newList);
        notifyDataSetChanged();
    }
}
