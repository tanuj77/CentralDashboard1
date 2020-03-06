package com.chi.centraldashboard.Minister.HealthCareInfrastructure;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.MinisterPmssyDataNewAiims;

import java.util.ArrayList;
import java.util.List;

public class PMSSYNewAiimsCusRecViewNineAdapter extends RecyclerView.Adapter<PMSSYNewAiimsCusRecViewNineAdapter.MyViewHolder> {
    Context mCtx;
    private List<MinisterPmssyDataNewAiims> newAiimsListmain;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tv_project,tvStateName,tvLocatoin,tvPhase,tvProjectStatus,tvOpdStatus,tvMcStatus,tvPhysicalProgress, tvCount;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_srno);
            tv_project=(TextView) view.findViewById(R.id.tv_project);
            tvStateName = (TextView) view.findViewById(R.id.tv_statename);
            tvLocatoin=(TextView) view.findViewById(R.id.tv_location);
            tvPhase=(TextView) view.findViewById(R.id.tv_phase);
            tvProjectStatus=(TextView) view.findViewById(R.id.tv_projectstatus);
            tvOpdStatus=(TextView)view.findViewById(R.id.tv_opd_status);
            tvMcStatus=(TextView) view.findViewById(R.id.tv_mc_status);
            tvPhysicalProgress=(TextView) view.findViewById(R.id.tv_physicalprogress);



        }
    }


    public PMSSYNewAiimsCusRecViewNineAdapter(Context context, List<MinisterPmssyDataNewAiims> newAiimsList) {
        this.newAiimsListmain = newAiimsList;
        this.mCtx = context;
    }

    @Override
    public PMSSYNewAiimsCusRecViewNineAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mnewaiims_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new PMSSYNewAiimsCusRecViewNineAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PMSSYNewAiimsCusRecViewNineAdapter.MyViewHolder holder, int position) {
        Log.i("rspos",""+position);
        if (position==0){
            holder.itemView.setBackgroundResource(R.color.LightPink);
        }else if (position % 2 == 0 && position!=0) {
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

        final MinisterPmssyDataNewAiims newAiims = newAiimsListmain.get(position);

        holder.tvSno.setText(String.valueOf(newAiims.getS_no()));
        holder.tv_project.setText(newAiims.getProject());
        holder.tvStateName.setText(newAiims.getState());
        holder.tvLocatoin.setText(newAiims.getLocation());
        holder.tvPhase.setText(newAiims.getPhase());
        holder.tvProjectStatus.setText(newAiims.getProject_status());
        holder.tvOpdStatus.setText(newAiims.getOpd_status());
        holder.tvMcStatus.setText(newAiims.getMc_status());
        holder.tvPhysicalProgress.setText(newAiims.getPhy_progress());


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
        return newAiimsListmain.size();
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterPmssyDataNewAiims> facilityTypeDetailsLists) {
        for (MinisterPmssyDataNewAiims ftdl : facilityTypeDetailsLists) {
            newAiimsListmain.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterPmssyDataNewAiims> newList) {
        newAiimsListmain = new ArrayList<>();
        newAiimsListmain.addAll(newList);
        notifyDataSetChanged();
    }
}
