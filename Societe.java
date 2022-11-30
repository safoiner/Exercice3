package org.example;

import java.util.ArrayList;
import java.util.List;

public class Societe {
   private  long id;
    private String raison_social;
    private List<Impots> impotsList=new ArrayList<>();

    public Societe(long id, String raison_social) {
        this.id = id;
        this.raison_social = raison_social;
    }

    public Impots getImpots(int annee){
        for (Impots impots: impotsList) {
            if(impots.getAnnee() == annee) return  impots;
        }
        return null;
    }

    public void addImpots(Impots imp){
        impotsList.add(imp);
    }
    public String toString(){
        return "Société :"+id+" - "+raison_social;
    }
}
