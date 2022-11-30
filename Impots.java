package org.example;

import java.util.ArrayList;
import java.util.List;

public class Impots {
    private  int annee;
    private double totalImpot;
    private String statement="";
    private final List<Dossier> dossierList=new ArrayList<>();

    public Impots(int annee) {
        this.annee = annee;
    }

    public void add(Dossier d){
        dossierList.add(d);
    }

    public int getAnnee(){

        return annee;
    }
    public String toString() {


        for (Dossier dossier : dossierList) {
            dossier.calculerMontant();
           statement = statement + dossier.toString()+"\n";
           totalImpot+=dossier.montant;
        }

        return "Liste des impôts 2022\n"+statement+totalImpot ;
    }

}
