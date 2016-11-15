package com.example.rigaudeau.gsbandroid;

/**
 * Created by rigaudeau on 15/11/2016.
 */
public class Secteur {
    private String libelle;
    private int code;


    public Secteur(String libelle, int code){
        this.libelle=libelle;
        this.code=code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
