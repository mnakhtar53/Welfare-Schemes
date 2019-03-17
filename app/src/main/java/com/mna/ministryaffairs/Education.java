package com.mna.ministryaffairs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Education extends AppCompatActivity {

    TextView edu_1, edu_2, edu_3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.education);

        edu_1= findViewById(R.id.edu_1);
        edu_2= findViewById(R.id.edu_2);
        edu_3= findViewById(R.id.edu_3);

        edu_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://tribal.nic.in/writereaddata/Schemes/VTCGuidelines.pdf"));
                startActivity(intent);
            }
        });

        edu_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://tribal.nic.in/writereaddata/Schemes/AshramSchoolGuideline.pdf"));
                startActivity(intent);
            }
        });

        edu_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://tribal.nic.in/writereaddata/Schemes/CentralySponsorednew.pdf"));
                startActivity(intent);
            }
        });
    }
}
