package com.chi.centraldashboard.Minister.HealthServiceDelivery;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.EMRCBRN;
import com.chi.centraldashboard.apiCall.bin.EMRMedicalPersonTrained;
import com.chi.centraldashboard.apiCall.bin.EMROperationCenters;
import com.chi.centraldashboard.apiCall.bin.EMRPersonalTrained;
import com.chi.centraldashboard.apiCall.bin.EMRSkillCenters;
import com.chi.centraldashboard.apiCall.bin.FamilyPlaningPPIUCD;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthANCCheckup;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthAntenatalCare;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthInstitutionalDelivery;
import com.chi.centraldashboard.apiCall.bin.NFHS_BreastFed;
import com.chi.centraldashboard.apiCall.bin.NFHS_DeliveryAttended;
import com.chi.centraldashboard.apiCall.bin.NFHS_Households;
import com.chi.centraldashboard.apiCall.bin.NFHS_MarriedWoman;
import com.chi.centraldashboard.apiCall.bin.NFHS_PregnantWoman;
import com.chi.centraldashboard.apiCall.bin.NLEP_ChildCases;
import com.chi.centraldashboard.apiCall.bin.NLEP_FemaleCases;
import com.chi.centraldashboard.apiCall.bin.NLEP_Grade2;
import com.chi.centraldashboard.apiCall.bin.SRS_CBR;
import com.chi.centraldashboard.apiCall.bin.SRS_NMR;
import com.chi.centraldashboard.apiCall.bin.SRS_TFR;

import java.util.ArrayList;
import java.util.List;


public class FamilyPlaningRecviewCusFiveAdapter extends RecyclerView.Adapter<FamilyPlaningRecviewCusFiveAdapter.MyViewHolder> {

    Context mCtx;
    String flagType = "nothing";

    private List<FamilyPlaningPPIUCD> familyPlaningPPIUCDList;


    private List<MaternalHealthAntenatalCare> antenatalCareList;
    private List<MaternalHealthInstitutionalDelivery> institutionalDeliveryList;
    private List<MaternalHealthANCCheckup> ancCheckupList;


    private List<EMRSkillCenters> emrSkillCentersList;
    private List<EMRPersonalTrained> emrPersonalTrainedList;
    private List<EMRMedicalPersonTrained> emrMedicalPersonTrainedList;
    private List<EMRCBRN> emrcbrnList;
    private List<EMROperationCenters> emrOperationCentersList;

    private List<NLEP_Grade2> nlep_grade2List;
    private List<NLEP_FemaleCases> nlep_femaleCasesList;
    private List<NLEP_ChildCases> nlep_childCasesList;


    private List<NFHS_MarriedWoman> nfhs_marriedWomanList;
    private List<NFHS_PregnantWoman> nfhs_pregnantWomanList;
    private List<NFHS_DeliveryAttended> nfhs_deliveryAttendedList;
    private List<NFHS_Households> nfhs_householdsList;
    private List<NFHS_BreastFed> nfhs_breastFedList;

