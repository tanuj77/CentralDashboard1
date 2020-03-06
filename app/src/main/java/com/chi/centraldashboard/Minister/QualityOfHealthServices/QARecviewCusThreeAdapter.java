package com.chi.centraldashboard.Minister.QualityOfHealthServices;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.MinisterQALaQshya;
import com.chi.centraldashboard.apiCall.bin.MinisterQANQAS;

import java.util.ArrayList;
import java.util.List;

public class QARecviewCusThreeAdapter extends RecyclerView.Adapter<QARecviewCusThreeAdapter.MyViewHolder> {
    Context mCtx;
    private List<MinisterQANQAS> ministerQANQASList;
    private List<MinisterQALaQshya> ministerQALaQshyaList;

    String flagType;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tv_qa, tvStateName, tvDistrictHospital;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_qasrno);
            tvStateName = (TextView) view.findViewById(R.id.tv_qastatename);
            tv_qa = (TextView) view.findViewById(R.id.tv_qa);

        }
    }


    public QARecviewCusThreeAdapter(Context context, List<MinisterQANQAS> ministerQANQASList, List<MinisterQALaQshya> ministerQALaQshyaList, String flagType) {
        this.ministerQANQASList = ministerQANQASList;
        this.ministerQALaQshyaList = ministerQALaQshyaList;
        this.flagType = flagType;
        this.mCtx = context;
    }

    @Override
    public QARecviewCusThreeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mqa_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new QARecviewCusThreeAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(QARecviewCusThreeAdapter.MyViewHolder holder, int position) {

        if (position % 2 == 0) {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
        } else {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.itemView.setBackgroundResource(R.color.White);
            //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        if (flagType.equalsIgnoreCase("nqas") || flagType == "nqas") {
            final MinisterQANQAS qanqas = ministerQANQASList.get(position);

            holder.tvSno.setText(qanqas.getSR_NO());
            holder.tvStateName.setText(qanqas.getState_Name());
            holder.tv_qa.setText(qanqas.getNqas_facilities_count());

        }

        if (flagType.equalsIgnoreCase("laqshay") || flagType == "laqshay") {
            final MinisterQALaQshya laQshya = ministerQALaQshyaList.get(position);

            holder.tvSno.setText(laQshya.getSR_NO());
            holder.tvStateName.setText(laQshya.getState_Name());
            holder.tv_qa.setText(laQshya.getNumber_of_facilities_LaQshya_certified());


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
        if (flagType.equalsIgnoreCase("laqshay") || flagType == "laqshay") {
            return ministerQALaQshyaList.size();
        } else {
            return ministerQANQASList.size();
        }
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterQALaQshya> ministerQALaQshyaList) {
        for (MinisterQALaQshya ftdl : ministerQALaQshyaList) {
            ministerQALaQshyaList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterQALaQshya> newList) {
        ministerQALaQshyaList = new ArrayList<>();
        ministerQALaQshyaList.addAll(newList);
        notifyDataSetChanged();
    }
}
