package com.chi.centraldashboard.Minister;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.chi.centraldashboard.AboutUsActivity;
import com.chi.centraldashboard.Minister.DrugsAndDiagnostics.AmritActivity;
import com.chi.centraldashboard.Minister.DrugsAndDiagnostics.DVDMSActivity;
import com.chi.centraldashboard.Minister.DrugsAndDiagnostics.FreeDSIActivity;
import com.chi.centraldashboard.Minister.DrugsAndDiagnostics.HPEActiviy;
import com.chi.centraldashboard.Minister.HealthCareInfrastructure.AmbulanceActivity;
import com.chi.centraldashboard.Minister.HealthCareInfrastructure.BloodBankActivity;
import com.chi.centraldashboard.Minister.HealthCareInfrastructure.DialysisActivity;
import com.chi.centraldashboard.Minister.HealthCareInfrastructure.FRUActivity;
import com.chi.centraldashboard.Minister.HealthCareInfrastructure.NHRRDataActivity;
import com.chi.centraldashboard.Minister.HealthCareInfrastructure.NOTPActivity;
import com.chi.centraldashboard.Minister.HealthCareInfrastructure.PMSSYDataActivity;
import com.chi.centraldashboard.Minister.HealthServiceDelivery.CGHSActivity;
import com.chi.centraldashboard.Minister.HealthServiceDelivery.ChildHealthActivity;
import com.chi.centraldashboard.Minister.HealthServiceDelivery.EMRActivity;
import com.chi.centraldashboard.Minister.HealthServiceDelivery.ElderlyActivity;
import com.chi.centraldashboard.Minister.HealthServiceDelivery.FamilyPlaningActivity;
import com.chi.centraldashboard.Minister.HealthServiceDelivery.ImmunizationActivity;
import com.chi.centraldashboard.Minister.HealthServiceDelivery.MaternalHealthActivity;
import com.chi.centraldashboard.Minister.HealthServiceDelivery.MhealthActivity;
import com.chi.centraldashboard.Minister.HealthServiceDelivery.PMJAYActivity;
import com.chi.centraldashboard.Minister.HealthServiceDelivery.RCHActivity;
import com.chi.centraldashboard.Minister.HumanResouces.CommunityProcessActivity;
import com.chi.centraldashboard.Minister.HumanResouces.HRActivity;
import com.chi.centraldashboard.Minister.HumanResouces.NursingActivity;
import com.chi.centraldashboard.Minister.InternationalHealth.InternationalHealthActivity;
import com.chi.centraldashboard.Minister.PendingReferences.ATRActivity;
import com.chi.centraldashboard.Minister.QualityOfHealthServices.CEAActivity;
import com.chi.centraldashboard.Minister.QualityOfHealthServices.EHospitalActivity;
import com.chi.centraldashboard.Minister.QualityOfHealthServices.FSSAIActivity;
import com.chi.centraldashboard.Minister.QualityOfHealthServices.MeraAspataalActivity;
import com.chi.centraldashboard.Minister.QualityOfHealthServices.OrsActivity;
import com.chi.centraldashboard.Minister.QualityOfHealthServices.QualityAssuranceActivity;
import com.chi.centraldashboard.Minister.Regulations.SugamActivity;
import com.chi.centraldashboard.Minister.Survillance.AMRContainmentActivity;
import com.chi.centraldashboard.Minister.Survillance.DDAPActivity;
import com.chi.centraldashboard.Minister.Survillance.HMISActivity;
import com.chi.centraldashboard.Minister.Survillance.IhipActivity;
import com.chi.centraldashboard.Minister.Survillance.LeptospirosisActivity;
import com.chi.centraldashboard.Minister.Survillance.NACOActivity;
import com.chi.centraldashboard.Minister.Survillance.NCDCActivity;
import com.chi.centraldashboard.Minister.Survillance.NFHS_SRSActivity;
import com.chi.centraldashboard.Minister.Survillance.NLEPActivity;
import com.chi.centraldashboard.Minister.Survillance.NPCDCSActivity;
import com.chi.centraldashboard.Minister.Survillance.NPPCDActivity;
import com.chi.centraldashboard.Minister.Survillance.NPPCFActivity;
import com.chi.centraldashboard.Minister.Survillance.NTCPActivity;
import com.chi.centraldashboard.Minister.Survillance.NVBDCPActivity;
import com.chi.centraldashboard.Minister.Survillance.PCZDActivity;
import com.chi.centraldashboard.Minister.Survillance.PbsActivity;
import com.chi.centraldashboard.Minister.Survillance.VHPActivity;
import com.chi.centraldashboard.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinisterMainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView textView;

    LinearLayout llPink;
    ExpandableListView elvHealthCare;
    ExpandableListAdapter listAdapterHC;

    List<String> listHeader;
    HashMap<String, List<String>> hashmap;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minister_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setPadding(40, 0, 0, 0);
        toolbar.setTitle("Central Dashboard");
        setSupportActionBar(toolbar);

        elvHealthCare = (ExpandableListView) findViewById(R.id.elv_pink);

        listHeader = new ArrayList<String>();
        hashmap = new HashMap<String, List<String>>();


        // Adding child data
        listHeader.add("Healthcare Infrastructure");
        listHeader.add("Health Human Resources");
        listHeader.add("Health Service Delivery");
        listHeader.add("Survelliance");
        listHeader.add("Quality of Health service");
        listHeader.add("Drugs & Diagnostics");
        listHeader.add("Regulations");
        listHeader.add("International Health");
        listHeader.add("Pending References");


        // Adding child data
        List<String> arrayListHealthCare = new ArrayList<String>();
        arrayListHealthCare.add("Pradhan Mantri Swasthya Suraksha Yojana(PMSSY)");
        arrayListHealthCare.add("National Health Resource Repository");
        arrayListHealthCare.add("Budget");
        arrayListHealthCare.add("National Identification Number(NIN)");
        arrayListHealthCare.add("Ambulances");/////
        arrayListHealthCare.add("Organ And Tissues Transplant(NOTP)");
        arrayListHealthCare.add("Blood Bank");
        arrayListHealthCare.add("NHM Finance");
        arrayListHealthCare.add("First Referral Units(FRU)");
        arrayListHealthCare.add("Dialysis");
        arrayListHealthCare.add("Hospital Section");

        List<String> arrayListHHR = new ArrayList<>();
        arrayListHHR.add("Community Processes");
        arrayListHHR.add("Human Resources");
        arrayListHHR.add("Allied Health Sciences(AHS)");
        arrayListHHR.add("Nursing");
        arrayListHHR.add("Medical Education");


        List<String> arrayListHealthService = new ArrayList<String>();
        arrayListHealthService.add("Ayushman Bharat - Health & Wellness Center(AB-HWC)");
        arrayListHealthService.add("Ayushman Bharat - Pradhan Mantri Jan Arogaya Yojana(AB-PMJAY)");
        arrayListHealthService.add("Central Goverment Health Scheme(CGHS)");
        arrayListHealthService.add("eSanjeevani");
        arrayListHealthService.add("Nationla Programme for Health Care of the Elderly");
        arrayListHealthService.add("TB Control");
        arrayListHealthService.add("M-Health");
        arrayListHealthService.add("Reproductive And Child Health(RCH)");
        arrayListHealthService.add("Family Planning");
        arrayListHealthService.add("Maternal Health");
        arrayListHealthService.add("Immunization");
        arrayListHealthService.add("Child Health");
        arrayListHealthService.add("Adolescent Health");
        arrayListHealthService.add("Viral Hepatitis Control(NVHCP)");
        arrayListHealthService.add("Blindness Control(NPCB)");
        arrayListHealthService.add("National Mental Health Programme(NMHP)");
        arrayListHealthService.add("National Oral Health(NOHP)");
        arrayListHealthService.add("Emergency Medical Relief(EMR)");

        List<String> arrayListSurvillance = new ArrayList<String>();
        arrayListSurvillance.add("Integrated Health Information Platform(IHIP)");
        arrayListSurvillance.add("Health Management Information System(HMIS)");
        arrayListSurvillance.add("National Center For Disease Control(NCDC)");
        arrayListSurvillance.add("National Tobacoo Control Programme (NTCP)");
        arrayListSurvillance.add("Drug De-Addiction(DDAP)");
        arrayListSurvillance.add("AIDS Control(NACO)");
        arrayListSurvillance.add("Rabies Control(NRCP)");
        arrayListSurvillance.add("Leptospirosis Control");
        arrayListSurvillance.add("Viral Hepatitis(VHP)");
        arrayListSurvillance.add("Leprosy Eradication(NLEP)");
        arrayListSurvillance.add("Flurosis Control(NPCCF)");
        arrayListSurvillance.add("Deafness Control(NPPCD)");
        arrayListSurvillance.add("Population-Based Screening(PBS)/NCD");
        arrayListSurvillance.add("Zoonotic Disease(PCZD)");
        arrayListSurvillance.add("NPCDCS");
        arrayListSurvillance.add("AMR Containment");
        arrayListSurvillance.add("National Vector Borne Disease Control Programme(NVBDCP)");
        arrayListSurvillance.add("Stastics Division(NFHS & SRS)");


        List<String> arrayListQuality = new ArrayList<String>();
        arrayListQuality.add("Mera Aspataal");
        arrayListQuality.add("Online Registration System(ORS)");
        arrayListQuality.add("E-Hospital");
        arrayListQuality.add("LaQshya");
        arrayListQuality.add("National Urban Health Mission(NUHM)");
        arrayListQuality.add("Right To Information");
        arrayListQuality.add("Quality Assurance");
        arrayListQuality.add("Food Saftey And Standards Authority Of India(FSSAI)");
        arrayListQuality.add("Clinical Establishments Act(CEA)");

        List<String> arrayListDrugs = new ArrayList<String>();
        arrayListDrugs.add("Drug And Vaccine Distribution Management System(DVDMS)");
        arrayListDrugs.add("Free Diagnostics Services Initiative");
        arrayListDrugs.add("Affordable Medicines (AMRIT)");
        arrayListDrugs.add("Health Public Enterprises");

        List<String> arrayListRegulations = new ArrayList<String>();
        arrayListRegulations.add("SUGAM(CDSCO)");

        List<String> arrayListInternationalHealth = new ArrayList<String>();
        arrayListInternationalHealth.add("MOU and SON");

        List<String> arrayListATR = new ArrayList<String>();
        arrayListATR.add("ATR");


        hashmap.put(listHeader.get(0), arrayListHealthCare);// Header, Child data
        hashmap.put(listHeader.get(1), arrayListHHR);
        hashmap.put(listHeader.get(2), arrayListHealthService);// Header, Child data
        hashmap.put(listHeader.get(3), arrayListSurvillance);// Header, Child data
        hashmap.put(listHeader.get(4), arrayListQuality);// Header, Child data
        hashmap.put(listHeader.get(5), arrayListDrugs);// Header, Child data
        hashmap.put(listHeader.get(6), arrayListRegulations);// Header, Child data
        hashmap.put(listHeader.get(7), arrayListInternationalHealth);// Header, Child data
        hashmap.put(listHeader.get(8), arrayListATR);// Header, Child data

        listAdapterHC = new ExpandableListAdapter(this, listHeader, hashmap, "hc");

        elvHealthCare.setDividerHeight(20);
        // setting list adapter
        elvHealthCare.setAdapter(listAdapterHC);

        // Listview Group click listener
        elvHealthCare.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        elvHealthCare.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listHeader.get(groupPosition) + " Expanded",
