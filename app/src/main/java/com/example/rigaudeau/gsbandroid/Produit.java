package com.example.rigaudeau.gsbandroid;

/**
 * Created by rigaudeau on 15/11/2016.
 */
public class Produit {
    private int code;
    private String libelle;
    private String forme;


    public Produit(int code, String libelle, String forme){
        this.code=code;
        this.libelle=libelle;
        this.forme=forme;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }
}
