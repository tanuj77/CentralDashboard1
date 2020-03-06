package com.chi.centraldashboard.Minister.InternationalHealth;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.FSSAIPrimary;
import com.chi.centraldashboard.apiCall.bin.FSSAIState;
import com.chi.centraldashboard.apiCall.bin.MinisterMouActive;
import com.chi.centraldashboard.apiCall.bin.MinisterMouInactive;
import com.chi.centraldashboard.apiCall.bin.MinisterMouSigned;

import java.util.List;


public class IHCusRecViewSixAdapter extends RecyclerView.Adapter<IHCusRecViewSixAdapter.MyViewHolder> {

    Context mCtx;
    String typeMain;
    private List<MinisterMouSigned> ministerMouSignedList;
    private List<MinisterMouActive> ministerMouActiveList;
    private List<MinisterMouInactive> ministerMouInactiveList;

    private List<FSSAIPrimary> fssaiPrimaryList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tvSubject, tvCountry, tvDate, tvAutoRenewal, tvStatus, tvOpdStatus, tvMcStatus, tvPhysicalProgress, tvCount;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_srno);
            tvSubject = (TextView) view.findViewById(R.id.tv_subject);
            tvCountry = (TextView) view.findViewById(R.id.tv_country);
            tvDate = (TextView) view.findViewById(R.id.tv_date);
            tvAutoRenewal = (TextView) view.findViewById(R.id.tv_autorenewal);
            tvStatus = (TextView) view.findViewById(R.id.tv_status);


        }
    }


    public IHCusRecViewSixAdapter(Context applicationContext, List<MinisterMouSigned> ministerMouSignedList, List<MinisterMouActive> ministerMouActiveList, List<MinisterMouInactive> ministerMouInactiveList, String type) {
        this.mCtx = applicationContext;
        this.ministerMouSignedList = ministerMouSignedList;
        this.ministerMouActiveList = ministerMouActiveList;
        this.ministerMouInactiveList = ministerMouInactiveList;
        this.typeMain = type;
    }

    public IHCusRecViewSixAdapter(Context applicationContext, List<FSSAIPrimary> fssaiPrimaryList, String type) {
        this.mCtx = applicationContext;
        this.fssaiPrimaryList=fssaiPrimaryList;
        this.typeMain = type;

    }


    @Override
    public IHCusRecViewSixAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mih_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new IHCusRecViewSixAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(IHCusRecViewSixAdapter.MyViewHolder holder, int position) {

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
            case "signed":
                final MinisterMouSigned mouSigned = ministerMouSignedList.get(position);

                holder.tvSno.setText(String.valueOf(mouSigned.getSR_NO()));
                holder.tvSubject.setText(mouSigned.getSubject());
                holder.tvCountry.setText(mouSigned.getCountry());
                holder.tvDate.setText(mouSigned.getDate_of_signing());
                holder.tvAutoRenewal.setText(String.valueOf(mouSigned.getAuto_renewal()));
                holder.tvStatus.setText(String.valueOf(mouSigned.getStatus()));
                break;

            case "active":
                final MinisterMouActive mouActive = ministerMouActiveList.get(position);
                holder.tvSno.setText(String.valueOf(mouActive.getSR_NO()));
                holder.tvSubject.setText(mouActive.getSubject());
                holder.tvCountry.setText(mouActive.getCountry());
                holder.tvDate.setText(mouActive.getDate_of_signing());
                holder.tvAutoRenewal.setText(String.valueOf(mouActive.getAuto_renewal()));
                holder.tvStatus.setText(String.valueOf(mouActive.getStatus()));
                break;

            case "inactive":
                final MinisterMouInactive mouInactive = ministerMouInactiveList.get(position);
                holder.tvSno.setText(String.valueOf(mouInactive.getSR_NO()));
                holder.tvSubject.setText(mouInactive.getSubject());
                holder.tvCountry.setText(mouInactive.getCountry());
                holder.tvDate.setText(mouInactive.getDate_of_signing());
                holder.tvAutoRenewal.setText(String.valueOf(mouInactive.getAuto_renewal()));
                holder.tvStatus.setText(String.valueOf(mouInactive.getStatus()));
                break;

            case "FSSAIPrimary":
                final FSSAIPrimary fssaiPrimary = fssaiPrimaryList.get(position);
                holder.tvSno.setText(fssaiPrimary.getSR_NO());
                holder.tvSubject.setText(fssaiPrimary.getState_Name());
                holder.tvCountry.setText(fssaiPrimary.getCentral_Government_Institutes_Autonomous_Bodies_NABL());
                holder.tvDate.setText(fssaiPrimary.getState_Food_Laboratories_NABL());
                holder.tvAutoRenewal.setText(String.valueOf(fssaiPrimary.getPrivate_Laboratories_NABL()));
                holder.tvStatus.setText(String.valueOf(fssaiPrimary.getState_Government_Laboratories_Under_Transition_Provision()));
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

        if (typeMain.equalsIgnoreCase("signed") || typeMain.equals("signed")) {
            return ministerMouSignedList.size();
        } else if (typeMain.equalsIgnoreCase("active") || typeMain.equals("active")) {
            return ministerMouActiveList.size();
        } else if (typeMain.equalsIgnoreCase("FSSAIPrimary") || typeMain.equals("FSSAIPrimary")) {
            return fssaiPrimaryList.size();
        } else {

            return ministerMouInactiveList.size();
        }
    }


//    ////////////////pagiantion method///////////
//    public void addData(List<MinisterPmjayECardsGenerated> facilityTypeDetailsLists) {
//        for (MinisterPmjayECardsGenerated ftdl : facilityTypeDetailsLists) {
//            ministerPmjayECardsGeneratedList.add(ftdl);
//
//        }
//        notifyDataSetChanged();
//    }
//
//    //////////////Search in recyclerview method//////////
//    public void updateList(List<MinisterPmjayECardsGenerated> newList) {
//        ministerPmjayECardsGeneratedList = new ArrayList<>();
//        ministerPmjayECardsGeneratedList.addAll(newList);
//        notifyDataSetChanged();
//    }
}