//                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        elvHealthCare.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listHeader.get(groupPosition) + " Collapsed",
//                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        elvHealthCare.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
//                Toast.makeText(
//                        getApplicationContext(),
//                        listHeader.get(groupPosition)
//                                + " : "
//                                + hashmap.get(
//                                listHeader.get(groupPosition)).get(
//                                childPosition), Toast.LENGTH_SHORT)
//                        .show();
                String program = hashmap.get(
                        listHeader.get(groupPosition)).get(
                        childPosition);


                switch (program) {

                    case "Pradhan Mantri Swasthya Suraksha Yojana(PMSSY)":
                        Intent intent1 = new Intent(MinisterMainActivity.this, PMSSYDataActivity.class);
                        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent1);
                        break;
                    case "National Health Resource Repository":
                        Intent intent2 = new Intent(MinisterMainActivity.this, NHRRDataActivity.class);
                        intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent2);
                        break;

                    case "Budget":
//                        Intent intent54 = new Intent(MinisterMainActivity.this, NHRRDataActivity.class);
//                        intent54.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent54);
                        break;

                    case "National Identification Number(NIN)":
//                        Intent intent55 = new Intent(MinisterMainActivity.this, NHRRDataActivity.class);
//                        intent55.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent55);
                        break;

                    case "Ambulances":
                        Intent intent56 = new Intent(MinisterMainActivity.this, AmbulanceActivity.class);
                        intent56.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent56);
                        break;
                    case "Organ And Tissues Transplant(NOTP)":
                        Intent intent57 = new Intent(MinisterMainActivity.this, NOTPActivity.class);
                        intent57.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent57);
                        break;

                    case "Blood Bank":
                        Intent intent58 = new Intent(MinisterMainActivity.this, BloodBankActivity.class);
                        intent58.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent58);
                        break;

                    case "NHM Finance":
