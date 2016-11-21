package com.example.rigaudeau.gsbandroid;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;


public class Connexion extends AsyncTask<String,Void,Boolean> {
    @Override
    protected Boolean doInBackground(String... params) {
        try {
            URL url=new URL(params[0]);
            HttpURLConnection cnx = (HttpURLConnection)url.openConnection();
            cnx.setRequestMethod("POST");
            cnx.setDoOutput(true);
            OutputStreamWriter osw = new OutputStreamWriter(cnx.getOutputStream());
            osw.write("login="+params[1]+"&passwd="+params[2]);
            osw.flush();
            osw.close();
            int httpResult=cnx.getResponseCode();
            if(httpResult==HttpURLConnection.HTTP_OK){
                InputStreamReader isr = new InputStreamReader(cnx.getInputStream());
                BufferedReader buff = new BufferedReader(isr);
                String ligne=buff.readLine();
                Log.i("myGSB",ligne);
                return ligne.equals("connect");
            }
            else
                Log.i("myGSB","else");
        } catch (IOException e) {
            Log.i("myGSB",e.getMessage());
        }
        return false;
    }
}

