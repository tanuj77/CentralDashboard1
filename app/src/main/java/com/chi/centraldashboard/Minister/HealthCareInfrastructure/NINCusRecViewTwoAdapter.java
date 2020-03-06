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

//public class NINCusRecViewTwoAdapter extends RecyclerView.Adapter<NINCusRecViewTwoAdapter.MyViewHolder> {
    public class NINCusRecViewTwoAdapter extends RecyclerView.Adapter<NINCusRecViewTwoAdapter.MyViewHolder> {
        Context mCtx;
        private List<MinisterNhrrDataTypewise> typewiseListmain;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView tvName, tvNumber;


            public MyViewHolder(View view) {
                super(view);

                tvName = (TextView) view.findViewById(R.id.tv_name);
                tvNumber = (TextView) view.findViewById(R.id.tv_number);



            }
        }


        public NINCusRecViewTwoAdapter(Context context, List<MinisterNhrrDataTypewise> typewiseList) {
            this.typewiseListmain = typewiseList;
            this.mCtx = context;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mnin_recyclerview_row, parent, false);
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
                holder.tvName.setText("S_No");
                holder.tvNumber.setText("State Name");
                // holder.tvCount.setText("Distribution of HE State wise");
            }

            final MinisterNhrrDataTypewise typewise = typewiseListmain.get(position);

            holder.tvName.setText(String.valueOf(typewise.getSr_no()));
            holder.tvNumber.setText(typewise.getState_name());



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

