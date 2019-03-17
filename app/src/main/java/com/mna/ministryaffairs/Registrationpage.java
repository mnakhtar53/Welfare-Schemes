package com.mna.ministryaffairs;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrationpage extends AppCompatActivity {

    Button btnNewRegistration,btnViewInfo,btnUpdateInfo,btnDeleteReg,btnMainPage;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrationpage);

        btnNewRegistration = findViewById(R.id.btnNewRegistration);
        btnViewInfo = findViewById(R.id.btnViewInfo);
        btnUpdateInfo = findViewById(R.id.btnUpdateInfo);
        btnDeleteReg = findViewById(R.id.btnDeleteReg);
        btnMainPage = findViewById(R.id.btnMainPage);

        databaseHelper = new DatabaseHelper(this);

        btnNewRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registrationpage.this,Registration.class);
                startActivity(intent);
            }
        });

        btnViewInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = databaseHelper.getAllData();
                if(res.getCount() == 0) {
                    // show message
                    showMessage("Error","Nothing found");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Id :"+ res.getString(0)+"\n");
                    buffer.append("Name :"+ res.getString(1)+"\n");
                    buffer.append("Mobile Number :"+ res.getString(2)+"\n");
                    buffer.append("Email :"+ res.getString(3)+"\n");
                    buffer.append("Region :"+ res.getString(4)+"\n\n");
                }

                // Show all data
                showMessage("Data",buffer.toString());
            }

            public void showMessage(String title,String Message){
                AlertDialog.Builder builder = new AlertDialog.Builder(Registrationpage.this);
                builder.setCancelable(true);
                builder.setTitle(title);
                builder.setMessage(Message);
                builder.show();
            }
        }
        );

        btnUpdateInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registrationpage.this,Update_info.class);
                startActivity(intent);
            }
        });

        btnDeleteReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registrationpage.this,Delete_info.class);
                startActivity(intent);
            }
        });

        btnMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registrationpage.this,LanguageActivity.class);
                startActivity(intent);
            }
        });

    }
}