//                        Intent intent59 = new Intent(MinisterMainActivity.this, NHM.class);
//                        intent59.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent59);
                        break;
                    case "First Referral Units(FRU)":
                        Intent intent60 = new Intent(MinisterMainActivity.this, FRUActivity.class);
                        intent60.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent60);
                        break;

                    case "Dialysis":
                        Intent intent61 = new Intent(MinisterMainActivity.this, DialysisActivity.class);
                        intent61.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent61);
                        break;

                    case "Hospital Section":
//                        Intent intent62 = new Intent(MinisterMainActivity.this, Hosp.class);
//                        intent62.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent62);
                        break;


                    case "Community Processes":
                        Intent incp = new Intent(MinisterMainActivity.this, CommunityProcessActivity.class);
                        incp.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(incp);
                        break;

                    case "Human Resources":
                        Intent in1 = new Intent(MinisterMainActivity.this, HRActivity.class);
                        in1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(in1);
                        break;

                    case "Nursing":
                        Intent in2 = new Intent(MinisterMainActivity.this, NursingActivity.class);
                        in2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(in2);
                        break;

                    case "Ayushman Bharat - Pradhan Mantri Jan Arogaya Yojana(AB-PMJAY)":
                        Intent intent3 = new Intent(MinisterMainActivity.this, PMJAYActivity.class);
                        intent3.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent3);
                        break;

                    case "Central Goverment Health Scheme(CGHS)":
                        Intent intent4 = new Intent(MinisterMainActivity.this, CGHSActivity.class);
                        intent4.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent4);
                        break;

                    case "eSanjeevani":
