package com.kostyle.moneykati.DB;

import android.provider.BaseColumns;

//public final static String _COLUMN_ ="";

/**
 * Created by Manuel Konomi on 17/10/2015 Madrid.
 */
public class DBContract {

    public DBContract() {
    }

    public static abstract class AccountEntry implements BaseColumns {
        public final static String _TABLE_Account = "account";
        public final static String _COLUMN_ID = "id";
        public final static String _COLUMN_NAME = "name";
        public final static String _COLUMN_ID_Master = "id_master";
        public final static String _COLUMN_CurrentBalance = "cur_balance";
        public final static String _COLUMN_InitialBalance = "ini_balance";
        public final static String _COLUMN_Status = "status";
    }

    public static abstract class CategoryEntry implements BaseColumns {
        public final static String _TABLE_Category = "category";
        public final static String _COLUMN_ID = "id";
        public final static String _COLUMN_LINK = "cat_link";
        public final static String _COLUMN_Name = "name";
        public final static String _COLUMN_Type = "cat_type";
    }

    public static abstract class JournalEntry implements BaseColumns {
        public final static String _TABLE_Journal = "journal";
        public final static String _COLUMN_ID = "id";
        public final static String _COLUMN_TIME = "timestamp";
        public final static String _COLUMN_ACC = "id_acc";
        public final static String _COLUMN_CAT = "id_cat";
        public final static String _COLUMN_AMO = "amount";
        public final static String _COLUMN_OBS = "observations";
        public final static String _COLUMN_REPTYPE = "rep_type";
        public final static String _COLUMN_REPSPAN = "rep_span";
        public final static String _COLUMN_DEBT = "debt_type";
        public final static String _COLUMN_DCONT = "debt_cntc";
        public final static String _COLUMN_DSTATUS = "debt_status";
    }

    private static final String COMMA = ",";
    private static final String TEXT = " TEXT";
    private static final String DOUBLE = " INTEGER";

    public static final String SQL_CREATE_ACC = "CREATE TABLE " + AccountEntry._TABLE_Account + " (" +
            AccountEntry._ID + DOUBLE + " PRIMARY KEY," +
            AccountEntry._COLUMN_ID + DOUBLE + COMMA +
            AccountEntry._COLUMN_NAME + TEXT + COMMA +
            AccountEntry._COLUMN_ID_Master + DOUBLE + COMMA +
            AccountEntry._COLUMN_CurrentBalance + DOUBLE + COMMA +
            AccountEntry._COLUMN_InitialBalance + DOUBLE + COMMA +
            AccountEntry._COLUMN_Status + TEXT + ")";


    public static final String SQL_CREATE_CAT = "CREATE TABLE " + CategoryEntry._TABLE_Category + " (" +
            CategoryEntry._ID + DOUBLE + " PRIMARY KEY," +
            CategoryEntry._COLUMN_ID + DOUBLE + COMMA +
            CategoryEntry._COLUMN_Name + TEXT + COMMA +
            CategoryEntry._COLUMN_LINK + DOUBLE + COMMA +
            CategoryEntry._COLUMN_Type + TEXT + ")";

    public static final String SQL_CREATE_JOU = "CREATE TABLE " + JournalEntry._TABLE_Journal + " (" +
            JournalEntry._ID + DOUBLE + " PRIMARY KEY," +
            JournalEntry._COLUMN_ID + DOUBLE + COMMA +
            JournalEntry._COLUMN_ACC + DOUBLE + " FOREING KEY REFERENCES " + AccountEntry._TABLE_Account + "(" + AccountEntry._ID + ")," +
            JournalEntry._COLUMN_CAT + DOUBLE + " FOREING KEY REFERENCES " + CategoryEntry._TABLE_Category + "(" + CategoryEntry._ID + ")," +
            JournalEntry._COLUMN_TIME + TEXT + COMMA +
            JournalEntry._COLUMN_AMO + DOUBLE + COMMA +
            JournalEntry._COLUMN_REPTYPE + TEXT + COMMA +
            JournalEntry._COLUMN_REPSPAN + DOUBLE + COMMA +
            JournalEntry._COLUMN_DEBT + TEXT + COMMA +
            JournalEntry._COLUMN_DCONT + TEXT + COMMA +
            JournalEntry._COLUMN_OBS + TEXT + COMMA +
            JournalEntry._COLUMN_DSTATUS + TEXT + ")";


    public static final String SQL_DELETE_ACC =
            "DROP TABLE IF EXISTS " + AccountEntry._TABLE_Account;

    public static final String SQL_DELETE_CAT =
            "DROP TABLE IF EXISTS " + CategoryEntry._TABLE_Category;

    public static final String SQL_DELETE_JOU =
            "DROP TABLE IF EXISTS " + JournalEntry._TABLE_Journal;
}
