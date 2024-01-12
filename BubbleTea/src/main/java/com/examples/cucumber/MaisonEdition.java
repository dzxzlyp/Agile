package com.examples.cucumber;

public class MaisonEdition
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Auteur auteur;
    private String reputation;

    /**
     * Constructeur d'objets de classe MaisonEdition
     */
    public MaisonEdition()
    {
        auteur = new Auteur();
        reputation = "Moyen";
    }

    public void updateReputation()
    {
        int nbLivres = auteur.nombreLivres();
        if (nbLivres<5){
            setReputation("Faible");
        }
        else if (nbLivres<10){
            setReputation("Moyen");
        }
        else{
            setReputation("Forte");
        }
    }

    public Auteur getAuteur(){
        return auteur;
    }

    public String getReputation(){
        return reputation;
    }

    public void setAuteur(Auteur auteur){
        this.auteur = auteur;
    }

    public void setReputation(String reputation){
        this.reputation = reputation;
    }
}