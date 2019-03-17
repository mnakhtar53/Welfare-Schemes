package com.mna.ministryaffairs;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    EditText am_ll_name, am_ll_mobile, am_ll_email, am_ll_region;
    Button am_ll_btn_enter;

    private DatabaseHelper databaseHelper;   // create object of DatabaseHelper

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        // Set icon with label name.    But it only works with one layout
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.logo);
        //actionBar.setDisplayUseLogoEnabled(true);

        databaseHelper = new DatabaseHelper(this);

        am_ll_name = findViewById(R.id.am_ll_name);
        am_ll_mobile = findViewById(R.id.am_ll_mobile);
        am_ll_email = findViewById(R.id.am_ll_email);
        am_ll_region = findViewById(R.id.am_ll_region);
        am_ll_btn_enter = findViewById(R.id.am_ll_btn_enter);


        am_ll_btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // for checking EditText is empty or not
                EditText usernameEditText = findViewById(R.id.am_ll_name);
                String sUsername = usernameEditText.getText().toString();

                EditText mobileEditText = findViewById(R.id.am_ll_mobile);
                String mobileNumber = mobileEditText.getText().toString();

                EditText emailEditText = findViewById(R.id.am_ll_email);
                String email = emailEditText.getText().toString();

                EditText regionEditText = findViewById(R.id.am_ll_region);
                String region = regionEditText.getText().toString();


                if (sUsername.matches("") || mobileNumber.matches("") || email.matches("") || region.matches("")) {
                    Toast.makeText(Registration.this, "Fill all details properly", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (databaseHelper.insertData(am_ll_name.getText().toString(), am_ll_mobile.getText().toString(), am_ll_email.getText().toString(), am_ll_region.getText().toString())) {
                    Toast.makeText(Registration.this, "Data Registered Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Registration.this, LanguageActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Registration.this, "Please Insert Data", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
