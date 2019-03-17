package com.mna.ministryaffairs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Delete_info extends AppCompatActivity {

    EditText et_dltid;
    Button btnDelete;

    private DatabaseHelper databaseHelper;   // create object of DatabaseHelper

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_info);

        databaseHelper = new DatabaseHelper(this);

        et_dltid = findViewById(R.id.et_dltid);
        btnDelete = findViewById(R.id.btnDelete);

        btnDelete.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer deletedRows = databaseHelper.deleteData(et_dltid.getText().toString());
                        if(deletedRows > 0) {
                            Toast.makeText(Delete_info.this, "Data Deleted", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(Delete_info.this,Registrationpage.class);
                            startActivity(intent);
                        }
                        else
                            Toast.makeText(Delete_info.this,"ID Not Found",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
