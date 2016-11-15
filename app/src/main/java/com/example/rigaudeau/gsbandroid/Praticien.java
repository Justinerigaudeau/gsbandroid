package com.example.rigaudeau.gsbandroid;

/**
 * Created by rigaudeau on 15/11/2016.
 */
public class Praticien {
    private int code;
    private String nom;
    private String prenom;
    private String activite;


    public Praticien (int code, String nom, String prenom,String activite){
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.activite = activite;
    }

    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getActivite() {
        return activite;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }
}