//                        Intent intent41 = new Intent(MinisterMainActivity.this, eSa.class);
//                        intent41.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent41);
                        break;
                    case "Nationla Programme for Health Care of the Elderly":
                        Intent intent42 = new Intent(MinisterMainActivity.this, ElderlyActivity.class);
                        intent42.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent42);
                        break;

                    case "TB Control":
//                        Intent intent43 = new Intent(MinisterMainActivity.this, ElderlyActivity.class);
//                        intent43.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent43);
                        break;

                    case "M-Health":
                        Intent intent5 = new Intent(MinisterMainActivity.this, MhealthActivity.class);
                        intent5.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent5);
                        break;

                    case "Reproductive And Child Health(RCH)":
                        Intent intent6 = new Intent(MinisterMainActivity.this, RCHActivity.class);
                        intent6.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent6);
                        break;

                    case "Family Planning":
                        Intent intent44 = new Intent(MinisterMainActivity.this, FamilyPlaningActivity.class);
                        intent44.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent44);
                        break;

                    case "Maternal Health":
                        Intent intent45 = new Intent(MinisterMainActivity.this, MaternalHealthActivity.class);
                        intent45.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent45);
                        break;

                    case "Immunization":
                        Intent intent46 = new Intent(MinisterMainActivity.this, ImmunizationActivity.class);
                        intent46.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent46);
                        break;

                    case "Child Health":
                        Intent intent47 = new Intent(MinisterMainActivity.this, ChildHealthActivity.class);
                        intent47.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent47);
                        break;

                    case "Adolescent Health":
