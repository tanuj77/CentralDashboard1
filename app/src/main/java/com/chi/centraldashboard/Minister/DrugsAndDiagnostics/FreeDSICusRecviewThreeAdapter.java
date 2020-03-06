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
import com.chi.centraldashboard.apiCall.bin.MinisterFreeDSIDHs;
import com.chi.centraldashboard.apiCall.bin.MinisterFreeDSIDS;
import com.chi.centraldashboard.apiCall.bin.MinisterFreeDSILS;
import com.chi.centraldashboard.apiCall.bin.MinisterFreeDSIRS;

import java.util.ArrayList;
import java.util.List;

    public class FreeDSICusRecviewThreeAdapter extends RecyclerView.Adapter<FreeDSICusRecviewThreeAdapter.MyViewHolder> {
        Context mCtx;
        private List<MinisterAmritPharmacies> ministerAmritPharmaciesList;
        private List<MinisterAmritPatientsServed> ministerAmritPatientsServedList;
        private List<MinisterAmritDrugsDispensed> ministerAmritDrugsDispensedList;
        private List<MinisterAmritSavingsPatients> ministerAmritSavingsPatientsList;


        private List<MinisterFreeDSIDS>ministerFreeDSIDSList;
        private List<MinisterFreeDSILS>ministerFreeDSILSList;
        private List<MinisterFreeDSIRS>ministerFreeDSIRSList;
        private List<MinisterFreeDSIDHs>ministerFreeDSIDHsList;

        String flagType;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView tvSno, tv_amritprg, tvStateName;


            public MyViewHolder(View view) {
                super(view);

                tvSno = (TextView) view.findViewById(R.id.tv_freesrno);
                tvStateName = (TextView) view.findViewById(R.id.tv_freestatename);
                tv_amritprg = (TextView) view.findViewById(R.id.tv_freeprg);

            }
        }


        public FreeDSICusRecviewThreeAdapter(Context context, List<MinisterFreeDSIDS> ministerFreeDSIDSList, List<MinisterFreeDSILS> ministerFreeDSILSList, List<MinisterFreeDSIRS> ministerFreeDSIRSList, List<MinisterFreeDSIDHs> ministerFreeDSIDHsList, String flagType) {
            this.mCtx = context;
            this.ministerFreeDSIDSList = ministerFreeDSIDSList;
            this.ministerFreeDSILSList = ministerFreeDSILSList;
            this.ministerFreeDSIRSList = ministerFreeDSIRSList;
            this.ministerFreeDSIDHsList = ministerFreeDSIDHsList;
            this.flagType = flagType;

        }

        @Override
        public FreeDSICusRecviewThreeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mfreedsi_recview_row, parent, false);
            //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

            return new FreeDSICusRecviewThreeAdapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(FreeDSICusRecviewThreeAdapter.MyViewHolder holder, int position) {

            if (position % 2 == 0) {
                //holder.rootView.setBackgroundColor(Color.BLACK);
                holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
            } else {
                //holder.rootView.setBackgroundColor(Color.WHITE);
                holder.itemView.setBackgroundResource(R.color.White);
                //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
            }


            if (flagType.equalsIgnoreCase("ds") || flagType == "ds") {
                final MinisterFreeDSIDS dsids = ministerFreeDSIDSList.get(position);

                holder.tvSno.setText(dsids.getSR_NO());
                holder.tvStateName.setText(dsids.getState_Name());
                holder.tv_amritprg.setText(dsids.getStatus_of_Implementation_of_Free_Diagnostic_Services());


            }
            if (flagType.equalsIgnoreCase("ls") || flagType == "ls") {
                final MinisterFreeDSILS patientsServed = ministerFreeDSILSList.get(position);

                holder.tvSno.setText(patientsServed.getSR_NO());
                holder.tvStateName.setText(patientsServed.getState_Name());
                holder.tv_amritprg.setText(patientsServed.getFree_Laboratory_services());

            }

            if (flagType.equalsIgnoreCase("rs") || flagType == "rs") {
                final MinisterFreeDSIRS drugsDispensed = ministerFreeDSIRSList.get(position);

                holder.tvSno.setText(drugsDispensed.getSR_NO());
                holder.tvStateName.setText(drugsDispensed.getState_Name());
                holder.tv_amritprg.setText(drugsDispensed.getRadiology_services());

            }
            if (flagType.equalsIgnoreCase("dhs") || flagType == "dhs") {
                final MinisterFreeDSIDHs savingsPatients = ministerFreeDSIDHsList.get(position);

                holder.tvSno.setText(savingsPatients.getSR_NO());
                holder.tvStateName.setText(savingsPatients.getState_Name());
                holder.tv_amritprg.setText(savingsPatients.getServices_in_DHs());

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
            if (flagType.equalsIgnoreCase("ds") || flagType == "ds") {
                return ministerFreeDSIDSList.size();
            } else if (flagType.equalsIgnoreCase("ls") || flagType == "ls") {
                return ministerFreeDSILSList.size();
            } else if (flagType.equalsIgnoreCase("rs") || flagType == "rs") {
                return ministerFreeDSIRSList.size();
            } else {
                return ministerFreeDSIDHsList.size();
            }
        }


        ////////////////pagiantion method///////////
        public void addData(List<MinisterFreeDSIDS> ministerFreeDSIDSList) {
            for (MinisterFreeDSIDS ftdl : ministerFreeDSIDSList) {
                ministerFreeDSIDSList.add(ftdl);

            }
            notifyDataSetChanged();
        }

        //////////////Search in recyclerview method//////////
        public void updateList(List<MinisterFreeDSIDS> newList) {
            ministerFreeDSIDSList = new ArrayList<>();
            ministerFreeDSIDSList.addAll(newList);
            notifyDataSetChanged();
        }
    }

