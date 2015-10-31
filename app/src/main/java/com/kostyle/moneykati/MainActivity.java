package com.kostyle.moneykati;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.kostyle.moneykati.DB.DBContract;
import com.kostyle.moneykati.DB.DBHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void inizializeDB(View view){
        DBHelper dbh= new DBHelper(this);
        SQLiteDatabase db= dbh.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(DBContract.AccountEntry._COLUMN_ID, 117);
        values.put(DBContract.AccountEntry._COLUMN_NAME, "John's Account");
        values.put(DBContract.AccountEntry._COLUMN_InitialBalance, 1000000);

        long newRowId;
        newRowId = db.insert(DBContract.AccountEntry._TABLE_Account,null, values);

        values = new ContentValues();
        values.put(DBContract.CategoryEntry._COLUMN_ID, 64);
        values.put(DBContract.CategoryEntry._COLUMN_Name, "Tselinoyarsk");
        values.put(DBContract.CategoryEntry._COLUMN_Type, "1");
        newRowId = db.insert(DBContract.CategoryEntry._TABLE_Category,null, values);

        values = new ContentValues();
        values.put(DBContract.CategoryEntry._COLUMN_ID, 84);
        values.put(DBContract.CategoryEntry._COLUMN_Name, "Zaire");
        values.put(DBContract.CategoryEntry._COLUMN_Type, "2");
        newRowId = db.insert(DBContract.CategoryEntry._TABLE_Category,null, values);


        CharSequence texto="Wake me up when you need me";
        Context context = getApplicationContext();
        int duracion=Toast.LENGTH_LONG;
        Toast t=Toast.makeText(context, texto, duracion);
        t.show();
    }

    public void copyDB(View view){
        File f=new File("/data/data/com.kostyle.moneykati/databases/MoneyKati.db");
        FileInputStream fis =null;
        FileOutputStream fos=null;

        try
        {
            fis=new FileInputStream(f);
            fos=new FileOutputStream("/sdcard/Download/MK_dump.db");
            while(true)
            {
                int i=fis.read();
                if(i!=-1)
                {fos.write(i);}
                else
                {break;}
            }
            fos.flush();
            Toast.makeText(this, "DB dump OK", Toast.LENGTH_LONG).show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            Toast.makeText(this, "DB dump ERROR", Toast.LENGTH_LONG).show();
        }
        finally
        {
            try
            {
                fos.close();
                fis.close();
            }
            catch(IOException ioe)
            {}
        }
    }
}
