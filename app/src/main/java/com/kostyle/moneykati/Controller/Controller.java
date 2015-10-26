package com.kostyle.moneykati.Controller;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.kostyle.moneykati.DB.DBContract;

/**
 * Created by Manu on 25/10/2015.
 */
public class Controller {

    private static final String COMMA = ", ";

    public enum CAT_TYPE {
        DEBIT, CREDIT
    }

    public enum ACC_STATUS{
        OPEN, CLOSED
    }

    public enum REP_TYPE{
        DAY, MONTH, YEAR, NONE
    }

    public enum DEBT_STATUS{
        OPEN, CLOSED
    }

    public enum MYBOOL{
        TRUE, FALSE
    }

    public static void insertAccount(AccBean acc, SQLiteDatabase db){

       /* String insert = "INSERT INTO " + DBContract.AccountEntry._TABLE_Account + " (" + DBContract.AccountEntry._COLUMN_ID + COMMA + DBContract.AccountEntry._COLUMN_InitialBalance + COMMA +
                DBContract.AccountEntry._COLUMN_NAME + COMMA + DBContract.AccountEntry._COLUMN_ID_Master + COMMA + DBContract.AccountEntry._COLUMN_Status +
                ") VALUES(" + acc.getId() + COMMA + acc.getIniBal() + ", '" + acc.getName() + "', " + acc.getIdMaster() + ", '" + acc.getStatus() +"')";

        System.out.println(insert);*/

        ContentValues values = new ContentValues();
        values.put(DBContract.AccountEntry._COLUMN_ID, acc.getId());
        values.put(DBContract.AccountEntry._COLUMN_NAME, acc.getName());
        values.put(DBContract.AccountEntry._COLUMN_InitialBalance, acc.getIniBal());
        values.put(DBContract.AccountEntry._COLUMN_ID_Master, acc.getIdMaster());
        values.put(DBContract.AccountEntry._COLUMN_Status, acc.getStatus().toString());
        values.put(DBContract.AccountEntry._COLUMN_CurrentBalance, acc.getBal());

        db.insert(DBContract.AccountEntry._TABLE_Account, null, values);
    }

    public static void insertJournalEntry(JouBean je, SQLiteDatabase db){
        ContentValues values = new ContentValues();
        values.put(DBContract.JournalEntry._COLUMN_ID, je.getId());
        values.put(DBContract.JournalEntry._COLUMN_ACC, je.getAccId());
        values.put(DBContract.JournalEntry._COLUMN_AMO, je.getAmount());
        values.put(DBContract.JournalEntry._COLUMN_CAT, je.getCatId());
        values.put(DBContract.JournalEntry._COLUMN_DCONT, je.getdContact());
        values.put(DBContract.JournalEntry._COLUMN_DEBT, je.getDebt().toString());
        values.put(DBContract.JournalEntry._COLUMN_DSTATUS, je.getdStatus().toString());
        values.put(DBContract.JournalEntry._COLUMN_OBS, je.getObs());
        values.put(DBContract.JournalEntry._COLUMN_REPSPAN, je.getRepspan());
        values.put(DBContract.JournalEntry._COLUMN_REPTYPE, je.getReptype().toString());
        values.put(DBContract.JournalEntry._COLUMN_TIME, je.getTs().toString());

        db.insert(DBContract.JournalEntry._TABLE_Journal, null, values);
    }

    public static void insertCategory(CatBean category, SQLiteDatabase db){
        ContentValues values = new ContentValues();
        values.put(DBContract.CategoryEntry._COLUMN_ID, category.getId());
        values.put(DBContract.CategoryEntry._COLUMN_Type, category.getType().toString());
        values.put(DBContract.CategoryEntry._COLUMN_Name, category.getName());
        values.put(DBContract.CategoryEntry._COLUMN_LINK, category.getLink());

        db.insert(DBContract.CategoryEntry._TABLE_Category, null, values);
    }
}
