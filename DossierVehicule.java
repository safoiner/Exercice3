package org.example;

public class DossierVehicule extends Dossier{
    private int nbChevaux;
    private char categorie;
    public DossierVehicule(long id, int nbChevaux, char categorie) {
        super(id);
        this.nbChevaux = nbChevaux;
        this.categorie = categorie;
    }
    @Override
    public void calculerMontant() {
        if(categorie == 'E'){
            IE();

        }else {
            IG();
        }
    }

    private void IG() {
        if(nbChevaux<8)
            montant = 700;
        else if(nbChevaux>=8 && nbChevaux<=10)
            montant=1500;
        else if(nbChevaux>=11 && nbChevaux<=14)
            montant=6000;
        else
            montant=20000;
    }

    private void IE() {
        if(nbChevaux<8)
            montant = 350;
        else if(nbChevaux>=8 && nbChevaux<=10)
            montant=650;
        else if(nbChevaux>=11 && nbChevaux<=14)
            montant=3000;
        else
            montant=8000;
    }

    public String toString(){
        return "Vehicule "+ categorie+ " "+ nbChevaux+" CH"+", montant : "+montant;
    }
}
