package com.chi.centraldashboard.Minister.QualityOfHealthServices;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.CEARegistered;
import com.chi.centraldashboard.apiCall.bin.MinisterEHospitalDoneToday;
import com.chi.centraldashboard.apiCall.bin.MinisterEHospitalOnboarded;
import com.chi.centraldashboard.apiCall.bin.MinisterEHospitalRegistration;

import java.util.ArrayList;
import java.util.List;


public class CEACusRecviewElevenAdapter extends RecyclerView.Adapter<CEACusRecviewElevenAdapter.MyViewHolder> {

    Context mCtx;
    String typeMain;
    private List<CEARegistered> ceaRegisteredList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tvStateName, tv_allopathy, tv_ayurveda, tv_unani, tv_siddha, tv_homeopathy, tv_yoga, tv_naturapathy, tv_sowa, tv_total;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_ceasrno);
            tvStateName = (TextView) view.findViewById(R.id.tv_ceastatename);
            tv_allopathy = (TextView) view.findViewById(R.id.tv_allopathy);
            tv_ayurveda = (TextView) view.findViewById(R.id.tv_ayurveda);
            tv_unani = (TextView) view.findViewById(R.id.tv_unani);
            tv_siddha = (TextView) view.findViewById(R.id.tv_siddha);
            tv_homeopathy = (TextView) view.findViewById(R.id.tv_homeopathy);
            tv_yoga = (TextView) view.findViewById(R.id.tv_yoga);
            tv_naturapathy = (TextView) view.findViewById(R.id.tv_naturapathy);
            tv_sowa = (TextView) view.findViewById(R.id.tv_sowa);
            tv_total = (TextView) view.findViewById(R.id.tv_total);

        }
    }


    public CEACusRecviewElevenAdapter(Context applicationContext, List<CEARegistered> ceaRegisteredList, String type) {
        this.mCtx = applicationContext;
        this.ceaRegisteredList = ceaRegisteredList;

        this.typeMain = type;
    }


    @Override
    public CEACusRecviewElevenAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mcea_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new CEACusRecviewElevenAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CEACusRecviewElevenAdapter.MyViewHolder holder, int position) {
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

        if (typeMain.equalsIgnoreCase("ceaRegistered") || typeMain.equals("ceaRegistered")) {

            final CEARegistered ceaRegistered = ceaRegisteredList.get(position);

            holder.tvSno.setText(ceaRegistered.getSR_NO());
            holder.tvStateName.setText(ceaRegistered.getState_Name());
            holder.tv_allopathy.setText(ceaRegistered.getAllopathy());
            holder.tv_ayurveda.setText(ceaRegistered.getAyurveda());
            holder.tv_unani.setText(ceaRegistered.getUnani());
            holder.tv_siddha.setText(ceaRegistered.getSiddha());
            holder.tv_homeopathy.setText(ceaRegistered.getHomoeopathy());
            holder.tv_yoga.setText(ceaRegistered.getYoga());
            holder.tv_naturapathy.setText(ceaRegistered.getNaturapathy());
            holder.tv_sowa.setText(ceaRegistered.getSowa());
            holder.tv_total.setText(ceaRegistered.getTotal());


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


        return ceaRegisteredList.size();


    }


    ////////////////pagiantion method///////////
    public void addData(List<CEARegistered> ceaRegisteredList) {
        for (CEARegistered ftdl : ceaRegisteredList) {
            ceaRegisteredList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<CEARegistered> newList) {
        ceaRegisteredList = new ArrayList<>();
        ceaRegisteredList.addAll(newList);
        notifyDataSetChanged();
    }
}
