package com.example.rigaudeau.gsbandroid;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;


public class Menu extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu);
            Button btnFiche = (Button) findViewById(R.id.btnFiche);
            btnFiche.setOnClickListener(observateurClic);
            Button btnAncienneFiche = (Button) findViewById(R.id.btnAncienneFiche);
            btnAncienneFiche.setOnClickListener(observateurClic);


            Bundle b = getIntent().getExtras();
            String log = b.getString("log");
            String pwd = b.getString("pwd");
           //Importation importation = new Importation();
            //importation.execute("http://10.0.3.2:88/gsbandroid/import.php", log, pwd);
        }
            public View.OnClickListener observateurClic = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {

                        case R.id.btnFiche:
                            Intent i = new Intent(getApplicationContext(),formulaire.class);
                            startActivity(i);
                            break;








                    }

                }

        };


    }


