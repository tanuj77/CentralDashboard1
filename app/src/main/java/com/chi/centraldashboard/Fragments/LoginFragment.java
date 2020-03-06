package com.chi.centraldashboard.Fragments;


import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.chi.centraldashboard.Minister.MinisterMainActivity;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.Login;
import com.chi.centraldashboard.others.ConnectionDetector;
import com.chi.centraldashboard.others.UserProfile;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.Context.MODE_PRIVATE;


public class LoginFragment extends Fragment {
    EditText mUserName, mPassword;
    Button mButtonLogin;
    String strUserId, strUserName, strUserEmailId, strUserStateId, strUserState, strUserDistrictId, strUserDistrict, strUserRole, strUserRoleValue;
    String strPassword;
    int intStatus;
    private final int ASK_REQUEST_CODE = 100;
    ConnectionDetector cd;

    Gson gson;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        mUserName = (EditText) view.findViewById(R.id.et_username);
        mPassword = (EditText) view.findViewById(R.id.et_password);
        mButtonLogin = (Button) view.findViewById(R.id.btn_login);

        cd = new ConnectionDetector(getActivity());
        sharedPreferences = getActivity().getSharedPreferences(getString(R.string.preference_key_file), MODE_PRIVATE);
        editor = sharedPreferences.edit();
        gson = new Gson();
        // Check if Internet present
        if (!cd.isConnectingToInternet()) {
            // Internet Connection is not present
            AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();

            // Setting Dialog Title
            alertDialog.setTitle("Internet Connection Error");

            // Setting Dialog Message
            alertDialog.setMessage("Please connect to working Internet connection");
            // Setting alert dialog icon
            // Setting OK Button
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    getActivity().finish();
                }
            });
            // Showing Alert Message
            alertDialog.show();

            //return;
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&
                getActivity().checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, ASK_REQUEST_CODE);

        }

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strUserName = mUserName.getText().toString();
                strPassword = mPassword.getText().toString();
                if (strUserName.equals("") || strUserName.equalsIgnoreCase("")) {
                    Toast.makeText(getActivity(), "User Name can not be blank", Toast.LENGTH_SHORT).show();
                } else if (strPassword.equals("") || strPassword.equalsIgnoreCase("")) {
                    Toast.makeText(getActivity(), "Password can not be blank", Toast.LENGTH_SHORT).show();
                } else {
                    cd = new ConnectionDetector(getActivity());

                    // Check if Internet present
                    if (!cd.isConnectingToInternet()) {
                        // Internet Connection is not present
                        AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();

                        // Setting Dialog Title
                        alertDialog.setTitle("Internet Connection Error");

                        // Setting Dialog Message
                        alertDialog.setMessage("Please connect to working Internet connection");
                        // Setting alert dialog icon
                        // Setting OK Button
                        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                getActivity().finish();
                            }
                        });
                        // Showing Alert Message
                        alertDialog.show();

                        return;
                    } else {
                        // mlogin();
                        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
                        Call<Login> loginCall = apiInterface.logIn(strUserName.trim(), strPassword.trim()); //new Login("9999999999","demo")
                        loginCall.enqueue(new Callback<Login>() {
                            @Override
                            public void onResponse(Call<Login> call, Response<Login> response) {

                                //   Log.d("Data", "responce = " + response.body().getData().getUSERNAME());
                                Toast.makeText(getActivity(), "" + response.body().getData().getUSERNAME(), Toast.LENGTH_LONG).show();

                                intStatus = response.body().getStatus();
                                if (intStatus == 1) {
                                    UserProfile userProfile = UserProfile.getUser();
                                    userProfile.setName(response.body().getData().getUSERNAME());
                                    userProfile.setEmail(response.body().getData().getEMAILID());

                                    strUserId = response.body().getData().getID().toString();
                                    strUserName = response.body().getData().getUSERNAME();
                                    strUserEmailId = response.body().getData().getEMAILID();
                                    strUserStateId = response.body().getData().getsTATEID();
                                    strUserState = response.body().getData().getsTATENAME();
                                    strUserDistrictId = response.body().getData().getdISTRICTID();
                                    strUserDistrict = response.body().getData().getdISTRICTNAME();
                                    strUserRole = response.body().getData().getrOLE().toString();
                                    strUserRoleValue = response.body().getData().getrOLEVALUE();

                                    editor.putString(getString(R.string.preference_id), strUserId);
                                    editor.putString(getString(R.string.preference_name_key), strUserName);
                                    editor.putString(getString(R.string.preference_email_key), strUserEmailId);
                                    editor.putString(getString(R.string.preference_stateid_key), strUserStateId);
                                    editor.putString(getString(R.string.preference_statename_key), strUserState);
                                    editor.putString(getString(R.string.preference_districtid_key), strUserDistrictId);
                                    editor.putString(getString(R.string.preference_districtname_key), strUserDistrict);
                                    editor.putString(getString(R.string.preference_role_key), strUserRole);
                                    editor.putString(getString(R.string.preference_rolevalue_key), strUserRoleValue);
                                    editor.commit();

                                    Intent intent = new Intent(getActivity(), MinisterMainActivity.class);
                                    //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    startActivity(intent);
                                    getActivity().finish();

                                    //district();
                                } else {
                                    Toast.makeText(getActivity(), "Enter Valid Email Or Password", Toast.LENGTH_LONG).show();
                                }
                            }

                            @Override
                            public void onFailure(Call<Login> call, Throwable t) {
                                Log.d("Data", "responce" + t);
                            }
                        });
                    }
                }
            }
        });


        return view;
    }

}