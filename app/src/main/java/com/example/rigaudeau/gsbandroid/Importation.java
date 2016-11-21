package com.example.rigaudeau.gsbandroid;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.example.rigaudeau.gsbandroid.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by rigaudeau on 21/11/2016.
 */

public class Importation extends AsyncTask<String,Void,Menu>{

    protected Menu doInBackground(String...params){
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
                Gson gson=new Gson();
                return gson.fromJson(ligne, Menu.class);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}