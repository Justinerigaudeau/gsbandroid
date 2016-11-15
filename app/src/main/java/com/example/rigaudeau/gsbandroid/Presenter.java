package com.example.rigaudeau.gsbandroid;

/**
 * Created by rigaudeau on 15/11/2016.
 */
public class Presenter {
    private int codeVisiteur;
    private int codeProduit;


    public Presenter(int codeVisiteur, int codeProduit) {
        this.codeVisiteur = codeVisiteur;
        this.codeProduit = codeProduit;
    }

    public int getCodeVisiteur() {
        return codeVisiteur;
    }

    public void setCodeVisiteur(int codeVisiteur) {
        this.codeVisiteur = codeVisiteur;
    }

    public int getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }
}
