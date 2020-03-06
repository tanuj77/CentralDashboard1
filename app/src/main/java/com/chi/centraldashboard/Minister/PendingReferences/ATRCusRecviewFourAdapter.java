package com.chi.centraldashboard.Minister.PendingReferences;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.MinisterAtrParliament;
import com.chi.centraldashboard.apiCall.bin.MinisterAtrPmo;
import com.chi.centraldashboard.apiCall.bin.MinisterAtrVip;

import java.util.ArrayList;
import java.util.List;

public class ATRCusRecviewFourAdapter extends RecyclerView.Adapter<ATRCusRecviewFourAdapter.MyViewHolder> {
    Context mCtx;
    private List<MinisterAtrPmo> ministerAtrPmoList;
    private List<MinisterAtrVip> ministerAtrVipList;
    private List<MinisterAtrParliament> ministerAtrParliamentList;
    String flagType;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tv_proj, tvStateName, tvDate;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_atrsrno);
            tvStateName = (TextView) view.findViewById(R.id.tv_atrstatename);
            tv_proj = (TextView) view.findViewById(R.id.tv_atrproject);
            tvDate = (TextView) view.findViewById(R.id.tv_atrdate);
        }
    }


    public ATRCusRecviewFourAdapter(Context context, List<MinisterAtrPmo> ministerAtrPmoList, List<MinisterAtrParliament> ministerAtrParliamentList, List<MinisterAtrVip> ministerAtrVipList, String flagType) {
        this.ministerAtrPmoList = ministerAtrPmoList;
        this.ministerAtrVipList = ministerAtrVipList;
        this.ministerAtrParliamentList = ministerAtrParliamentList;
        this.flagType = flagType;
        this.mCtx = context;
    }

    @Override
    public ATRCusRecviewFourAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.matr_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new ATRCusRecviewFourAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ATRCusRecviewFourAdapter.MyViewHolder holder, int position) {

        if (position % 2 == 0) {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
        } else {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.itemView.setBackgroundResource(R.color.White);
            //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
        }


        if (flagType.equalsIgnoreCase("pmo") || flagType == "pmo") {
            final MinisterAtrPmo pmo = ministerAtrPmoList.get(position);


            holder.tvSno.setText(pmo.getSR_NO());
            holder.tvStateName.setText(pmo.getName_Of_Section());
            holder.tv_proj.setText(pmo.getNo_of_Pending_ATR_on_PMO_References());
            holder.tvDate.setText(pmo.getDate1());

        }
        if (flagType.equalsIgnoreCase("vip") || flagType == "vip") {
            final MinisterAtrVip vip = ministerAtrVipList.get(position);

            holder.tvSno.setText(vip.getSR_NO());
            holder.tvStateName.setText(vip.getDevesion());
            holder.tv_proj.setText(vip.getName());
            holder.tvDate.setText(vip.getDate());
        }

        if (flagType.equalsIgnoreCase("parliament") || flagType == "parliament") {
            final MinisterAtrParliament parliament = ministerAtrParliamentList.get(position);

            holder.tvSno.setText(parliament.getSR_NO());
            holder.tvStateName.setText(parliament.getName_Section());
            holder.tv_proj.setText(parliament.getNo_of_Parliament_Assurances());
            holder.tvDate.setText(parliament.getDate1());
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
        if (flagType.equalsIgnoreCase("pmo") || flagType == "pmo") {
            return ministerAtrPmoList.size();
        } else if (flagType.equalsIgnoreCase("vip") || flagType == "vip") {
            return ministerAtrVipList.size();
        } else {
            return ministerAtrParliamentList.size();
        }
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterAtrPmo> ministerAtrPmoList) {
        for (MinisterAtrPmo ftdl : ministerAtrPmoList) {
            ministerAtrPmoList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterAtrPmo> newList) {
        ministerAtrPmoList = new ArrayList<>();
        ministerAtrPmoList.addAll(newList);
        notifyDataSetChanged();
    }
}


