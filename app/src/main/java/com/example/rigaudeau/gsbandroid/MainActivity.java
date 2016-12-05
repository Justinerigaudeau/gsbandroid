package com.example.rigaudeau.gsbandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.rigaudeau.gsbandroid.Connexion;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.sql.Connection;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        Button btnCnx = (Button) findViewById(R.id.btnCnx);
        btnCnx.setOnClickListener(observateurClic);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public View.OnClickListener observateurClic = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnCnx:
                    String log = ((EditText) findViewById(R.id.txtLogin)).getText().toString();
                    String pwd = ((EditText) findViewById(R.id.txtPassword)).getText().toString();
                    Connexion cnx = new Connexion();
                    cnx.execute("http://10.0.3.2:88/PPE3/auth.php", log, pwd);
                    try {
                        if (cnx.get()) {
                            Intent i = new Intent(getApplicationContext(), Menu.class);
                            i.putExtra("log", log);
                            i.putExtra("pwd", pwd);
                            startActivity(i);

                        } else {
                            Toast.makeText(getApplicationContext(),"Echec de la connexion", Toast.LENGTH_LONG).show();
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        Log.i("myGSB",e.getMessage());
                    }
                    break;
            }
        }
    };

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
