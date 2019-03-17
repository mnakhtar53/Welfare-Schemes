package com.mna.ministryaffairs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Update_info extends AppCompatActivity {

    EditText et_id,et_name,et_mobile,et_email,et_region;
    Button btnUpdate;
    private DatabaseHelper databaseHelper;   // create object of DatabaseHelper

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_info);

        et_id = findViewById(R.id.et_id);
        et_name = findViewById(R.id.et_name);
        et_mobile = findViewById(R.id.et_mobile);
        et_email = findViewById(R.id.et_email);
        et_region = findViewById(R.id.et_region);
        btnUpdate = findViewById(R.id.btnUpdate);

        databaseHelper = new DatabaseHelper(this);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isUpdate = databaseHelper.updateData(et_id.getText().toString(),et_name.getText().toString(),
                                et_mobile.getText().toString(),et_email.getText().toString(),
                                et_region.getText().toString());
                        if(isUpdate == true) {
                            Toast.makeText(Update_info.this, "Data Update Successfully", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(Update_info.this, LanguageActivity.class);
                            startActivity(intent);
                        }
                        else
                            Toast.makeText(Update_info.this,"Data not Updated",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
