package org.example;

public abstract class Dossier {
    private long id ;
    public double montant;

    public Dossier(long id) {
        this.id = id;
    }
    public abstract void calculerMontant();
}
