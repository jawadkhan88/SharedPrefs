package com.example.osman.sharedprefs;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    SharedPreferences sp;

    public static final String mypreference = "mypref";
    public static final String Name = "nameKey";
    public static final String Email = "emailKey";

    EditText name;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name =    ((EditText) findViewById(R.id.etName));
        email =    ((EditText) findViewById(R.id.etEmail));
        sp = PreferenceManager.getDefaultSharedPreferences(this);
    }


    public void Save(View view) {
        String n =((EditText) findViewById(R.id.etName)).getText().toString();
        String e = ((EditText) findViewById(R.id.etEmail)).getText().toString();

        try {
            SharedPreferences.Editor editor = sp.edit();

            editor.putString("Name", n);
            editor.putString("Email", e);
            editor.commit();
           Toast.makeText(this, "Show Text", Toast.LENGTH_LONG).show();
        }
        catch (Exception ex)

        {
            Toast.makeText(this,ex.getMessage(),Toast.LENGTH_LONG).show();
        }
    }

    public void clear(View view) {
        ((EditText) findViewById(R.id.etName)).setText("");
        ((EditText) findViewById(R.id.etEmail)).setText("");

    }

    public void Get(View view)
    {

        sp = getSharedPreferences("mypref", Context.MODE_PRIVATE);

        if (sp.contains("Name")) {
            name.setText(sp.getString("Name", ""));
        }
        if (sp.contains("Email")) {
            email.setText(sp.getString("Email", ""));

        }
    }

    public void btnSharing_Click(View view)
    {
        this.startActivity(new Intent(this, SharingActivity.class));
    }




}