package com.example.rigaudeau.gsbandroid;

import java.util.ArrayList;

/**
 * Created by rigaudeau on 05/12/2016.
 */

public class visiteur {
    private int code;
    private String Nom;
    private String Prenom;
    private ArrayList<visiteur>lesVisiteurs;


    public  visiteur(int code, String Nom, String Prenom){
        this.code=code;
        this.Nom=Nom;
        this.Prenom=Prenom;
        this.lesVisiteurs= new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void aujouteVisiteur(int code, String Nom, String Prenom){
        visiteur unVisiteur = new visiteur( code, Nom, Prenom);
        lesVisiteurs.add(unVisiteur);
    }

}
