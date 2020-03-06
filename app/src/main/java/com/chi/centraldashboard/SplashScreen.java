package com.chi.centraldashboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.ImageView;

import pl.droidsonroids.gif.GifImageView;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        GifImageView gifImageView=(GifImageView) findViewById(R.id.gifimageview);

    }
}
