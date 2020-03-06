package com.chi.centraldashboard;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.uncopt.android.widget.text.justify.JustifiedTextView;


public class AboutUsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.setTitle("Central Dashboard");

        setSupportActionBar(toolbar);

        LinearLayout layout = (LinearLayout) findViewById(R.id.borderEffect); // id fetch from xml
        ShapeDrawable rectShapeDrawable = new ShapeDrawable(); // pre defined class

// get paint
        Paint paint = rectShapeDrawable.getPaint();

// set border color, stroke and stroke width

        paint.setColor(Color.GRAY);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5); // you can change the value of 5
        layout.setBackgroundDrawable(rectShapeDrawable);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        JustifiedTextView myMsg1 = (JustifiedTextView)findViewById(R.id.t1);
        myMsg1.setText("The Central Dashboard is a comprehensive information management tool which allows visual tracking and analysis of Key Performance Indicators. It can be leveraged in powerful ways:");

        JustifiedTextView myMsg2 = (JustifiedTextView)findViewById(R.id.t2);
        myMsg2.setText("To access information on Key Performance Indicators (KPIs) of all MoHFW programmes on a single portal");

        JustifiedTextView myMsg3 = (JustifiedTextView)findViewById(R.id.t3);
        myMsg3.setText("To present visualizations that display a bird’s eye view of programme performance,for data driven decision-making");

        JustifiedTextView myMsg4 = (JustifiedTextView)findViewById(R.id.t4);
        myMsg4.setText("To evaluate national status of all health-system components");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}
