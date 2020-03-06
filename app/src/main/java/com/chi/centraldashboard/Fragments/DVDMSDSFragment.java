package com.chi.centraldashboard.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.chi.centraldashboard.R;


public class DVDMSDSFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dvdmsd, container, false);
        WebView webView = (WebView) view.findViewById(R.id.webView_dvdms);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://cdashboard.dcservices.in/HISUtilities/dashboard/dashBoardACTION.cnt?groupId=MzM=&dashboardFor=Q0VOVFJBTCBEQVNIQk9BUkQ=&isGlobal=1&token=A1zY3doX2NoaTpjaCFAMTIzZ0a");
        return view;
    }


}