//                        Intent intent48 = new Intent(MinisterMainActivity.this, Ad.class);
//                        intent48.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent48);
                        break;

                    case "Viral Hepatitis Control(NVHCP)":
//                        Intent intent49 = new Intent(MinisterMainActivity.this, RCHActivity.class);
//                        intent49.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent49);
                        break;

                    case "Blindness Control(NPCB)":
//                        Intent intent50 = new Intent(MinisterMainActivity.this, RCHActivity.class);
//                        intent50.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent50);
                        break;

                    case "National Mental Health Programme(NMHP)":
//                        Intent intent51 = new Intent(MinisterMainActivity.this, RCHActivity.class);
//                        intent51.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent51);
                        break;

                    case "National Oral Health(NOHP)":
//                        Intent intent52 = new Intent(MinisterMainActivity.this, RCHActivity.class);
//                        intent52.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent52);
                        break;

                    case "Emergency Medical Relief(EMR)":
                        Intent intent53 = new Intent(MinisterMainActivity.this, EMRActivity.class);
                        intent53.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent53);
                        break;


                    case "Integrated Health Information Platform(IHIP)":
                        Intent intent8 = new Intent(MinisterMainActivity.this, IhipActivity.class);
                        intent8.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent8);
                        break;


                    case "Health Management Information System(HMIS)":
                        Intent intent25 = new Intent(MinisterMainActivity.this, HMISActivity.class);
                        intent25.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent25);
                        break;
                    case "National Center For Disease Control(NCDC)":
                        Intent intent26 = new Intent(MinisterMainActivity.this, NCDCActivity.class);
                        intent26.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent26);
                        break;

                    case "National Tobacoo Control Programme (NTCP)":
                        Intent intent27 = new Intent(MinisterMainActivity.this, NTCPActivity.class);
                        intent27.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent27);
                        break;

                    case "Drug De-Addiction(DDAP)":
                        Intent intent28 = new Intent(MinisterMainActivity.this, DDAPActivity.class);
                        intent28.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent28);
                        break;

                    case "AIDS Control(NACO)":
                        Intent intent29 = new Intent(MinisterMainActivity.this, NACOActivity.class);
                        intent29.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent29);
                        break;

                    case "Rabies Control(NRCP)":
