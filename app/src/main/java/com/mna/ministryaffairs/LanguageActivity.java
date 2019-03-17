package com.mna.ministryaffairs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class LanguageActivity extends AppCompatActivity {

    Button la_ll_btn_eng,la_ll_btn_registration;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.languagelayout);

        la_ll_btn_eng = findViewById(R.id.la_ll_btn_eng);
        la_ll_btn_registration = findViewById(R.id.la_ll_btn_registration);

        la_ll_btn_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LanguageActivity.this, FrontLayout.class);
                startActivity(intent);
            }

        });

        la_ll_btn_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LanguageActivity.this, Registrationpage.class);
                startActivity(intent);
            }
        });

        }


}

