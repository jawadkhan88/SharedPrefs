package com.example.osman.sharedprefs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class SharingActivity extends AppCompatActivity
{
    TinyDB tinydb;
    ArrayList<Integer> myarraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharing);
        tinydb = new TinyDB(this);
    }

    public void button1_Click(View view)
    {
        tinydb.putInt("clickCount", 2);
    }

    public void button2_Click(View view)
    {
        Score s = new Score("Javed", 30);
        tinydb.putInt("SCORE", s.getScore());
        tinydb.putString("PLAYER", s.getPerson());
    }

    public void button3_Click(View view)
    {
        myarraylist = new ArrayList<Integer>();

        myarraylist.add(10);
        myarraylist.add(20);
        myarraylist.add(30);
        tinydb.putListInt("MYARRAY", myarraylist);

    }

    public void button4_Click(View view)
    {
        int dataint = tinydb.getInt("clickCount");

        Toast.makeText(this, String.valueOf(dataint), Toast.LENGTH_LONG).show();
    }

    public void button5_Click(View view)
    {
        //  String email = tinydb.getString("EMAIL");
        //  Toast.makeText(this, email, Toast.LENGTH_LONG).show();

        Toast.makeText(this, tinydb.getString("PLAYER") + " " + tinydb.getInt("SCORE"), Toast.LENGTH_LONG).show();
    }

    public void button6_Click(View view)
    {
        ArrayList<Integer> mylist = tinydb.getListInt("MYARRAY");

        for (int item : mylist)
        {
            Toast.makeText(this, String.valueOf(item), Toast.LENGTH_LONG).show();
        }

    }

}
