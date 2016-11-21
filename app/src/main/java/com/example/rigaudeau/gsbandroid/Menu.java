package com.example.rigaudeau.gsbandroid;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


    public class Menu extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu);

            Bundle b = getIntent().getExtras();
            String log = b.getString("log");
            String pwd = b.getString("pwd");
            Importation importation = new Importation();
            importation.execute("http://10.0.3.2:88/gsbandroid/import.php", log, pwd);

        }
    }


