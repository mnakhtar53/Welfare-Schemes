package com.mna.ministryaffairs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class WomenSafety extends AppCompatActivity {

    TextView womsafe_1, womsafe_2, womsafe_3, womsafe_4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.womensafety);

        womsafe_1= findViewById(R.id.womsafe_1);
        womsafe_2= findViewById(R.id.womsafe_2);
        womsafe_3= findViewById(R.id.womsafe_3);
        womsafe_4= findViewById(R.id.womsafe_4);

        womsafe_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mygov.in/group/beti-bachao-beti-padhao-0/"));
                startActivity(intent);
            }
        });

        womsafe_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("http://wcd.nic.in/schemes/one-stop-centre-scheme-1"));
                startActivity(intent);
            }
        });

        womsafe_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.wcd.nic.in/schemes/women-helpline-scheme-2"));
                startActivity(intent);
            }
        });

        womsafe_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("http://wcd.nic.in/schemes/swadhar-greh-scheme-women-difficult-circumstances"));
                startActivity(intent);
            }
        });
    }
}
