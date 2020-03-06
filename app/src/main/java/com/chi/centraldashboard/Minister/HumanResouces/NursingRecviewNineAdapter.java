package com.chi.centraldashboard.Minister.HumanResouces;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.EMRCBRN;
import com.chi.centraldashboard.apiCall.bin.EMROperationCenters;
import com.chi.centraldashboard.apiCall.bin.EMRPersonalTrained;
import com.chi.centraldashboard.apiCall.bin.EMRSkillCenters;
import com.chi.centraldashboard.apiCall.bin.FamilyPlaningPPIUCD;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthANCCheckup;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthAntenatalCare;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthInstitutionalDelivery;
import com.chi.centraldashboard.apiCall.bin.NursingCentralSector;
import com.chi.centraldashboard.apiCall.bin.NursingCourses;
import com.chi.centraldashboard.apiCall.bin.NursingInstitute;
import com.chi.centraldashboard.apiCall.bin.NursingNationalInstitute;
import com.chi.centraldashboard.apiCall.bin.NursingSeats;
import com.chi.centraldashboard.apiCall.bin.NursingStateWise;
import com.chi.centraldashboard.apiCall.bin.NursingUpgradation;

import java.util.ArrayList;
import java.util.List;


public class NursingRecviewNineAdapter extends RecyclerView.Adapter<NursingRecviewNineAdapter.MyViewHolder> {

    private static final int TYPE_HEAD = 0;
    private static final int TYPE_LIST = 1;

    Context mCtx;
    String flagType = "nothing";

    private List<NursingStateWise> nursingStateWiseList;
    private List<NursingCentralSector> nursingCentralSectorList;
    private List<NursingCourses> nursingCoursesList;
    private List<NursingNationalInstitute> nursingNationalInstituteList;
    private List<NursingSeats> nursingSeatsList;
    private List<NursingUpgradation> nursingUpgradationList;
    private List<NursingInstitute> nursingInstituteList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        int viewType;

        //variable for list
        public TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tvCount;
        //variable for header
        public TextView tv_heading1, tv_heading2, tv_heading3, tv_heading4, tv_heading5, tv_heading6, tv_heading7, tv_heading8, tv_heading9;

