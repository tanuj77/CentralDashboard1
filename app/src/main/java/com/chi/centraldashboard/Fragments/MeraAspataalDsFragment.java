package com.chi.centraldashboard.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

import com.chi.centraldashboard.R;


public class MeraAspataalDsFragment extends Fragment {
  Button btnDetailedStatus;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vi = inflater.inflate(R.layout.fragment_mera_aspataal_ds, container, false);


        WebView webView = (WebView) vi.findViewById(R.id.webView_mera_aspataal);
        webView.loadUrl("https://admin-meraaspataal.nhp.gov.in/api/chiapilogin/5dfb07869e5ad");

        return vi;
    }

}
