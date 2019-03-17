package com.mna.ministryaffairs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FrontLayout extends AppCompatActivity {

    Button frontlayout_btn_edu, frontlayout_btn_far, frontlayout_btn_child, frontlayout_btn_ws;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontlayout);

        frontlayout_btn_edu= findViewById(R.id.frontlayout_btn_edu);
        frontlayout_btn_far= findViewById(R.id.frontlayout_btn_far);
        frontlayout_btn_child= findViewById(R.id.frontlayout_btn_child);
        frontlayout_btn_ws= findViewById(R.id.frontlayout_btn_ws);

        frontlayout_btn_edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrontLayout.this, Education.class);
                startActivity(intent);
            }
        });

        frontlayout_btn_far.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrontLayout.this, Farmer.class);
                startActivity(intent);
            }
        });

        frontlayout_btn_child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrontLayout.this, ChildCare.class);
                startActivity(intent);
            }
        });

        frontlayout_btn_ws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrontLayout.this, WomenSafety.class);
                startActivity(intent);
            }
        });
    }
}
