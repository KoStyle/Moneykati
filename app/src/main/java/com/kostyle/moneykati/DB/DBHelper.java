package com.kostyle.moneykati.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Manu on 17/10/2015.
 */
public class DBHelper extends SQLiteOpenHelper{

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MoneyKati.db";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DBContract.SQL_CREATE_ACC);
        db.execSQL(DBContract.SQL_CREATE_CAT);
        db.execSQL(DBContract.SQL_CREATE_JOU);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DBContract.SQL_DELETE_ACC);
        db.execSQL(DBContract.SQL_DELETE_CAT);
        db.execSQL(DBContract.SQL_DELETE_JOU);

        onCreate(db);
    }
}
