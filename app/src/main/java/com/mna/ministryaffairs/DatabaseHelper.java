package com.mna.ministryaffairs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "info.db";
    public static final String TABLE_NAME = "information";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "MOBILE_NUMBER";
    public static final String COL_4 = "EMAIL";
    public static final String COL_5 = "AREA";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {  //table creation and ist entities
        db.execSQL("CREATE TABLE "+TABLE_NAME+ "(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TETX,MOBILE_NUMBER TEXT,EMAIL TEXT,AREA TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);      // for table upgradation  (for remove table)
        onCreate(db);       // Again create table

    }

    //insert method defining
    public boolean insertData(String name, String mobileNumber, String email, String area){   //parameters of edittext present in AddNewContact

        SQLiteDatabase db = this.getWritableDatabase();  // create database instance

        ContentValues ContentValue = new ContentValues();
        ContentValue.put("NAME",name);  //ContentValue.put("Table name", String passing);
        ContentValue.put("MOBILE_NUMBER",mobileNumber);
        ContentValue.put("EMAIL",email);
        ContentValue.put("AREA",area);

        /*long result = */db.insert("information",null, ContentValue);  //insert opration
        /*if (result == 1 )
            return false;
        else*/
            return true;
    }   // insert method end

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

    public boolean updateData(String id, String name, String mobileNumber, String email, String area) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,mobileNumber);
        contentValues.put(COL_4,email);
        contentValues.put(COL_5,area);
        db.update(TABLE_NAME, contentValues, "ID = ?",new String[] { id });
        return true;
    }

    public Integer deleteData (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?",new String[] {id});
    }


   }