    private List<SRS_CBR> srs_cbrList;
    private List<SRS_TFR> srs_tfrList;
    private List<SRS_NMR> srs_nmrList;



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tvIucd, tvStateName, tvTotal, tvPost, tvProjectStatus, tvOpdStatus, tvMcStatus, tvPhysicalProgress, tvCount;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_fpsrno);
            tvStateName = (TextView) view.findViewById(R.id.tv_fpstatename);
            tvIucd = (TextView) view.findViewById(R.id.tv_ppiucd);
            tvTotal = (TextView) view.findViewById(R.id.tv_fptotal);
            tvPost = (TextView) view.findViewById(R.id.tv_fppost);


        }
    }


    public FamilyPlaningRecviewCusFiveAdapter(Context applicationContext, List<FamilyPlaningPPIUCD> familyPlaningPPIUCDList, String flagType) {
        this.mCtx = applicationContext;
        this.familyPlaningPPIUCDList = familyPlaningPPIUCDList;
        this.flagType = flagType;
    }

    public FamilyPlaningRecviewCusFiveAdapter(Context applicationContext, List<MaternalHealthAntenatalCare> antenatalCareList, List<MaternalHealthInstitutionalDelivery> institutionalDeliveryList, List<MaternalHealthANCCheckup> ancCheckupList, String flagType) {
        this.mCtx = applicationContext;
        this.antenatalCareList = antenatalCareList;
        this.institutionalDeliveryList = institutionalDeliveryList;
        this.ancCheckupList = ancCheckupList;
        this.flagType = flagType;
    }

    public FamilyPlaningRecviewCusFiveAdapter(Context applicationContext, List<EMRSkillCenters> emrSkillCentersList, List<EMRPersonalTrained> emrPersonalTrainedList, List<EMRMedicalPersonTrained> emrMedicalPersonTrainedList, List<EMRCBRN> emrcbrnList, List<EMROperationCenters> emrOperationCentersList, String flagType) {
        this.mCtx = applicationContext;
        this.emrSkillCentersList = emrSkillCentersList;
        this.emrPersonalTrainedList = emrPersonalTrainedList;
        this.emrMedicalPersonTrainedList = emrMedicalPersonTrainedList;
        this.emrcbrnList = emrcbrnList;
        this.emrOperationCentersList = emrOperationCentersList;
        this.flagType = flagType;
    }

    /////NLEP
    public FamilyPlaningRecviewCusFiveAdapter(Context applicationContext, List<NLEP_Grade2> nlep_grade2List, List<NLEP_FemaleCases> nlep_femaleCasesList, List<NLEP_ChildCases> nlep_childCasesList, String flagType, int i) {
        this.mCtx = applicationContext;
        this.nlep_grade2List = nlep_grade2List;
        this.nlep_femaleCasesList = nlep_femaleCasesList;
        this.nlep_childCasesList = nlep_childCasesList;
        this.flagType = flagType;
    }

    //////NFHS
    public FamilyPlaningRecviewCusFiveAdapter(Context context, List<NFHS_MarriedWoman> nfhs_marriedWomanList, List<NFHS_PregnantWoman> nfhs_pregnantWomanList, List<NFHS_DeliveryAttended> nfhs_deliveryAttendedList, List<NFHS_Households> nfhs_householdsList, List<NFHS_BreastFed> nfhs_breastFedList, String nfhs_marriedWoman, int i) {
        this.mCtx = context;
        this.nfhs_marriedWomanList = nfhs_marriedWomanList;
        this.nfhs_pregnantWomanList = nfhs_pregnantWomanList;
        this.nfhs_deliveryAttendedList = nfhs_deliveryAttendedList;
        this.nfhs_householdsList = nfhs_householdsList;
        this.nfhs_breastFedList = nfhs_breastFedList;
        this.flagType = nfhs_marriedWoman;
    }

    ////SRS
    public FamilyPlaningRecviewCusFiveAdapter(Context context, List<SRS_CBR> srs_cbrList, List<SRS_TFR> srs_tfrList, List<SRS_NMR> srs_nmrList, String srs_cbr, double v) {
        this.mCtx = context;
        this.srs_cbrList = srs_cbrList;
        this.srs_tfrList = srs_tfrList;
        this.srs_nmrList = srs_nmrList;
        this.flagType = srs_cbr;
    }



    @Override
    public FamilyPlaningRecviewCusFiveAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mfamilyplaning_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new FamilyPlaningRecviewCusFiveAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FamilyPlaningRecviewCusFiveAdapter.MyViewHolder holder, int position) {

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
            case "antenatalCare":
                final MaternalHealthAntenatalCare antenatalCare = antenatalCareList.get(position);

                holder.tvSno.setText(antenatalCare.getSR_NO());
                holder.tvStateName.setText(antenatalCare.getState_Name());
                holder.tvIucd.setText(antenatalCare.getFirsttrimester());
                holder.tvTotal.setText(antenatalCare.getEstimate_pregnancy_w());
                holder.tvPost.setText(antenatalCare.getFirsttrimester_w());
                break;

            case "institutional":
                final MaternalHealthInstitutionalDelivery institutionalDelivery = institutionalDeliveryList.get(position);
                holder.tvSno.setText(institutionalDelivery.getSR_NO());
                holder.tvStateName.setText(institutionalDelivery.getState_Name());
                holder.tvIucd.setText(institutionalDelivery.getInstitutedelivery());
                holder.tvTotal.setText(institutionalDelivery.getEstimate_pregnancy_id());
                holder.tvPost.setText(institutionalDelivery.getInstitutedelivery_id());
                break;

            case "anccheckup":
                final MaternalHealthANCCheckup ancCheckup = ancCheckupList.get(position);
                holder.tvSno.setText(ancCheckup.getSR_NO());
                holder.tvStateName.setText(ancCheckup.getState_Name());
                holder.tvIucd.setText(ancCheckup.getAnccheckup());
                holder.tvTotal.setText(ancCheckup.getEstimate_pregnancy_anc());
                holder.tvPost.setText(ancCheckup.getAnccheckup_anc());
                break;

            case "FamilyPlaning":
                final FamilyPlaningPPIUCD ppiucd = familyPlaningPPIUCDList.get(position);

                holder.tvSno.setText(ppiucd.getSR_NO());
                holder.tvStateName.setText(ppiucd.getState_Name());
                holder.tvIucd.setText(ppiucd.getPpiucd_insertion_no());
                holder.tvTotal.setText(ppiucd.getTotal_institution_delivery());
                holder.tvPost.setText(ppiucd.getAcceptance_rate_100_beds());
                break;

            case "SkillCenters":
                final EMRSkillCenters emrSkillCenters = emrSkillCentersList.get(position);
                holder.tvSno.setText(emrSkillCenters.getSR_NO());
                holder.tvStateName.setText(emrSkillCenters.getState_Name());
                holder.tvIucd.setText(emrSkillCenters.getNumber_of_Skill_Centre());
                holder.tvTotal.setText(emrSkillCenters.getGrant_Released_in_Rupees_INR());

                break;

            case "PersonalTrained":
                final EMRPersonalTrained personalTrained = emrPersonalTrainedList.get(position);
                holder.tvSno.setText(personalTrained.getSR_NO());
                holder.tvStateName.setText(personalTrained.getState_Name());
                holder.tvIucd.setText(personalTrained.getDoctors());
                holder.tvTotal.setText(personalTrained.getNurses());
                holder.tvPost.setText(personalTrained.getParamedics());
                break;

            case "MedicalPersonalTrained":
                final EMRMedicalPersonTrained medicalPersonTrained = emrMedicalPersonTrainedList.get(position);
                holder.tvSno.setText(medicalPersonTrained.getSR_NO());
                holder.tvStateName.setText(medicalPersonTrained.getState_Name());
                holder.tvIucd.setText(medicalPersonTrained.getDoctors_trained_in_Public_Health_Emergencies());
                holder.tvTotal.setText(medicalPersonTrained.getDoctors_trained_in_Hospital_Emergencies());

                break;

            case "CBRN":
                final EMRCBRN emrcbrn = emrcbrnList.get(position);
                holder.tvSno.setText(emrcbrn.getSR_NO());
                holder.tvStateName.setText(emrcbrn.getState_Name());
                holder.tvIucd.setText(emrcbrn.getCentre_name());
                holder.tvTotal.setText(emrcbrn.getStatus());

                break;

            case "OperationCenters":
                final EMROperationCenters operationCenters = emrOperationCentersList.get(position);
                holder.tvSno.setText(operationCenters.getSR_NO());
                holder.tvStateName.setText(operationCenters.getState_Name());
                holder.tvIucd.setText(operationCenters.getLocation());
                holder.tvTotal.setText(operationCenters.getStatus());

                break;

            case "nlep_grade2":
                final NLEP_Grade2 grade2 = nlep_grade2List.get(position);
                holder.tvSno.setText(grade2.getSR_NO());
                holder.tvStateName.setText(grade2.getState_Name());
                holder.tvIucd.setText(grade2.getNo_of_G2D_cases());
                holder.tvTotal.setText(grade2.getNew_Cases_Detected());
                holder.tvPost.setText(grade2.getGrade_II_Disability_G2D_cases_in_Percentage());
                break;

            case "nlep_FemaleCases":
                final NLEP_FemaleCases femaleCases = nlep_femaleCasesList.get(position);
                holder.tvSno.setText(femaleCases.getSR_NO());
                holder.tvStateName.setText(femaleCases.getState_Name());
                holder.tvIucd.setText(femaleCases.getNo_of_Female_Cases());
                holder.tvTotal.setText(femaleCases.getNew_Cases_Detected());
                holder.tvPost.setText(femaleCases.getFemale_Cases_in_Percentage());
                break;

            case "nlep_ChildCases":
                final NLEP_ChildCases childCases = nlep_childCasesList.get(position);
                holder.tvSno.setText(childCases.getSR_NO());
                holder.tvStateName.setText(childCases.getState_Name());
                holder.tvIucd.setText(childCases.getNo_of_Child_Cases());
                holder.tvTotal.setText(childCases.getNew_Cases_Detected());
                holder.tvPost.setText(childCases.getChild_Cases_in_Percentage());
                break;


            case "NFHS_MarriedWoman":
                final NFHS_MarriedWoman marriedWoman = nfhs_marriedWomanList.get(position);
                holder.tvSno.setText(marriedWoman.getSR_NO());
                holder.tvStateName.setText(marriedWoman.getState_Name());
                holder.tvIucd.setText(marriedWoman.getRural());
                holder.tvTotal.setText(marriedWoman.getUrban());
                holder.tvPost.setText(marriedWoman.getTotal());
                break;


            case "NFHS_PregnantWoman":
                final NFHS_PregnantWoman pregnantWoman = nfhs_pregnantWomanList.get(position);
                holder.tvSno.setText(pregnantWoman.getSR_NO());
                holder.tvStateName.setText(pregnantWoman.getState_Name());
                holder.tvIucd.setText(pregnantWoman.getRural());
                holder.tvTotal.setText(pregnantWoman.getUrban());
                holder.tvPost.setText(pregnantWoman.getTotal());
                break;

            case "NFHS_DeliveryAttended":
                final NFHS_DeliveryAttended deliveryAttended = nfhs_deliveryAttendedList.get(position);
                holder.tvSno.setText(deliveryAttended.getSR_NO());
                holder.tvStateName.setText(deliveryAttended.getState_Name());
                holder.tvIucd.setText(deliveryAttended.getRural());
                holder.tvTotal.setText(deliveryAttended.getUrban());
                holder.tvPost.setText(deliveryAttended.getTotal());
                break;


            case "NFHS_Households":
                final NFHS_Households households = nfhs_householdsList.get(position);
                holder.tvSno.setText(households.getSR_NO());
                holder.tvStateName.setText(households.getState_Name());
                holder.tvIucd.setText(households.getRural());
                holder.tvTotal.setText(households.getUrban());
                holder.tvPost.setText(households.getTotal());
                break;

            case "NFHS_BreastFed":
                final NFHS_BreastFed breastFed = nfhs_breastFedList.get(position);
                holder.tvSno.setText(breastFed.getSR_NO());
                holder.tvStateName.setText(breastFed.getState_Name());
                holder.tvIucd.setText(breastFed.getRural());
                holder.tvTotal.setText(breastFed.getUrban());
                holder.tvPost.setText(breastFed.getTotal());
                break;

            case "SRS_CBR":
                final SRS_CBR cbr = srs_cbrList.get(position);
                holder.tvSno.setText(cbr.getSR_NO());
                holder.tvStateName.setText(cbr.getState_Name());
                holder.tvIucd.setText(cbr.getTotal());
                holder.tvTotal.setText(cbr.getRural());
                holder.tvPost.setText(cbr.getUrban());
                break;

            case "SRS_TFR":
                final SRS_TFR tfr = srs_tfrList.get(position);
                holder.tvSno.setText(tfr.getSR_NO());
                holder.tvStateName.setText(tfr.getState_Name());
                holder.tvIucd.setText(tfr.getTotal());
                holder.tvTotal.setText(tfr.getRural());
                holder.tvPost.setText(tfr.getUrban());
                break;


            case "SRS_NMR":
                final SRS_NMR nmr = srs_nmrList.get(position);
                holder.tvSno.setText(nmr.getSR_NO());
                holder.tvStateName.setText(nmr.getState_Name());
                holder.tvIucd.setText(nmr.getTotal());
                holder.tvTotal.setText(nmr.getRural());
                holder.tvPost.setText(nmr.getUrban());
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

        if (flagType.equalsIgnoreCase("antenatalCare") || flagType == "antenatalCare") {
            return antenatalCareList.size();
        } else if (flagType.equalsIgnoreCase("institutional") || flagType == "institutional") {
            return institutionalDeliveryList.size();
        } else if (flagType.equalsIgnoreCase("anccheckup") || flagType == "anccheckup") {
            return ancCheckupList.size();
        } else if (flagType.equalsIgnoreCase("SkillCenters") || flagType == "SkillCenters") {
            return emrSkillCentersList.size();
        } else if (flagType.equalsIgnoreCase("PersonalTrained") || flagType == "PersonalTrained") {
            return emrPersonalTrainedList.size();
        } else if (flagType.equalsIgnoreCase("MedicalPersonalTrained") || flagType == "MedicalPersonalTrained") {
            return emrMedicalPersonTrainedList.size();
        } else if (flagType.equalsIgnoreCase("CBRN") || flagType == "CBRN") {
            return emrcbrnList.size();
        } else if (flagType.equalsIgnoreCase("OperationCenters") || flagType == "OperationCenters") {
            return emrOperationCentersList.size();
        } else if (flagType.equalsIgnoreCase("nlep_grade2") || flagType == "nlep_grade2") {
            return nlep_grade2List.size();
        } else if (flagType.equalsIgnoreCase("nlep_FemaleCases") || flagType == "nlep_FemaleCases") {
            return nlep_femaleCasesList.size();
        } else if (flagType.equalsIgnoreCase("nlep_ChildCases") || flagType == "nlep_ChildCases") {
            return nlep_childCasesList.size();
        } else if (flagType.equalsIgnoreCase("NFHS_MarriedWoman") || flagType == "NFHS_MarriedWoman") {
            return nfhs_marriedWomanList.size();
        } else if (flagType.equalsIgnoreCase("NFHS_PregnantWoman") || flagType == "NFHS_PregnantWoman") {
            return nfhs_pregnantWomanList.size();
        } else if (flagType.equalsIgnoreCase("NFHS_DeliveryAttended") || flagType == "NFHS_DeliveryAttended") {
            return nfhs_deliveryAttendedList.size();
        } else if (flagType.equalsIgnoreCase("NFHS_Households") || flagType == "NFHS_Households") {
            return nfhs_householdsList.size();
        } else if (flagType.equalsIgnoreCase("NFHS_BreastFed") || flagType == "NFHS_BreastFed") {
            return nfhs_breastFedList.size();
        }else if (flagType.equalsIgnoreCase("SRS_CBR") || flagType == "SRS_CBR") {
            return srs_cbrList.size();
        }else if (flagType.equalsIgnoreCase("SRS_TFR") || flagType == "SRS_TFR") {
            return srs_tfrList.size();
        }else if (flagType.equalsIgnoreCase("SRS_NMR") || flagType == "SRS_NMR") {
            return srs_nmrList.size();
        } else {
            return familyPlaningPPIUCDList.size();
        }


    }


    ////////////////pagiantion method///////////
    public void addData(List<FamilyPlaningPPIUCD> familyPlaningPPIUCDList) {
        for (FamilyPlaningPPIUCD ftdl : familyPlaningPPIUCDList) {
            familyPlaningPPIUCDList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<FamilyPlaningPPIUCD> newList) {
        familyPlaningPPIUCDList = new ArrayList<>();
        familyPlaningPPIUCDList.addAll(newList);
        notifyDataSetChanged();
    }
}


