package com.mna.ministryaffairs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ChildCare extends AppCompatActivity {

    TextView childcare_1, childcare_2, childcare_3, childcare_4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.childcare);

        childcare_1= findViewById(R.id.childcare_1);
        childcare_2= findViewById(R.id.childcare_2);
        childcare_3= findViewById(R.id.childcare_3);
        childcare_4= findViewById(R.id.childcare_4);

        childcare_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.wcd.nic.in/sites/default/files/nationalguidelines.pdf"));
                startActivity(intent);
            }
        });

        childcare_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("http://wcd.nic.in/sites/default/files/nnp_0.pdf"));
                startActivity(intent);
            }
        });

        childcare_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pacsindia.org/projects/health-and-nutrition/icds-scheme"));
                startActivity(intent);
            }
        });

        childcare_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.india.gov.in/sukanya-samriddhi-yojna"));
                startActivity(intent);
            }
        });
    }
}
