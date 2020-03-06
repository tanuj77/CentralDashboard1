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
import android.webkit.WebViewClient;
import android.widget.Button;

import com.chi.centraldashboard.R;

public class EhospitalDsFragment extends Fragment {
Button btnDetailedStatus;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =inflater.inflate(R.layout.fragment_ehospital_ds, container, false);


        WebView webView = (WebView) view.findViewById(R.id.webView_ehospital);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://dashboard.ehospital.gov.in/dashboard-testing2");



        return view;
    }

}