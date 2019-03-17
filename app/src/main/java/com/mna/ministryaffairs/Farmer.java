package com.mna.ministryaffairs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Farmer extends AppCompatActivity {

    TextView farm_1, farm_2, farm_3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farmer);

        farm_1=findViewById(R.id.farm_1);
        farm_2=findViewById(R.id.farm_2);
        farm_3=findViewById(R.id.farm_3);

        farm_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.enam.gov.in/NAM/home/index.html"));
                startActivity(intent);
            }
        });

        farm_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://soilhealth.dac.gov.in/"));
                startActivity(intent);
            }
        });

        farm_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("http://agri-insurance.gov.in/pmfby.aspx"));
                startActivity(intent);
            }
        });
    }
}
