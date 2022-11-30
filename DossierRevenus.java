package org.example;

public class DossierRevenus extends Dossier{
   private double ca;

    public DossierRevenus(long id, double ca) {
        super(id);
        this.ca = ca;
    }

    @Override
    public void calculerMontant() {
     montant=((ca*15)/100);
    }
    public String toString(){
        return "15% de revenus "+ca+": "+montant;
    }
}