//                        Intent intent30 = new Intent(MinisterMainActivity.this, IhipActivity.class);
//                        intent30.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent30);
                        break;

                    case "Leptospirosis Control":
                        Intent intent31 = new Intent(MinisterMainActivity.this, LeptospirosisActivity.class);
                        intent31.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent31);
                        break;

                    case "Viral Hepatitis(VHP)":
                        Intent intent32 = new Intent(MinisterMainActivity.this, VHPActivity.class);
                        intent32.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent32);
                        break;

                    case "Leprosy Eradication(NLEP)":
                        Intent intent33 = new Intent(MinisterMainActivity.this, NLEPActivity.class);
                        intent33.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent33);
                        break;

                    case "Flurosis Control(NPCCF)":
                        Intent intent34 = new Intent(MinisterMainActivity.this, NPPCFActivity.class);
                        intent34.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent34);
                        break;

                    case "Deafness Control(NPPCD)":
                        Intent intent35 = new Intent(MinisterMainActivity.this, NPPCDActivity.class);
                        intent35.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent35);
                        break;


                    case "Population-Based Screening(PBS)/NCD":
                        Intent intent9 = new Intent(MinisterMainActivity.this, PbsActivity.class);
                        intent9.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent9);
                        break;

                    case "Zoonotic Disease(PCZD)":
                        Intent intent36 = new Intent(MinisterMainActivity.this, PCZDActivity.class);
                        intent36.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent36);
                        break;

                    case "NPCDCS":
                        Intent intent37 = new Intent(MinisterMainActivity.this, NPCDCSActivity.class);
                        intent37.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent37);
                        break;

                    case "AMR Containment":
                        Intent intent38 = new Intent(MinisterMainActivity.this, AMRContainmentActivity.class);
                        intent38.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent38);
                        break;

                    case "National Vector Borne Disease Control Programme(NVBDCP)":
                        Intent intent39 = new Intent(MinisterMainActivity.this, NVBDCPActivity.class);
                        intent39.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent39);
                        break;

                    case "Stastics Division(NFHS & SRS)":
                        Intent intent40 = new Intent(MinisterMainActivity.this, NFHS_SRSActivity.class);
                        intent40.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent40);
                        break;


                    case "Mera Aspataal":
                        Intent intent10 = new Intent(MinisterMainActivity.this, MeraAspataalActivity.class);
                        intent10.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent10);
                        break;

                    case "Online Registration System(ORS)":
                        Intent intent11 = new Intent(MinisterMainActivity.this, OrsActivity.class);
                        intent11.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent11);
                        break;


                    case "E-Hospital":
                        Intent intent12 = new Intent(MinisterMainActivity.this, EHospitalActivity.class);
                        intent12.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent12);
                        break;

                    case "LaQshya":
//                        Intent intent19 = new Intent(MinisterMainActivity.this, EHospitalActivity.class);
//                        intent19.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent19);
                        break;

                    case "National Urban Health Mission(NUHM)":
//                        Intent intent20 = new Intent(MinisterMainActivity.this, EHospitalActivity.class);
//                        intent20.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent20);
                        break;

                    case "Right To Information":
//                        Intent intent21 = new Intent(MinisterMainActivity.this, EHospitalActivity.class);
//                        intent21.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent21);
                        break;

                    case "Quality Assurance":
                        Intent intent22 = new Intent(MinisterMainActivity.this, QualityAssuranceActivity.class);
                        intent22.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent22);
                        break;

                    case "Food Saftey And Standards Authority Of India(FSSAI)":
                        Intent intent23 = new Intent(MinisterMainActivity.this, FSSAIActivity.class);
                        intent23.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent23);
                        break;

                    case "Clinical Establishments Act(CEA)":
                        Intent intent24 = new Intent(MinisterMainActivity.this, CEAActivity.class);
                        intent24.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent24);
                        break;


                    case "Drug And Vaccine Distribution Management System(DVDMS)":
                        Intent intent13 = new Intent(MinisterMainActivity.this, DVDMSActivity.class);
                        intent13.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent13);
                        break;

                    case "Free Diagnostics Services Initiative":
                        Intent intent16 = new Intent(MinisterMainActivity.this, FreeDSIActivity.class);
                        intent16.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent16);
                        break;

                    case "Affordable Medicines (AMRIT)":
                        Intent intent17 = new Intent(MinisterMainActivity.this, AmritActivity.class);
                        intent17.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent17);
                        break;

                    case "Health Public Enterprises":
                        Intent intent18 = new Intent(MinisterMainActivity.this, HPEActiviy.class);
                        intent18.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent18);
                        break;

                    case "SUGAM(CDSCO)":
                        Intent intent14 = new Intent(MinisterMainActivity.this, SugamActivity.class);
                        intent14.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent14);
                        break;


                    case "MOU and SON":
                        Intent intent15 = new Intent(MinisterMainActivity.this, InternationalHealthActivity.class);
                        intent15.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent15);
                        break;


                    case "ATR":

                        Intent intent = new Intent(MinisterMainActivity.this, ATRActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        break;


                }

                return false;
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.minister_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(MinisterMainActivity.this, AboutUsActivity.class);
            startActivity(intent);
        } else if (id == R.id.action_logout) {

        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onBackPressed() {
        finish();

    }

    @Override
    public void onResume() {
        super.onResume();

    }


}