        public MyViewHolder(View view, int viewType) {
            super(view);

            if (viewType == TYPE_LIST) {

                tv1 = (TextView) view.findViewById(R.id.tv_nursing1);
                tv2 = (TextView) view.findViewById(R.id.tv_nursing2);
                tv3 = (TextView) view.findViewById(R.id.tv_nursing3);
                tv4 = (TextView) view.findViewById(R.id.tv_nursing4);
                tv5 = (TextView) view.findViewById(R.id.tv_nursing5);
                tv6 = (TextView) view.findViewById(R.id.tv_nursing6);
                tv7 = (TextView) view.findViewById(R.id.tv_nursing7);
                tv8 = (TextView) view.findViewById(R.id.tv_nursing8);
                tv9 = (TextView) view.findViewById(R.id.tv_nursing9);
                viewType = 1;
            } else if (viewType == TYPE_HEAD) {
                tv_heading1 = (TextView) view.findViewById(R.id.tv_nurseh1);
                tv_heading2 = (TextView) view.findViewById(R.id.tv_nurseh2);
//                tv_heading3 = (TextView) view.findViewById(R.id.tv_nursingh3);
//                tv_heading4 = (TextView) view.findViewById(R.id.tv_nursingh4);
//                tv_heading5 = (TextView) view.findViewById(R.id.tv_nursingh5);
//                tv_heading6 = (TextView) view.findViewById(R.id.tv_nursingh6);
//                tv_heading7 = (TextView) view.findViewById(R.id.tv_nursingh7);
//                tv_heading8 = (TextView) view.findViewById(R.id.tv_nursingh8);
//                tv_heading9 = (TextView) view.findViewById(R.id.tv_nursingh9);
                viewType = 0;
            }

        }


    }


    public NursingRecviewNineAdapter(Context applicationContext, List<NursingStateWise> nursingStateWiseList, List<NursingCentralSector> nursingCentralSectorList, List<NursingCourses> nursingCoursesList, List<NursingNationalInstitute> nursingNationalInstituteList, List<NursingSeats> nursingSeatsList, List<NursingUpgradation> nursingUpgradationList, List<NursingInstitute> nursingInstituteList, String flagType) {
        this.mCtx = applicationContext;
        this.nursingStateWiseList = nursingStateWiseList;
        this.nursingCentralSectorList = nursingCentralSectorList;
        this.nursingCoursesList = nursingCoursesList;
        this.nursingNationalInstituteList = nursingNationalInstituteList;
        this.nursingSeatsList = nursingSeatsList;
        this.nursingUpgradationList = nursingUpgradationList;
        this.nursingInstituteList = nursingInstituteList;
        this.flagType = flagType;
    }


    @Override
    public NursingRecviewNineAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        MyViewHolder nursingRecviewNineAdapter;

        // View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mnursing_recview_row, parent, false);
        if (viewType == TYPE_LIST) {


            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mnursing_recview_row, parent, false);
            nursingRecviewNineAdapter = new MyViewHolder(view, viewType);

            return nursingRecviewNineAdapter;
        } else if (viewType == TYPE_HEAD) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nursinghead_recview, parent, false);
            nursingRecviewNineAdapter = new MyViewHolder(view, viewType);

            return nursingRecviewNineAdapter;
        }
        return null;
        //return new NursingRecviewNineAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NursingRecviewNineAdapter.MyViewHolder holder, int position) {

        if (holder.viewType == TYPE_HEAD) {
//            holder.tv_heading1.setText("Shri");
//            holder.tv_heading2.setText("Radhey");
//            holder.tv_heading3.setText("Shyam");
//            holder.tv_heading4.setText("Shri");
//            holder.tv_heading5.setText("Sita");
//            holder.tv_heading6.setText("Ram");
//            holder.tv_heading7.setText("Harey");
//            holder.tv_heading8.setText("Krishna");
//            holder.tv_heading9.setText("Harey Ram");

        }
        else if (holder.viewType == TYPE_LIST) {

            if (position == 0) {
                holder.itemView.setVisibility(View.INVISIBLE);
            }
            if (position % 2 == 0) {
                //holder.rootView.setBackgroundColor(Color.BLACK);
                holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
            } else {
                //holder.rootView.setBackgroundColor(Color.WHITE);
                holder.itemView.setBackgroundResource(R.color.White);
                //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
            }


            switch (flagType) {
                case "Statewise":
                    final NursingStateWise stateWise = nursingStateWiseList.get(position - 1);

                    holder.tv1.setText(stateWise.getSR_NO());
                    holder.tv2.setText(stateWise.getState_Name());
                    holder.tv3.setText(stateWise.getA_N_M());
                    holder.tv4.setText(stateWise.getG_N_M());
                    holder.tv5.setText(stateWise.getB_Sc());
                    holder.tv6.setText(stateWise.getM_Sc());
                    holder.tv7.setText(stateWise.getPBBSC());
                    holder.tv8.setText(stateWise.getIGNOU());
                    holder.tv9.setText(stateWise.getNurse_Practitioner_Critical_Care());
                    break;

                case "CentralSector":
                    final NursingCentralSector centralSector = nursingCentralSectorList.get(position - 1);
                    holder.tv1.setText(centralSector.getSR_NO());
                    holder.tv2.setText(centralSector.getTraining_of_Nurses());
                    holder.tv3.setText(centralSector.getUpgradation_of_Schools_into_College_of_Nursing());
                    holder.tv4.setText(centralSector.getNational_Florence_Nightingale_Awards());
                    break;

                case "Courses":
                    final NursingCourses courses = nursingCoursesList.get(position - 1);
                    holder.tv1.setText(courses.getSR_NO());
                    holder.tv2.setText(courses.getNursing_Programs());
                    holder.tv3.setText(courses.getTraining_Duration());
                    holder.tv4.setText(courses.getExamination());
                    holder.tv5.setText(courses.getRegistration());
                    break;

                case "NationalInstitute":
                    final NursingNationalInstitute nationalInstitute = nursingNationalInstituteList.get(position - 1);
                    holder.tv1.setText(nationalInstitute.getSR_NO());
                    holder.tv2.setText(nationalInstitute.getTotal_Number_of_Nursing_Institutes());
                    break;

                case "Seats":
                    final NursingSeats seats = nursingSeatsList.get(position - 1);
                    holder.tv1.setText(seats.getSR_NO());
                    holder.tv2.setText(seats.getAnnual_Admission_Capacity_Seats());
                    holder.tv3.setText(seats.getThematic_Registered_Nurses_RN_RM());
                    holder.tv4.setText(seats.getThematic_Registered_ANM_LHV());
                    holder.tv5.setText(seats.getTotal_Registered_Nursing());
                    holder.tv6.setText(seats.getIndia_Status_Per_1000_Population());
                    holder.tv7.setText(seats.getWHO_Norms_per_1000_population_Target());

                    break;

                case "Upgradation":
                    final NursingUpgradation upgradation = nursingUpgradationList.get(position - 1);
                    holder.tv1.setText(upgradation.getSR_NO());
                    holder.tv2.setText(upgradation.getApproved());
                    holder.tv3.setText(upgradation.getFunctional());
                    break;

                case "Institute":
                    final NursingInstitute institute = nursingInstituteList.get(position - 1);
                    holder.tv1.setText(institute.getSR_NO());
                    holder.tv2.setText(institute.getIndian_Nursing_Councile());
                    holder.tv3.setText(institute.getRAK_College_of_Nursing_est_1946());
                    holder.tv4.setText(institute.getLady_Reading_Health_School_est_1918());

                    break;


            }


        }
    }

    @Override
    public int getItemCount() {

        if (flagType.equalsIgnoreCase("CentralSector") || flagType == "CentralSector") {
            return nursingCentralSectorList.size() + 1;
        } else if (flagType.equalsIgnoreCase("Courses") || flagType == "Courses") {
            return nursingCoursesList.size() + 1;
        } else if (flagType.equalsIgnoreCase("NationalInstitute") || flagType == "NationalInstitute") {
            return nursingNationalInstituteList.size() + 1;
        } else if (flagType.equalsIgnoreCase("Seats") || flagType == "Seats") {
            return nursingSeatsList.size() + 1;
        } else if (flagType.equalsIgnoreCase("Upgradation") || flagType == "Upgradation") {
            return nursingUpgradationList.size() + 1;
        } else if (flagType.equalsIgnoreCase("Institute") || flagType == "Institute") {
            return nursingInstituteList.size() + 1;
        } else {
            return nursingStateWiseList.size() + 1;
        }

    }


    @Override
    public int getItemViewType(int position) {
        if (position == 0)
            return TYPE_HEAD;
        return TYPE_LIST;

    }

}


